import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class DayOne_2 {
  public static void main(String[] args) {
    int somma = 0;
    int risultato = 0;
    int uno = 0;
    int due = 0;
    int tre = 0;

    try {
      File myObj = new File("DayOne_1.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if(data.isEmpty() == true){
            if(somma > uno){
                tre = due;
                due = uno;
                uno = somma;
                somma = 0;
            }else if(somma > due){
              tre = due;
              due = somma;
              somma = 0;
            }else if(somma > tre){
              tre = somma;
              somma = 0;
            }else{
              somma = 0;
            }
        }else{
            somma = somma + Integer.valueOf(data);
        }
      risultato = uno + due + tre;
      }
      System.out.print(risultato);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}