import java.util.ArrayList;
import java.util.HashMap;

public class ME_Co extends University{


    private  ArrayList<String> CapacityMEG = new ArrayList<>();
    private  ArrayList<String> CapacityMEP = new ArrayList<>();
    private HashMap<Integer , String> lesMEP = new HashMap<>();
    private HashMap<Integer , String> lesMEG = new HashMap<>();

    private ArrayList<String> numberMEG = new ArrayList<>();
    private ArrayList<String> numberMEP = new ArrayList<>();
    private ArrayList<String> CreditMEP = new ArrayList<>();
    private ArrayList<String> CreditMEG = new ArrayList<>();
//    int anIntMEP = 0;
//    int anIntMEG = 0;
    public ME_Co(){
        CapacityMEG.add( 0 , "4");
        CapacityMEP.add( 0 , "4");
        CapacityMEP.add( 1 , "4");
        CreditMEP.add(0 , "3");
        CreditMEP.add(1,"1");
        CreditMEG.add(0 , "1");
        String lesson1 = " CHEMISTRY / Teacher = Mr Hamidi / CodeNumber = 3114 / CourseCredit = 3 / ProfessionalCourse / Class time = 8-11 AM thursday/ exam at = 31 june 9AM - 11AM " ;
        lesMEP.put(1 , lesson1);
        String lesson2 = " LAB_1 / Teacher = Mr Samadi / CodeNumber = 3113 / CourseCredit = 1 / ProfessionalCourse/ Class time = 8-9:30 AM thursday/ exam at = 31 june 16-18 PM " ;
        lesMEP.put(2 , lesson2);
        String lesson3 = " LAB_2 / Teacher = Mr Yousefi / CodeNumber = 1112 / CourseCredit = 1 / GeneralCourse / Class time = 9:30-11 AM sunday and tuesday/ exam at = 30 june 9-10AM " ;
        lesMEG.put(1 , lesson3);
        numberMEG.add(0 ,"1112");
        numberMEP.add(0,"3114");
        numberMEP.add(1,"3113");
    }

    public void setNumberMEG(int number , String string) {
        this.numberMEG.add(number,string);
    }

    public void setNumberMEP(int number , String string) {
        this.numberMEP.add(number,string);
    }

    public ArrayList<String> getNumberMEG() {
        return numberMEG;
    }

    public ArrayList<String> getNumberMEP() {
        return numberMEP;
    }
    public void setLesMEP( int number , String lessons) {
        this.lesMEP.put(number , lessons);
    }

    public HashMap<Integer, String> getLesMEP() {
        return lesMEP;
    }
    public void setLesMEG( int number , String lessons) {
        this.lesMEG.put(number , lessons);
    }

    public HashMap<Integer, String> getLesMEG() {
        return lesMEG;
    }

    public void setCreditMEG(int number , String s) {
        this.CreditMEG.add(number,s);
    }

    public ArrayList<String> getCreditMEG() {
        return CreditMEG;
    }

    public void setCreditMEP(int number , String s) {
        this.CreditMEP.add(number,s);
    }

    public ArrayList<String> getCreditMEP() {
        return CreditMEP;
    }

    public void setCapacityMEG(ArrayList<String> capacityMEG) {
        CapacityMEG = capacityMEG;
    }

    public void setCapacityMEP(ArrayList<String> capacityMEP) {
        CapacityMEP = capacityMEP;
    }

    public ArrayList<String> getCapacityMEG() {
        return CapacityMEG;
    }

    public ArrayList<String> getCapacityMEP() {
        return CapacityMEP;
    }
    public void setCapacityMEP(int number , String s ) {
        CapacityMEP.add(number , s);
    }
    public void setCapacityMEG(int number , String s ) {
        CapacityMEG.add(number , s);
    }
}
