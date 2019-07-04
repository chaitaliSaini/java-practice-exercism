class SpaceAge {
    private double ageInSeconds;

    SpaceAge(double seconds) {
        ageInSeconds = seconds;
    }

    double getSeconds() {
        return ageInSeconds;
    }

    double onEarth() {
        return calculateYears(1);
    }

    double calculateYears(double earthYears) {
        return Math.round((getSeconds() / (earthYears * 31557600.0)) * 100.0) / 100.0;
    }

    double onMercury() {
        return calculateYears(0.2408467);
    }

    double onVenus() {
        return calculateYears(0.61519726);
    }

    double onMars() {
        return calculateYears(1.8808158);
    }

    double onJupiter() {
        return calculateYears(11.862615);
    }

    double onSaturn() {
        return calculateYears(29.447498);
    }

    double onUranus() {
        return calculateYears(84.016846);
    }

    double onNeptune() {
        return calculateYears(164.79132);
    }

}
