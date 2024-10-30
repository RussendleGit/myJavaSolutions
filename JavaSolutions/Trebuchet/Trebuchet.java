package Trebuchet;

import java.io.*;
/*

 */
class Trebuchet {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File toSift = new File("final.txt");
        BufferedReader siftRead = new BufferedReader(new FileReader(toSift));

        String readedString;
        int finalInt = 0;
        // 48 - 57
        while ((readedString = siftRead.readLine()) != null) {
            String temp = "";
            char[] readSplit = readedString.toCharArray();
            for (int i = 0; i <= readSplit.length; i++) {
                if (readSplit[i] == 'o' && i + 2 < readSplit.length) {
                    if (readSplit[i + 1] == 'n' && readSplit[i + 2] == 'e') {
                        temp += '1';
                        System.out.println("one found");
                        break;
                    }
                }
                if (readSplit[i] == 't' && i + 2 < readSplit.length) {
                    if (readSplit[i + 1] == 'w' && readSplit[i + 2] == 'o') {
                        temp += '2';
                        System.out.println("two found");
                        break;
                    }
                }
                  if (readSplit[i] == 't' && i + 4 < readSplit.length) {
                    if (readSplit[i + 1] == 'h' && readSplit[i + 2] == 'r'
                        && readSplit[i + 3] == 'e' && readSplit[i + 4] == 'e') {
                        temp += '3';
                        System.out.println("three found");
                        break;
                    }
                }
                  if (readSplit[i] == 'f' && i + 3 < readSplit.length) {
                    if (readSplit[i + 1] == 'o' && readSplit[i + 2] == 'u'
                            && readSplit[i + 3] == 'r') {
                        temp += '4';
                        System.out.println("four found");
                        break;
                    }
                }
                  if (readSplit[i] == 'f' && i + 3 < readSplit.length) {
                    if (readSplit[i + 1] == 'i' && readSplit[i + 2] == 'v'
                            && readSplit[i + 3] == 'e') {
                        temp += '5';
                        System.out.println("five found");
                        break;
                    }
                }
                  if (readSplit[i] == 's' && i + 2 < readSplit.length) {
                    if (readSplit[i + 1] == 'i' && readSplit[i + 2] == 'x') {
                        temp += '6';
                        System.out.println("six found");
                        break;
                    }
                }
                  if (readSplit[i] == 's' && i + 4 < readSplit.length) {
                    if (readSplit[i + 1] == 'e' && readSplit[i + 2] == 'v'
                    && readSplit[i + 3] == 'e' && readSplit[i + 4] == 'n') {
                        temp += '7';
                        System.out.println("seven found");
                        break;
                    }
                }
                  if (readSplit[i] == 'e' && i + 4 < readSplit.length) {
                    if (readSplit[i + 1] == 'i' && readSplit[i + 2] == 'g'
                            && readSplit[i + 3] == 'h' && readSplit[i + 4] == 't') {
                        temp += '8';
                        System.out.println("eight found");
                        break;
                    }
                }
                  if (readSplit[i] == 'n' && i + 3 < readSplit.length) {
                    if (readSplit[i + 1] == 'i' && readSplit[i + 2] == 'n'
                            && readSplit[i + 3] == 'e') {
                        temp += '9';
                        System.out.println("nine found");
                        break;
                    }
                }
                  if (isInt(readSplit[i])) {

                    temp += readSplit[i];
                      System.out.println("int found" + temp);
                    break;
                }
            }
            for (int i = readSplit.length - 1; i >= 0; i--) {
                if (readSplit[i] == 'e' && i - 2 >= 0) {
                    if (readSplit[i - 1] == 'n' && readSplit[i - 2] == 'o') {
                        temp += '1';
                        System.out.println("one found");
                        break;
                    }
                }
                 if (readSplit[i] == 'o' && i - 2 >= 0) {
                    if (readSplit[i - 1] == 'w' && readSplit[i - 2] == 't') {
                        temp += '2';
                        System.out.println("two found");
                        break;
                    }
                }
                 if (readSplit[i] == 'e' && i - 4 >= 0) {
                    if (readSplit[i - 1] == 'e' && readSplit[i - 2] == 'r'
                            && readSplit[i - 3] == 'h' && readSplit[i - 4] == 't') {
                        temp += '3';
                        System.out.println("three found");
                        break;
                    }
                }
                 if (readSplit[i] == 'r' && i - 3 >= 0) {
                    if (readSplit[i - 1] == 'u' && readSplit[i - 2] == 'o'
                            && readSplit[i - 3] == 'f') {
                        temp += '4';
                        System.out.println("four found");
                        break;
                    }
                }
                 if (readSplit[i] == 'e' && i - 3 >= 0) {
                    if (readSplit[i - 1] == 'v' && readSplit[i - 2] == 'i'
                            && readSplit[i - 3] == 'f') {
                        temp += '5';
                        System.out.println("five found");
                        break;
                    }
                }
                 if (readSplit[i] == 'x' && i - 2 >= 0) {
                    if (readSplit[i - 1] == 'i' && readSplit[i - 2] == 's') {
                        temp += '6';
                        System.out.println("six found");
                        break;
                    }
                }
                 if (readSplit[i] == 'n' && i - 4 >= 0) {
                    if (readSplit[i - 1] == 'e' && readSplit[i - 2] == 'v'
                            && readSplit[i - 3] == 'e' && readSplit[i - 4] == 's') {
                        temp += '7';
                        System.out.println("seven found");
                        break;
                    }
                }
                 if (readSplit[i] == 't' && i - 4 >= 0) {
                    if (readSplit[i - 1] == 'h' && readSplit[i - 2] == 'g'
                            && readSplit[i - 3] == 'i' && readSplit[i - 4] == 'e') {
                        temp += '8';
                        System.out.println("eight found");
                        break;
                    }
                }
                 if (readSplit[i] == 'e' && i - 3 >= 0) {
                    if (readSplit[i - 1] == 'n' && readSplit[i - 2] == 'i'
                            && readSplit[i - 3] == 'n') {
                        temp += '9';
                        System.out.println("nine found");
                        break;
                    }
                }
                if (isInt(readSplit[i])) {

                    temp += readSplit[i];
                    System.out.println("int found" + readSplit[i]);
                    break;
                }

            }
            System.out.println(readedString);
            finalInt += Integer.parseInt(temp);
        }
        System.out.println(finalInt);


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