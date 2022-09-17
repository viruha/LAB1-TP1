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
        System.out.println("A dormir... \nEstado activo: " + activo+ "\n- - - - - - - - - - - - - -");
    }

    public void despertar() {
        if (activo == false) {
            if (bateria.getCarga() > 0) {
                activo = true;
                System.out.println("Despertando... \nEstado activo: " + activo + "\n- - - - - - - - - - - - - -");
            } else {
                System.out.println("Recargar bateria!! Carga: " + bateria.getCarga());
            }
        }
    }

    public void recargar() {
        System.out.println("\n- - - - - - - - - - - - - -\nNo hay suficiente energía...");
        bateria.setCarga(1000);
        System.out.println("Cargando... \nEstado activo: " + activo+ "\n- - - - - - - - - - - - - -");
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
