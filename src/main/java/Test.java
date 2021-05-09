import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Test  {
    
    public static void main(String args[]) {
    
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Write any thing : ");
        FileWriter w;
        try {
            w = new FileWriter("D:\\Text");
            BufferedWriter buffer = new BufferedWriter(w);
        String name;
        do{
        name=br.readLine();
        if(name.equals("stop"))
           break;
        else{
            buffer.write(name);
            System.out.println(name);
            
        }
        } while(!name.equals("stop"));
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
