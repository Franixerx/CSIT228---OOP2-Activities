class Hourly implements Employee {

    private int totalHours;
    private int ratePerHour;

    public int getTotalHours(){
        return totalHours;
    }

    public void setTotalHours(int totalHours){
        this.totalHours = totalHours;
    }
    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public int computeSalary() {
        ratePerHour = 300;
        return totalHours * ratePerHour;
    }
}
