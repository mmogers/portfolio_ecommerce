package lesson6.clockfeatures.domain;
//every domain class should be documented
/**
 * Hour should represent the value between 0-24
 */
public class Hour {

    private byte hour;

    public Hour() {
    }

    public Hour(byte hour) {
        this.setHour(hour);
    }


    public byte getHour() {
        return hour;
    }

    //added some extra logic in setters

    /**
     * Validation is in place
     * byte values between 0 and 24 are allowed
     * @param hour - byte
     */
    public void setHour(byte hour) { // if not 0-24 - logical error-> throw an error

        if(hour < 0){
            //Throw and error "number is too small"
            return; //stops execution
        }else if (hour > 24){
            //Throw an error "number is too large"
            return; //stops execution
        }
        this.hour = hour;
    }
}
