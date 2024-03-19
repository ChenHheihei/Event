import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformances {

    Scanner reader = new Scanner(System.in);

    Queue<Performance> performances = new LinkedList<>();

    public void handlePerformances(){
        int choice = 0;
        do{
            System.out.println("\n" + "Here are the performance operations available to you: " + "\n");
            System.out.println("Type 1 to add performances:" + "\n");
            System.out.println("Type 2 to display the list of performances:" + "\n");
            System.out.println("Type 3 to start the performances:" + "\n");
            System.out.println("Type 4 to QUIT:" + "\n");
            choice = reader.nextInt();
            reader.nextLine();
            switch(choice){
                case 1:
                    System.out.println("How many performances would you like to add?");
                    int num = reader.nextInt ();
                    reader.nextLine();
                    addPerformances(num);
                    break;
                case 2:
                    diaplayPerformances();
                    break;
                case 3:
                    startPerformances();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }while(choice != 4);
    }
    
    public void addPerformances(int num){
        
        for(int i=0; i<num; i++){
            System.out.println("Enter the Performance ID: ");
            String performanceID = reader.nextLine();

            System.out.println("Enter the name of the Performance: ");
            String performanceName = reader.nextLine();

            System.out.println("Enter the name of the performer: ");
            String performanceLeadName = reader.nextLine();

            System.out.println("Enter the rank of the performance: ");
            char performanceGroup = reader.nextLine().charAt(0);

            Performance performance = new Performance(performanceID, performanceName, performanceLeadName, performanceGroup);

            this.performances.offer(performance);
        }
    }

    public void diaplayPerformances(){
        System.out.println("Here is the list of performances: " + "\n" + performances);
    }

    public void startPerformances(){
        System.out.println("The next performance starting is: "+ performances.poll());
    }
}
