package Newoop;

import java.util.*;

public class Main {
    public static void main(String[] args){
        PharmacyComponent azitromit = new Azitromit("Azitromit", "10mg", 50);
        PharmacyComponent pinicilin = new Pinicilin("Pinicilin", "10mg", 120);
        PharmacyComponent water = new Water("Water", "10mg", 20);
        PharmacyComponent water2 = new Water("Water", "10mg", 20);
        PharmacyComponent cocoine = new Cocoine("Cocoine","10mg",150);

        List<PharmacyComponent> pharmacyComponents = new ArrayList<>();
        pharmacyComponents.add(azitromit);
        pharmacyComponents.add(water2);
        pharmacyComponents.add(water);
        pharmacyComponents.add(pinicilin);
        pharmacyComponents.add(cocoine);
        System.out.println(pharmacyComponents);

        Collections.sort(pharmacyComponents);
        System.out.println(pharmacyComponents);

        Pharmacy pharmacy1 = new Pharmacy().addComponent(azitromit).addComponent(water);
        Pharmacy pharmacy2 = new Pharmacy().addComponent(pinicilin).addComponent(water);
        Pharmacy pharmacy3 = new Pharmacy().addComponent(cocoine).addComponent(water);
        Pharmacy pharmacy4 = new Pharmacy().addComponent(cocoine).addComponent(pinicilin);
        Pharmacy pharmacy5 = new Pharmacy().addComponent(azitromit).addComponent(water);

        for (PharmacyComponent comp: pharmacy1){
            System.out.println(comp.getName());
        }

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);
        pharmacies.add(pharmacy4);
        pharmacies.add(pharmacy5);
        Collections.sort(pharmacies);
        System.out.println("/////////");
        System.out.println(pharmacies);


        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy5);
        System.out.println(result.size());


        Set<PharmacyComponent> set = new HashSet<>();
        set.add(azitromit);
        set.add(pinicilin);
        set.add(cocoine);

        System.out.println("///////////");
        System.out.println(set);



       // Collections.sort(pharmacies, new);
        //Iterator<PharmacyComponent> iterator = pharmacy1;


         //while (iterator.hasNext()){
         //  System.out.println(iterator.next());
         //}
//        while (((Iterator<PharmacyComponent>)pharmacy1).hasNext()){
//            System.out.println(((Iterator<PharmacyComponent>)pharmacy1).next());
//      }

    }
}
