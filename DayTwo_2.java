import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class DayTwo_2 {
  public static void main(String[] args) {

    try {
      File myObj = new File("testDayTwo.txt");
      Scanner myReader = new Scanner(myObj);
      int punteggio = 0;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        
        char chosen = data.charAt(0);
        char result = data.charAt(2);
        
        //pareggio
        if(result == 'Y'){
          if(chosen == 'A'){
            punteggio = punteggio + 4;
          }
          if(chosen == 'B'){
            punteggio = punteggio + 5;
          }
          if(chosen == 'C'){
            punteggio = punteggio + 6;
          } }
        //vittoria
        if(result == 'Z'){
            if(chosen == 'A'){
              punteggio = punteggio + 8;
            }
            if(chosen == 'B'){
              punteggio = punteggio + 9;
            }
            if(chosen == 'C'){
              punteggio = punteggio + 7;
            } }
        //sconfitta
        if(result == 'X'){
            if(chosen == 'A'){
              punteggio = punteggio + 3;
            }
            if(chosen == 'B'){
              punteggio = punteggio + 1;
            }
            if(chosen == 'C'){
              punteggio = punteggio + 2;
            } }
      }
      System.out.println(punteggio);
      myReader.close();
      }
      
      catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
  
