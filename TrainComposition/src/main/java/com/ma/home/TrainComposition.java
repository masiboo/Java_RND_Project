package com.ma.home;

import java.util.Deque;
import java.util.LinkedList;

public class TrainComposition {
    private final Deque<Integer> wagons = new LinkedList<>();
    public void attachWagonFromLeft(int wagonId) {
        wagons.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        wagons.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        int index = 0;
        if (!wagons.isEmpty()) {
            index = wagons.removeFirst();
        }
        return index;
    }

    public int detachWagonFromRight() {
        int index = 0;
        if (!wagons.isEmpty()) {
            index = wagons.removeLast();
        }
        return index;
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}