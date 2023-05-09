package io.turntabl;

import io.turntabl.state.PackageState;

/**
 * <h1>Package</h1>
 * Context class in state pattern.
 * <p>
 * This class can be in three states:
 * <ol>
 *     <li> Ordered </li>
 *     <li> InRoute </li>
 *     <li> Received </li>
 * </ol>
 */
public class Package {
    // package state variable
    private PackageState state;

    /**
     * Construct to initial package in the first state
     * @param state the starting state of the package
     */
    public Package(PackageState state) {
        this.state = state;
    }

    /**
     * Changes package state to initial
     */
    public void previousState() {
        state.previous(this);
    }

    /**
     * Moves package to next state
     */
    public void nextState() {
        state.next(this);
    }

    /**
     * Get package status
     */
    public void packageStatus() {
        state.status();
    }

    /**
     * Set the package state
     * @param state the new package state
     */
    public void setState(PackageState state) {
        this.state = state;
    }
}
