import java.util.*;

public class DoubleQueueAllOperations {

    // Declare DQueue With Size of 5
    public static int DQueue[] = new int[5];
    public static int Front, Rear;

    // DQInsert_REAR Same as Simple Queue Insert

    public static void DQInsert_REAR(int num) {
        if (Rear == DQueue.length - 1) {
            System.out.println("Double Queue is Overflow!");
        } else {
            if (Front == -1) {
                Front = 0;
            }
            Rear++;
            DQueue[Rear] = num;
        }
    }

    // DQDelete_FRONT Same as Simple Queue Delete
    
    public static void DQDelete_FRONT() {
        if (Front == -1 || Front > Rear) {
            System.out.println("Queue is Underflow!");
        } else {
            System.out.println("Dequeued: " + DQueue[Front]);
            Front++;
            // Reset the queue when all elements are dequeued
            if (Front > Rear) {
                Front = -1;
                Rear = -1;
            }
        }
    }


    // DQInsert_FRONT Method

    public static void DQInsert_FRONT(int num){

        if(Front == 0){
            System.out.println("Double Queue is Empty !");
        }

        if(Front == 1){
            System.out.println("Double Queue is Overflow !");
        }

        Front--;

        DQueue[Front] = num;

    }

    // DQDelete_REAR Method

    public static void DQDelete_REAR(){

        if(Rear == 0){
            System.out.println("Double Queue is Underflow");
        }

        System.out.println("Delete Element is: -"+DQueue[Rear]);


        // check is Queue Empty

        if(Front == Rear){
            Rear = 0; Front=0;
        }
        else{
            Rear--;
        }

    }

    // Display Method 


    public static void Display(){
        if(Front == -1){
            System.out.println("Double Queue is Empty !");
        }else {
            System.out.println("Queue elements are:");
            for (int i = Front; i <= Rear; i++) {
                System.out.println(DQueue[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---- OPTIONS ----");
            System.out.println("1. Display");
            System.out.println("2. Insert Front");
            System.out.println("3. Insert Rear");
            System.out.println("4. Delete Front");
            System.out.println("5. Delete Rear");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Display();
                    break;

                case 2:
                    System.out.print("Enter Number: ");
                    int numFront = scanner.nextInt();
                    DQInsert_FRONT(numFront);
                    break;

                case 3:
                    System.out.print("Enter Number: ");
                    int numRear = scanner.nextInt();
                    DQInsert_REAR(numRear);
                    break;

                case 4:
                    DQDelete_FRONT();
                    break;

                case 5:
                    DQDelete_REAR();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice. Enter a valid choice.");
                    break;
            }
        }
    }

}
