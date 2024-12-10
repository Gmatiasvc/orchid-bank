package database;

import common.logger.Logger;
import java.io.FileWriter;
import java.io.IOException;

public class infoSave {
    private static int iacca;
    private static int iaccc;
    private static int iclij;
    private static int iclin;

    public static boolean accountAhorro(int newACCA,boolean verbose){
        iacca = newACCA;
        iaccc = InfoRead.accountCorriente();
        iclij = InfoRead.clientJuridica();
        iclin = InfoRead.clientNatural();

        try (FileWriter writer = new FileWriter("db/database.info", false)) {
            writer.append(Integer.toString(iacca));
            writer.append(Integer.toString(iaccc));
            writer.append(Integer.toString(iclij));
            writer.append(Integer.toString(iclin));
            writer.close();
            if (verbose) {
                System.out.println(Logger.dateString(4) + " [INFO] File now stores updated database information.");
            }
            return true;
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during informatio write event; information has been lost.");
            return false;
        }
    }

    public static boolean accountCorriente(int newACCC,boolean verbose){
        iacca = InfoRead.accountAhorro();
        iaccc = newACCC;
        iclij = InfoRead.clientJuridica();
        iclin = InfoRead.clientNatural();

        try (FileWriter writer = new FileWriter("db/database.info", false)) {
            writer.append(Integer.toString(iacca));
            writer.append(Integer.toString(iaccc));
            writer.append(Integer.toString(iclij));
            writer.append(Integer.toString(iclin));
            writer.close();
            if (verbose) {
                System.out.println(Logger.dateString(4) + " [INFO] File now stores updated database information.");
            }
            return true;
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during informatio write event; information has been lost.");
            return false;
        }
    }

    public static boolean clientJuridica(int newCLIJ,boolean verbose){
        iacca = InfoRead.accountAhorro();
        iaccc = InfoRead.accountCorriente();
        iclij = newCLIJ;
        iclin = InfoRead.clientNatural();

        try (FileWriter writer = new FileWriter("db/database.info", false)) {
            writer.append(Integer.toString(iacca));
            writer.append(Integer.toString(iaccc));
            writer.append(Integer.toString(iclij));
            writer.append(Integer.toString(iclin));
            writer.close();
            if (verbose) {
                System.out.println(Logger.dateString(4) + " [INFO] File now stores updated database information.");
            }
            return true;
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during informatio write event; information has been lost.");
            return false;
        }
    }

    public static boolean clientNatural(int newCLIN,boolean verbose){
        iacca = InfoRead.accountAhorro();
        iaccc = InfoRead.accountCorriente();
        iclij = InfoRead.clientJuridica();
        iclin = newCLIN;

        try (FileWriter writer = new FileWriter("db/database.info", false)) {
            writer.append(Integer.toString(iacca));
            writer.append(Integer.toString(iaccc));
            writer.append(Integer.toString(iclij));
            writer.append(Integer.toString(iclin));
            writer.close();
            if (verbose) {
                System.out.println(Logger.dateString(4) + " [INFO] File now stores updated database information.");
            }
            return true;
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during informatio write event; information has been lost.");
            return false;
        }
    }
}