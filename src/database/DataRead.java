package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import objects.Persona;
import objects.PersonaJuridica;

public class DataRead {

    //Doc: Save format: name - surname - idString - idType - BithYear - BirthMonth - BirthDay - Adress - phoneNumber - email - marital
    //Doc: Address format: Region - Provincia - Distrito - Calle
    public static Persona readPersona(int pos, boolean verbose) {
        Persona data = new Persona(null, null, null, null, null, null, null, null, null);
        try {
            File reader = new File("db/client/natural/" + pos + ".client");
            try (Scanner scanner = new Scanner(reader)) {
                data.setName(scanner.nextLine());
                data.setSurname(scanner.nextLine());
                data.setIdString(scanner.nextLine());
                data.setIdType(scanner.nextLine());
                String n1 = scanner.nextLine();
                String n2 = scanner.nextLine();
                String n3 = scanner.nextLine();
                String[] list = {n1, n2, n3};
                data.setDayOfBirth(list);
                n1 = scanner.nextLine();
                n2 = scanner.nextLine();
                n3 = scanner.nextLine();
                String n4 = scanner.nextLine();
                String[] list2 = {n1, n2, n3, n4};
                data.setAdress(list2);
                data.setPhoneNumber(scanner.nextLine());
                data.setEmail(scanner.nextLine());
                data.setCivilStatus(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return data;
    }

    //Doc: Save format: name - ruc - adress - phoneNumber - email -  inc. doc. - persona
    //Doc: Address format: Region - Provincia - Distrito - Calle
    public static PersonaJuridica readPersonaJuridica(int pos, boolean verbose) {
        PersonaJuridica data = new PersonaJuridica(null, null, null, null, null, null, null);
        Persona dataRep = new Persona(null, null, null, null, null, null, null, null, null);
        try {
            File reader = new File("db/client/juridica/" + pos + ".client");
            try (Scanner scanner = new Scanner(reader)) {
                data.setCompanyName(scanner.nextLine());
                data.setRuc(scanner.nextLine());
                String n1 = scanner.nextLine();
                String n2 = scanner.nextLine();
                String n3 = scanner.nextLine();
                String n4 = scanner.nextLine();
                String[] list = {n1, n2, n3, n4};
                data.setAdress(list);
                data.setPhoneNumber(scanner.nextLine());
                data.setEmail(scanner.nextLine());
                data.setIncorporationDoc(scanner.nextLine());
                dataRep.setName(scanner.nextLine());
                dataRep.setSurname(scanner.nextLine());
                dataRep.setIdString(scanner.nextLine());
                dataRep.setIdType(scanner.nextLine());
                n1 = scanner.nextLine();
                n2 = scanner.nextLine();
                n3 = scanner.nextLine();
                String[] list1 = {n1, n2, n3};
                dataRep.setDayOfBirth(list1);
                n1 = scanner.nextLine();
                n2 = scanner.nextLine();
                n3 = scanner.nextLine();
                n4 = scanner.nextLine();
                String[] list2 = {n1, n2, n3, n4};
                dataRep.setAdress(list2);
                dataRep.setPhoneNumber(scanner.nextLine());
                dataRep.setEmail(scanner.nextLine());
                dataRep.setCivilStatus(scanner.nextLine());
                data.setRepresentative(dataRep);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return data;
    }
}
