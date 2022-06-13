package enumTest;

public enum Season {
    SUMMER(25), AUTUMN(10), WINTER(0), SPRING(15);

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    Season(int temperature) {
        this.temperature = temperature;
    }
}
