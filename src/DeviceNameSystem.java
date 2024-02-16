package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeviceNameSystem {
    public static void main(String[] args) {
        List<String> deviceNames = new ArrayList<>(Arrays.asList("lamp","lamp","tv","lamp","dd","lamp","tv","tv"));
        List<String> dns = new ArrayList<String>();
        List<String> copyDN = new ArrayList<>(deviceNames);
        System.out.println(deviceNames);

        int[] d = new int[deviceNames.size()];
        int count=0;

        for (int i = 0; i < copyDN.size(); i++) {
            count=0;
            for (int j = i+1; j < copyDN.size(); j++) {
                if(copyDN.get(i).equals(copyDN.get(j)) && d[j]==0)
                    d[j]=++count;
                System.out.println(Arrays.toString(d));

            }
            System.out.println(copyDN);
            System.out.println(Arrays.toString(d));
        }

        for (int i = 0; i < deviceNames.size(); i++) {
            if(d[i]!=0){
                deviceNames.set(i,deviceNames.get(i)+d[i]);
            }
        }
        System.out.println(deviceNames);
        System.out.println("++++++++++++++++++++++++++++++");





//------------------------------------------------------------

        for (int j = 0; j < deviceNames.size(); j++) {
            dns.add(deviceNames.get(0));
            for (int i = 1; i < deviceNames.size(); i++) {
                if (deviceNames.get(0).equals(deviceNames.get(i))) {
                    System.out.println("--- 1 --------------------");
                    dns.add(deviceNames.get(i) + count++);
                    deviceNames.remove(i);
                    System.out.println(" DNS= " + dns);
                    System.out.println("Device Names" + deviceNames);
                    i--;
                } else {
                    System.out.println("--- 2 --------------------");
                    dns.add(deviceNames.get(i));
                    deviceNames.remove(i);
                    System.out.println(" DNS= " + dns);
                    System.out.println("Device Names" + deviceNames);
                    i--;
                }
            }
            System.out.println("====================Iner Loop END ==================");
        }
        System.out.println("--- END --------------------");
        deviceNames.remove(0);
        System.out.println(deviceNames);
        System.out.println(dns);
    }
}
