package xml.concert;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void silenceCellPhones() {
        System.out.println("手机静音");
    }
    public void takeSeats() {
        System.out.println("找到座位坐下");
    }
    public void applause() {
        System.out.println("表演结束，鼓掌~~~");
    }
    public void demandRefund() {
        System.out.println("演失败，要求退款.");
    }

    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("手机静音");
            System.out.println("找到座位坐下");
            jp.proceed();
            System.out.println("表演结束，鼓掌~~~");
        } catch (Throwable e) {
            System.out.println("演失败，要求退款.");
        }
    }
}
