package org.example;

public class Client {
    private String surname;
    private String name;
    private String patronymic;

    private String birthDate;



    private String telephoneNumber;
    private String gender;




    @Override
    public String toString() {
        return "<" + surname + ">" +
                "<" + name +
                ">" +"<" + patronymic +">" +
                "<" + birthDate + ">" + "<"+ telephoneNumber + ">" + "<" + gender +
                ">";
    }

    public Client(String surname, String name, String patronymic, String birthDate,
                  String telephoneNumber, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.telephoneNumber = telephoneNumber;
        this.gender = gender;
    }


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getGender() {
        return gender;
    }
}
