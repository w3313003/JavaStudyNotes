import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;
/**
 *@Description: 定时器
 *Date: 2018/5/15
 * @schedule
 * 在固定延迟执行中，每个执行都相对于上次执行的实际执行时间进行调度。如果由于任何原因（如垃圾收集或其他后台活动）延迟执行，后续执行也会延迟。
 * @scheduleAtFixedRate
 * 在固定速率执行中，每个执行都相对于初始执行的计划执行时间进行调度。如果由于任何原因（例如垃圾收集或其他后台活动）延迟执行，
 * 两个或更多执行将会快速连续发生以“赶上”。
 **/
public class Timer {
    public static void main(String main[]) {
        timer2();
    }
//    定时任务方式1 延迟delay后执行一次
//    schedule(TimerTask task, int delay)
    public static void time1() {
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("-------设定要指定任务--------");
            }
        }, 2000);
    }
    //    定时任务2 延迟delay后执行一次 之后每period后执行一次
//      schedule(TimerTask task, long delay, long period)
    public static void timer2() {
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("-------设定要指定任务--------" + LocalTime.now());
            }
        }, 1000, 5000);
    }
    //    定时任务3 设定指定任务task在指定延迟delay后进行固定频率peroid的执行。
//    scheduleAtFixedRate(TimerTask task, long delay, long period)
    public static void timer3() {
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("-------设定要指定任务--------" + LocalTime.now());
            }
        }, 1000, 2000);
    }
//      定时任务4 安排指定的任务task在指定的时间firstTime开始进行重复的固定速率period执行。
    public static void timer4() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 12);// 控制时
        calendar.set(Calendar.MINUTE, 0);// 控制分
        calendar.set(Calendar.SECOND, 0);// 控制秒
        Date time = calendar.getTime(); // 得出执行任务的时间,此处为今天的12：00：00
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("-------设定要指定任务--------");
            }
        }, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行
    }
}
