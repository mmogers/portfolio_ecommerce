package lesson8;

public class Author {
    private String name;
    private String email;
    private char gender; //'m' of 'f'


    @Override
    public String toString() {
        return
                name + "(" + gender + ") at " + email ;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email; //check dfgjsfg@jrfgsekjfg.skdfrgaewiu
        if(gender =='m' || gender == 'f') { //check if gender is f and m only
            this.gender = gender;
        }else {
            System.out.println("Incorrect gender");
            this.gender = '-'; //the gender is '-' if other than f or m
            return; //throw error
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
