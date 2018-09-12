package xml.concert;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance{
    public void perform() {
        System.out.println("开始表演~~~");
    }
}
