package org.example.imageCompress;

public class CompressorSubClass1 extends CompressorTemplate{
    @Override
    public void preCompress(int [] data) {
        System.out.println("La compresseur 1 est lancé");
        int s =0;
        for (int d : data) {
            s = s+d;
        }
        System.out.println("\tLa taille totale avant compression : "+s);
    }

    @Override
    public void postCompress(int [] data) {
        int s =0;
        for (int d : data) {
            s = s+d;
        }
        System.out.println("\tLa taille totale après compression : "+s);
        System.out.println("Compression effectué avec le compresseur 1 ");
    }
}
