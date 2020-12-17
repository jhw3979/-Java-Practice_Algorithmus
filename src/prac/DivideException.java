package prac;
import java.io.*;

public class DivideException extends Exception {
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
}