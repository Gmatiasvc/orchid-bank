package database;

import common.logger.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import objects.CuentaAhorro;
import objects.CuentaCorriente;
import objects.Persona;
import objects.PersonaJuridica;

public class DataSave {

    public static boolean saveClientNatural(int pos, Persona acc, boolean verbose) {
        try {
            File saveFile = new File("db/client/natural/" + pos + ".client");
            if (saveFile.createNewFile()) {
                if (verbose) {
                    System.out.println(Logger.dateString(4) + " [INFO] File created at: " + "db/client/natural/" + pos + ".client");
                }
            } else {
                if (verbose) {
                    System.out.println(Logger.dateString(4) + " [INFO] File already existed at: " + "db/client/natural/" + pos + ".client");
                }
            }
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during file creation event.");
        }

        try (FileWriter writer = new FileWriter("db/client/natural/" + pos + ".client", false)) {
            writer.append(acc.toString());
            writer.close();
            if (verbose) {
                System.out.println(Logger.dateString(4) + " [INFO] File now stores customer information.");
            }
            return true;
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during informatio write event; information has been lost.");
            return false;
        }
    }

    public static boolean saveClientJuridica(int pos, PersonaJuridica acc, boolean verbose) {
        try {
            File saveFile = new File("db/client/juridica/" + pos + ".client");
            if (saveFile.createNewFile()) {
                if (verbose) {
                    System.out.println(Logger.dateString(4) + " [INFO] File created at: " + "db/client/juridica/" + pos + ".client");
                }
            } else {
                if (verbose) {
                    System.out.println(Logger.dateString(4) + " [INFO] File already existed at: " + "db/client/juridica/" + pos + ".client");
                }
            }
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during file creation event.");
        }

        try (FileWriter writer = new FileWriter("db/client/juridica/" + pos + ".client", false)) {
            writer.append(acc.toString());
            writer.close();
            if (verbose) {
                System.out.println(Logger.dateString(4) + " [INFO] File now stores customer information.");
            }
            return true;
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during information write event; information has been lost.");
            return false;
        }
    }

    public static boolean saveAccountCorriente(int pos, CuentaCorriente acc, boolean verbose) {
        try {
            File saveFile = new File("db/account/corriente/" + pos + ".acc");
            if (saveFile.createNewFile()) {
                if (verbose) {
                    System.out.println(Logger.dateString(4) + " [INFO] File created at: " + "db/account/corriente/" + pos + ".acc");
                }
            } else {
                if (verbose) {
                    System.out.println(Logger.dateString(4) + " [INFO] File already existed at: " + "db/account/corriente/" + pos + ".acc");
                }
            }
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during file creation event.");
        }

        try (FileWriter writer = new FileWriter("db/account/corriente/" + pos + ".acc", false)) {
            writer.append(acc.toString());
            writer.close();
            if (verbose) {
                System.out.println(Logger.dateString(4) + " [INFO] File now stores account information.");
            }
            return true;
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during information write event; information has been lost.");
            return false;
        }
    }

    public static boolean saveAccountAhorro(int pos, CuentaAhorro acc, boolean verbose) {
        try {
            File saveFile = new File("db/account/ahorro/" + pos + ".acc");
            if (saveFile.createNewFile()) {
                if (verbose) {
                    System.out.println(Logger.dateString(4) + " [INFO] File created at: " + "db/account/ahorro/" + pos + ".acc");
                }
            } else {
                if (verbose) {
                    System.out.println(Logger.dateString(4) + " [INFO] File already existed at: " + "db/account/ahorro/" + pos + ".acc");
                }
            }
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during file creation event.");
        }

        try (FileWriter writer = new FileWriter("db/account/ahorro/" + pos + ".acc", false)) {
            writer.append(acc.toString());
            writer.close();
            if (verbose) {
                System.out.println(Logger.dateString(4) + " [INFO] File now stores account information.");
            }
            return true;
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during informatio write event; information has been lost.");
            return false;
        }
    }
}
