public class OwnException extends RuntimeException {

    private String s;

    public OwnException(String massage){
        this.s = massage;
    }
    public String print(){
        return s;
    }
}
