package designpatterns;

import java.util.HashMap;

public class SingletonPattern {
    private int age;
    private String name;
    private static SingletonPattern singletonPattern;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SingletonPattern other = (SingletonPattern) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    private SingletonPattern() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static SingletonPattern initializeSingleton() {
        if (singletonPattern == null)
            singletonPattern = new SingletonPattern();
        return singletonPattern;
    }
}