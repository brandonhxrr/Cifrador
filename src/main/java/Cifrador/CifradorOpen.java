package Cifrador;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CifradorOpen {
    private final int llave;
    
    public CifradorOpen(int llave){
        this.llave = llave;
    }
    
    public void cifrar(InputStream inStr, OutputStream outStr) throws IOException{
        boolean ono = false;
        while(!ono){
            int sigleer = inStr.read(); //leemos siguiente byte
            
            if(sigleer ==-1){
                ono = true;
            }else{
                byte b =(byte) sigleer; 
                byte c = (byte)(b + llave);
                outStr.write(c);
            }
        }
    }
    
    public void descifrar(InputStream inStr, OutputStream outStra) throws IOException{
        boolean ono = false;
        while(!ono){
            int sigleer = inStr.read(); //leemos siguiente byte
            
            if(sigleer ==-1){
                ono = true;
            }else{
                byte b =(byte) sigleer; 
                byte c = (byte)(b - llave);
                outStra.write(c);
            }
        }
    }

}
