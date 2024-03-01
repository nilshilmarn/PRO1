package EX1;

public class WeatherStation
{

    private double temperature; // celcius
    private double pressure; // bar


    public WeatherStation()
    {
        temperature = 0;
        pressure = 1;
    }

    public WeatherStation(double temperature, double pressure)
    {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public static WeatherStation fromImperial(double temperatureFahrenheit, double pressurePSI)
    {
        double temperatureCelsius = (temperatureFahrenheit - 32) / 1.8;
        double pressureBar = pressurePSI / 14.503773773;
        return new WeatherStation(temperatureCelsius, pressureBar);
    }


    public double getTemperature()
    {
        return temperature;
    }

    public double getPressure()
    {
        return pressure;
    }

    public double getTemperatureFahrenheit(double temperature)
    {
        return temperature * 1.8 + 32;
    }

    public double getPressurePSI(double pressure)
    {
        return pressure * 14.503773773;
    }

    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }

    public void setPressure(double pressure)
    {
        this.pressure = pressure;
    }

    public void setTemperatureFahrenheit(double temperature)
    {
        this.temperature = temperature * 1.8 + 32;
    }

    public void setPressurePSI(double pressure)
    {
        this.pressure = pressure * 14.503773773;
    }

    @Override
    public String toString()
    {
        return String.format("WeatherStation(Temperature: %fC, Pressure %fBar | Temperature: %fF, Pressure: %fPSI)", temperature, pressure, getTemperatureFahrenheit(temperature), getPressurePSI(pressure));
    }


    public static void main(String[] args)
    {
        WeatherStation weatherStation = new WeatherStation();
        System.out.println(weatherStation);

        WeatherStation weatherStation1 = new WeatherStation(35, 0.5);
        System.out.println(weatherStation1);

        WeatherStation weatherStation2 = WeatherStation.fromImperial(68,21);
        System.out.println(weatherStation2);

    }

}
