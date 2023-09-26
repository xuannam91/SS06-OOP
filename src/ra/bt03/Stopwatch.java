package ra.bt03;

public class Stopwatch {
    private long startTime,endTime;

    public long getStartTime() {
        return startTime;
    }

    public Stopwatch() {
    }

    public Stopwatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return  this.endTime - this.startTime;
    }


}
