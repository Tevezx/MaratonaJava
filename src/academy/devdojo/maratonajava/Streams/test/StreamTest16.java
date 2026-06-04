 package academy.devdojo.maratonajava.Streams.test;

import academy.devdojo.maratonajava.Streams.dominio.Category;
import academy.devdojo.maratonajava.Streams.dominio.LightNovel;
import academy.devdojo.maratonajava.Streams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

 public class StreamTest16 {
     private static List<LightNovel> lightMovelList = new ArrayList<>(List.of(new LightNovel("Naruto", 1.0, Category.TRAMA),
             new LightNovel("Boku No Hero", 1.0, Category.FANTASY),
             new LightNovel("One Piece", 2.0, Category.FANTASY),
             new LightNovel("One Piece", 2.0, Category.FANTASY),
             new LightNovel("Attack On Titan", 10.0, Category.ROMANCE)));

     public static void main(String[] args) {
         Map<Category, DoubleSummaryStatistics> collect = lightMovelList.stream()
                 .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
         System.out.println(collect);

         // Map<Category, List<Promotion>> -> exibindo por categoria, quais as promocoes que tem nela
         // toSet -> nao exibe valores duplicados
         Map<Category, Set<Promotion>> collect1 = lightMovelList.stream()
                 .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest16::getPromotion, toSet())));
         System.out.println(collect1);

         Map<Category, Set<Promotion>> collect2 = lightMovelList.stream()
                 .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest16::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
         System.out.println(collect2);
     }

    private static Promotion getPromotion(LightNovel ln){
         return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
 }
