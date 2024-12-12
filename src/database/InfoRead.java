package database;

import java.io.File;
import java.util.Scanner;

@SuppressWarnings("UseSpecificCatch")
public class InfoRead {

    public static int accountAhorro() {
        try {
            File reader = new File("db/database.info");
            try (Scanner scanner = new Scanner(reader)) {
                return Integer.parseInt((scanner.nextLine()));
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public static int accountCorriente() {
        try {
            File reader = new File("db/database.info");
            try (Scanner scanner = new Scanner(reader)) {
                scanner.nextLine();
                return Integer.parseInt((scanner.nextLine()));
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public static int clientJuridica() {
        try {
            File reader = new File("db/database.info");
            try (Scanner scanner = new Scanner(reader)) {
                scanner.nextLine();
                scanner.nextLine();
                return Integer.parseInt((scanner.nextLine()));
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public static int clientNatural() {
        try {
            File reader = new File("db/database.info");
            try (Scanner scanner = new Scanner(reader)) {
                scanner.nextLine();
                scanner.nextLine();
                scanner.nextLine();
                return Integer.parseInt((scanner.nextLine()));
            }

        } catch (Exception e) {
            return 0;
        }
    }
}
