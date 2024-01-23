package org.example.model.concrete;

import org.example.model.CustomerBuilder;

public class HoldingEntity extends CustomerBuilder {
    private final Long pib;
    private final String location;

    public HoldingEntity(Builder b) {
        super(b);
        this.pib = b.pib;
        this.location = b.location;
    }

    public static class Builder extends CustomerBuilder.Builder<Builder> {
        private Long pib;
        private String location;

        public Builder( Long id, String name){
            super(id,name);
        }

        public Builder location(String location){
            this.location = location;
            return this;
        }

        public Builder pib(Long pib){
            this.pib = pib;
            //return self();
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public HoldingEntity build() {
            return new HoldingEntity(this);
        }
    }
}
