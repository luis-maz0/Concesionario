
package logica;

import persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void crearAuto(String marca,String modelo,String motor, String color, String patente, int cantPuertas){
        Auto auto = new Auto();
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controladoraPersistencia.crearAuto(auto);
    }
    
}
