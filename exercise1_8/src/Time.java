public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    public void setTime (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public Time nextSecond(){
        if (this.second != 59){
            this.second++;
        }else {
            if(this.minute != 59){
                this.minute++;
            }else {
                if(this.hour != 23){
                    this.hour++;
                }else {
                    this.hour = 00;
                    this.minute = 00;
                    this.second = 00;
                    return this;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        if (this.second != 00){
            this.second--;
        }else {
            if(this.minute != 00){
                this.minute--;
            }else {
                if(this.hour != 00){
                    this.hour--;
                }else {
                    this.hour = 23;
                    this.minute = 59;
                    this.second = 59;
                    return this;
                }
            }
        }
        return this;
    }
}
