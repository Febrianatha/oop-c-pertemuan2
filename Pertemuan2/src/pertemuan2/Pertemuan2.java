package pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Febriana Agatha
 * TGL: 15 Maret 2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mhs ="Febriana Agatha Lama Beraf";
        Long nim=2301010291L;
        String kelas="C";
        
        BufferedReader dtIn = new BufferedReader (new InputStreamReader(System.in));
        
       
       
        try {
            System.out.print ("Input Nama Mahasiswa: ");
            mhs = dtIn.readLine();
            
            System.out.print ("Input Nim: ");
            nim = Long.parseLong( dtIn.readLine() );
        }catch (IOException e){
            System.out.println("Maaf eror");
        }
        kelas = JOptionPane.showInputDialog("Input Kelas: ");
        
        System.out.println ("Data "+mhs+" dengan Nim "+ nim+ " berada di kelas "+kelas);
      
    }
    
}
