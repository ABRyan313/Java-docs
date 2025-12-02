# ✅ **1. First: Verify the Project Build & Dependencies**

### ✔️ Step 1 — Run Maven clean + install

```bash
mvn clean install
```

If it fails, the issues are in:

* `pom.xml` versions
* Missing dependencies
* Wrong Java version

### ✔️ Step 2 — Check Java version compatibility

Open `pom.xml` and see:

```xml
<java.version>17</java.version>    // or 11, 21, etc.
```

Then check your local Java:

```bash
java -version
```

Mismatch = runtime errors.

### ✔️ Step 3 — Check if `.env` or `application.properties` missing

Many projects fail because:

* Database URL not correct
* Missing environment variables
* Wrong credentials

Look for:

* `application.properties`
* `application.yml`
* `application-dev.properties`
* `.env` files

Missing config = project won’t run correctly.

---

# ✅ **2. Run the Application With Logs Enabled**

Start with:

```bash
mvn spring-boot:run
```

Watch the console carefully for:

* Bean creation exceptions
* Missing dependencies
* Failed autowiring
* Database errors
* Security filter chain errors

Log errors give direction.

---

# ✅ **3. Check the Project Structure**

Many issues come from bad architecture:

Ensure packages follow Spring Boot scanning rule:

```
com.example.project
 ├─ controller
 ├─ service
 ├─ repository
 └─ model
```

If your main class is:

```
com.example.DemoApplication
```

All other packages **must be under** `com.example.*`.

Otherwise controllers/services are not detected → features don’t work.

---

# ✅ **4. Debug Security Issues (Your Login Problem)**

You said:

> both admin and user login take you to same login page.
> is it normal?

### ✔️ Yes, this is normal if:

* They share same **authentication entry point**
* Only authorization differs
* Role-based pages are not configured

Most Spring Security setups have:

1️⃣ Same login form for all users
2️⃣ After login, you get redirected based on role

So check:

### **✔️ Step 1: Look at the SecurityConfig**

Search for:

```java
http
    .formLogin()
    .loginPage("/login")
```

→ This forces **everyone** to use `/login`.

### **✔️ Step 2: Check the Role Redirect**

Look for:

```java
successHandler(...)
```

or

```java
defaultSuccessUrl(...)
```

If missing → everyone goes to same page.

### **✔️ Step 3: Check Authorization Rules**

Look for:

```java
.authorizeHttpRequests()
    .requestMatchers("/admin/**").hasRole("ADMIN")
    .requestMatchers("/user/**").hasRole("USER")
```

If not configured:

* Admin routes won't be protected
* Users won't be redirected properly
* Both roles behave the same

---

# ✅ **5. Test Endpoints Manually (Since No Swagger)**

Without Swagger/OpenAPI, use:

* **Postman**
* **Insomnia**
* **cURL**

Test:

1. `/auth/login`
2. `/auth/register`
3. `/admin/**`
4. `/user/**`

If roles are ignored, you found the security bug.

---

# ✅ **6. Add Logging to Understand Security Flow**

Enable debug logs temporarily:

`application.properties`:

```properties
logging.level.org.springframework.security=DEBUG
```

Now you can see:

* Which filter runs
* Which role is assigned
* Why redirection fails
* Why authentication fails

This is extremely helpful.

---

# ✅ **7. Identify the Top Causes of Bugs in Cloned Spring Boot Projects**

### ✔️ ✔️ Most Common Issues:

1. Missing DB tables
2. Wrong SQL schema not imported
3. Wrong Java version
4. Missing environment variables
5. Security misconfiguration
6. CORS blocking requests
7. Controllers not scanned
8. Service autowire issues
9. Feign/RestTemplate calling wrong URLs
10. DTO mismatches

---

# 🧭 **Best Professional Workflow to Fix the Bugs**

### ✔️ Step-by-step debugging pipeline:

1️⃣ **Run entire project**
2️⃣ **Read log error** from console
3️⃣ **Fix one error at a time**
4️⃣ Run again
5️⃣ **Add Postman collections to test API**
6️⃣ Check user/admin login flow
7️⃣ Add breakpoints in IntelliJ (optional but powerful)
8️⃣ Fix missing config in `application.properties`
9️⃣ Check database migrations
🔟 Build again

This is exactly how team leads debug legacy or unknown projects.
