import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Chess Game =====");
        System.out.println("1. King");
        System.out.println("2. Queen");
        System.out.println("3. Rook");
        System.out.println("4. Bishop");
        System.out.println("5. Knight");
        System.out.println("6. Pawn");

        System.out.print("Choose a piece (1-6): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("King: Moves one square in any direction.");
                break;
            case 2:
                System.out.println("Queen: Moves any number of squares in any direction.");
                break;
            case 3:
                System.out.println("Rook: Moves any number of squares horizontally or vertically.");
                break;
            case 4:
                System.out.println("Bishop: Moves any number of squares diagonally.");
                break;
            case 5:
                System.out.println("Knight: Moves in 'L' shape (2 and 1).");
                break;
            case 6:
                System.out.println("Pawn: Moves forward 1 square (2 squares on first move). Captures diagonally.");
                break;
            default:
                System.out.println("Invalid choice! Please select 1-6.");
        }

        // Print a simple 8x8 chessboard
        System.out.println("\nChessboard Layout:");
        for (int row = 1; row <= 8; row++) {
            for (int col = 1; col <= 8; col++) {
                if ((row + col) % 2 == 0)
                    System.out.print("■ "); // white square
                else
                    System.out.print("□ "); // black square
            }
            System.out.println();
        }

        sc.close();
    }
}
