package vlagru.eshop.entity;

public class ImmutableNotebook {

    private final String name;
    private final double price;
    private final double weight;
    private final NotebookCategory category;

    public ImmutableNotebook(String name, double price, double weight, NotebookCategory category) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public NotebookCategory getCategory() {
        return category;
    }

}
