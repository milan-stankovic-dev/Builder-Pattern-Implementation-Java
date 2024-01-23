package org.example.model;

import org.example.model.concrete.LegalPerson;

import java.util.Locale;

public class CustomerBuilder {
    private final Long id;
    private final String name;
    private final String email;
    private final String address;
    private final String phoneNumber;

    public CustomerBuilder(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.email = b.email;
        this.address = b.address;
        this.phoneNumber = b.phoneNumber;
    }

    public abstract static class Builder<T extends Builder<?>> {
        protected Long id;
        protected String name;
        protected String email;
        protected String address;
        protected String phoneNumber;

        protected abstract T self();

        public Builder(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public T email(String email) {
            this.email = email;
            return self();
        }

        public T address(String address) {
            this.address = address;
            return self();
        }

        public T phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return self();
        }

        public abstract CustomerBuilder build();


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
