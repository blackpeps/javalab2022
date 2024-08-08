import java.io.*;
public class sum {
    public static void main (String[] args) {
        try {
            FileReader fin = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fin);
            String inp = br.readLine();
            int sum = 0;
            for (String element:inp.split(":")) {
                System.out.println(element);
                sum += Integer.parseInt(element);
            }
            System.out.println("Sum is: "+ sum);
            fin.close();
        }
        catch (IOException e) {
            System.out.println((e.getMessage()));
        }
    }
}
