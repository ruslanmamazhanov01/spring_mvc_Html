package peaksoft.config.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.config.model.User;
import peaksoft.config.servic.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("users", service.getAllUsers());
        return "users";
    }

    @GetMapping("add-user")
    public String getUser() {
        return "add-user";
    }

    @PostMapping("save-user")
    public String addUser(User user, Model model) {

        service.addUser(user);
        System.out.println(user.getAge());
        System.out.println(user.getName());
        model.addAttribute("users", user);
        return "redirect:/users";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        service.removeUser(id);
        return "redirect:/users";

    }
    @GetMapping("/edit")
    public String edit(@RequestParam int id){
    

        return "";
    }
}
