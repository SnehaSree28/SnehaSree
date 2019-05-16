/**
 * Created by lovel on 11-Nov-18.
 */
public enum  EnumPractice {
    SNEHA("SNEHA SREE"),
        JAMBULA("JAM BULA");
    private String value2;
    EnumPractice(String value){
        value2=value;
    }

    @Override
    public String toString() {
        return value2;
    }

    public static void main(String args[]) {
        EnumPractice enumPractice = EnumPractice.SNEHA;;
        for(EnumPractice e:EnumPractice.values()){
            System.out.println(e);
        }
        System.out.println(EnumPractice.values().length+1);
    }
}
