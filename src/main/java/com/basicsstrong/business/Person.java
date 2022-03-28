package com.basicsstrong.business;

public class Person extends Company{

    public static void main( String[] args )
    {
        Company com = new Company();
        com.enrollEmplpyees("Diego");

        Person person = new Person();
        person.enrollEmplpyees("Milagros");

        Company c = new Person();
        c.enrollEmplpyees("Luis");
    }
}
