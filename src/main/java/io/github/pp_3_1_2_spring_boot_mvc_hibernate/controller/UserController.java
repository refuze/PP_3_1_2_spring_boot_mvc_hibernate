package io.github.pp_3_1_2_spring_boot_mvc_hibernate.controller;

import io.github.pp_3_1_2_spring_boot_mvc_hibernate.model.User;
import io.github.pp_3_1_2_spring_boot_mvc_hibernate.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String usersList(ModelMap model) {
        model.addAttribute("users", userService.getList());
        return "users";
    }

    @GetMapping("/user-add")
    public String userAdd(ModelMap model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/user-add")
    public String saveUser(@ModelAttribute User user) {
        userService.update(user);
        return "redirect:/users";
    }

    @GetMapping("/user-update/{id}")
    public String updateUser(ModelMap model, @PathVariable Long id) {
        model.addAttribute("user", userService.get(id));
        return "user-form";
    }

    @DeleteMapping("/user-delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.delete(userService.get(id));
        return "redirect:/users";
    }
}
