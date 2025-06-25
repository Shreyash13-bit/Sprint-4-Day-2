@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public List<Product> getProducts() {
        return List.of(
            new Product(1, "Tablet", 25000),
            new Product(2, "Keyboard", 1200)
        );
    }
}
