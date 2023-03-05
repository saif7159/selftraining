package reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        Footballer footballer = new Footballer(23, "Mbappe", 434, 398, "Ligue 1", "PSG");
        Footballer footballer1 = new Footballer(28, "Ronaldo", 809, 578, "La Liga", "Real Madrid");
        Footballer footballer2 = new Footballer(23, "Neymar", 567, 432, "Ligue 1", "PSG");
        Class class1 = footballer.getClass();
        System.out.println(class1.getName());
        Method method = class1.getDeclaredMethod("calculateRating");
        System.out.println((int) method.invoke(footballer2));
        Field field = class1.getField("age");
        HashSet<String> set = new HashSet<>();

    }
}
