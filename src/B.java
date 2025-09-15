/* constructor chainng
call constructor from another constructor
 */

public class B {
    {
        System.out.println("B class constructor");
    }
    B(){
        this(10);

    }
    B(int x){

    }
}


