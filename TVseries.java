public class TVseries extends Movie {

    private String seriesTitle;
    private int numberofEpiseods;
    private double averageDurationOfEachEpisode;

    public String getSeriesTitle() {
        return seriesTitle;
        
    }

    public int getNumberOfEpiseods() {
        return numberofEpiseods;
        
    }

    public double getAveragedurationOfeachepisode() {
        return averageDurationOfEachEpisode;
        
    }

   
    public double getRating() {
        return rating;
        
    }
   
    public String getBrief() {
        return brief;
        
    }
   
    public int getYear() {
        return year;
        
    }

    public void setSeriesTitle(String Title) {
        this.seriesTitle = Title;
        
    }
    
    public void setNumberOfEpiseods(int Noumber) {
        this.numberofEpiseods = Noumber;

        
    }

    public void setAveragedurationOfeachepisode(double average) {
        this.averageDurationOfEachEpisode = average;
        
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
