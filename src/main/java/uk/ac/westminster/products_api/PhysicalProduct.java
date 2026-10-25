package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it shares core attributes like id, name, and price, but represents tangible goods shipped in physical packaging.
// A ShoppingCart would NOT pass this test because it HAS-A list of products instead of being a specialized kind of product itself.
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // Empty no-arg constructor for Jackson deserialisation
    public PhysicalProduct() {
    }

    // Full constructor setting inherited fields via super(...)
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
