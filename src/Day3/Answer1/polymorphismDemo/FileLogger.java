package Day3.Answer1.polymorphismDemo;

public class FileLogger extends BaseLogger{
    public void log(String message){
        System.out.println("File Logger: " + message);
    }
}