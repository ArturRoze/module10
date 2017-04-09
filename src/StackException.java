import java.io.IOException;

public class StackException {
    public void f() throws IOException {
        try {
            g();
        }catch (OwnException e){
            throw new IOException();
        }finally {
            System.out.println("finally");
        }
    }
    private void g(){
        throw new OwnException("Throw from method \"g\"");
    }
}
