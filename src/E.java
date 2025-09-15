/*

this used as to pass the object as parameters;
 */

public class E {

    E(){
        //this(this);//object not fully created
        fun(this);
        System.out.println(this);
    }

    E(int x){
        this();

    }
    E(E obj){

        System.out.println();
    }

    void fun(E object){
        System.out.println("Object passed as parameter");
    }
}
