import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.ArrayList;  
import java.util.Date;  
import java.util.Scanner;  
  
class Event {  
    private String eventID;  
    private String eventName;  
    private String eventVenue;  
    private Date eventDate;  
    private ArrayList<String> eventAttendees;  
  
    public Event() {  
        this.eventAttendees = new ArrayList<>();  
    }  
  
    public void organizeEvent() {  
        Scanner scanner = new Scanner(System.in);  
  
        System.out.print("Enter event ID: ");  
        eventID = scanner.nextLine();  
  
        System.out.print("Enter event name: ");  
        eventName = scanner.nextLine();  
  
        System.out.print("Enter event venue: ");  
        eventVenue = scanner.nextLine();  
  
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
  
        while (true) {  
            System.out.print("Enter event date (yyyy-MM-dd): ");  
            try {  
                eventDate = dateFormat.parse(scanner.nextLine());  
                break;  
            } catch (ParseException e) {  
                System.out.println("Invalid date format. Please try again.");  
            }  
        }  
  
        while (true) {  
            System.out.print("Enter the name of an attendee (or 'done' to finish): ");  
            String name = scanner.nextLine();  
            if (name.equalsIgnoreCase("done")) {  
                break;  
            }  
            eventAttendees.add(name);  
        }  
  
        System.out.println("\nEvent Details:");  
        System.out.println("Event ID: " + eventID);  
        System.out.println("Event Name: " + eventName);  
        System.out.println("Event Venue: " + eventVenue);  
        System.out.println("Event Date: " + dateFormat.format(eventDate));  
        System.out.println("Total Attendees: " + eventAttendees.size());  
        System.out.println("Attendees:");  
        for (String attendee : eventAttendees) {  
            System.out.println(attendee);  
        }  
  
        scanner.close();  
    }  
  
    // Getters and Setters  
    public String getEventID() {  
        return eventID;  
    }  
  
    public void setEventID(String eventID) {  
        this.eventID = eventID;  
    }  
  
    public String getEventName() {  
        return eventName;  
    }  
  
    public void setEventName(String eventName) {  
        this.eventName = eventName;  
    }  
  
    public String getEventVenue() {  
        return eventVenue;  
    }  
  
    public void setEventVenue(String eventVenue) {  
        this.eventVenue = eventVenue;  
    }  
  
    public Date getEventDate() {  
        return eventDate;  
    }  
  
    public void setEventDate(Date eventDate) {  
        this.eventDate = eventDate;  
    }  
  
    public ArrayList<String> getEventAttendees() {  
        return eventAttendees;  
    }  
  
    public void setEventAttendees(ArrayList<String> eventAttendees) {  
        this.eventAttendees = eventAttendees;  
    }  
  
    // ToString method  
    @Override  
    public String toString() {  
        return "Event{" +  
                "eventID='" + eventID + '\'' +  
                ", eventName='" + eventName + '\'' +  
                ", eventVenue='" + eventVenue + '\'' +  
                ", eventDate=" + eventDate +  
                ", eventAttendees=" + eventAttendees +  
                '}';  
    }  
}  
