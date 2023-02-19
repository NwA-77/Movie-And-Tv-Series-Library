import java.util.Scanner;


public class View{

    //Contains all the app menues or UIs

    public static void welcome (){

        System.out.println("--- Welcome to my App ---");
        System.out.println("1- Show List of All Movies.");
        System.out.println("2- Add New Movie.");
        System.out.println("3- Show List of All TvSeries.");
        System.out.println("4- Add New TvSeries.");
        System.out.println("---------------------------");

        System.out.print("Please select an option: ");
        Scanner s = new Scanner(System.in);
        String userOption = s.nextLine();

        switch (userOption)
        {
            case "1":
                View.listOfAllMovies();
                break;

            case "2":
                View.addNewMovie();
                break;

            case "3":
                View.listOfAllTvSeries();
                break;

            case "4":
                View.addNewTvSeries();

            default:
             System.out.println("please enter a vaild opition ");
             View.welcome();
        }



    }

    public static void listOfAllMovies(){
        System.out.println();
        System.out.println("-- List of All Movies --");
        Controler.printAllMovies();
        System.out.println("----------------------------\n");

        System.out.print("Enter 'd' for movie details, or 'm' for main menue: ");
        Scanner s = new Scanner(System.in);
        String userOption = s.nextLine();

        switch (userOption)
        {
            case "d":
                System.out.println();
                View.movieDetails();
                break;

            case "m":
                System.out.println();
                View.welcome();
                break;

            default:
             System.out.println("please enter a vaild opition ");
             View.listOfAllMovies();
        }

    }

    public static void movieDetails() {

     System.out.println("\n--- Movie Details --");

     System.out.print("Please enter movie number: ");
     Scanner s = new Scanner(System.in);
     String movieChoice = s.nextLine();
     
     System.out.println();
     
     Controler.getMovieDetails(Integer.parseInt(movieChoice));

     System.out.print("Enter 'L' for movie List, or 'm' for main menue: ");
         s = new Scanner(System.in);
        String userOption = s.nextLine();

        switch (userOption)
        {
            case "L":
                System.out.println();
                View.listOfAllMovies();
                break;

            case "m":
                System.out.println();
                View.welcome();
                break;

            default:
             System.out.println("please enter a vaild opition ");
             View.listOfAllMovies();
        }


        
    } 

    public static  void addNewMovie()
    {
        System.out.println("\n --- Add new Movie ---");

        Controler.setNewMovie();

        System.out.println("\nMovie has been added succfully.");

        View.listOfAllMovies();
        

    }




    //TvSeries Section.
    public static void listOfAllTvSeries() {

        System.out.println();
        System.out.println("-- List of All TvSeries --");
        Controler.printAllTvSeries();
        System.out.println("----------------------------\n");

        System.out.print("Enter 'd' for Tvseries details, or 'm' for main menue: ");
        Scanner s = new Scanner(System.in);
        String userOption = s.nextLine();

        switch (userOption)
        {
            case "d":
                System.out.println();
                View.tvSeriesDetails();
                break;

            case "m":
                System.out.println();
                View.welcome();
                break;

            default:
             System.out.println("please enter a vaild opition ");
             View.listOfAllTvSeries();
        }

        
    }

    public static void tvSeriesDetails() {
        
        System.out.println("\n--- TvSeries Details --");
   
        System.out.print("Please enter TvSeries number: ");
        Scanner s = new Scanner(System.in);
        String tvSeriesChoice = s.nextLine();
        System.out.println();
        
        
        Controler.getTvSeriesDetails(Integer.parseInt(tvSeriesChoice));
   
        System.out.print("Enter 'L' for TvSeries List, or 'm' for main menue: ");
            s = new Scanner(System.in);
           String userOption = s.nextLine();
   
           switch (userOption)
           {
               case "L":
                   System.out.println();
                   View.listOfAllTvSeries();
                   break;
   
               case "m":
                   System.out.println();
                   View.welcome();
                   break;
   
               default:
                System.out.println("please enter a vaild opition ");
                View.listOfAllTvSeries();
           }
   
   
           
       } 

       public static  void addNewTvSeries()
    {
        System.out.println("\n --- Add new TvSeries ---");

        Controler.setNewTvSeries();

        System.out.println("\n TvSeries has been added succfully.");

        View.listOfAllTvSeries();
        

    }



    
}
