package io.turntabl.state;

import io.turntabl.Package;

public class DeliveredState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("Packaged has been delivered! (final state)");
    }

    @Override
    public void previous(Package pkg) {
        // Packages can not be returned
        System.out.println("Can not revert state from here");
    }

    @Override
    public void status() {
        System.out.println("Package has been delivered");
    }
}
