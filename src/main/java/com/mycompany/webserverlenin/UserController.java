
package com.mycompany.webserverlenin;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Return the login view
    }

    @PostMapping("/login")
    public String login(@RequestParam("user_name") String username,
            @RequestParam("password") String password,
            Model model) {
        boolean success = userService.authenticate(username, password);
        if (success) {
            return "redirect:/home"; // Redirect to home or any protected resource
        } else {
            // Add error parameter to the URL
            return ""; // URL encode the error message
        }
    }

    @PostMapping("/update-password")
    @ResponseBody
    public Map<String, Object> updatePassword(@RequestBody Map<String, String> payload) {
        String username = payload.get("username");
        String newPassword = payload.get("newPassword");

        Map<String, Object> response = new HashMap<>();
        try {
            boolean success = userService.updatePassword(username, newPassword);
            if (success) {
                response.put("success", true);
            } else {
                response.put("success", false);
                response.put("message", "User not found or error updating password.");
            }
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", e.getMessage());
        }
        return response;
    }
    
//    @PostMapping("/create-user")
//    @ResponseBody
//    public Map<String, Object> createUser(@RequestBody Map<String, String> payload) {
//        String username = payload.get("username");
//        String password = payload.get("password");
//        String role = payload.get("role");
//
//        Map<String, Object> response = new HashMap<>();
//        try {
//            userService.saveUser(username, password, role);
//            response.put("success", true);
//        } catch (Exception e) {
//            response.put("success", false);
//            response.put("message", e.getMessage());
//        }
//        return response;
//    }
    @PostMapping("/create-user")
    @ResponseBody
    public Map<String, Object> createUser(@RequestBody Map<String, String> payload) {
        String username = payload.get("username");
        String password = payload.get("password");
        String role = payload.get("role");

        Map<String, Object> response = new HashMap<>();
        try {
            userService.saveUser(username, password, role);
            response.put("success", true);
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", e.getMessage());
        }
        return response;
    }
}
