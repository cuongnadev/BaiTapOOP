public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second ) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public MyTime nextSecond(){
        if(second != 59){
            second++;
        }else{
            if(minute != 59){
                minute++;
            }else{
                if (hour != 23){
                    hour++;
                }else{
                    this.hour = 00;
                    this.minute = 00;
                    this.second = 00;
                    return this;
                }
            }
        }
        return this;
    }
    public MyTime nextMinute(){
        if(minute != 59){
            minute++;
        }else{
            if (hour != 23){
                hour++;
            }else{
                this.hour = 00;
                this.minute = 00;
                return this;
            }
        }
        return this;
    }
    public MyTime nextHour(){
        if (hour != 23){
            hour++;
        }else{
            this.hour = 00;
            return this;
        }
        return this;
    }
    public MyTime previousSecond(){
        if(second != 00){
            second--;
        }else{
            if(minute != 00){
                minute--;
            }else{
                if (hour != 00){
                    hour--;
                }else{
                    this.hour = 23;
                    this.minute = 59;
                    this.second = 59;
                    return this;
                }
            }
        }
        return this;
    }
    public MyTime previousMinute(){
        if(minute != 00){
            minute++;
        }else{
            if (hour != 00){
                hour++;
            }else{
                this.hour = 23;
                this.minute = 59;
                return this;
            }
        }
        return this;
    }
    public MyTime previousHour(){
        if (hour != 0){
            hour++;
        }else{
            this.hour = 23;
            return this;
        }
        return this;
    }
}
