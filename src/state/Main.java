/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author AYŞE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      DroneIslem drone=new DroneIslem();
      drone.yukselsin();
      drone.durdurulsun();
      drone.yerdeCalissin();
      drone.yukselsin();
      drone.durdurulsun();
      drone.yerdeCalissin();
      drone.durdurulsun();

        
    }
    
}
