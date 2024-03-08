import java.util.ArrayList;
import java.util.HashMap;

public class CE_Co extends University{



    private  ArrayList<String> CapacityCEG = new ArrayList<>();
    private  ArrayList<String> CapacityCEP = new ArrayList<>();

    private HashMap<Integer , String> lesCEP = new HashMap<>();
    private HashMap<Integer , String> lesCEG = new HashMap<>();

    private ArrayList<String> numberCEG = new ArrayList<>();
    private ArrayList<String> numberCEP = new ArrayList<>();

    private ArrayList<String> CreditCEP = new ArrayList<>();
    private ArrayList<String> CreditCEG = new ArrayList<>();

//    int anIntCEP = 0;
//    int anIntCEG = 0;
    public CE_Co(){
        CapacityCEG.add( 0 , "4");
        CapacityCEP.add( 0 , "4");
        CapacityCEP.add( 1 , "4");
        CreditCEP.add(0 , "3");
        CreditCEP.add(1,"3");
        CreditCEG.add(0 , "3");
        String lesson1 = " BP_C / Teacher = Mr Nazem / CodeNumber = 2112 / CourseCredit = 3 / ProfessionalCourse / Class time = 8-9:30 PM saturday and monday/ exam at = 22 june 9-11AM " ;
        lesCEP.put(2 , lesson1);
        String lesson2 = " AP_JAVA / Teacher = Mr Ghaderi / CodeNumber = 2111 / CourseCredit = 3 / ProfessionalCourse / Class time = 9:30-11 AM saturday and monday/ exam at = 31 june 9-11AM " ;
        lesCEP.put(1 , lesson2);
        String lesson3 = " GAME_THEORY / Teacher = Mr Karimi / CodeNumber = 1111 / CourseCredit = 3 / GeneralCourse / Class time = 8-9:30 AM sunday and tuesday/ exam at = 31 june 9-11AM " ;
        lesCEG.put(1 , lesson3);
        numberCEG.add(0 ,"1111");
        numberCEP.add(0,"2111");
        numberCEP.add(1,"2112");
    }

    public void setNumberCEG(int number , String string) {
        this.numberCEG.add(number,string);
    }

    public void setNumberCEP(int number , String string) {
        this.numberCEP.add(number,string);
    }

    public ArrayList<String> getNumberCEG() {
        return numberCEG;
    }

    public ArrayList<String> getNumberCEP() {
        return numberCEP;
    }
    public void setLesCEP( int number , String lessons) {
        this.lesCEP.put(number , lessons);
    }

    public HashMap<Integer, String> getLesCEP() {
        return lesCEP;
    }

    public void setLesCEG( int number , String lessons) {
        this.lesCEG.put(number , lessons);
    }

    public HashMap<Integer, String> getLesCEG() {
        return lesCEG;
    }

    public void setCreditCEG(int number , String s) {
        this.CreditCEG.add(number,s);
    }

    public ArrayList<String> getCreditCEG() {
        return CreditCEG;
    }

    public void setCreditCEP(int number , String s) {
        this.CreditCEP.add(number,s);
    }

    public ArrayList<String> getCreditCEP() {
        return CreditCEP;
    }

    public void setCapacityCEG(ArrayList<String> capacityCEG) {
        CapacityCEG = capacityCEG;
    }

    public void setCapacityCEP(ArrayList<String> capacityCEP) {
        CapacityCEP = capacityCEP;
    }

    public ArrayList<String> getCapacityCEG() {
        return CapacityCEG;
    }

    public ArrayList<String> getCapacityCEP() {
        return CapacityCEP;
    }
    public void setCapacityCEP(int number , String s ) {
        CapacityCEP.add(number , s);
    }
    public void setCapacityCEG(int number , String s ) {
        CapacityCEG.add(number , s);
    }

}
