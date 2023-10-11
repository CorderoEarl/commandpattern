package commandPattern;

public class CreatePlaylist implements Command{
    private MusicPlayer musicPlayer;

    public CreatePlaylist (MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.createPlaylist();
    }
}
