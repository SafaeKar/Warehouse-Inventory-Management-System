public class Product {
    private int id;               // Identifiant du produit
    private String name;          // Nom du produit (avec un "S" majuscule)
    private int quantity;         // Quantité en stock

    // Constructeur pour initialiser un produit
    public Product(int id, String name, int quantity) {
        this.id = id;            // Initialisation de l'identifiant
        this.name = name;        // Initialisation du nom
        this.quantity = quantity; // Initialisation de la quantité
    }

    // Méthode pour obtenir l'ID du produit
    public int getId() {
        return id;
    }

    // Méthode pour obtenir le nom du produit
    public String getName() {
        return name;
    }

    // Méthode pour obtenir la quantité du produit
    public int getQuantity() {
        return quantity;
    }

    // Méthode pour définir la quantité du produit
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Méthode pour afficher les détails du produit
    @Override
    public String toString() {
        return "Product Id: " + id + " Name: " + name + " Quantity: " + quantity; // Espace ajouté pour une meilleure lisibilité
    }
}
