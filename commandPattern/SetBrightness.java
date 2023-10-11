package commandPattern;

public class SetBrightness implements Command{
    private Lights lights;

    public SetBrightness(Lights lights) {
        this.lights = lights;
    }

    @Override
    public String execute() {
        return lights.setBrightness(75);
    }
}
