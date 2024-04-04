package com.vk.designpatterns;

import java.io.Serial;
import java.io.Serializable;

class Singleton implements Serializable, Cloneable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    @Serial
    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}

public class SingletonDoubleChecked {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }
}