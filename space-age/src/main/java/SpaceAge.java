class SpaceAge {
    private double ageInSeconds;
    private double mercuryOrbitalPeriod = 0.2408467;
    private double venusOrbitalPeriod = 0.61519726;
    private double earthOrbitalPeriod = 1;
    private double marsOrbitalPeriod = 1.8808158;
    private double jupiterOrbitalPeriod = 11.862615;
    private double saturnOrbitalPeriod = 29.447498;
    private double uranusOrbitalPeriod = 84.016846;
    private double neptuneOrbitalPeriod = 164.79132;

    SpaceAge(double seconds) {
        ageInSeconds = seconds;
    }

    double getSeconds() {
        return ageInSeconds;
    }

    double onEarth() {
        return calculateYears(earthOrbitalPeriod);
    }

    double calculateYears(double earthYears) {
        return Math.round((getSeconds() / (earthYears * 31557600.0)) * 100.0) / 100.0;
    }

    double onMercury() {
        return calculateYears(mercuryOrbitalPeriod);
    }

    double onVenus() {
        return calculateYears(venusOrbitalPeriod);
    }

    double onMars() {
        return calculateYears(marsOrbitalPeriod);
    }

    double onJupiter() {
        return calculateYears(jupiterOrbitalPeriod);
    }

    double onSaturn() {
        return calculateYears(saturnOrbitalPeriod);
    }

    double onUranus() {
        return calculateYears(uranusOrbitalPeriod);
    }

    double onNeptune() {
        return calculateYears(neptuneOrbitalPeriod);
    }

}
