import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// update the class
class MyException extends Throwable {
    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try (Scanner file = new Scanner(new File(fileName))) {
            if (file.hasNextLine()) {
                return file.nextLine();
            }
        } catch (FileNotFoundException err) {
            if (!isCorrectFileName(fileName)) {
                throw new IncorrectFileNameException(
                        "Incorrect filename : " + fileName, err);
            }
            // ...
        }
    }

}


//do not change the code
class Main {
    public static void main(String[] args) {
        MyException myException = new MyException("This is a custom exception");
        System.out.println(myException.getMessage());
        Class<?> superClass = myException.getClass().getSuperclass();
        System.out.println(superClass.equals(Throwable.class));
    }
}