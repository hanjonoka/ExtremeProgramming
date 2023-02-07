package fr.oxyl.formation.xp.dto;

public class CinemaDTO {
    private long id;
    private String nom;
    private String ville;

    public CinemaDTO(long id, String nom, String ville) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
