package io.turntabl;

import io.turntabl.state.OrderedState;

public class Main {
    public static void main(String[] args) {
        Package pkg = new Package(new OrderedState());
        pkg.packageStatus();
        pkg.previousState();
//
        pkg.nextState();
        pkg.packageStatus();

        pkg.nextState();
        pkg.packageStatus();
//
        pkg.previousState();
    }
}