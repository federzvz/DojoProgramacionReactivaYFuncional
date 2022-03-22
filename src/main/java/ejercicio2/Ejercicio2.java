package ejercicio2;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> malasPalabras = Arrays.asList(
                "concha",
                "polla",
                "culo",
                "pete",
                "puto",
                "puta",
                "huevon",
                "pija",
                "verga",
                "cojer"
        );
        Scanner scanner = new Scanner(System.in);
        String chatInput="";
        List<String> chatList = new ArrayList<String>();
        while(!chatInput.equalsIgnoreCase("exit")){
            chatInput=scanner.nextLine();
            chatList.add(chatInput);
        }
        /*Flux<List<String>> censurarMalasPalabras(){
            return chatList.stream()
                    .filter(x -> {
                        return this;
                    });
*/
    }
}

