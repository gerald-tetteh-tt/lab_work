package com.vmorg.machine;

import com.vmorg.exceptions.InvalidHostnameException;

// Desktop virtual machine
public class Desktop extends Machine {
    private int windowsVersion;
    private String buildNumber;

    public Desktop(String hostName, String nameOfRequester, int numberOfCpus,
                      double gbOfRam, double sizeOfHardDisk, int windowsVersion,
                      String buildNumber) throws InvalidHostnameException {
        super(hostName, nameOfRequester, numberOfCpus, gbOfRam, sizeOfHardDisk,"Windows Machine");
        this.windowsVersion = windowsVersion;
        this.buildNumber = buildNumber;
    }
}
