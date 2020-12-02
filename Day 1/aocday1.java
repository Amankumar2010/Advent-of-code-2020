import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class aocday1{

    public static void main(String[] args){
        ArrayList<Integer> values = loadData("input.txt");

        for ( int i = 0; i < values.size(); i++ ){
            int required =  2020 - values.get(i);
            int Num1 , Num2 , Num3;

            if ( values.contains(required)  && (required != values.get(i))) {

                Num1 = required ;
                System.out.println ( "First number is " + Num1);
                Num2 = 2020 - required ;
                System.out.println( "Second number is " + Num2 );
                Num3 = required * values.get(i);
                System.out.println("The multiplication of the two found number is " + Num3);
                break;


            } else if ( required == 1010){
                System.out.println(1010*2 + "is doomed");
                break;
            }
        }
    }

    public static ArrayList<Integer> loadData (String fileName){
        ArrayList<Integer> values = new ArrayList<>();

        try {
            File myFile = new File(fileName);
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                values.add( Integer.parseInt(scanner.nextLine()));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("loading error");
            e.printStackTrace();
        }
        return values;
    }
}
