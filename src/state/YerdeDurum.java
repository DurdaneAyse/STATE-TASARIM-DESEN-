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
public class YerdeDurum implements IDurum {
DroneIslem dron;
    public YerdeDurum(DroneIslem drn) {
        dron=drn;

    }

    @Override
    public void durdur() {
        System.out.println(" Drone durduruldu.");
           dron.durumSetle(dron.kapaliState);

    }

    @Override
    public void yerdeCalis() {
        System.out.println(" Drone şuan zaten yerde çlışıyor!");
    }

    @Override
    public void yuksel() {
        System.out.println(" Drone yükseliyor");
     dron.durumSetle(dron.havadaState);
    }

}
