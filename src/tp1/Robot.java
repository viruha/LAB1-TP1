package tp1;

public class Robot {

    private Bateria bateria;
    private boolean activo;

    public Robot() {
        bateria = new Bateria();
        activo = true;
    }    

    public boolean isActivo() {
        return activo;
    }    

    public void setActivo(boolean activo) {
        this.activo = activo;
    }    

    public int avanzar(int pasos) {
        int aux = 0;
        if (activo) {
            if ((pasos / 10) <= bateria.getCarga()) {
                bateria.setCarga(bateria.getCarga() - pasos / 10);
                return pasos;
            } else {
                aux = bateria.getCarga();
                bateria.setCarga(0);
                activo = false;
                return (aux * 10);
            }
        } else {
            return -1;
        }
    }

    public int retroceder(int pasos) {
        int aux = 0;
        if (activo) {
            if ((pasos / 10) <= bateria.getCarga()) {
                bateria.setCarga(bateria.getCarga() - (pasos / 10));
                return pasos;
            } else {
                aux = bateria.getCarga();
                bateria.setCarga(0);
                activo = false;
                return (aux * 10);
            }
        } else {
            return -1; 
        }
    }

    public void dormir() {                
        activo = false;

    }

    public void despertar() {
      activo = true;
    }

    public void recargar() {

        bateria.setCarga(1000);

    }

    public boolean bateriaLlena() {
        if (bateria.getCarga()==1000) {
            return true;
        } else {
        return false;
        }
    }

    public boolean bateriaVacia() {
       if (bateria.getCarga()==0) {
            return true;
        } else {
        return false;
        }
    }

    public int energiaActual() {
       return   bateria.getCarga();
    }
}
