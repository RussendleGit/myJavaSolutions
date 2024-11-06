import java.io.*;
import java.util.ArrayList;

class Code {
    public static void main(String[] args) throws Exception {
        File toSift = new File("Demo.txt") ;
        BufferedReader siftRead = new BufferedReader(new FileReader(toSift));
        String stringRead;
        ArrayList<String> lines = new ArrayList<String>();
        String edge = "";
        while ((stringRead = siftRead.readLine()) != null) {
            lines.add(stringRead);
        }
        for (int i = 0; i < lines.get(0).length(); i++) {
            edge += ".";
        }
        for (int line = 0; line < lines.size(); line++) {
            String top = (line - 1 >= 0) ? lines.get(line - 1) : edge;
            String mid = lines.get(line);
            String btm = (line + 1 < lines.size()) ? lines.get(line + 1) : edge;
            char[] topArray = top.toCharArray();
            char[] midArray = mid.toCharArray();
            char[] btmArray = btm.toCharArray();
            for (int i = 0; i < midArray.length; i++) {
                if (isInt(midArray[i])) {
                    if ((!isInt(topArray[i]) && topArray[i] != '.') || (!isInt(btmArray[i]) && btmArray[i] != '.')) {
                        System.out.println(midArray[i]);
                    } else if  ((line + 1 < midArray.length) &&
                                ((!isInt(topArray[i + 1]) && topArray[i] != '.') || 
                                (!isInt(btmArray[i]) && btmArray[i + 1] != '.') || 
                                (!isInt(midArray[i + 1]) && midArray[i] != '.'))) {
                        
                        System.out.println("else" + midArray[i]);
                    } 
                }
            }
        }
        siftRead.close();

        

    }
    public static boolean isInt(char input) {
        for (int i = 48; i <= 57; i++) {
            if (input == i) {

                return true;
            }
        }
        return false;
    }
}