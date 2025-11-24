public class Main {
    public static void main(String[] args) {

        // --------------------------
        // 1. Création du restaurant
        // --------------------------
        Restaurant resto = new Restaurant("Chez Java");

        // --------------------------
        // 2. Création des plats
        // --------------------------
        Plat p1 = new Plat(1, "Pizza", 50.0);
        Plat p2 = new Plat(2, "Spaghetti", 40.0);
        PlatSpecial p3 = new PlatSpecial(3, "Tacos", 30.0, "Plat du jour");

        // Ajouter au menu
        resto.AjouterPlatAumenu(p1);
        resto.AjouterPlatAumenu(p2);
        resto.AjouterPlatAumenu(p3);

        // --------------------------
        // 3. Création d'un client
        // --------------------------
        Client client = new Client(1, "Omar");
        Client client1 = new Client(2, "mourad");

        // --------------------------
        // 4. Création des serveurs
        // --------------------------
        Serveur serveur1 = new Serveur(1, "Yassine");
        ServeurVIP serveurVIP = new ServeurVIP(2, "Karim", "Gold");

        Commande commande = new Commande(1, "21/11/2025",client, serveur1 );
        Commande commande1 = new Commande(2, "22/12/2025",client1, serveurVIP );

        // Ajouter des plats à la commande
        commande.ajouterPlat(p1);
        commande.ajouterPlat(p3);
        commande1.ajouterPlat(p2);

        // Ajouter la commande à l’historique du client
        client.passerCommande(commande);
        client1.passerCommande(commande1);

        // Ajouter la commande au restaurant
        resto.AjouterCommande(commande);
        resto.AjouterCommande(commande1);

        // 6. Affichages
        System.out.println("\n--- MENU DU RESTAURANT ---");
        resto.afficherMenu();

        System.out.println("\n--- DÉTAILS DE LA COMMANDE ---");
        System.out.println("Client : " + client.getNom());
        System.out.println("Serveur : " + serveur1.getNom());
        System.out.println("Plats commandés : ");
        for (Plat p : commande.getPlats()) {
            System.out.println(" - " + p);
        }

        System.out.println("TOTAL = " + commande.CalculerTotal() + " DH");

        System.out.println("\n--- COMMANDES DU RESTAURANT ---");
        resto.afficherCommandes();
        System.out.println("\nProgramme terminé avec succès !");
    }
}

