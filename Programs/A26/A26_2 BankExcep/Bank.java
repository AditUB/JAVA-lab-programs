package Exceptions.BankExcep;

//At a time only one exception can be handled even if multiple exceptions exist
public class Bank {
    static void CreateAcc(int age, String name) throws AgeExcep, NameExcep, NameAgeExcep {
        if (age > 18 && name.length() > 3) {
            System.out.println("Account created");
        } else if (age < 18 && name.length() <= 3) {
            throw new NameAgeExcep(age, name);
        } else if (age < 18) {
            throw new AgeExcep(age);
        } else {
            throw new NameExcep(name);
        }

    }
}
