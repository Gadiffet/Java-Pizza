public class Commande {
    // ATTRIBUTS
    public int idPizza;
    public int idCommande;
    public int quantite;
    public int totalPrix;

    // CONSTRUCTEUR
    public Commande (int idPizza, int idCommande, int quantite, int totalPrix) {
        this.idPizza = idPizza;
        this.idCommande = idCommande;
        this.quantite = quantite;
        this.totalPrix = totalPrix;
    }

    // GETTERS ET SETTERS
    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getTotalPrix() {
        return totalPrix;
    }

    public void setTotalPrix(int totalPrix) {
        this.totalPrix = totalPrix;
    }
}