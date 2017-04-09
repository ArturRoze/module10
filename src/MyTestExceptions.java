public class MyTestExceptions {

    public void throwsTreeExceptions(int number)throws FirstException, SecondException, ThirdException{
        if (number == 1) {
            throw new FirstException();
        }else if (number == 2){
            throw new SecondException();
        }else {
            throw new ThirdException();
        }
    }
}
