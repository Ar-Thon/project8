import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Program8{
    public static void main(String[]args){
        File theFile = new File("input1.txt");
        try{
            Scanner scan= new Scanner(theFile);
            Queue queue1=new Queue(65);
            while(scan.hasNext()){
                scan.useDelimiter( "" );
                String singleCharString = scan.next( );
                if(queue1.isEmpty()){
                    queue1.enqueue(singleCharString.charAt(0));

                }
                else if(queue1.isFull()!=true){
                    for(int i=0;i<=queue1.size();i++)
                    queue1.enqueue(singleCharString.charAt(i));
                    System.out.println(queue1.size());
                }
                else {
                    queue1.dequeue();
                }
            }
        }
        catch(FileNotFoundException | QueueFullException |QueueEmptyException e){
            System.out.println("error");
            e.printStackTrace();
        }

    }

}
