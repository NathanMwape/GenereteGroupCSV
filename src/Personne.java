public class Personne {
    private String numero;
    private String nom;
    private String post;
    private String prenom;
    private String sexe;

    public Personne(String numero, String nom, String post, String prenom, String sexe) {
        this.numero = numero;
        this.nom = nom;
        this.post = post;
        this.prenom = prenom;
        this.sexe = sexe;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
}
