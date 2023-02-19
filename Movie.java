/**
 * Movie
 */
public class Movie {

    private String movieTitle;
    public double rating;
    public int year;
    public String brief;

    public String getMovietitle() {
        return movieTitle;
        
    }

    public String getBrief() {
        return brief;
        
    }

    public int getYear() {
        return year;
        
    }

    public double getRating() {
        return rating;
        
    }

    public void setMovieTitle(String Title) {
        this.movieTitle = Title;
        
    }

    public void setBrief(String brief) {
        this.brief = brief;
        
    }

    public void setYear(int year) {
        this.year = year; 
        
    }

    public void setRating(double rating) {
        this.rating = rating;
        
        
    }
}