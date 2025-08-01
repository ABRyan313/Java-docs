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

```
```

Let me know if you want this saved to a downloadable `.md` file or need help visualizing it further.
