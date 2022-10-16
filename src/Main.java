import MyPackage.Secret;

public class Main {
    public static void main(String[] args) {

        Secret secret = new Secret();
        HackIt hackIt = new HackIt();
        hackIt.getSecret();
        System.out.println(secret);
    }
}