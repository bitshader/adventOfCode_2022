import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class DayThree_2 {
    public static void main(String[] args) {

        try {
            File myObj = new File("testDayThree.txt");
            Scanner myReader = new Scanner(myObj);
            Integer sum = 0;
            String alphabet = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            boolean isIn2 = false;
            boolean isIn3 = false;
            int point = 0;

            while (myReader.hasNextLine()) {
                String line1 = myReader.nextLine();
                String line2 = myReader.nextLine();
                String line3 = myReader.nextLine();
                int index = 0;
                do { 

                    // compare the first character of line1 with the rest of the lines

                    // line 2
                    isIn2 = false;
                    isIn3 = false;
                    for (int i = 0; i < line2.length(); i++) {
                        if (line1.charAt(index) == line2.charAt(i)) {
                            isIn2 = true;
                        }
                    }

                    // line 3
                    for (int i = 0; i < line3.length(); i++) {
                        if (line1.charAt(index) == line3.charAt(i)) {
                            isIn3 = true;
                        }
                    }

                    index++;

                } while ((isIn2 == false) || (isIn3 == false));

                // the character found at the index is the elf badge
                point = 0;
                while (line1.charAt(index - 1) != alphabet.charAt(point)) {
                    point++;
                }
                sum = sum + point;

            }
            System.out.println(sum);
            myReader.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}