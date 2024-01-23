package org.example.model;

public class CustomerTelescope {
    private final Long id;
    private final String name;
    private final String email;
    private final String address;
    private final String phoneNumber;

    public CustomerTelescope(Long id, String name, String email, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public CustomerTelescope(Long id, String name, String email, String address){
        this(id, name, email, address, null);
    }

    public CustomerTelescope(Long id, String name, String email){
        this(id, name, email, null);
    }

    public CustomerTelescope(Long id, String name){
        this(id, name, null);
    }

    @Override
    public String toString() {
        return "CustomerTelescope{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
