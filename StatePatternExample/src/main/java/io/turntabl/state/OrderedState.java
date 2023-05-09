package io.turntabl.state;

import io.turntabl.Package;

public class OrderedState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new InRouteState());
    }

    @Override
    public void previous(Package pkg) {
        System.out.println("Package is in the first stage");
    }

    @Override
    public void status() {
        System.out.println("Package has been ordered");
    }
}
