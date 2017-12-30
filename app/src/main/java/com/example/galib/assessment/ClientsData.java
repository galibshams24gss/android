package com.example.galib.assessment;

/**
 * Created by Galib on 12/31/2017.
 */

class ClientsData {
    private String id;
    private String name;
    private String dob;
    private String address;
    private String gender;
    private String email;
    private String password;
    private String contact;
    private String emergencycontact;

    public ClientsData(String id, String name, String dob, String address, String gender, String email, String password, String contact, String emergencycontact) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.emergencycontact = emergencycontact;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDob() {
        return this.dob;
    }

    public String getAddress() {
        return this.address;
    }

    public String getGender() {
        return this.gender;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getContact() {
        return this.contact;
    }

    public String getEmergencycontact() {
        return this.emergencycontact;
    }
}
