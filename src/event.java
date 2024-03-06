import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class event {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Event event = new Event();

        // 得到用户(学生)数据
        System.out.print("Enter event ID: ");
        event.setEventID(scanner.nextLine());

        System.out.print("Enter event name: ");
        event.setEventName(scanner.nextLine());

        System.out.print("Enter event venue: ");
        event.setEventVenue(scanner.nextLine());

        System.out.print("Enter event date (YYYY-MM-DD): ");
        String dateInput = scanner.nextLine();
        try {
            System.out.println("Invalid date format. Please use the format YYYY-MM-DD.");
            return;
        }

        
        boolean done = false;
        while (!done) {
            System.out.println("Event attendees:");
            System.out.println("1. Add attendee");
            System.out.println("2. Remove attendee");
            System.out.println("3. Update attendee");
            System.out.println("4. Find attendee");
            System.out.println("5. Display total attendees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the attendee: ");
                    String attendeeName = scanner.nextLine();
                    event.addAttendee(attendeeName);
                    break;
                case 2:
                    System.out.print("Enter the name of the attendee to remove: ");
                    attendeeName = scanner.nextLine();
                    event.removeAttendee(attendeeName);
                    break;
                case 3:
                    System.out.print("Enter the name of the attendee to update: ");
                    attendeeName = scanner.nextLine();
                    System.out.print("Enter the new name for the attendee: ");
                    String newAttendeeName = scanner.nextLine();
                    event.updateAttendee(attendeeName, newAttendeeName);
                    break;
                case 4:
                    System.out.print("Enter the name of the attendee to find: ");
                    attendeeName = scanner.nextLine();
                    event.findAttendee(attendeeName);
                    break;
                case 5:
                    System.out.println("Total number of attendees: " + event.getTotalAttendees());
                    break;
                case 6:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // 设置该项目的细节
        System.out.println("Event Details:");
        System.out.println("Event ID: " + event.getEventID());
        System.out.println("Event Name: " + event.getEventName());
        System.out.println("Event Venue: " + event.getEventVenue());
        System.out.println("Event Date: " + event.getEventDate());
        System.out.println("Attendees:");
        event.displayAttendees();
    }
}

class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private Date eventDate;
    private ArrayList<String> eventAttendees;

    public Event() {
        eventAttendees = new ArrayList<>();
    }

    // Getters and setters
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

    // 计划该项目的目标
    public void organizeEvent() {
        
    }

    public void addAttendee(String attendeeName) {
        eventAttendees.add(attendeeName);
    }

    public void removeAttendee(String attendeeName) {
        eventAttendees.remove(attendeeName);
    }

    public void updateAttendee(String oldName, String newName) {
        int index = eventAttendees.indexOf(oldName);
        if (index != -1) {
            eventAttendees.set(index, newName);
        } else {
            System.out.println("Attendee not found.");
        }
    }

    public void findAttendee(String attendeeName) {
        if (eventAttendees.contains(attendeeName)) {
            System.out.println("Attendee found: " + attendeeName);
        } else {
            System.out.println("Attendee not found.");
        }
    }

    public int getTotalAttendees() {
        return eventAttendees.size();
    }

    public void displayAttendees() {
        for (String attendee : eventAttendees) {
            System.out.println(attendee);
        }
    }
}