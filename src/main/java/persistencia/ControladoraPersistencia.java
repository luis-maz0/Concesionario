package persistencia;

import logica.Auto;

public class ControladoraPersistencia {
    AutoJpaController autoJpa = new AutoJpaController();
    
    public void crearAuto(Auto auto){
        autoJpa.create(auto);
    }
    
}
