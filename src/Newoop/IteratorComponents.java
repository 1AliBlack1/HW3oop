package Newoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorComponents implements Iterator<PharmacyComponent>{

   private Pharmacy pharmacy;
    private List<PharmacyComponent> components;
    private int index;

    public IteratorComponents(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
        components = pharmacy.getComponents();
        index = pharmacy.getIndex();
    }

    @Override
    public boolean hasNext(){
        return index < components.size();
    }

    @Override
    public PharmacyComponent next() {
        return components.get(index++);
    }
}
