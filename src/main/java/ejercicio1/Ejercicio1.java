package ejercicio1;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Ejercicio1 {
    static List<Correo> correoList = new ArrayList<Correo>();
    static Map<String,String> correosMap = new HashMap<>();

    public Ejercicio1(){
    }

    //a) Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
    public List<String> eliminarRepetidos(){
        List<String> correosListAux= new ArrayList<>();
        for (Correo i : correoList) correosListAux.add(i.correo);
        return correosListAux.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    //b) Filtro: para saber si hay correos con dominio gmail, hotmail y outlook
    public List<String> filtrarCorreosEspecificos(){
        List<String> correosListAux= new ArrayList<>();
        for (Correo i : correoList) correosListAux.add(i.correo);
        return correosListAux
            .stream()
            .filter(c -> c.contains("gmail") || c.contains("hotmail") || c.contains("outlook"))
            .collect(Collectors.toList());
    }
    //c) Map: para saber si todos los correos cumple con todas las condiciones (Que cuente con el @ y el dominio)
    public String mapValidation(){
        return correosMap.entrySet().stream()
                .filter(x -> {
                    if (x.getValue().contains("@") && x.getValue().contains(".com")) {
                        return true;
                    }
                    return false;
                })
                .map(map -> map.getValue())
                .collect(Collectors.joining(","));
    }


    // d) Saber la cantidad de correos que hay, sin usar un ciclo
    public Integer cantidadCorreos(){
        return correoList.size();
    }

    // e) Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo
    public Integer cantidadGmailHotmailOutlook(){
        return filtrarCorreosEspecificos().size();
    }

    /*
    En la misma lista determinar si se envió un correo o no a cada uno de los correos,
    si se le envió cambiar el estado en la lista, todo esto respetando la inmutabilidad
     */
    public static void verificarEstados(){
        List<Correo> auxList = new ArrayList<>();
        correoList.stream().map(correo -> correo).forEach(x -> {
            if(x.recibido==true){
                Correo aux = new Correo(true,x.correo);
                auxList.add(aux);
            }
            auxList.add(x);
        });
        correoList=auxList;
    }

    public static void main(String[] args) {
        //Crear una lista de mínimo 30 correos
        correoList.add(new Correo("mathiaslabora@gmail.com", true));
        correoList.add(new Correo("fede123@hotmail.com", false));
        correoList.add(new Correo("latigresa@gmail.com", true));
        correoList.add(new Correo("carina25@hotmail.com", true));
        correoList.add(new Correo("maty_19@outlook.com", true));
        correoList.add(new Correo("laura@hotmail.com", true));
        correoList.add(new Correo("pedrito12@gmail.com", false));
        correoList.add(new Correo("fernando_12@hotmail.com", true));
        correoList.add(new Correo("carlosEluno@gmail.com", true));
        correoList.add(new Correo("mathiaslabora@gmail.com", true));
        correoList.add(new Correo("fede123@hotmail.com", false));
        correoList.add(new Correo("elmanyasape@gmail.com", false));
        correoList.add(new Correo("luis99@outlook.com", true));
        correoList.add(new Correo("fefo15@hotmail.com", true));
        correoList.add(new Correo("critianoronaldo@gmail.com", true));
        correoList.add(new Correo("jesus666@hotmail.com", true));
        correoList.add(new Correo("diorrodri@outlook.com", true));
        correoList.add(new Correo("fede123@hotmail.com", false));
        correoList.add(new Correo("critianbolso@gmail.comm", true));
        correoList.add(new Correo("fede123@hotmail.com", false));
        correoList.add(new Correo("mathiaslabora@gmail.com", true));
        correoList.add(new Correo("fede123@hotmail.com", false));
        correoList.add(new Correo("aguantelacumbia@gmail.com", true));
        correoList.add(new Correo("fede123@outlook.com", true));
        correoList.add(new Correo("panconmortadela@gmail.com", true));
        correoList.add(new Correo("fede123@hotmail.com", false));
        correoList.add(new Correo("memes55@hotmail.com", true));
        correoList.add(new Correo("parara@outlook.com", true));
        correoList.add(new Correo("test@yahoo.com", true));
        Map<String,String> correosMap = new HashMap<String,String>();
        for (Correo i : correoList) correosMap.put(i.correo, i.correo);
        System.out.print("");
        verificarEstados();
        System.out.print("");
    }
}
