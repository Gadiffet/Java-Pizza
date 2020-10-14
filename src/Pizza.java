public class Pizza {
    // ATTRIBUTS
    public int idPizza;
    public String nomPizza;
    public double prixPizza;


    // CONSTRUCTEUR
    public Pizza (int idPizza, String nomPizza, double prixPizza) {
        this.idPizza = idPizza;
        this.nomPizza = nomPizza;
        this.prixPizza = prixPizza;
    } 

    // GETTERS ET SETTERS
    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    public String getNomPizza() {
        return nomPizza;
    }

    public void setNomPizza(String nomPizza) {
        this.nomPizza = nomPizza;
    }

    public double getPrixPizza() {
        return prixPizza;
    }

    public void setPrixPizza(double prixPizza) {
        this.prixPizza = prixPizza;
    }
}