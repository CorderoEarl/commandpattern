package commandPattern;

public class ThermostatUp implements Command{
    private Thermostat thermostat;

    public ThermostatUp (Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.thermostatUp();
    }
}
