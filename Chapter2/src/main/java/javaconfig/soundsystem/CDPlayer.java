package javaconfig.soundsystem;

import org.springframework.context.annotation.Bean;

public class CDPlayer implements MediaPlay{
    CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }


}
