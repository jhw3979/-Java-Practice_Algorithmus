package prac.Interface_prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;


public class Index {

    public void run() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        FileInputStream fis = new FileInputStream("src/prac/Interface_prac/setting.txt");

        Scanner scanner = new Scanner(fis);
        String className = scanner.nextLine();
        //System.out.println(className);

        scanner.close();
        fis.close();

        Class clazz = Class.forName(className);

        A a = new A();
        X x = (X) clazz.getDeclaredConstructor().newInstance();

        a.setX(x);
        a.print();
    }
}