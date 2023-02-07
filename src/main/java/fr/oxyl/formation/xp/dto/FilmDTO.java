package fr.oxyl.formation.xp.dto;

public class FilmDTO {
    private long id;
    private String titre;
    private int duree;
    private String realisateur;

    public FilmDTO(long id, String titre, int duree, String realisateur) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }
}
