package io.turntabl.highestValueGroup;

import java.util.ArrayList;
import java.util.List;

public class HighestValueGroup {
    public int highestValueGroup(List<String> numberStrings){
        int maximumValue = 0;
        ArrayList<Integer> eachGroupValue = new ArrayList<>();
        int runningSum = 0;

        for (String value: numberStrings){
            if(!value.equals("")){
                runningSum += Integer.valueOf(value);
            }
            else{
                eachGroupValue.add(runningSum);
                runningSum = 0;
            }
        }

        for (Integer value : eachGroupValue){
            if(value > maximumValue){
                maximumValue = value;
            }
        }
        return  maximumValue;
    }
}
