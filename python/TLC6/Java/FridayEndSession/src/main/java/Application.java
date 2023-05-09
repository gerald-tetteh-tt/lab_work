import trading.*;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

    public static void main(String[] args) {
        Trade t1 = new Fund("T1", "APPL", 100, 15.25);

        Trade t2 = new Bond("T2", "TSL", 10, 12.45, 0.2);


        System.out.println(t1);
        System.out.println(t2);
        t2.setPrice(1);
        System.out.println(t2);
        Account acc = new Account();
        Trader joe = new Trader("Joe",acc);
        joe.addTrade(t1);
        System.out.println(joe.getValueOfTrades());
        for (int i =0; i <=4; i++) {
            System.out.println(joe.getValueOfTrades());
            joe.addTrade(t2);
        }


        //checked exception
//        try{
//            FileReader freader  =new FileReader("MyFile");
//        }catch(FileNotFoundException ex){
//            System.out.println("File does not exist");
//        }
//        catch(Exception e){
//            System.out.println("I caught an exception!");
//        }finally{
//            System.out.println("Finally done!");
//        }
//        try {
//            readFromFile("MyFile");
//        }
//        catch(FileNotFoundException e){
//            System.out.println("Exception happened!!");
//        }
    }

    public static void readFromFile(String fileName) throws FileNotFoundException {
        FileReader freader  =new FileReader("MyFile");
    }
}
