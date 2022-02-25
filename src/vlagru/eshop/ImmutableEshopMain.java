package vlagru.eshop;


import vlagru.eshop.entity.ImmutableNotebook;


import static vlagru.eshop.entity.NotebookCategory.ZAKLADNI;

public class ImmutableEshopMain {

    private static void printNotebook(ImmutableNotebook notebook) {
        System.out.printf("%s, %.2f, %.2f, %s\n", notebook.getName(), notebook.getPrice(), notebook.getWeight(),
                notebook.getCategory());
    }

    public static void main(String[] args) {

        ImmutableNotebook lenovo = new ImmutableNotebook("Lenovo XP",20_000.50,1.85, ZAKLADNI);

        printNotebook(lenovo);

    }

}

