package paagbi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesFNEKontrolatuz {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            try {
                in = new FileInputStream("xanadu.txt");
            } catch (FileNotFoundException e) {
                System.err.println("FileNotFoundException" + e.getMessage());
            }
            
            out = new FileOutputStream("xanaduFN.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
