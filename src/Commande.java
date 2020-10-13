public class Commande {
    // ATTRIBUTS
    public int idCommande;
    public int montantCommande;

    // CONSTRUCTEUR
    public Commande (int idCommande, int montantCommande) {
        this.idCommande = idCommande;
        this.montantCommande = montantCommande;
    }

    // GETTERS ET SETTERS
    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getMontantCommande() {
        return montantCommande;
    }

    public void setMontantCommande(int montantCommande) {
        this.montantCommande = montantCommande;
    }
}