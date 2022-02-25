package vlagru.eshop;


import vlagru.eshop.entity.Notebook;


import static vlagru.eshop.entity.NotebookCategory.*;

public class EshopMain {

    public static void main(String[] args) {
        Notebook lenovo = new Notebook("Lenovo XP",20_000.50,1.85, ZAKLADNI);
        Notebook dell = new Notebook("Dell 13'",25_000.40,1.02,PRACE);
        Notebook matebook = new Notebook("Mate Book", 30_000, 0.99,HRY);
        Notebook mcbook = new Notebook("McBook AIR 13", 50_000, 0.88,PRO);

        Notebook[] notebooks = new Notebook[] {lenovo, dell, matebook, mcbook};
        for (Notebook notebook : notebooks) {
            System.out.printf("%s %.2f %.2f %s\n", notebook.getName(), notebook.getPrice(),
                    notebook.getWeight(), notebook.getCategory());
        }

    }
}
