class Question12 {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean delayed;
    public Question12(String flightNumber, String destination, String departureTime) { this.flightNumber = flightNumber; this.destination = destination; this.departureTime = departureTime; this.delayed = false; }
    public void delay(int minutes) { this.delayed = true; int h = Integer.parseInt(departureTime.split(":")[0]); int m = Integer.parseInt(departureTime.split(":")[1]); m += minutes; h += m / 60; m = m % 60; h = h % 24; this.departureTime = String.format("%02d:%02d", h, m); }
    public boolean isOnTime() { return !delayed; }
    public String toString() { return flightNumber + " " + destination + " " + departureTime + " delayed:" + delayed; }
    public static void main(String[] args) {
        Question12 f = new Question12("AI101", "Delhi", "09:30");
        System.out.println(f);
        f.delay(45);
        System.out.println(f);
    }
}
