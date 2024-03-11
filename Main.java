import java.util.Scanner;


public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter event ID : ");
String eventID = scanner.nextLine();
System.out.println("Enter event name : ");
String eventName = scanner.nextLine();
System.out.println("Enter event venue : ");
String eventVenue = scanner.nextLine();
System.out.println("Enter event date : ");
String eventDate = scanner.nextLine();
ArrayList event = new arrayList(eventID,eventName,eventVenue,eventDate);
System.out.println("Enter number of attendees");
int numAttendees = Integer.parseInt(scanner.nextLine());

for(int i = 0; i < numAttendees;i++){
System.out.println("Enter attendee name : ");
String attendeeName = scanner.nextLine();
event.addAttendee(attendeeName);
}
System.out.println("\nEvent Details: ");
 System.out.println(event);
System.out.println("\nAttendees: ");
event.displayAttendees();

 scanner.close();
}
}