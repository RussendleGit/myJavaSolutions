import java.io.*;

class Code {
    public static void main(String[] args) throws Exception {
        File toSift = new File("Demo.txt") ;
        BufferedReader siftRead = new BufferedReader(new FileReader(toSift));
        String stringRead;
        while ((stringRead = siftRead.readLine()) != null) {
            System.out.println(stringRead);
        }
        siftRead.close();

    }
}