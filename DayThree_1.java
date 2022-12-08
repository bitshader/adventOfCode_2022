import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class DayThree_1{
  public static void main(String[] args) {

    try {
      File myObj = new File("testDayThree.txt");
      Scanner myReader = new Scanner(myObj);
      Integer sum = 0;
      String alphabet = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
      while (myReader.hasNextLine()) { 
        String line = myReader.nextLine(); 
        String first = "";
        String second = "";
        int point = 0;

        //divide the line into two halves
        first = line.substring(0, ((line.length()/2)));
        second = line.substring((line.length()/2), (line.length()));

        for(int i=0; i<(first.length()); i++){
            for(int j=0; j<(second.length()); j++){
                if(first.charAt(i) == second.charAt(j)){
                    second = removeChr(second, first.charAt(i)); //remove all character duplicate
                    point = 0;
                    while(first.charAt(i) != alphabet.charAt(point)){
                        point++;
                    }
                    sum = sum+point;
                }
            }
        }       
      }  
      System.out.println(sum);
      myReader.close();
    }
      
      catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  //Function that is used to delete duplicate characters to avoid adding up the score multiple times
  public static String removeChr(String str, char x){
    StringBuilder strBuilder = new StringBuilder();
    char[] rmString = str.toCharArray();
    for(int i=0; i<rmString.length; i++){
        if(rmString[i] == x){

        } else {
            strBuilder.append(rmString[i]);
        }
    }
    return strBuilder.toString();
}

}