import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class DayTwo_1 {
  public static void main(String[] args) {

    try {
      File myObj = new File("testDayTwo.txt");
      Scanner myReader = new Scanner(myObj);
      int punteggio = 0;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        
        char opponent = data.charAt(0);
        char my = data.charAt(2);
        
        //pareggio
          if((my == 'X') && (opponent == 'A')){
            punteggio = punteggio + 4;
          }
          if((my == 'Y') && (opponent == 'B')){
            punteggio = punteggio + 5;
          }
          if((my == 'Z') && (opponent == 'C')){
            punteggio = punteggio + 6;
          }
        //vittoria
          if((my == 'X') && (opponent == 'C')){
          punteggio = punteggio + 7;
          }
          if((my == 'Y') && (opponent == 'A')){
          punteggio = punteggio + 8;
         }
          if((my == 'Z') && (opponent == 'B')){
          punteggio = punteggio + 9;
         }
        //sconfitta
          if((my == 'X') && (opponent == 'B')){
          punteggio = punteggio + 1;
          }
          if((my == 'Y') && (opponent == 'C')){
          punteggio = punteggio + 2;
          }
          if((my == 'Z') && (opponent == 'A')){
          punteggio = punteggio + 3;
          }
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
  