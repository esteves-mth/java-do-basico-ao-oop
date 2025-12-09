public class UserTest {
    public static void main(String[] args) {
        User u = new User("mike", "mike321");
        System.out.println(u.login("mike31"));
        System.out.println(u.login("mike32"));
        System.out.println(u.login("mike321"));
        System.out.println(u.changePassword("mike32","mike321"));
        System.out.println(u.login("mike321"));
        System.out.println(u.login("mike31"));
        System.out.println(u.login("mike32"));
        System.out.println(u.login("mike321"));
        System.out.println(u.isAuthenticated());
        u.logout();
        System.out.println(u.isAuthenticated());
        System.out.println(u.getUsername());

    }
}
