import java.util.Scanner;

public class SimpleQueueAllOperations {

    // Declare Queue With Size of 5
    public static int Queue[] = new int[5];
    public static int Front = -1, Rear = -1;

    // Enqueue Method
    public static void Enqueue(int num) {
        if (Rear == Queue.length - 1) {
            System.out.println("Queue is Overflow!");
        } else {
            if (Front == -1) {
                Front = 0;  
            }
            Rear++;
            Queue[Rear] = num;
        }
    }

    // Dequeue Method
    public static void Dequeue() {
        if (Front == -1 || Front > Rear) {
            System.out.println("Queue is Underflow!");
        } else {
            System.out.println("Dequeued: " + Queue[Front]);
            Front++;
            // Reset the queue when all elements are dequeued
            if (Front > Rear) {
                Front = -1;
                Rear = -1;
            }
        }
    }

    public static void Display() {
        if (Front == -1) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Queue elements are:");
            for (int i = Front; i <= Rear; i++) {
                System.out.println(Queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---- OPTIONS ----");
            System.out.println("1. Display");
            System.out.println("2. Enqueue");
            System.out.println("3. Dequeue");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Display();
                    break;

                case 2:
                    System.out.println("Enter Number: ");
                    int num = scanner.nextInt();
                    Enqueue(num);
                    break;

                case 3:
                    Dequeue();
                    break;

                case 4:
                    System.out.println("Exiting..");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice. Enter a valid choice.");
                    break;
            }
        }
    }
}
