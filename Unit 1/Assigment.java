/* Assignment 1 - Movie Ratings */
import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
    
        Scanner scan = new Scanner (System.in);

        //Input Movie Name
        System.out.println("Please enter the movie name");
        String movie_name= scan.nextLine();

        //Input run time
        System.out.println("Please enter the running time in minutes.");
        int run_time= scan.nextInt();
        int hours= run_time/60;
        int minutes = run_time%60;

        //Input movie reviews from web
        System.out.println("Please enter ratings from the movie review website.");
        double movie1= scan.nextDouble();
        double movie2=scan.nextDouble();
        double movie3=scan.nextDouble();
        double avg_movie_rating= ((movie1+movie2+movie3)/3);

        //Movie Ratings Focus Group
        System.out.println("Please enter ratings from the focus group.");
        double focus1= scan.nextDouble();
        double focus2=scan.nextDouble();
        double avg_focus_rating= ((focus1+focus2)/2);

        //Average movie critic rating
        System.out.println("Please enter the average movie critic rating.");
        double critic1= scan.nextDouble();

        //Overall rate
        double overall_rate=((avg_movie_rating*0.2)+(avg_focus_rating*0.3)+(critic1*.5));
        int final_overall_rate = (int) (overall_rate+0.5);


        //Printing info
        System.out.println("Title: "+movie_name);
        System.out.println("Running time: "+hours+"h"+minutes);
        System.out.println("Average website rating: "+avg_movie_rating);
        System.out.println("Average focus group rating: "+avg_focus_rating);
        System.out.println("Average movie critic rating: "+critic1);
        System.out.println("Overall movie rating: "+final_overall_rate);

            



    
  }
}

