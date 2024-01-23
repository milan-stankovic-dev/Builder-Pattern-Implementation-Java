package org.example.model.concrete;

import org.example.model.Customer;
import org.example.model.CustomerBuilder;

public class NaturalPerson extends CustomerBuilder {
    private final String fullName;
    private final String socialSecurity;

    protected NaturalPerson(Builder b) {
        super(b);
        this.fullName = b.lastName;
        this.socialSecurity = b.socialSecurity;
    }

    public static class Builder extends CustomerBuilder.Builder{
        private String lastName;
        private String socialSecurity;

        public Builder(Long id, String name){
            super(id, name);
        }

        public Builder lastName(String fullName) {
            this.lastName = fullName;
            return this;
        }

        public Builder socialSecurity(String socialSecurity) {
            this.socialSecurity = socialSecurity;
            return this;
        }

        @Override
        public Builder email(String email){
            this.email = email;
            return this;
        }

        @Override
        public Builder address(String address){
            this.address = address;
            return this;
        }

        @Override
        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public NaturalPerson build(){
            return new NaturalPerson(this);
        }
    }

    @Override
    public String toString() {
        return "NaturalPerson{" +
                "fullName='" + fullName + '\'' +
                ", socialSecurity='" + socialSecurity + '\'' +
                '}';
    }
}
