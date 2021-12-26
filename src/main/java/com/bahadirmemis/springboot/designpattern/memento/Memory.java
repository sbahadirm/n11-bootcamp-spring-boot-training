package com.bahadirmemis.springboot.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private List<Memento> mementoList;
    private List<Memento> mementoNextList;

    public Memory() {
        mementoList = new ArrayList<>();
        mementoNextList = new ArrayList<>();
    }

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento undo(){

        if (!mementoList.isEmpty()){

            Memento lastVersion = mementoList.get(mementoList.size() - 1);

            mementoList.remove(lastVersion);
            mementoNextList.add(lastVersion);

            return lastVersion;
        } else {
            throw new ArrayIndexOutOfBoundsException("No registered version found!");
        }
    }

    public Memento next(){

        if (!mementoNextList.isEmpty()){
            Memento memento = mementoNextList.get(mementoNextList.size() -1);

            mementoNextList.remove(memento);
            mementoList.add(memento);

            return memento;
        } else {
            throw new ArrayIndexOutOfBoundsException("No registered version found!");
        }
    }
}
