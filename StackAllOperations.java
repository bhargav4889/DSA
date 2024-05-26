import java.util.Scanner;

public class StackAllOperations {

    // Declare a stack with size 5
    public static int Stack[] = new int[5];
    public static int Top = -1;

    // PUSH Method
    public static void Push(int n) {
        if (Top >= Stack.length - 1) {
            System.out.println("Stack Now is OverFlow");
            return;
        }
        Top++;
        Stack[Top] = n;
        System.out.println("Element pushed: " + Stack[Top]);
    }

    // POP Method
    public static void Pop() {
        if (Top < 0) {
            System.out.println("Stack Now is Underflow");
            return;
        }
        System.out.println("POP Item is: " + Stack[Top--]);
    }

    // PEEP Method
    public static void Peep(int i) {
        if (Top - i + 1 < 0) {
            System.out.println("Stack Now is Underflow");
            return;
        }
        System.out.println("Stack ith Element is: " + Stack[Top - i + 1]);
    }

    // Change Method
    public static void Change(int i, int x) {
        if (Top - i + 1 < 0) {
            System.out.println("Stack Now is Underflow");
            return;
        }
        Stack[Top - i + 1] = x;
        System.out.println("Stack Changed Value is: " + Stack[Top - i + 1]);
    }

    // Display Method
    public static void Display() {
        if (Top < 0) {
            System.out.println("Stack Now is Underflow");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = Top; i >= 0; i--) {
            System.out.println("Element: " + Stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---- OPTIONS ----");
            System.out.println("1. Display");
            System.out.println("2. Push");
            System.out.println("3. Pop");
            System.out.println("4. Change");
            System.out.println("5. Peep");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Display();
                    break;
                case 2:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    Push(element);
                    break;
                case 3:
                    Pop();
                    break;
                case 4:
                    System.out.print("Enter position to change: ");
                    int pos = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    int newVal = scanner.nextInt();
                    Change(pos, newVal);
                    break;
                case 5:
                    System.out.print("Enter position to peep: ");
                    int peepPos = scanner.nextInt();
                    Peep(peepPos);
                    break;
                case 6:
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
