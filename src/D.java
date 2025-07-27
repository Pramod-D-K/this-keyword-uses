/*
used to return the current object
 */

public class D {
    int x;
    String name;
    D(){
        this.x = 10;
        this.name = "Pramod";
    }

    D fun(){
        return this;
    }
}
