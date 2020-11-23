package singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(anotherInstance);
    }

    //Often overused
    //Difficult to unit test
    //if not careful, not threadsafe
    //Somtimes confused for factory
    //calender is not singleton

    //returns same instance - one instructor
    //no interface

    //factory returns various instance
    //multiple constu
    //interface
    //adapt more

}
