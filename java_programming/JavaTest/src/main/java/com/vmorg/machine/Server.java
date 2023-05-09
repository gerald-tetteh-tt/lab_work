package com.vmorg.machine;

import com.vmorg.exceptions.InvalidHostnameException;

// Server virtual machine
public class Server extends Machine {
    private String linuxDistribution;
    private int majorDistributionNumber;
    private String kernelVersion;
    private String administrativeTeam;

    public Server(String hostName, String nameOfRequester, int numberOfCpus,
                     double gbOfRam, double sizeOfHardDisk, String linuxDistribution,
                     int majorDistributionNumber, String kernelVersion, String administrativeTeam) throws InvalidHostnameException {
        super(hostName, nameOfRequester, numberOfCpus, gbOfRam, sizeOfHardDisk, "Linux Machine");
        this.administrativeTeam = administrativeTeam;
        this.kernelVersion = kernelVersion;
        this.linuxDistribution = linuxDistribution;
        this.majorDistributionNumber = majorDistributionNumber;
    }
}
