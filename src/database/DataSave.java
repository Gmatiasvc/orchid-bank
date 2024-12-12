package database;

import common.logger.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import objects.CuentaAhorro;
import objects.CuentaCorriente;
import objects.Persona;
import objects.PersonaJuridica;
import objects.operaciones.Cheque;
import objects.operaciones.Deposito;
import objects.operaciones.Operacion;
import objects.operaciones.Retiro;
import objects.operaciones.Transferencia;

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
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during information write event; information has been lost.");
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
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during information write event; information has been lost.");
            return false;
        }
    }

    public static boolean appendOperationAccount(String number, boolean verbose, Operacion operation){
        try {
            File saveFile = new File("db/movements/" + number + ".mvlog");
            if (saveFile.createNewFile()) {
                if (verbose) {
                    System.out.println(Logger.dateString(4) + " [INFO] File created at: " + "db/movements/" + number + ".mvlog");
                }
            } else {
                if (verbose) {
                    System.out.println(Logger.dateString(4) + " [INFO] File already existed at: " + "db/movements/" + number + ".mvlog");
                }
            }
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during file creation event.");
        }

        try (FileWriter writer = new FileWriter("db/movements/" + number + ".mvlog", true)) {
            switch (operation.getIDENTIFIER()) {
                case "0" -> {writer.append(((Deposito)operation).toString());}
                case "1" -> {writer.append(((Retiro)operation).toString());}
                case "2","3" -> {writer.append(((Transferencia)operation).toString());}
                case "4","5" -> {writer.append(((Cheque)operation).toString());}
                default -> {writer.append(operation.toString());if (verbose) {
                    System.out.println(Logger.dateString(4) + " [ERROR] File has a bad/unparsable line, some information has been written regardless, data loss might have happened.");
                }}
            }
            writer.close();
            if (verbose) {
                System.out.println(Logger.dateString(4) + " [INFO] File now stores up to date operation information.");
            }
            return true;
        } catch (IOException e) {
            System.out.println(Logger.dateString(4) + " [ERROR] An error has occurred during information write event; information has been lost.");
            return false;
        }
    }
}
