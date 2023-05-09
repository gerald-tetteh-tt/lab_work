package io.turntabl.state;

import io.turntabl.Package;

public class InRouteState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void previous(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void status() {
        System.out.println("Package is in route :)");
    }
}
