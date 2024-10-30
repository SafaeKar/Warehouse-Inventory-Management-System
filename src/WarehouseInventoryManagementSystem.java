public class WarehouseInventoryManagementSystem {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        // Ajouter des produits à l'inventaire
        warehouse.addProduct(101, "Laptop", 50);
        warehouse.addProduct(102, "Smartphone", 200);
        warehouse.addProduct(103, "Tablet", 100);

        // Rechercher un produit par ID
        warehouse.lookUpProduct(102);

        // Trier les produits par nom
        warehouse.sortProductsByName();

        // Enregistrer des expéditions journalières
        warehouse.recordShipment(101);
        warehouse.recordShipment(103);

        // Afficher les expéditions journalières
        warehouse.printDailyShipments();
    }
}
