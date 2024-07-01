package bitmask;

public class ClearBit {
    public static void main(String[] args) {
        
        int n=5;
        int pos=2;
        int bitMask = 1<<pos;
        int notBM= ~bitMask;
        int newno= notBM & n;
        System.out.println(newno);


    }
    
}
