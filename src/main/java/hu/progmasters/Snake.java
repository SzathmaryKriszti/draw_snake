package hu.progmasters;

public class Snake {

    /*

  This method will draw a shape that would look like this:

  . . . . . . . . .
  . x x x . . . . .
  . . . x x x . . .
  . . . . . x x x .
  . . . . . . . . .

  */
    public static void main(String[] args) {

        drawSnake();

    }


    private static void drawSnake() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 9; j++) {
                if ((i == 2 && j > 1 && j < 5) || (i == 3 && j > 3 && j < 7) || (i == 4 && j > 5 && j < 9)) {
                    System.out.print("X ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}