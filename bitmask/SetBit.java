package bitmask;

public class SetBit {
    
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask = 1<<pos;
        int newno= bitMask | n;
        System.out.println("New number : "+newno);
        
    }
}
