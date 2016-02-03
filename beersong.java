
public class beersong

{
    public static void main (String[] args) {
        int number = 99;
        String word = "bottles";

        while (number > 0) {

            if (number == 1) {
                word = "bottle";
            }

            System.out.print(number + " " + word + " of beer on the wall");
            System.out.println(", " + number + " " + word + " of beer");
            System.out.print("Take one down, ");
            System.out.print("pass it around, ");

            number = number - 1;

            if (number > 0)
            {
                System.out.println(number + " " + word + " of beer on the wall.");
                System.out.println(" ");
            }
            else
            {
                System.out.println("no more bottles of beer on the wall.");
            }
        }
    }
}
