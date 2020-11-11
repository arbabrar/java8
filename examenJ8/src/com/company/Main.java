package com.company;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

           List<Integer>listNumeros= new ArrayList<>();
           Double promedio;
           String toUp;
           List<String> resBusq;
           listNumeros.add(15);
           listNumeros.add(18);
           listNumeros.add(35);
           listNumeros.add(1);
           listNumeros.add(6);
           listNumeros.add(35);
           listNumeros.add(14);
           promedio=average(listNumeros);
           System.out.println("El promedio de la lista es " + promedio);
           List<String>listChain= new ArrayList<>();
           listChain.add("jesus");
           listChain.add("maria");
           listChain.add("jose");
           listChain.add("pedro");
           listChain.add("martin");
           listChain.add("miguel");
           toUp=upperCase(listChain);
           System.out.println("La cadena de nombre en mayuscula es " + toUp);
           List<String>listObj= new ArrayList<>();
           listObj.add("asno");
           listObj.add("Alvaro");
           listObj.add("Ala");
           listObj.add("amo");
           listObj.add("ala");
           listObj.add("manuel");
           resBusq=search(listObj);
           System.out.println("El resultado de la lista filtrada es " + resBusq);
           List<Integer>listCuatro= new ArrayList<>();
        listCuatro.add(12);
        listCuatro.add(15);
        listCuatro.add(7);
        listCuatro.add(45);
        listCuatro.add(6);
        listCuatro.add(5);
        listCuatro.add(4);
        List<String>listNumber;
        listNumber=getString(listCuatro);
        System.out.println("El resultado final de la ultima lista  es " + listNumber);


    }

    private static List<String> getString(List<Integer> listCuatro) {
        List<String> nuevaLista=new ArrayList<>();
        listCuatro.stream().forEach(i -> {
            if (i.intValue() % 2 == 0) {
                nuevaLista.add("e"+i);

            } else {
                nuevaLista.add("o"+i);
            }
        });

        return nuevaLista;

    }


    private static List<String> search(List<String> listObj) {
        List<String> respuesta=new ArrayList<>();
          respuesta=listObj.stream().filter(n->n.length()<=3 && n.startsWith("a")).collect(toList());
        return respuesta;
    }


    private static String upperCase(List<String> listChain) {
        String resp;
        resp = listChain.stream().map(String::toUpperCase).collect(Collectors.joining(","));

        return  resp;
    }

    private static Double average(List<Integer> listNumeros) {
        double resultado=listNumeros.stream().mapToDouble(i -> i).average().getAsDouble();
        return resultado;

    }


}
