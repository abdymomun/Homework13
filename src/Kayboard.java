public class Kayboard {
private boolean backlight;
private boolean additionalDigits;

    public Kayboard(boolean backlight , boolean additionalDigitst) {
        this.backlight = backlight;
        this.additionalDigits = additionalDigitst;

    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public boolean isAdditionalDigits() {
        return additionalDigits;
    }

    public void setAdditionalDigits(boolean additionalDigits) {
        this.additionalDigits = additionalDigits;

    }

    @Override
    public String toString() {
        return "Kayboard{" +
                "backlight=" + backlight +
                ", additionalDigits=" + additionalDigits +
                '}';
    }
}
