import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Event {

    Scanner reader = new Scanner(System.in);
    public final static int capacity = 10_000;

    private String eventID;
    private String eventName;
    private LocalDate eventDate;
    private String eventVenue;
    ArrayList<Attendee> eventAttendees = new ArrayList<>();

    public Event(){}

    public void setEventID(String id){
        eventID = id;
    }

    public String getEventID(){
        return eventID;
    }

    public void setEventName(String name){
        eventName = name;
    }
    
    public String getEventName(){
        return eventName;
    }

    public void setEventDate(LocalDate date){  
        eventDate = date;  
    }

    public LocalDate getEventDate(){  
        return eventDate;  
    }

    public void setEventVenue(String venue){
        eventVenue = venue;
    }
    
    public String getEventVenue(){
        return eventVenue;
    }

    public void organizeEvent(int choice){

        switch(choice){
            case 1:
                System.out.println("Enter the Event ID : ");
                String id = reader.nextLine();
                setEventID(id);

                System.out.println("Enter the name of the Event: ");
                String eventName = reader.nextLine();
                setEventName(eventName);

                System.out.println("Enter the Event date (YYYY-MM-DD): ");
                LocalDate date = LocalDate.parse(reader.nextLine());
                setEventDate(date);
                
                System.out.println("Enter the event's venue: ");
                String venue = reader.nextLine();
                setEventVenue(venue);
            case 2:
                System.out.println("How many attendess are coming?: ");
                int num = reader.nextInt();
                reader.nextLine();

                for(int i=0; i<num; i++){
                    System.out.println("Enter the name of the attendee: ");
                    String name = reader.nextLine();

                    System.out.println("Enter the gender of the attendee: ");
                    char gender = reader.nextLine().charAt(0);

                    System.out.println("Enter the age of the attendee: ");
                    int age = reader.nextInt();
                    reader.nextLine();

                    System.out.println("Enter the amail of the attendee: ");
                    String email = reader.nextLine();


                    eventAttendees.add(new Attendee(name, gender, email, age));
                }
                System.out.println("\n" + "All the attendees were added successfully to the list.");
                break;
            case 3:
                System.out.println("Enter the name of the attendee to remove");
                String nameToRemove = reader.nextLine();

                for(Attendee attendee :eventAttendees){
                    if(nameToRemove.equals(attendee.getName())){
                        eventAttendees.remove(attendee);
                        break;
                    }

                }
                System.out.println("\n"+ nameToRemove + "removed successfully from the list of attendees");
                break;
            case 4:
                System.out.println("Enter the name of the attendee you want to upadte: ");
                String nameToUpdate=reader.nextLine();

                for(Attendee attendee :eventAttendees){
                    if(nameToUpdate.equals(attendee.getName())){
                        System.out.println("Enter the new name, or enter null if you don't want to update: ");
                        String newName = reader.nextLine();
                        if(!newName.equals("null")){
                            attendee.setName(newName);
                        }
                        System.out.println("Enter the new age,or enter 0 if you don't want to update:");
                        int nweAge = reader.nextInt();
                        reader.nextLine();
                        if (nweAge != 0) {
                            attendee.setAge(nweAge);
                        }
                        System.out.println("Enter the new email,or enter 0 if you don't want to update:");
                        String nweEmail = reader.nextLine();
                        if (!nweEmail.equals("null")) {
                            attendee.setEmail(nweEmail);
                        }
                        break;

                        

                    }
                        

                }
                case 5:
                    System.out.println("Enter the name of attendee to find: ");
                    String nameToFind = reader.nextLine();
                    for(Attendee attendee :eventAttendees){
                        System.out.println(attendee);
                        if(attendee.getName().equals(nameToFind)){
                            System.out.println(attendee);
                            break;
                        }

                    }
                case 6:
                    System.out.println("Here is the list of attendees:" + "\n" + eventAttendees);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    



                


        }

    }
}