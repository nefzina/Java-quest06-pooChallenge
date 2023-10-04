public class Classroom {

    public static void main(String[] args) {
        Wilder amani = new Wilder("Amani", true);
        Wilder sam = new Wilder("Sam", false);
        Wilder henri = new Wilder("Henri", true);

        System.out.println(amani.whoAmI());
        System.out.println(sam.whoAmI());
        System.out.println(henri.whoAmI());

    }
}
