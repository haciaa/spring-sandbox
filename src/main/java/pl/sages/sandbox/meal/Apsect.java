package pl.sages.sandbox.meal;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Apsect {
    @Pointcut("execution(* pl.sages.sandbox..* (..))")
    public void allInPackage() {}

    @Before("allInPackage()")
    public void logEverything(JoinPoint joinPoint) {
        System.out.print("before - " + joinPoint.toString() + "\n");
    }

    @After("allInPackage()")
    public void logEverythingAfter(JoinPoint joinPoint) {
        System.out.print("after - " + joinPoint.toString() + "\n");
    }

    @Around("bean(lunch)")
    public void aroundLunch(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.print(proceedingJoinPoint.getArgs());
        System.out.print("\n");
        try {
            Object[] objs = new Object[] {((int) proceedingJoinPoint.getArgs()[0]*2)};
            Object o = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
