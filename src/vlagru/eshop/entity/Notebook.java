package vlagru.eshop.entity;

public class Notebook {

    private String name;
    private double price;
    private double weight;
    private NotebookCategory category;

    public Notebook(String name,double price,double weight,NotebookCategory category) {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCategory(NotebookCategory category) {
        this.category = category;
    }
}
