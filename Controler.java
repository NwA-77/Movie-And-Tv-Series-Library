import java.util.ArrayList;
import java.util.Scanner;

public class Controler {

   public static ArrayList<Movie> movieList= new ArrayList<Movie>();
   public static ArrayList<TVseries> tvSeriesList= new ArrayList<TVseries>();
   

   public static void fillMovieData() {

        Movie movie1= new Movie();

        movie1.setMovieTitle("The Shawshank Redemption");
        movie1.setBrief("Over the course of several years, two convicts form a friendship, seeking consolation and, eventually, redemption through basic compassion.");
        movie1.setYear(1994);
        movie1.setRating(9.3);

        Movie movie2= new Movie();

        movie2.setMovieTitle("The Godfather");
        movie2.setBrief("The aging patriarch of an organized crime dynasty in postwar New York City \n transfers control of his clandestine empire to his reluctant youngest son");
        movie2.setYear(1972);
        movie2.setRating(9.2);

        Movie movie3= new Movie();

        movie3.setMovieTitle("The Dark Knight");
        movie3.setBrief("When the menace known as the Joker wreaks havoc and chaos on the people of Gotham,\n Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.");
        movie3.setYear(2008);
        movie3.setRating(9.0);



        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
    
   }

   

   public static void getMovieDetails(int i) {
    

     // تذكر بان المصفوفة تبدا من الرقم صفر
     int indx = i-1;
     
     
     Movie movie1= Controler.movieList.get(indx);
     
     System.out.println("Title: "+movie1.getMovietitle());
     System.out.println("About the Movie: "+movie1.getBrief());
     System.out.println("Production Year: "+movie1.getYear());
     System.out.println("Rating on IMDB Website: "+movie1.getRating());
     
     System.out.println("-----------------------------\n");
}

//print the movies Titles
public static void printAllMovies(){
     
     for(int i = 0 ; i < movieList.size(); i++)
     {
          System.out.println((i+1) +"- " + movieList.get(i).getMovietitle() );
     }    
    
}

//movie for the user 
public static void setNewMovie() {

     Movie movie= new Movie();

     Scanner s = new Scanner(System.in);


   
     System.out.print("Title: ");
     movie.setMovieTitle(s.nextLine());

     System.out.print(" About: ");
     movie.setBrief(s.nextLine());

     System.out.print("Prodiction Year: ");
     movie.setYear(s.nextInt());

     System.out.print("Rating From the IMDB Website: ");
     movie.setRating(s.nextDouble());

     movieList.add(movie);
     
}




//Tvseries section
public static void fillTvSeriesData() {

     TVseries series1= new TVseries();

        series1.setSeriesTitle("Breaking Bad");
        series1.setBrief("A chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine with a former student in order to secure his family's future.");
        series1.setNumberOfEpiseods(62);
        series1.setAveragedurationOfeachepisode(49);
        series1.setYear(2008);
        series1.setRating(9.5);

        TVseries series2=new TVseries();

        series2.setSeriesTitle("Band of Brothers");
        series2.setBrief("The story of Easy Company of the U.S. Army 101st Airborne Division \n and their mission in World War II Europe, from Operation Overlord to V-J Day.");
        series2.setNumberOfEpiseods(10);
        series2.setAveragedurationOfeachepisode(56);
        series2.setYear(2001);
        series2.setRating(9.4);

        TVseries series3=new TVseries();

        series3.setSeriesTitle("Chernobyl");
        series3.setBrief("In April 1986, an explosion at the Chernobyl nuclear power plant in the Union of Soviet Socialist Republics \n becomes one of the world's worst man-made catastrophes.");
        series3.setNumberOfEpiseods(5);
        series3.setAveragedurationOfeachepisode(1);
        series3.setYear(2019);
        series3.setRating(9.4);

        tvSeriesList.add(series1);
        tvSeriesList.add(series2);
        tvSeriesList.add(series3);
     
   }

   public static void getTvSeriesDetails(int i) {
    

     // تذكر بان المصفوفة تبدا من الرقم صفر
     int indx = i-1;
     
     
     TVseries series1=Controler.tvSeriesList.get(indx);
     
     System.out.println("Title Of The Series : "+series1.getSeriesTitle());
     System.out.println("About the Series: "+series1.getBrief());
     System.out.println("Number Of Episeods: "+series1.getNumberOfEpiseods());
     System.out.println("Average Duration Of each Episode: "+series1.getAveragedurationOfeachepisode()+" Minute");
     System.out.println("production year: "+series1.getYear());
     System.out.println("Rating of the Series on IMDB Website: "+series1.getRating());
     
     System.out.println("-----------------------------\n");
}

public static void printAllTvSeries() {

    for(int i = 0; i< tvSeriesList.size();i++)
    {
     System.out.println((i+1) +"- "+ tvSeriesList.get(i).getSeriesTitle() );
    }
     
}

public static void setNewTvSeries() {

     TVseries series= new TVseries();

     Scanner s =new Scanner(System.in);

     System.out.print("Wrtite Your TvSeries Title: ");
     series.setSeriesTitle(s.nextLine());

     System.out.print("About the TvSeries: ");
     series.setBrief(s.nextLine());

     System.out.print("Add the Numper Of Episeods: ");
     series.setNumberOfEpiseods(s.nextInt());

     System.out.print("Average duration Of each episode: ");
     series.setAveragedurationOfeachepisode(s.nextDouble());

     System.out.print("The Prodiction Year: ");
     series.setYear(s.nextInt());

     System.out.print("Rating From the IMDB Website: ");
     series.setRating(s.nextDouble());

     tvSeriesList.add(series);
    
     
}


}
