import java.io.*;
import java.util.*;
class ExceptionHandle extends Exception{
    ExceptionHandle(String s){ super(s);}
}
class ExceptionHandling {
    public static void main(String args[]){  
        try{ throw new ExceptionHandle("Raman"); }
        catch(ExceptionHandle eh){System.out.println("Exception occured: "+ eh);}  
        finally{
            System.out.println("this is my finally part of code ");
        }
        System.out.println("rest of the code...");  
    }
}