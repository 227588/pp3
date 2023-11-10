public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute){
        if(hour>=0 && hour<=23)
            this.hour=hour;
        if(minute>=0 && minute<=59)
            this.minute=minute;
    }

    public void addMinute(){
        minute++;
        if(minute==60){
            addHour();
            minute=0;
        }
    }
    public void addHour(){
        hour++;
        if(hour==24)
            hour=0;
    }

    @Override
    public String toString() {
        return "Clock [hour=" + hour + ", minute=" + minute + "]";
    }
    
}
