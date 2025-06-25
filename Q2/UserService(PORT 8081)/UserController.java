@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return new User(id, "Shreyash", "Shreyash@gmail.com");
    }
}
