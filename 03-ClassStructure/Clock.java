public class Clock {
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    public Clock(){
        hour = 0;
        minute = 0;
    }

    public Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public void setClock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public void setClock(){
        hour = 0;
        minute = 0;
    }

    public void displayTime(){
        System.out.printf("\n%02d:%02d\n",hour,minute);
    }

    public void addOneMinute(){
        minute++;
        if(minute>=60){
            hour++;
            minute=0;
            if(hour>=24)
                hour=0;
        }
        if(hour==alarmHour && minute==alarmMinute)
            runAlarm();
    }

    public void setAlarm(int hour, int minute){
        alarmHour = hour;
        alarmMinute = minute;
    }

    public void runAlarm(){
        System.out.printf("\nBeep beep beep\n");
    }

    
}
