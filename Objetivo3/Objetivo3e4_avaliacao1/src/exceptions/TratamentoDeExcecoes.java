package exceptions;

public class TratamentoDeExcecoes {

    private  static  void throwException() throws Exception {
        try{
                throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally executado em trowException");
        }
    }
}

