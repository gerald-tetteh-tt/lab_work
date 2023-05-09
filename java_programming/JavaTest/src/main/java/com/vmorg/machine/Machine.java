package com.vmorg.machine;

import com.vmorg.exceptions.InvalidHostnameException;

// Virtual machine abstract class
public abstract class Machine {
    private static final int HOST_NAME_LENGTH = 15;
    private final String hostName;
    private final String nameOfRequester;
    private int numberOfCpus;
    // RAM in gigabytes (GB)
    private double gbOfRam;
    // size in GB
    private double sizeOfHardDisk;
    private String machineType;

    protected Machine(String hostName, String nameOfRequester, int numberOfCpus,
                      double gbOfRam, double sizeOfHardDisk, String machineType)
            throws InvalidHostnameException {
        validateHostName(hostName);
        this.hostName = hostName;
        this.nameOfRequester = nameOfRequester;
        this.numberOfCpus = numberOfCpus;
        this.gbOfRam = gbOfRam;
        this.sizeOfHardDisk = sizeOfHardDisk;
        this.machineType = machineType;
    }

    void validateHostName(String hostName) throws InvalidHostnameException {
        int monthStartIndex = 8;
        int monthEndIndex = 10;
        int dayStartIndex = 10;
        int dayEndIndex = 12;
        int prefixStartIndex = 0;
        int prefixEndIndex = 4;
        if(hostName.length() != HOST_NAME_LENGTH) {
            throw new InvalidHostnameException("Hostname length is invalid");
        }
        String hostNamePrefix = hostName.substring(prefixStartIndex,prefixEndIndex);
        if(!hostNamePrefix.equals("host")) {
            throw new InvalidHostnameException("Hostname is invalid");
        }
        int monthString = Integer.parseInt(hostName.substring(monthStartIndex,monthEndIndex));
        int dayString = Integer.parseInt(hostName.substring(dayStartIndex,dayEndIndex));
        if(monthString > 12 || dayString > 31)  {
            throw new InvalidHostnameException("Hostname date is invalid");
        }
    }

    public String getNameOfRequester() {
        return nameOfRequester;
    }

    public String getMachineType() {
        return machineType;
    }
}
