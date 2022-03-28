package employee_info;

public class Car {
    private String startElectricity() {
        return "Starting an electricity, ";
    }

    private String startCommand() {
        return "starting the ignition, ";
    }

    private String startFuelSystem() {
        return "starting the fuel supply";
    }

    public String start() {
        return startElectricity() + startCommand() + startFuelSystem();
    }
}