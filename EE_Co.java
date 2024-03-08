import java.util.ArrayList;
import java.util.HashMap;

public class EE_Co extends University{

    private HashMap<Integer , String> lesEEP = new HashMap<>();
    private HashMap<Integer , String> lesEEG = new HashMap<>();

    private ArrayList<String> numberEEG = new ArrayList<>();
    private ArrayList<String> numberEEP = new ArrayList<>();

    private ArrayList<String> CreditEEP = new ArrayList<>();
    private ArrayList<String> CreditEEG = new ArrayList<>();

    private  ArrayList<String> CapacityEEG = new ArrayList<>();
    private  ArrayList<String> CapacityEEP = new ArrayList<>();
    String lesson1;
//    int anIntEEP = 0;
//    int anIntEEG = 0;
    public EE_Co(){
        CapacityEEG.add( 0 , "4");
        CapacityEEP.add( 0 , "4");
        CapacityEEP.add( 1 , "4");
        CreditEEP.add(0 , "3");
        CreditEEP.add(1,"3");
        CreditEEG.add(0 , "3");
        numberEEG.add(0 ,"1113");
        numberEEP.add(0,"2114");
        numberEEP.add(1,"2113");
      lesson1 = " SIGNAL / Teacher = Mr Ghadiri / CodeNumber = 2114 / CourseCredit = 3 / ProfessionalCourse/ Class time = 8-9:30 PM sunday and tuesday/ exam at = 22 june 9AM - 12AM " ;
        lesEEP.put(1 , lesson1);
        String lesson2 = " BP_CC / Teacher = Mr Davodi / CodeNumber = 2113 / CourseCredit = 3 / ProfessionalCourse / Class time = 6:30-8 PM saturday and monday/ exam at = 14 june 9-11AM " ;
        lesEEP.put(2 , lesson2);
        String lesson3 = " OOP / Teacher = Mr Jabari / CodeNumber = 1113 / CourseCredit = 3 / GeneralCourse / Class time = 8-9:30 PM thursday/ exam at = 24 june 9-11:30AM " ;
        lesEEG.put(1 , lesson3);
    }

    public void setNumberEEG(int number , String string) {
        this.numberEEG.add(number,string);
    }

    public void setNumberEEP(int number , String string) {
        this.numberEEP.add(number,string);
    }

    public ArrayList<String> getNumberEEG() {
        return numberEEG;
    }

    public ArrayList<String> getNumberEEP() {
        return numberEEP;
    }
    public void setLesEEP( int number , String lessons) {
        this.lesEEP.put(number , lessons);
    }

    public HashMap<Integer, String> getLesEEP() {
        return lesEEP;
    }

    public void setLesEEG( int number , String lessons) {
        this.lesEEG.put(number , lessons);
    }

    public HashMap<Integer, String> getLesEEG() {
        return lesEEG;
    }

    public void setCreditEEG(int number , String s) {
        this.CreditEEG.add(number,s);
    }

    public void setCreditEEP(int number , String s) {
        this.CreditEEP.add(number,s);
    }

    public ArrayList<String> getCreditEEG() {
        return CreditEEG;
    }

    public ArrayList<String> getCreditEEP() {
        return CreditEEP;
    }

    public void setCapacityEEG(ArrayList<String> capacityEEG) {
        CapacityEEG = capacityEEG;
    }

    public void setCapacityEEP(int number , String s ) {
        CapacityEEP.add(number , s);
    }
    public void setCapacityEEG(int number , String s ) {
        CapacityEEG.add(number , s);
    }

    public ArrayList<String> getCapacityEEG() {
        return CapacityEEG;
    }

    public ArrayList<String> getCapacityEEP() {
        return CapacityEEP;
    }
}
