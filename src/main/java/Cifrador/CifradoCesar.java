package Cifrador;

public class CifradoCesar {
    private final int llave;
    
    
    public CifradoCesar(int llave){
        this.llave = llave;
    }
    
    public String cifrar(String texto) {
        char[] caracteres = texto.toLowerCase().toCharArray();
        char[] mensajeCifrado = new char[caracteres.length];

        for (int i = 0; i < caracteres.length; i++) {
            char c = (char) ((caracteres[i] + llave) % 'a');
            mensajeCifrado[i] = c;
        }

        return new String(mensajeCifrado);
    }

}
