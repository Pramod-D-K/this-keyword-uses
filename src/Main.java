
/* this keyword refers to the current object
 how and where we can use the "this" keyword

 * it refers to the current class instance variables
 * In constructor chaining, invoke into current class constructor
 * invoke into the current class method
 * returns the current object
 * passing the current object as parameter

  */

public class Main {

    public static void main(String[] args) {
        A p = new A();
        B b = new B();
        D d = new D();
        D d2 = d.fun();
        System.out.println(d2.x + " And " +d2.name );
        E e = new E();
    }
}
