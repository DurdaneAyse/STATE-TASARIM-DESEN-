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
public class KapaliDurum implements IDurum {
 DroneIslem dron;
    public KapaliDurum(DroneIslem drn) {
        dron=drn;

    }

    @Override
    public void durdur() {
        System.out.println(" Drone zaten kapalı!");
    }

    @Override
    public void yerdeCalis() {
        System.out.println(" Drone yerde çalışmaya başladı..");
        dron.durumSetle(dron.yerdeState);
    }

    @Override
    public void yuksel() {
        System.out.println(" Drone öncelikle yerde çalışması lazım..");

    }

}
