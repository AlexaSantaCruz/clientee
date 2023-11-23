/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientewaos;

import servidor.MiInterfazRemota;
import java.rmi.Naming;

public class Clientewaos {
  public static void main(String[] args) {
    try {
      MiInterfazRemota mir = (MiInterfazRemota) Naming.lookup("//192.168.1.127:1234/PruebaRMI");

      // Imprimimos myMethod1() tantas veces como devuelva myMethod2()
      for (int i = 1; i <= mir.miMetodo2(); i++)
        mir.miMetodo1();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}