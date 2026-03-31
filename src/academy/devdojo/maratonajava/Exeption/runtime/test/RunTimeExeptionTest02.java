package academy.devdojo.maratonajava.Exeption.runtime.test;

public class RunTimeExeptionTest02 {
    public static void main(String[] args) {
        try{
            divisao(1,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        // Só aparece devioo ao tratamento que fiz na psvm
        System.out.println("Código Finalizado");
    }

    // throws IllegalArgumentException = significa que esse metodo pode
    // lançar uma excessao IllegalArgumentException
    private static Integer divisao(Integer a, Integer b) throws IllegalArgumentException{
        // Sempre que haver uma verificacao, lançamos uma excecao

        if(b == 0){
            //throw new RuntimeException("Argumento Ilegal, não pode ser 0!");
            throw new IllegalArgumentException("Argumento Ilegal, não pode ser 0!");
        }

        return a/b;

        /*
        try{
            return a/b;
        }
        // ArithmeticException é do tipo RunTimeException, por isso eu pego o objeto inteiro
        catch (RuntimeException e){
            e.printStackTrace();
        }
        return 0;
         */
    }
}
