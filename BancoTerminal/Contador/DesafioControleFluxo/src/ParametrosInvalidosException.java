import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;

public class ParametrosInvalidosException extends Exception{

    @Override
    public synchronized Throwable fillInStackTrace() {
        // TODO Auto-generated method stub
        return super.fillInStackTrace();
    }

    @Override
    public synchronized Throwable getCause() {
        // TODO Auto-generated method stub
        return super.getCause();
    }

    @Override
    public String getLocalizedMessage() {
        // TODO Auto-generated method stub
        return super.getLocalizedMessage();
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        // TODO Auto-generated method stub
        return super.getStackTrace();
    }

    @Override
    public synchronized Throwable initCause(Throwable cause) {
        // TODO Auto-generated method stub
        return super.initCause(cause);
    }

    @Override
    public void printStackTrace() {
        // TODO Auto-generated method stub
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream s) {
        // TODO Auto-generated method stub
        super.printStackTrace(s);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        // TODO Auto-generated method stub
        super.printStackTrace(s);
    }

    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        // TODO Auto-generated method stub
        super.setStackTrace(stackTrace);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // super.toString();
        return "This thread was stopped because the first parameter is bigger then second parameter"; 
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    
}
