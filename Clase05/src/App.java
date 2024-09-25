import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.PrintWriter;


public class App {

    public static void leer(File f, FileReader fr, BufferedReader br){


    }

    public static void escribir(File f, FileWriter fw, PrintWriter pw){
        try{
            fw = new FileWriter(f);
        pw = new PrintWriter(fw);

        for(int i = 0; i < 10; i++){
            pw.write("Linea: "+ i);
            
        }
        } catch(IOError io){


        }
        finally{
            try{
                if(fw != null) pw.close();
                if(fw != null) fw.close();
            } catch(null){

            }
        }

    }

    public static void main(String[] args) throws Exception {
        File fichero = null;
        
        FileReader reader = null;
        BufferedReader buffer = null;

        FileWriter fw = null;
        PrintWriter pw = null;

        try{
            fichero = new File("/home/pepmatt/Documentos/Di/Clase05","texto.txt");

        }catch(FileNotFoundException fin){}
        
    }
}
