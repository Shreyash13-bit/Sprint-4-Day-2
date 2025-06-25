@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {
        return List.of(
            new Product(1, "Laptop", 999.99),
            new Product(2, "Phone", 499.49),
            new Product(3, "Monitor", 199.99)
        );
    }
}
