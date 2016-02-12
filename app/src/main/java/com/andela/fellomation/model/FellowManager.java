package com.andela.fellomation.model;

import java.util.ArrayList;

/**
 * Created by andela on 2/12/16.
 */
public class FellowManager {
    private FellowList fellowList;

    public FellowManager() {
        fellowList = new FellowList();
        populateFellow();
    }

    private void populateFellow(){
        fellowList.addFellow(new Fellow(0, "Kuti Gbolahan", "MALE"));
        fellowList.addFellow(new Fellow(1, "Daniel Okocha", "MALE"));
        fellowList.addFellow(new Fellow(2, "Grace Omotosho", "FEMALE"));
        fellowList.addFellow(new Fellow(3, "Just Protein", "MALE"));
        fellowList.addFellow(new Fellow(4, "Waleola AkinSykin", "MALE"));
        fellowList.addFellow(new Fellow(5, "Eston Karumbi", "MALE"));
        fellowList.addFellow(new Fellow(6, "Semiu Hassan", "MALE"));
        fellowList.addFellow(new Fellow(7, "Daniel James", "MALE"));
        fellowList.addFellow(new Fellow(8, "Obioma Ofo", "MALE"));
    }

    public ArrayList<Fellow> getAllCreatedFellow(){
        return fellowList.getAllFellows();
    }

}
