import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    private Map<Integer, Product> inventory;  // HashMap pour un accès rapide aux produits par ID
    private List<Integer> dailyShipments;     // ArrayList pour suivre les expéditions journalières dans l'ordre

    public Warehouse() {
        inventory = new HashMap<>();
        dailyShipments = new ArrayList<>();
    }

    // Ajoute un nouveau produit à l'inventaire
    public void addProduct(int id, String name, int quantity) {
        if (!inventory.containsKey(id)) {
            Product product = new Product(id, name, quantity);
            inventory.put(id, product);
            System.out.println("Produit ajouté : " + product);
        } else {
            System.out.println("Le produit avec l'ID " + id + " existe déjà.");
        }
    }

    // Recherche un produit par ID et affiche ses détails
    public void lookUpProduct(int id) {
        Product product = inventory.get(id);
        if (product != null) {
            System.out.println("Produit trouvé : " + product);
        } else {
            System.out.println("Le produit avec l'ID " + id + " n'a pas été trouvé.");
        }
    }

    // Trie les produits par nom et affiche la liste triée
    public void sortProductsByName() {
        List<Product> productList = new ArrayList<>(inventory.values());
        productList.sort(Comparator.comparing(Product::getName));
        System.out.println("Produits triés par nom :");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    // Enregistre les expéditions journalières en stockant les IDs des produits dans l'ordre d'arrivée
    public void recordShipment(int productId) {
        if (inventory.containsKey(productId)) {
            dailyShipments.add(productId);
            System.out.println("Expédition enregistrée pour le produit ID : " + productId);
        } else {
            System.out.println("L'ID du produit " + productId + " n'est pas trouvé dans l'inventaire.");
        }
    }

    // Affiche tous les IDs de produit d'une expédition journalière dans l'ordre d'arrivée
    public void printDailyShipments() {
        System.out.println("Expéditions journalières dans l'ordre d'arrivée :");
        for (int id : dailyShipments) {
            System.out.println("ID du produit : " + id);
        }
    }
}
