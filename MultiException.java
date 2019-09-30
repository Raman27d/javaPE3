import java.util.Scanner;
import java.io.*;
import java.util.*;

class MultiException{
    public static void main(String[] args){
        int x;
        Scanner scanner = Scanner(System.in);
        x=scanner.nextInt();
        try{
            if(x<0)throw new NegativeArraySizeException("array size is negative");
            String[] strings= new String[x];
            for(int i=0; i<x+1; i++){
                try{
                    if(i>=x) throw new IndexOutOfBoundsException("IndexOutOfBoundException is here");
                    if(strings[i].equals(null)) throw new NullPointerException("NullPointerException is here");
                }catch(IndexOutOfBoundsException iobe){System.out.println("Exception occured: "+ iobe);}
                }catch(NullPointerException npe){System.out.println("Exception occured: "+ npe);}
        }catch(NegativeArraySizeException nase){ System.out.println("Exception occured: "+ nase); }

    }
}