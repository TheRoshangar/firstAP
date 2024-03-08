import java.util.ArrayList;
import java.util.HashMap;

public class Math_Co extends University{

    private  ArrayList<String> CapacityMAG = new ArrayList<>();
    private  ArrayList<String> CapacityMAP = new ArrayList<>();
    private HashMap<Integer , String> lesMAP = new HashMap<>();
    private HashMap<Integer , String> lesMAG = new HashMap<>();
    private ArrayList<String> numberMAG = new ArrayList<>();
    private ArrayList<String> numberMAP = new ArrayList<>();
    private ArrayList<String> CreditMAP = new ArrayList<>();
    private ArrayList<String> CreditMAG = new ArrayList<>();
//    int anIntMAP = 0;
//    int anIntMAG = 0;

    public Math_Co(){
        CapacityMAG.add( 0 , "4");
        CapacityMAP.add( 0 , "4");
        CapacityMAP.add( 1 , "4");
        CreditMAG.add(0,"3");
        CreditMAP.add(0,"4");
        CreditMAP.add(1,"4");
        String lesson1 = " CALCULUS_1 / Teacher = Mr Kabiri / CodeNumber = 3111 / CourseCredit = 4 / ProfessionalCourse / Class time = 2:40-4:40 sunday and tuesday/ exam at = 17 june 9AM - 12AM " ;
        lesMAP.put(1 , lesson1);
        String lesson2 = " CALCULUS_2 / Teacher = Mr Yeganeh / CodeNumber = 3112 / CourseCredit = 4 / ProfessionalCourse / Class time = 4:40-6:40 sunday and tuesday/ exam at = 17 june 9AM - 12AM " ;
        lesMAP.put(2 , lesson2);
        String lesson3 = " TOPOLOGY / Teacher = Mr Jafari / CodeNumber = 1114 / CourseCredit = 3 / GeneralCourse / Class time = 8-9:30 AM saturday and monday/ exam at = 31 june 11-16PM " ;
        lesMAG.put(1 , lesson3);
        numberMAG.add(0 ,"1114");
        numberMAP.add(0,"3111");
        numberMAP.add(1,"3112");
    }

    public void setNumberMAG(int number , String string) {
        this.numberMAG.add(number,string);
    }

    public void setNumberMAP(int number , String string) {
        this.numberMAP.add(number,string);
    }

    public ArrayList<String> getNumberMAG() {
        return numberMAG;
    }

    public ArrayList<String> getNumberMAP() {
        return numberMAP;
    }

    public void setLesMAP(int number , String lessons) {
        this.lesMAP.put(number , lessons);
    }
    public HashMap<Integer, String> getLesMAP() {
        return lesMAP;
    }
    public void setLesMAG( int number , String lessons) {
        this.lesMAG.put(number , lessons);
    }

    public HashMap<Integer, String> getLesMAG() {
        return lesMAG;
    }

    public void setNumberMAG(ArrayList<String> numberMAG) {
        this.numberMAG = numberMAG;
    }

    public ArrayList<String> getCreditMAG() {
        return CreditMAG;
    }

    public void setCreditMAP(int number , String s) {
        this.CreditMAP.add(number,s);
    }

    public ArrayList<String> getCreditMAP() {
        return CreditMAP;
    }

    public void setCreditMAG(int number , String s) {
        this.CreditMAG.add(number,s);
    }

    public void setCapacityMAG(ArrayList<String> capacityMAG) {
        CapacityMAG = capacityMAG;
    }

    public void setCapacityMAP(ArrayList<String> capacityMAP) {
        CapacityMAP = capacityMAP;
    }

    public ArrayList<String> getCapacityMAG() {
        return CapacityMAG;
    }

    public ArrayList<String> getCapacityMAP() {
        return CapacityMAP;
    }
    public void setCapacityMAP(int number , String s ) {
        CapacityMAP.add(number , s);
    }
    public void setCapacityMAG(int number , String s ) {
        CapacityMAG.add(number , s);
    }
}
