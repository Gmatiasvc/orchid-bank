package common.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private boolean verbose = false;
    private static Date currentDate;
    private static SimpleDateFormat dateFormat;
    private File log;
    private FileWriter logWrite;
    private String FILE_PATH;

    public Logger(boolean verbose) {
        FILE_PATH = "logs/" + dateString(0) + ".log";
        this.verbose = verbose;
        try {
            log = new File(FILE_PATH);
            if (log.createNewFile()) {
                if (verbose) {
                    System.out.println(dateString(4) + " [INFO] File created at: " + FILE_PATH);
                }
            } else {
                if (verbose) System.out.println(dateString(4) + " [INFO] File already existed at: " + FILE_PATH);
            }
        } catch (IOException e) {
            System.out.println("ERROR: An error has occurred during log creation event.");
        }
    }

    private static String dateString(int format) {
        switch (format) {
            case 0 -> {
                dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            }
            case 1 -> {
                dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            }
            case 2 -> {
                dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SS");
            }
            case 3 -> {
                dateFormat = new SimpleDateFormat("HH:mm:ss");
            }
            case 4 -> {
                dateFormat = new SimpleDateFormat("HH:mm:ss SS");
            }
            default ->
                dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        }
        currentDate = new Date();
        return dateFormat.format(currentDate);
    }

    public void INFO(String message) {
        try {
            logWrite = new FileWriter(FILE_PATH, true);
            logWrite.append(dateString(2) + " [INFO] " + message + "\n");
            logWrite.close();
			
			if (verbose == true) {
				System.out.println(dateString(4) + " [INFO] An \"INFO\" event has been logged at: " + FILE_PATH);
			}

        } catch (IOException e) {
            System.out.println(dateString(4) + " [CRITICAL] An error during the logging of an event has happened, an event HAS NOT been recorded");
            System.out.println(dateString(4) + " [CRITICAL] Restart your system immediately to avoid further unrecorded events");
            System.out.println(dateString(4) + " [CRITICAL] If the problem continues, contact your IT branch and report the error");
        }
    }

    public void WARN(String message) {
        try {
            logWrite = new FileWriter(FILE_PATH, true);
            logWrite.append(dateString(2) + " [WARN] " + message + "\n");
            logWrite.close();

			if (verbose == true) {
				System.out.println(dateString(4) + " [INFO] A \"WARN\" event has been logged at: " + FILE_PATH);
			}

        } catch (IOException e) {
            System.out.println(dateString(4) + " [CRITICAL] An error during the logging of an event has happened, an event HAS NOT been recorded");
            System.out.println(dateString(4) + " [CRITICAL] Restart your system immediately to avoid further unrecorded events");
            System.out.println(dateString(4) + " [CRITICAL] If the problem continues, contact your IT branch and report the error");
        }
    }

    public void ERROR(String message) {
        try {
            logWrite = new FileWriter(FILE_PATH, true);
            logWrite.append(dateString(2) + " [ERROR] " + message + "\n");
            logWrite.close();

			if (verbose == true) {
				System.out.println(dateString(4) + " [INFO] An \"ERROR\" event has been logged at: " + FILE_PATH);
			}

        } catch (IOException e) {
            System.out.println(dateString(4) + " [CRITICAL] An error during the logging of an event has happened, an event HAS NOT been recorded");
            System.out.println(dateString(4) + " [CRITICAL] Restart your system immediately to avoid further unrecorded events");
            System.out.println(dateString(4) + " [CRITICAL] If the problem continues, contact your IT branch and report the error");
        }
    }

    public void FAIL(String message) {
        try {
            logWrite = new FileWriter(FILE_PATH, true);
            logWrite.append(dateString(2) + " [FAIL] " + message + "\n");
            logWrite.close();

			if (verbose == true) {
				System.out.println(dateString(4) + " [INFO] A \"FAIL\" event has been logged at: " + FILE_PATH);
			}

        } catch (IOException e) {
            System.out.println(dateString(4) + " [CRITICAL] An error during the logging of an event has happened, an event HAS NOT been recorded");
            System.out.println(dateString(4) + " [CRITICAL] Restart your system immediately to avoid further unrecorded events");
            System.out.println(dateString(4) + " [CRITICAL] If the problem continues, contact your IT branch and report the error");
        }
    }

    public void DEBUG(String message) {
        try {
            logWrite = new FileWriter(FILE_PATH, true);
            logWrite.write(dateString(2) + " [DEBUG] " + message + "\n");
            logWrite.close();

			if (verbose == true) {
				System.out.println(dateString(4) + " [INFO] A \"WARN\" event has been logged at: " + FILE_PATH);
			}

        } catch (IOException e) {
            System.out.println(dateString(4) + " [CRITICAL] An error during the logging of an event has happened, an event HAS NOT been recorded");
            System.out.println(dateString(4) + " [CRITICAL] Restart your system immediately to avoid further unrecorded events");
            System.out.println(dateString(4) + " [CRITICAL] If the problem continues, contact your IT branch and report the error");
        }
    }
}