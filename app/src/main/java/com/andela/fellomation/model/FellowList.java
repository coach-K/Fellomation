package com.andela.fellomation.model;

import java.util.ArrayList;

/**
 * Created by andela on 2/12/16.
 */
public class FellowList {
    private ArrayList<Fellow> fellows;

    public FellowList() {
        fellows = new ArrayList<>();
    }

    public boolean addFellow(Fellow fellow){
        return fellows.add(fellow);
    }

    public Fellow getFellow(int index){
        return fellows.get(index);
    }

    public ArrayList<Fellow> getAllFellows(){
        return fellows;
    }

    public void deleteFellow(int index){
        fellows.remove(index);
    }

    public void updateFellow(Fellow fellow){
        int index = 0;
        for (Fellow fellow1 : fellows){
            if (fellow1.getId() == fellow.getId()){
                fellows.set(index, fellow);
                break;
            }
            index++;
        }
    }
}
