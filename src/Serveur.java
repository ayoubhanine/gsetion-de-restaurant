public class Serveur {

    private int idServeur;
    private String nom;

    Serveur( int idServeur,String nom){
        this.idServeur=idServeur;
        this.nom=nom;
    }

    public void prendreCommande(Commande c){

        System.out.println("le serveur "+getNom()+" a pris la commande: "+c.getIdCommande());

    }







    public int getIdServeur() {
        return idServeur;
    }

    public void setIdServeur(int idServeur) {
        this.idServeur = idServeur;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Serveur{" +
                "idServeur=" + idServeur +
                ", nom='" + nom + '\'' +
                '}';
    }
}