import java.io.*;

public class WordCounter {
  public static void main(String[] args) throws FileNotFoundException, IOException{
    try {
      // if file name is specfied, proceed
      if (args.length > 0) {
        System.out.print("\nOpening file '" + args[0] + "'..."); 
        File myFile = new File(args[0]);
        FileReader myFileReader = new FileReader(myFile);
        BufferedReader reader = new BufferedReader(myFileReader);

        String line;
        String[] words; 
        System.out.println("\n");
        
        // read line by line
        // then split words and store in an array
        // print out the array's length
        while ((line = reader.readLine()) != null) {
          // "//s+" matches sequence of one or more whitespace characters.
          words = line.split("\\s+");
          System.out.println(words.length + ": " + line);
        } // end of while
      } else { 
          System.out.println("\nNo file specified!");
        } // end of else
    } catch (FileNotFoundException exObject) {
      System.out.println("\nError reading '" + args[0] + "'..." );
    } catch (IOException exOjbect) {
      System.out.println("\nError!");
    } // end of IEOException catch
  } // end of main
} // end of class