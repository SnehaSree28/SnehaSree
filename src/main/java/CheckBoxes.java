/**
 * Created by lovel on 30-Jan-19.
 */
public enum CheckBoxes {
    Bicycle("Bicycle"),
    Bike("Bike"),
    Hatchback("Hatchback"),
    Sedan("Sedan");
    private String value;

    CheckBoxes(String value){
        this.value=value;
    }

    @Override
    public String toString() {
        return value ;
    }
}
