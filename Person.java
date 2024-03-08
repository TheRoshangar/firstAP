import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private final UserType userType;
    private Course courseG;
    private Course courseP;

ArrayList<String> arrayList1 = new ArrayList<>();
    private int CourseNumber;
    private boolean game;
    private boolean signal;
    private boolean chemistry;
    private boolean lab_2;
    private boolean lab_1;
    private boolean oop;
    private boolean ap_java;
    private boolean bp_c;
    private boolean bp_cc;
    private boolean calculus1;
    private boolean calculus2;
    private boolean topology;
    private int remover = 0;



    private HashMap<Integer , String> hashMap = new HashMap<>();

    public Person(UserType userType){
     this.userType = userType;
     courseG = new General_C();
     courseP = new Professional_C();
calculus2=false;
chemistry=false;
lab_1=false;
lab_2=false;
topology=false;
ap_java=false;
bp_c=false;
bp_cc=false;
oop=false;
calculus1=false;
game = false;
signal=false;

     CourseNumber = 0 ;
    }


    public UserType getUserType() {
        return userType;
    }

    public Course getCourseG() {
        return courseG;
    }

    public Course getCourseP() {
        return courseP;
    }

    public void setHashMap(HashMap<Integer, String> hashMap , int number,String lessons) {
        hashMap.put(number , lessons);

    }

//    public void setHashMap(HashMap<Integer, String> hashMap) {
//        this.hashMap = hashMap;
//    }

    public HashMap<Integer, String> getHashMap() {
        return hashMap;
    }

    public int getCourseNumber() {
        return CourseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        CourseNumber = courseNumber;
    }





    public void setGame(boolean game) {
        this.game = game;
    }

    public void setSignal(boolean signal) {
        this.signal = signal;
    }

    public boolean isSignal() {
        return signal;
    }

    public boolean isGame() {
        return game;
    }


    public void setTopology(boolean topology) {
        this.topology = topology;
    }

    public void setOop(boolean oop) {
        this.oop = oop;
    }

    public void setLab_2(boolean lab_2) {
        this.lab_2 = lab_2;
    }

    public void setLab_1(boolean lab_1) {
        this.lab_1 = lab_1;
    }

    public void setBp_cc(boolean bp_cc) {
        this.bp_cc = bp_cc;
    }

    public void setCalculus1(boolean calculus1) {
        this.calculus1 = calculus1;
    }

    public void setCalculus2(boolean calculus2) {
        this.calculus2 = calculus2;
    }

    public void setBp_c(boolean bp_c) {
        this.bp_c = bp_c;
    }

    public void setAp_java(boolean ap_java) {
        this.ap_java = ap_java;
    }

    public void setChemistry(boolean chemistry) {
        this.chemistry = chemistry;
    }

    public boolean isChemistry() {
        return chemistry;
    }

    public boolean isAp_java() {
        return ap_java;
    }

    public boolean isBp_c() {
        return bp_c;
    }

    public boolean isBp_cc() {
        return bp_cc;
    }

    public boolean isCalculus1() {
        return calculus1;
    }

    public boolean isCalculus2() {
        return calculus2;
    }

    public boolean isLab_1() {
        return lab_1;
    }

    public boolean isLab_2() {
        return lab_2;
    }

    public boolean isOop() {
        return oop;
    }

    public boolean isTopology() {
        return topology;
    }

    public void setHashMap(HashMap<Integer, String> integerStringHashMap) {
        this.hashMap = integerStringHashMap;
    }

    public void setRemover(int remover) {
        this.remover = remover;
    }

    public int getRemover() {
        return remover;
    }

}
