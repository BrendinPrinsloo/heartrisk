package heartrisk.model;

public class PatientData {

    private int age;
    private int cholesterol;
    private int restingBloodPressure;
    private int maxHeartRate;

    public PatientData() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(int cholesterol) {
        this.cholesterol = cholesterol;
    }

    public int getRestingBloodPressure() {
        return restingBloodPressure;
    }

    public void setRestingBloodPressure(int restingBloodPressure) {
        this.restingBloodPressure = restingBloodPressure;
    }

    public int getMaxHeartRate() {
        return maxHeartRate;
    }

    public void setMaxHeartRate(int maxHeartRate) {
        this.maxHeartRate = maxHeartRate;
    }
}