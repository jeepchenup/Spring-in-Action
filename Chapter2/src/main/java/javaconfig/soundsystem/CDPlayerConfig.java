package javaconfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    /*@Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(new SgtPeppers());
    }*/

    // 上面的写法可以换成下面这种
    @Bean
    public CDPlayer cdPlayer(CompactDisc cd) {
        return new CDPlayer(cd);
    }
}
