package Models;

public class Aktor {
    // w każdej nowej klasie istnieje niewidoczny konstruktor (inaczej niejawny)
    private String firstName;
    private String lastName;
    private int rating;
    private boolean isOscarPrized;


    public Aktor(String title, String firstName, String lastName, int rating, boolean isOscarPrized) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.isOscarPrized = isOscarPrized;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRating() {
        return rating;
    }

    public boolean isOscarPrized() {
        return isOscarPrized;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setOscarPrized(boolean oscarPrized) {
        isOscarPrized = oscarPrized;
    }
}
