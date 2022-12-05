import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class DayOne_1 {
  public static void main(String[] args) {
    int somma = 0;
    int risultato = 0;
    try {
      File myObj = new File("testDayOne.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if(data.isEmpty() == true){
            if(somma > risultato){
                risultato = somma;
                somma = 0;
            }else{
                somma = 0;
            }
        }else{
            somma = somma + Integer.valueOf(data);
        }
        
      }
      System.out.print(risultato);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}