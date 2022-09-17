package tp1;

public class Hombre {

    private String nombreID;

    public Hombre() {
    }

    public Hombre(String nombreID) {
        this.nombreID = nombreID;
    }  

    public String getNombreID() {
        return nombreID;
    }

    public void setNombreID(String nombreID) {
        this.nombreID = nombreID;
    }
    

    public void jugarConRobot(Robot robot) {
        if (robot.isActivo() && robot.energiaActual() > 52) { 
            robot.avanzar(500);               
            System.out.println("Avanzando... 500pasos");
            robot.retroceder(20);               
            System.out.println("Retroceso... 20pasos");
            System.out.println("Carga de bateria: " + robot.energiaActual()); 
        } 
        robot.dormir();        
    } 
}
