package annotation.concert;

import org.aspectj.lang.annotation.*;

/**
 * 声明一个切面
 * 一个切面是由切点和通知组成
 */
@Aspect
public class Audience {

    /*@Before("execution(* annotation.concert.Performance.perform(..))")
    public void silenceCellPhones() {// 表演之前
        System.out.println("手机静音");
    }

    @Before("execution(* annotation.concert.Performance.perform(..))")
    public void takeSeats() {// 表演之前
        System.out.println("找到座位坐下");
    }

    @After("execution(* annotation.concert.Performance.perform(..))")
    public void applause() {// 表演之后
        System.out.println("表演结束，鼓掌~~~");
    }

    @AfterThrowing("execution(* annotation.concert.Performance.perform(..))")
    public void demandRefund() {// 表演失败
        System.out.pritnln("表演失败，要求退款.");
    }*/

    /* 为了避免上面重复写同样的切点，我们可以定义切点 */
    @Pointcut("execution(* annotation.concert.Performance.perform(..))")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellPhones() {// 表演之前
        System.out.println("手机静音");
    }

    @Before("performance()")
    public void takeSeats() {// 表演之前
        System.out.println("找到座位坐下");
    }

    @After("performance()")
    public void applause() {// 表演之后
        System.out.println("表演结束，鼓掌~~~");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {// 表演失败
        System.out.pritnln("表演失败，要求退款.");
    }
}
