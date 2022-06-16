package cl.sustantiva.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Film")
public class Film {

    @Id
    @Column(name="film_id")
    private int film_id;

    @Column(name = "title")
    private String title;

    @Column(name ="description")
    private String description;

    @Column(name="release_year")
    private int release_year;

    @Column(name="rating")
    private String rating;

    public Film() {
        super();
    }

    public Film(int film_id, String title, String description, int release_year, String rating) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.rating = rating;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
