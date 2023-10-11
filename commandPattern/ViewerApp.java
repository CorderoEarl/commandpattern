package commandPattern;

import java.util.Scanner;

public class ViewerApp {

    public static void main(String[] args) {
        Tv tv = new Tv();
        Lights lights = new Lights();
        MusicPlayer musicPlayer = new MusicPlayer();
        Thermostat thermostat = new Thermostat();

        RemoteControl rc = new RemoteControl();

        Scanner scanner = new Scanner(System.in);
        String userInput;
        boolean running = true;

        while (running) {
            System.out.println("\nChoose Option: " +
                    "\n1. Power On" +
                    "\n2. Power Off" +
                    "\n3. Volume Down" +
                    "\n4. Volume Up" +
                    "\n5. Create Playlist" +
                    "\n6. Thermostat Down" +
                    "\n7. Thermostat Up" +
                    "\n8. Set Brightness");

            System.out.print("Select a command or type 'exit' to quit: ");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    PowerOn powerOn = new PowerOn(tv);
                    System.out.println("\n" + powerOn.execute());
                    break;
                case "2":
                    PowerOff powerOff = new PowerOff(tv);
                    System.out.println("\n" + powerOff.execute());
                    break;
                case "3":
                    VolumeDown volumeDown = new VolumeDown(musicPlayer);
                    System.out.println("\n" + volumeDown.execute());
                    break;
                case "4":
                    VolumeUp volumeUp = new VolumeUp(musicPlayer);
                    System.out.println("\n" + volumeUp.execute());
                    break;
                case "5":
                    CreatePlaylist createPlaylist = new CreatePlaylist(musicPlayer);
                    System.out.println("\n" + createPlaylist.execute());
                    break;
                case "6":
                    ThermostatDown thermostatDown = new ThermostatDown(thermostat);
                    System.out.println("\n" + thermostatDown.execute());
                    break;
                case "7":
                    ThermostatUp thermostatUp = new ThermostatUp(thermostat);
                    System.out.println("\n" + thermostatUp.execute());
                    break;
                case "8":
                    SetBrightness setBrightness = new SetBrightness(lights);
                    System.out.println("\n" + setBrightness.execute());
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Please select a valid option.");
                    break;
            }
        }
    }
}
