/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copybytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author oracle
 */
public class CopyBytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File origen = new File("/home/oracle/Desktop/texto1.txt");
        InputStream in = new FileInputStream(origen);

        File destino = new File("/home/oracle/Desktop/texto2.txt");
        OutputStream out = new FileOutputStream(destino, true);

        byte[] buf = new byte[1024];
        int len;

        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);

        }
        in.close();
        out.close();
    }
}
