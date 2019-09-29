/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Battery;

import java.util.ArrayList;
import java.util.List;

import com.sun.jna.Native;
import com.sun.jna.Structure;
import com.sun.jna.win32.StdCallLibrary;

public class battery  {

    public static void main(String[] args) {
        
        
        
Kernel32.SYSTEM_POWER_STATUS batteryStatus = new Kernel32.SYSTEM_POWER_STATUS();
Kernel32.INSTANCE.GetSystemPowerStatus(batteryStatus);

System.out.println(batteryStatus);
byte batteryPresent= batteryStatus.getBatteryLifePercent();

      
if(batteryStatus.ACLineStatus == 1 && batteryPresent>80 ){
    System.out.println("hello");

    }
    


    }
}
    