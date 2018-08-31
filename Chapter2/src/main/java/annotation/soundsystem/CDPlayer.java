package annotation.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlay{

//    Autowired 1 - 成员变量
//    @Autowired
    private CompactDisc cd;

//    Autowired 2 - 构造方法
    /*@Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }*/

//    Autowired 3 - set方法
//    @Autowired
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }

//    Autowired 4 - get方法
    @Autowired
    public CompactDisc getCompactDisc() {
        return cd;
    }

    public void play() {
        cd.play();
    }
}
