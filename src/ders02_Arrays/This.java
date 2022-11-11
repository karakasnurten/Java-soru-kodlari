package ders02_Arrays;

public class This {
    //    id,first_name,last_name,email,gender
    private int id;
    private String firstName;
    private String lasttName;
    private String email;
    private String gender;

    public void User(int id, String firstName, String lasttName, String email, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
