package academy.devdojo.exercicios;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class ValidacaoData {
    public static Boolean validarData(String data){
        String regex = "^\\\\d{2}/\\\\d{2}/\\\\d{4}$";

        if(Pattern.matches(regex, data)){
            return false;
        }

        try{
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(data, dateTimeFormatter);
            return true;
        }catch (DateTimeException exception){
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(validarData("29/02/2024")); // true
        System.out.println(validarData("31/04/2023")); // false
        System.out.println(validarData("99/99/9999")); // false
    }
}
