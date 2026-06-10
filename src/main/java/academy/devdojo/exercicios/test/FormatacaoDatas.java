package academy.devdojo.exercicios.test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatacaoDatas {
    public static String validarData(String data){
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(data, dateTimeFormatter);
            return data;
        }catch (DateTimeException exception){
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(validarData("09/12/2006")); // data
        System.out.println(validarData("12/22/1998")); // null
        System.out.println(validarData("1998/12/09")); // null
    }
}
