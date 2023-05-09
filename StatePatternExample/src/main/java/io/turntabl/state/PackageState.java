package io.turntabl.state;

import io.turntabl.Package;

public interface PackageState {
    /**
     * Move package to next state
     * @param pkg package instance
 */
    void next(Package pkg);

    /**
     * Revert package to initial state
     * @param pkg package instance
     */
    void previous(Package pkg);

    /**
     * Show packages current status
     */
    void status();
}
