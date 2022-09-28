import org.jetbrains.annotations.NotNull;

import static java.lang.System.*;
public class Recursive1 {
    public static @NotNull String rec(int a, int b){
        if (a > b){
            a--;
            if( a == b ){
                return Integer.toString(a);
            }
            return a + " " + rec(a,b);

        }
        else {
            a++;
            if(a == b){
                return Integer.toString(a);
            }
            return a + " " + rec(a,b);
        }
    }
    public static void main(String[] args) {
    out.println(rec(25,12));
        out.println(rec(15,32));
    }
}
