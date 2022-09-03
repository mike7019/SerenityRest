package io.swagger.user.testing.models;

public class User {

    String idUser, userName, firstName, lastName, email, password, phone, userStatus;

    public User(String idUser, String userName, String firstName, String lastName, String email, String password, String phone, String userStatus) {
        this.idUser = idUser;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.userStatus = userStatus;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
