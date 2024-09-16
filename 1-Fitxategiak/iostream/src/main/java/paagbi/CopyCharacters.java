package paagbi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** Programa honek proiektuaren erroan dagoen Xanadu fitxategia bytez byte irakurtzen du, 
* byte bakoitza outagain.txt fitxategian idatziz. Honek CopyByte-en antzera funcionatzen du, 
* honek 8 byte gorde ordez 16 byte gordetzen ditu
*/
public class CopyCharacters {
    public static void main(String[] args) throws IOException{
        BufferedReader inputStream = null;
        BufferedWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = new BufferedWriter(new FileWriter("characteroutput.txt"));

            int c;
            while ((c = inputStream.read()) != -1) {
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
