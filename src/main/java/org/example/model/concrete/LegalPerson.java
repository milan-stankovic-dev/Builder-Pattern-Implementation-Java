package org.example.model.concrete;

import org.example.model.CustomerBuilder;

import java.util.Date;

public class LegalPerson extends CustomerBuilder {
    private final String firmName;
    private final Date foundingDate;

    protected LegalPerson(Builder b) {
        super(b);
        this.firmName = b.firmName;
        this.foundingDate = b.foundingDate;
    }

    public static class Builder extends CustomerBuilder.Builder<Builder> {
        private String firmName;
        private Date foundingDate;

        @Override
        protected Builder self() {
            return this;
        }

        public Builder(Long id, String name){
            super(id, name);
        }

        public Builder firmName(String firmName){
            this.firmName = firmName;
            return this;
        }

        public Builder foundingDate(Date foundingDate){
            this.foundingDate = foundingDate;
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
        public LegalPerson build(){
            return new LegalPerson(this);
        }
    }

    @Override
    public String toString() {
        return "LegalPerson{" +
                "firmName='" + firmName + '\'' +
                ", foundingDate=" + foundingDate +
                '}';
    }
}
