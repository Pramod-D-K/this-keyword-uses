/*
invoke into the methode from constructor and from another method
and cant from method to constructor
 */
public class C {
    void print(){
        this.display();
    }
    void display(){

    }
    C(){
        this.print();

    }
    C(int x){

    }
}
