import java.util.*;;
public class CircularQueueAllOperations {
    
     // Declare CQueue With Size of 5
     public static int CQueue[] = new int[5];
     public static int Front, Rear;

    // CQInsert Method 

    public static void CQInsert(int num){

        // reset rear point

        if(Rear == CQueue.length-1){
            Rear = 1;
        }
        else{
            Rear++;
        }

        // overflow 

        if(Front == Rear){
            System.out.println("Cirular Queue is Overflow");
        }

        CQueue[Rear] = num;

        // check front pointer properly set 

        if(Front == 0){
            Front = 1;
        }

    }


    // CQDelete Method 

    public static void CQDelete(){


    // underflow check 

    if(Front == 0){
        System.out.println("Circular Queue is Underflow");
    }

    System.out.println("Delete Element : " + CQueue[Front]);

    // check Empty 

    if(Front == Rear){
        Front =0 ; Rear = 0;
    }

    // increment  front pointer

    if(Front == CQueue.length-1){
        Front = 1;
    }
    else{
        Front++;
    }

    }


    public static void Display() {
        if (Front == -1) {
            System.out.println(" Circular Queue is Empty!");
        } else {
            System.out.println("Circular Queue elements are:");
            for (int i = Front; i <= Rear; i++) {
                System.out.println(CQueue[i]);
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
                    CQInsert(num);
                    break;

                case 3:
                    CQDelete();
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
