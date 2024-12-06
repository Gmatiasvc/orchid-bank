package database;

import common.logger.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during informatio write event; information has been lost.");
            return false;
        }
    }
}
