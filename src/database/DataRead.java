package database;

import common.logger.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import objects.accounts.CuentaAhorro;
import objects.accounts.CuentaCorriente;
import objects.accounts.Persona;
import objects.accounts.PersonaJuridica;

public class DataRead {
    public static String[] empty3 = {null, null,null};
    public static String[] empty4 = {null, null,null,null};
    public static ArrayList<String> emptyArray = new ArrayList<>();

    //Doc: Save format: name - surname - idString - idType - BithYear - BirthMonth - BirthDay - Adress - phoneNumber - email - marital
    //Doc: Address format: Region - Provincia - Distrito - Calle
    public static Persona readPersona(int pos, boolean verbose) {
        Persona data = new Persona(null, null, null, null, empty3, empty4, null, null, null);
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
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during information read event; information has not been obtained.");
        }
        return data;
    }

    //Doc: Save format: name - ruc - adress - phoneNumber - email -  inc. doc. - persona
    //Doc: Address format: Region - Provincia - Distrito - Calle
    public static PersonaJuridica readPersonaJuridica(int pos, boolean verbose) {
        PersonaJuridica data = new PersonaJuridica(null, null, empty4, null, null, null, null);
        Persona dataRep = new Persona(null, null, null, null, empty3, empty4, null, null, null);
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
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during information read event; information has not been obtained.");
        }
        return data;
    }

    //DOC: Save format: number - id - idtype - year - month - day - currency - balance - interestRate - overdraftLim - chequeLim - ChequeNumberLim - CheckbookNum - ChequeCommis
	public static CuentaCorriente readCuentaCorriente(int pos, boolean verbose){
		CuentaCorriente data = new CuentaCorriente(0, 0, 0, null,0, null, empty3, null, 0, 0, null, null);
		try {
            File reader = new File("db/account/corriente/" + pos + ".acc");
            try (Scanner scanner = new Scanner(reader)) {
                String number = scanner.nextLine();
                String id = scanner.nextLine();
                String idType = scanner.nextLine();
                String n1 = scanner.nextLine();
                String n2 = scanner.nextLine();
                String n3 = scanner.nextLine();
                String[] creationDate = {n1, n2, n3};
                String currency = scanner.nextLine();
                double balance;
                try {
                balance = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    balance = 0.0;
                }
                float interestRate;
                try {
                    interestRate = Float.parseFloat(scanner.nextLine());
                } catch (NumberFormatException e) {
                    interestRate = 0.0f;
                }
                try {
                    data.setOverdraftLimit(Float.parseFloat(scanner.nextLine()));
                } catch (NumberFormatException e) {
                    data.setOverdraftLimit(0.0f);
                }
                try {
                    data.setChequeLimit(Float.parseFloat(scanner.nextLine()));
                } catch (NumberFormatException e) {
                    data.setChequeLimit(0.0f);
                }
                data.setCheckbookNumber(scanner.nextLine());
                try {
                    data.setChequeCommission(Float.parseFloat(scanner.nextLine()));
                } catch (NumberFormatException e) {
                    data.setChequeCommission(0.0f);
                }
                data.cuenta(number, creationDate, currency, balance, interestRate, id, idType);
            }
        } catch (FileNotFoundException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during information read event; information has not been obtained.");
        }
		return data;
	}


    //DOC: Save format: number - year - month - day - currency - balance - interestRate - withdrawLim - statementDay - statementPeriod - gracePeriod - beneficiaries
    public static CuentaAhorro readCuentaAhorro(int pos, boolean verbose){
        CuentaAhorro data = new CuentaAhorro(pos, null, null, null, emptyArray, null, empty3, null, pos, pos, null, null);
        try {
            File reader = new File("db/account/ahorro/" + pos + ".acc");
            try (Scanner scanner = new Scanner(reader)) {
                String number = scanner.nextLine();
                String id = scanner.nextLine();
                String idType = scanner.nextLine();
                String n1 = scanner.nextLine();
                String n2 = scanner.nextLine();
                String n3 = scanner.nextLine();
                String[] creationDate = {n1, n2, n3};
                String currency = scanner.nextLine();
                double balance;
                try {
                balance = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    balance = 0.0;
                }
                float interestRate;
                try {
                    interestRate = Float.parseFloat(scanner.nextLine());
                } catch (NumberFormatException e) {
                    interestRate = 0.0f;
                }
                try {
                    data.setWithdrawLim(Float.parseFloat(scanner.nextLine()));
                } catch (NumberFormatException e) {
                    data.setWithdrawLim(0.0f);
                }
                data.setStatementDate(scanner.nextLine());
                data.setStatementPeriod(scanner.nextLine());
                data.setGracePeriod(scanner.nextLine());
                ArrayList<String> beneficiaries = new ArrayList<>();
                while(scanner.hasNextLine()){
                    beneficiaries.add(scanner.nextLine());
                }
                data.setBeneficiaries(beneficiaries);
                data.cuenta(number, creationDate, currency, balance, interestRate, id, idType);
            }
        } catch (FileNotFoundException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during information read event; information has not been obtained.");
        }
		return data;
	}

    public static ArrayList<String> readOperation(String number, boolean verbose){
        ArrayList<String> list = new ArrayList<>();
            try {
                File reader = new File("db/movements/" + number + ".mvlog");
                try (Scanner scanner = new Scanner(reader)) {
                    while (scanner.hasNextLine()) {
                        list.add(scanner.nextLine());
                    }
                }
            } catch (FileNotFoundException e) {
                list.add(null);
            }
        return list;
    }
}
