//

//using of static
public class Program {
    public static void main(String[] args) {
       hello();
       Program pr = new Program();
       pr.welcome();
    }
        static void hello(){
            System.out.println("Hello");
        }
        void welcome(){
            System.out.println("Welcome to java");
        }
}
