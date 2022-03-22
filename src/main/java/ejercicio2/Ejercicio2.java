package ejercicio2;

import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Ejercicio2 {
    static List<String> malasPalabras = Arrays.asList(
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

    /*public Mono<List<String>> censurarMalasPalabras(){

    }*/

    public static List<String> censurarMalasPalabras(List<String> chat) {
        List<String> auxChat = new ArrayList<>();
        AtomicBoolean isMalaPalabra= new AtomicBoolean(false);
        chat.stream().forEach(x -> {
            malasPalabras.stream().forEach(mp -> {
                if (mp.equalsIgnoreCase(x)) {
                    auxChat.add("*****");
                    isMalaPalabra.set(true);
                }
            });
            if(!isMalaPalabra.get()){
                auxChat.add(x);
            }
            isMalaPalabra.set(false);
        });
        return auxChat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chatInput = "";
        List<String> chatList = new ArrayList<String>();
        while (!chatInput.equalsIgnoreCase("exit")) {
            chatInput = scanner.nextLine();
            chatList.add(chatInput);
        }
        chatList=censurarMalasPalabras(chatList);
        System.out.print("");
    }
}

