package commandPattern;

public class ThermostatDown implements Command{
    private Thermostat thermostat;

    public ThermostatDown (Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    @Override
    public String execute() {
        return thermostat.thermostatDown();
    }
}
