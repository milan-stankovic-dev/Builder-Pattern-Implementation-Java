package org.example.model;

import org.example.model.concrete.LegalPerson;

public class CustomerBuilder {
    private final Long id;
    private final String name;
    private final String email;
    private final String address;
    private final String phoneNumber;

    protected CustomerBuilder(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.email = b.email;
        this.address = b.address;
        this.phoneNumber = b.phoneNumber;
    }

    public static class Builder {
        protected Long id;
        protected String name;
        protected String email;
        protected String address;
        protected String phoneNumber;

        public Builder(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public CustomerBuilder build(){
            return new CustomerBuilder(this);
        }

    }

    @Override
    public String toString() {
        return "CustomerBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
