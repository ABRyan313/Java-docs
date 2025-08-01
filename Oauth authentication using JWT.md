## 🔐 What is JWT?

**JWT** is a compact, URL-safe token format used to securely transmit information between parties. It consists of three parts:

1. **Header**
   - Contains metadata about the token, including the algorithm used for signing.

2. **Payload**
   - Holds the claims (i.e., user information, roles, expiration time, etc.).

3. **Signature**
   - Ensures the token’s integrity and authenticity by verifying that its contents haven’t been altered or forged.

---

## 🛠️ JWT Token Creation Process

1. **Generate JWT**
   - After authenticating the user, a JWT is generated with user data and signed using a secret key.

2. **Extract JWT**
   - The token is sent back to the client and then included in the `Authorization` header in future requests:  
     ```
     Authorization: Bearer <token>
     ```

3. **Validate JWT**
   - On each request to a protected endpoint, the server extracts and validates the token:
     - Is the token well-formed?
     - Has it expired?
     - Is the signature valid?

---

## 🎯 Role of JWT in Authentication

- The user authenticates by sending their credentials (e.g., username & password).
- The server verifies the credentials and returns a **signed JWT token**.
- The client includes the token in subsequent requests to **access protected resources**.
- The server validates the token:
  - ✅ If valid → **Access granted**
  - ❌ If invalid or expired → **Access denied**

---

> ✅ JWT allows stateless, scalable, and secure communication between client and server.
````


# Workflow of JWT Token Based Authentication in Spring Boot

1. **Request Filtering and Authentication**  
   The request is filtered through `oauth2ResourceServer`. The `AuthenticationManager` bean is used to handle authentication by verifying the user’s credentials via the `UserDetailsService` interface.

2. **User Retrieval via UserDetailsService**  
   `authUserDetailsService`, which implements `UserDetailsService`, looks up the user in the repository and returns a user object. It uses a method that returns `authUser` (an entity implementing `UserDetails`).

3. **UserDetails Implementation**  
   `UserDetails` is implemented by `authUser`, which provides all the necessary methods that Spring Security requires for:
   - User authentication and authorization
   - Checking account status

```

UserDetailsService <------ authUser ------> UserDetails

```

4. **Authentication and JWT Token Generation**  
Once the user is verified, `authService.authenticate()` processes the request, returns the authenticated user, and generates a JWT token using `JwtTokenService`.

5. **Response to Controller**  
`authService` sends the authenticated user and JWT token as a response back to the controller.

---

### Authentication Workflow Diagram

```

AuthenticationManager
|
v
UserDetailsService
|
v
AuthUser (verified = true)
|
v
AuthService
|
v
JwtTokenService
|
v
AuthController
