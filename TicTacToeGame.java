package workShopOne;
public class TicTacToeGame {

    public static void main (String[] args){

    TicTacToeGame temp= new TicTacToeGame();
    temp.printBoard();
    }
    static void printBoard()
    {
        String[] board = new String[9]; // this is where i decl array

        System.out.println("|---|---|---|");
        System.out.println("| " + 1 + " | "
                + 2 + " | " + 3
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + 4 + " | "
                + 5 + " | " + 6
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + 7 + " | "
                + 8 + " | " + 9
                + " |");
        System.out.println("|---|---|---|");
    }
}

