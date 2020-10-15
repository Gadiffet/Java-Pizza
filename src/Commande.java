public class Commande {
    // ATTRIBUTS
    public int idPizza;
    public int idCommande;
    public int quantite;
    public String nomPizza;

    // CONSTRUCTEUR
    public Commande (int idCommande, int idPizza, int quantite, String nomPizza) {
        this.idCommande = idCommande;
        this.idPizza = idPizza;
        this.quantite = quantite;
        this.nomPizza = nomPizza;
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

    public String getNomPizza() {
        return nomPizza;
    }

    public void setNomPizza(String nomPizza) {
        this.nomPizza = nomPizza;
    }
}