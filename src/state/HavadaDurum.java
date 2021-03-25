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
public class HavadaDurum implements IDurum{

    DroneIslem dron;

   
    public HavadaDurum(DroneIslem drn){
        dron=drn;
        
    }
    @Override
    public void durdur() {
        System.out.println(" Drone havada durdurulamaz!Durdurmak için öncelike yere indiriniz. ");
    }

    @Override
    public void yerdeCalis() {
        System.out.println(" Drone yere iniyor.");
        dron.durumSetle(dron.yerdeState);
    }

    @Override
    public void yuksel() {
        System.out.println(" Drone zaten havada!!");
    }
    
}
