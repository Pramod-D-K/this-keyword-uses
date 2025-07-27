/*

this used as to pass the object as parameters;
 */

public class E {

    E(){
        fun(this);
        System.out.println(this);
    }

    E(int x){
        this();
    }

    void fun(E object){
        System.out.println("Object passed as parameter");
    }
}
