package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;

    // instance variables
    String favoriteColor;
    String birthMonth;
    String gitHandle;
    boolean hasPets;

    public Person(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;
    }


    public String getFirstname() {

        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private void setFavoriteColor() {
        this.favoriteColor = favoriteColor;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }



    public void setBirthMonth() {
        this.birthMonth = birthMonth;
    }


    public String getBirthMonth() {
        return birthMonth;
    }



    public void setGitHandle() {
        this.gitHandle = gitHandle;
    }


    public String getGitHandle() {
        return gitHandle;
    }



    public boolean isHasPets() {
        return hasPets;
    }

    public String toString() {
        return this.firstname + ", " + this.lastname + ". Their favorite color is: " +
       this.favoriteColor + ". They were born in: " + this.birthMonth + ". Their GitHub handle is: " + this.gitHandle +
        ". It is " + this.hasPets + " that they have pets.";
    }
}
