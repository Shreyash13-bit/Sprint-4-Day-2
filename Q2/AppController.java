@RestController
public class AppController {
    @GetMapping("/user/1")
    public User getUser() {
        return new User(1, "Shreyash", "Shreyash@gmail.com");
    }
    @GetMapping("/products")
    public List<Product> getProducts() {
        return List.of(
            new Product(1, "Tablet", 25000),
            new Product(2, "Keyboard", 1200)
        );
    }
}
