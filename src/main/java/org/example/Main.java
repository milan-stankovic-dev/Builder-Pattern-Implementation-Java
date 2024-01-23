package org.example;

import org.example.model.Customer;
import org.example.model.CustomerBuilder;
import org.example.model.concrete.HoldingEntity;
import org.example.model.concrete.LegalPerson;
import org.example.model.concrete.NaturalPerson;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        final var customer = new Customer(1L,"Pera");
        customer.setAddress("test address");
        customer.setEmail("email@gmail.com");
        final var customerTelescope = new Customer(2L,"Zika");
//        final var customerBuilder =
//                new CustomerBuilder.Builder(3L, "Mika")
//                .address("Jove Ilica 154")
//                .email("testmail@gmail.com")
//                .address("test address 1")
//                .build();

        final NaturalPerson naturalPerson =
                new NaturalPerson.Builder(4L, "Ana")
                .lastName("Markovic")
                .address("Jove Ilica 57")
                .socialSecurity("12432452436436436")
                .build();

        final LegalPerson legalPerson =
                new LegalPerson.Builder(5L, null)
                .email("Email@gmail.com")                .firmName("sadasdad")
                .foundingDate(Date.valueOf("2021-12-12"))
                .build();

        final HoldingEntity holdingEntity =
                new HoldingEntity.Builder(6L, "name")
                        .pib(121212L).email("gmail@gmail.com")
                                .location("Location").build();

        System.out.println(customer);
        System.out.println(customerTelescope);
        System.out.println(holdingEntity);
        System.out.println(naturalPerson);
        System.out.println(legalPerson);
    }
}