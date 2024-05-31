class Archive {
    void getArchiver() {
        System.out.println("this is Archive method");
    }
}

class ZipArchive extends Archive {
    @Override
    void getArchiver() {
        System.out.println("This is ZipArchive method");
    }
}

interface Profile {
    void getProfile();
}

class User implements Profile {
    public final static String name = "Jaswanth";

    // @Override
    public void getProfile() {
        System.out.println("default Profile..");
    }

    // Overload
    public void getProfile(String name) {
        System.out.println(name + " Profile..");
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Archive zipArchive = new ZipArchive();
        zipArchive.getArchiver();

        // Profile user = new User();
        // user with type Profile can't access the getProfile(name) method

        User user = new User();

        user.getProfile();
        user.getProfile("Jaswanth");

    }
}
