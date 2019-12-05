package lv.javaguru.lesson10.uservalidationservice;

public class UserValidationServiceDemo {

    public static void main(String[] args) {

        UserValidationService uv = new UserValidationService();

        System.out.println();
        uv.validate(new User("Jo", "Ireland", 40));
        uv.validate(new User("Bruce", "Lee", 37));
        uv.validate(new User("Ella", "ReallyLongSurname", 22));
        uv.validate(new User("Poo", "Ee", 55));
        uv.validate(new User("Peter", "Pan", 300));
        uv.validate(new User("ReallyVeryLongName", "Smith", 0));
        uv.validate(new User("Ivan", "Ho", -5));
        uv.validate(new User("Richard", "TheLionHeart", 36));
        uv.validate(new User("Tom", "Ford", 88));
        uv.validate(new User("Niccolo", "Paganini", 16));
        uv.validate(new User("John", "Smith", -100));
        uv.validate(new User("Santa", "Claus", 0));

        System.out.println("User validation tries: " + uv.validationTries);
        System.out.println("Users added: " + User.getNr());
    }
}
