@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return new User(id, "Shreyash Roy", "shreyashroy1324@gmail.com");
    }
}
