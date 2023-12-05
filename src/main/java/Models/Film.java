package Models;

public class Film {
    // Pola reprezentujące cechy filmu - składniki klasy
    private String title;
    private String description;
    private String director;
    private double budget;
    private char rating;
    private String category;


    // Konstruktor klasy Film

    public Film(String title) {
        this.title = title;
    }

    public Film() {
    }

    public Film(String title, String description, String director, double budget, char rating, String category) {
        this.title = title;
        this.description = description;
        this.director = director;
        this.budget = budget;
        this.rating = rating;
        this.category = category;
    }

    // Metody dostępowe (gettery i settery) dla pól klasy (gettery i settery)

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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    // Przykładowa metoda do wyświetlania informacji o filmie
}
