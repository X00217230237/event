import java.util.ArrayList;
import java.time.LocalDate; 
import java.util.Scanner;

class Attendee {
    String name;
    char gender;
    int age;
    String email;

    public Attendee(String name, char gender, int age, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }
}

public class Event {
    private String eventID;
    private String eventName;
    private LocalDate eventDate; 
    private String eventVenue;
    private ArrayList<Attendee> eventAttendees; 

    public Event() {
        eventAttendees = new ArrayList<>();
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String id) {
        this.eventID = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String name) {
        this.eventName = name;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(String date) {
        this.eventDate = LocalDate.parse(date);
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String venue) {
        this.eventVenue = venue;
    }

    public void organizeEvent() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Enter event details");
            System.out.println("2. Add attendees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter the Event ID:");
                    setEventID(scanner.nextLine());
                    System.out.println("Enter the name of the event:");
                    setEventName(scanner.nextLine());
                    System.out.println("Enter the Event date(YYYY-MM-DD):");
                    setEventDate(scanner.nextLine());
                    System.out.println("Enter the event's venue:");
                    setEventVenue(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("How many attendees are coming:");
                    int num = scanner.nextInt();
                    scanner.nextLine(); 

                    for (int i = 0; i < num; i++) {
                        System.out.println("Enter the name of the attendee:");
                        String name = scanner.nextLine();
                        System.out.println("Enter the gender of the attendee (M/F):");
                        char gender = scanner.nextLine().charAt(0);
                        System.out.println("Enter the age of the attendee:");
                        int age = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.println("Enter the email of the attendee:");
                        String email = scanner.nextLine();

                        eventAttendees.add(new Attendee(name, gender, age, email));
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3); 

        scanner.close(); 
    }
}