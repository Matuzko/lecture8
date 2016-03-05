package lecture8.second;


import lecture8.first.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bouquet {
    private ArrayList<Flower> arrayList = new ArrayList<>();
    private int size;

    public Bouquet(int size, ArrayList<Flower> arrayList) {
        for (Flower a:arrayList
             ) {
            if (a.getSize()>=size){
                a.setSize(size);
            }
            this.arrayList.add(a);
        }
        this.size = size;
    }

    public void addFlowerToBouquet(Flower flower) {
        this.arrayList.add(flower);
    }

    public ArrayList<Flower> getArrayList() {
        return arrayList;
    }

    public int getSize() {
        return size;
    }



}

