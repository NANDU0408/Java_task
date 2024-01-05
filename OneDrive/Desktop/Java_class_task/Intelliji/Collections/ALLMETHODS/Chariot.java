package com.xworkz.interfacea.nandishA.collectionJ;


import java.util.*;

public class Chariot {
    public Collection<String> getChariots(){

        Collection<String>chariot = new ArrayList<>();
        chariot.add("Nandighosa");
        chariot.add("Dwarapadalana");
        chariot.add("Kapi Dhwaja");
        chariot.add("Dharma Padha");
        chariot.add("Daruga");
        chariot.add("Matali");

        System.out.println(chariot.size());
        Iterator<String> itr = chariot.iterator();
        while (itr.hasNext()){
            String chat = itr.next();
            System.out.println("Chariot names are: "+chat);
        }

        chariot.remove("Matali");
        System.out.println("After removal: "+chariot.size());
        boolean Matali = Collections.addAll(chariot, "Matali");
        System.out.println(Matali);
        System.out.println(chariot);
        System.out.println("When addall is used: "+chariot.size());
        System.out.println(chariot.containsAll(chariot));
        System.out.println(chariot.removeAll(chariot));
        System.out.println("After removing: "+chariot);
        System.out.println("Now retain all: "+chariot.retainAll(chariot));

        chariot.clear();
        System.out.println(chariot.equals("Daruga"));
        System.out.println(chariot.isEmpty());
        System.out.println(chariot.contains("Matali"));
        Object[] chariot1 = chariot.toArray();
        System.out.println(Arrays.toString(chariot1));

        return chariot;
    }

}
