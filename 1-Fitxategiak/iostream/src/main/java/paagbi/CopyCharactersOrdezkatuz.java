package paagbi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersOrdezkatuz {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new BufferedWriter(new FileWriter("xanaduAToB.txt"));

            int c;
            while ((c = inputStream.read()) != -1) {
                if (c == 'a') {
                    c = 'o';
                } else if (c == 'A'){
                    c = 'O';
                }
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
