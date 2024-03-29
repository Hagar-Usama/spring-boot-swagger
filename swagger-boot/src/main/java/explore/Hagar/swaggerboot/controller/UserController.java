package explore.Hagar.swaggerboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import explore.Hagar.swaggerboot.dto.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/api")
public class UserController {

    @Operation(summary = "Create a new user")
    @ApiResponse(responseCode = "201", description = "User created successfully",
            content = @Content(schema = @Schema(implementation = User.class)))
    @PostMapping("/user")
    public ResponseEntity<String> createuser(@RequestBody User user) {
        // Process the user (save to database, etc.)
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }

    @Operation(summary = "Get a user by ID")
    @ApiResponse(responseCode = "200", description = "User found",
            content = @Content(schema = @Schema(implementation = User.class)))
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getuserById(@PathVariable Long id) {
        // Fetch User from database or other source
        User User = new User();
        
        User.setName("John Doe");
        User.setAge(30);
        return ResponseEntity.ok(User);
    }
}
