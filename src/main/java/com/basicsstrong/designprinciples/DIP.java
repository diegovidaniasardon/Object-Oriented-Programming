package com.basicsstrong.designprinciples;

interface ILogger{
    public void logInformation(String logInfo);
}

class Logger implements ILogger{
    public void logInformation(String logInfo){
        System.out.println(logInfo);
    }
}
class LoggingToFile{
    private ILogger logger;

    public LoggingToFile(ILogger logger) {
        this.logger = logger;
    }

    public void logging(){
        logger.logInformation("Printing Logs to the file...");
    }

    /*  private Logger logger;

    public LoggingToFile(Logger logger) {
        this.logger = logger;
    }
    public void logging(){
        logger.logInformation("Printing Logs to the file...");
    }*/

}

class LoggingToDB{
    private ILogger logger;

    public LoggingToDB(ILogger logger) {
        this.logger = logger;
    }

    public void logging(){
        logger.logInformation("Save logs to the database...");
    }

}

public class DIP {
    public static void main( String[] args ){
      LoggingToFile loggingToFile = new LoggingToFile(new Logger());
      loggingToFile.logging();
    }
}
