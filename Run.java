import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
int form = 0 ;
    int addListEEP = 0 ;
    int addListCEP = 0 ;
    int addListMEP = 0 ;
    int addListMAP = 0 ;
    int addListEEG = 0 ;
    int addListCEG = 0 ;
    int addListMEG = 0 ;
    int addListMAG = 0 ;

    CE_Co ceCo = new CE_Co();
    Math_Co mathCo = new Math_Co();
    EE_Co eeCo = new EE_Co();
    ME_Co meCo = new ME_Co();
    Scanner sc = new Scanner(System.in);
    int CourseCredit = 0 ;
    HashMap<Integer , String> people = new HashMap<>();
    int NumberOfPeople = 0;

    ArrayList<Person> arrayList = new ArrayList<>();

    Person person;
    int ros = 0;
    int tos = 0;
    int dio = 0;
   int pio = 0;

    boolean init = false;
    boolean oz =false;


    ArrayList<String> noop = new ArrayList<>();
     ArrayList<String> poop = new ArrayList<>();



    public void remember1(String s){
        noop.add(ros,s);
        ros++;
    }
    public void remember2(String s){
        poop.add(tos,s);
        tos++;
    }
    public void addLessonG(String course,String number,int j){
        if (course.equals(number)){
            pio=pio+Integer.parseInt(noop.get(j-1));
        }
    }
    public void addLessonP(String course,String number,int j){
        if (course.equals(number)){
            dio=dio+Integer.parseInt(poop.get(j-2));
        }
    }

    public void login_page(){

        System.out.println("Hi please choose your User-Type and whenever you want you can type back to restart this page");

        String User_Type = sc.next();

        while (!User_Type.equals("ADMIN") && !User_Type.equals("USER")){
            if (User_Type.equals("back"))
                BackToFirstPage();
            if(User_Type.equals("exit"))break;
            System.out.println("please choose your User-Type correctly");
            User_Type = sc.next();
        }
        if (User_Type.equals("USER")){

            System.out.println("Login or sign up");
            String a = sc.next();
            while (!a.equals("login") && !a.equals("sign_up")){
                if (a.equals("back"))BackToFirstPage();
                System.out.println("your word is not legal");
                a= sc.next();
            }
            if (a.equals("sign_up")) {
             SignUp();
                person = new Person(UserType.USER);
            }
            if (a.equals("login")){
                System.out.println("please enter your stu number");
                String stu = sc.next();
                int help = 0;
                for (int i = 1 ; i <= NumberOfPeople;i++){
                    if(people.get(i).equals(stu)){
                      init = true;
                      help = i-1;
                      form = help;
                    }
                }

                if (init){
                    for (int i = 0 ; i < arrayList.get(help).getHashMap().size() ; i++){
                     person = arrayList.get(help);
                    }
                }
                if (!init){
                    System.out.println("there is no student with this ID");
                    BackToFirstPage();
                }
                init = false;
            }

        }
        else {
           AdminInput();
        }
    }
    public void AdminInput(){
        System.out.println("please type the password");
        String password = sc.next();
        while (!password.equals("1234")){
            if (password.equals("back") || password.equals("exit"))BackToFirstPage();
            System.out.println("it is not correct");
            password = sc.next();
        }
        person = new Person(UserType.ADMIN);
        AdminFirstPage();

    }

    public  String Admin1(){
        System.out.println("please choose your college");
        System.out.println("1-EE");
        System.out.println("2-CE");
        System.out.println("3-ME");
        System.out.println("4-MA");
        String k = sc.next();
        while (!k.equals("1") && !k.equals("2") && !k.equals("3") && !k.equals("4") ){
            if (k.equals("back") || k.equals("exit"))AdminFirstPage();
            System.out.println("your number is not linked");
            k = sc.next();
        }
        return  k;
    }
    public void Admin2(){
        for (int i = 1 ; i <= NumberOfPeople;i++){
            System.out.println(people.get(i));
        }
    }
    public void AdminFirstPage(){
        System.out.println("please choose one of these statements");
        System.out.println("1- add lessons to colleges");
        System.out.println("2- see students Id");
        System.out.println("3- remove lessons of student");
        System.out.println("4- show college lessons");
        System.out.println("5- change the Capacity");
        System.out.println("6- add lesson to a student");
        System.out.println("7 - suggestion  for students");


        String password = sc.next();
        while (!password.equals("1") &&!password.equals("2") &&!password.equals("3") &&!password.equals("4") && !password.equals("5") && !password.equals("6") && !password.equals("7")){
            if (password.equals("back") || password.equals("exit"))BackToFirstPage();
            System.out.println("your number is not linked");
            password = sc.next();
        }

        if (password.equals("1")){
            String k =Admin1();
            if (k.equals("1")){

                System.out.println("type your lesson code");
                String a = sc.next();

                System.out.println("type your CourseCredit");
                String b = sc.next();
                System.out.println("type your Capacity");
                String c = sc.next();
                System.out.println("type your lessons name with details");

                String newLesson=sc.next();
                Pattern pattern = Pattern.compile("ProfessionalCourse");
                Matcher matcher = pattern.matcher(newLesson);
                if (matcher.find()){
                    eeCo.setLesEEP(3+addListEEP,newLesson);
                    eeCo.setCreditEEP(2+addListEEP,b);
                    addListEEP++;
                  eeCo.getNumberEEP().add(a);
                    remember2(b);
                    eeCo.getCapacityEEP().add(1+addListEEG,c);
                }
                else{
                    eeCo.setLesEEG(2+addListEEG,newLesson);
                    eeCo.setCreditEEG(1+addListEEG,b);
                  addListEEG++;
                    eeCo.getNumberEEG().add(a);
                    remember1(b);
                    eeCo.getCapacityEEG().add(addListEEG,c);
                }

            }
            if (k.equals("2")){
                System.out.println("type your lesson code");
                String a = sc.next();

                System.out.println("type your CourseCredit");
                String b = sc.next();
                System.out.println("type your Capacity");
                String c = sc.next();
                System.out.println("type your lessons name with details");

                String newLesson=sc.next();
                Pattern pattern = Pattern.compile("ProfessionalCourse");
                Matcher matcher = pattern.matcher(newLesson);
                if (matcher.find()){
                 ceCo.setLesCEP(3+addListCEP,newLesson);
                    ceCo.setCreditCEP(2+addListCEP,b);
                    addListCEP++;
                  ceCo.getNumberCEP().add(a);
                    remember2(b);
                    ceCo.getCapacityCEP().add(1+addListCEP,c);
                }
                else{
                   ceCo.setLesCEG(2+addListCEG,newLesson);
                    ceCo.setCreditCEG(1+addListCEG,b);
                    addListCEG++;
                    ceCo.getNumberCEG().add(a);
                    remember1(b);
                    ceCo.getCapacityCEG().add(addListCEG,c);
                }
            }
            if (k.equals("3")){
                System.out.println("type your lesson code");
                String a = sc.next();

                System.out.println("type your CourseCredit");
                String b = sc.next();
                System.out.println("type your Capacity");
                String c = sc.next();
                System.out.println("type your lessons name with details");

                String newLesson=sc.next();
                Pattern pattern = Pattern.compile("ProfessionalCourse");
                Matcher matcher = pattern.matcher(newLesson);
                if (matcher.find()){
                   meCo.setLesMEP(3+addListMEP,newLesson);
                    meCo.setCreditMEP(2+addListMEP,b);
                    addListMEP++;
                   remember2(b);
                   meCo.getNumberMEP().add(a);
                    meCo.getCapacityMEP().add(1+addListMEP,c);
                }
                else{
                  meCo.setLesMEG(2+addListMEG,newLesson);
                    meCo.setCreditMEG(1+addListMEG,b);
                    addListMEG++;
                 meCo.getNumberMEG().add(a);
                    remember1(b);
                    meCo.getCapacityMEG().add(addListMEG,c);
                }
            }
            if (k.equals("4")){
                System.out.println("type your lesson code");
                String a = sc.next();

                System.out.println("type your CourseCredit");
                String b = sc.next();
                System.out.println("type your Capacity");
                String c = sc.next();
                System.out.println("type your lessons name with details");

                String newLesson=sc.next();
                Pattern pattern = Pattern.compile("ProfessionalCourse");
                Matcher matcher = pattern.matcher(newLesson);
                if (matcher.find()){
                mathCo.setLesMAP(3+addListMAP,newLesson);
                    mathCo.setCreditMAP(2+addListMAP,b);
                    addListMAP++;
                     mathCo.getNumberMAP().add(a);
                    remember2(b);
                    mathCo.getCapacityMAP().add(1+addListMAP,c);
                }
                else{
                 mathCo.setLesMAG(2+addListMAG,newLesson);
                    mathCo.setCreditMAG(1+addListMAG,b);
                    addListMAG++;
                   mathCo.getNumberMAG().add(a);
                    remember1(b);
                    mathCo.getCapacityMAG().add(addListMAG,c);
                }
            }
            System.out.println("ok you change the plan please type back or exit");
            String back = sc.nextLine();
            while (!back.equals("back") && !back.equals("exit")){
                System.out.println("please type back or exit");
                back=sc.nextLine();
            }
            if (back.equals("back")){
                AdminFirstPage();
            }
            if (back.equals("exit")){BackToFirstPage();

            }
        }
        if (password.equals("2")){
Admin2();
AdminFirstPage();
        }
        if (password.equals("3")){

            System.out.println("enter student ID");
            String stu = sc.next();

            for (int i = 1 ; i <= NumberOfPeople;i++){
                if(people.get(i).equals(stu)){
                    init = true;
                    j= i-1;
                    form = j;
                    break;
                }
            }
            if (init){
                System.out.println();
                System.out.println("these are the lessons :");
                System.out.println();
                int x = 0 ;
              for(int i = 1 ;i <= arrayList.get(j).getHashMap().size() ;i++){
                  if (arrayList.get(j).getHashMap().get(i)==null){
                      x++;
                      continue;
                  }
                  System.out.println(i-x + " : "+arrayList.get(j).getHashMap().get(i));
              }
                System.out.println("which one do you want to remove");
              SpecialRemove();
            }
            else {
                System.out.println("we don,t have an student with this ID");
                AdminFirstPage();
            }
        }
        if (password.equals("4")){
ne();

            }
        if (password.equals("5")){
            sort();
            AdminFirstPage();
        }
if (password.equals("6")){

    System.out.println("enter student ID");
    String stu = sc.next();

    for (int i = 1 ; i <= NumberOfPeople;i++){
        if(people.get(i).equals(stu)){
            init = true;
            j= i-1;
            form = j;
            break;
        }
    }
    if (init){
        System.out.println();
        System.out.println("these are the lessons :");
        System.out.println();
        int x = 0 ;
        for(int i = 1 ;i <= arrayList.get(j).getHashMap().size() ;i++){
            if (arrayList.get(j).getHashMap().get(i)==null){
                x++;
                continue;
            }
            System.out.println(i-x + " : "+arrayList.get(j).getHashMap().get(i));
        }
        System.out.println("");
    dory();
    }
    else {
        System.out.println("we don,t have an student with this ID");
        AdminFirstPage();
    }
}
if(password.equals("7")){

    System.out.println("enter student ID");
    String stu = sc.next();

    for (int i = 1 ; i <= NumberOfPeople;i++){
        if(people.get(i).equals(stu)){
            init = true;
            j= i-1;
            form = j;
            break;
        }
    }
    if (init){
        System.out.println();
        System.out.println("type your suggestion");
        String s = sc.nextLine();
        arrayList.get(form).arrayList1.add(s);
    }
    else {
        System.out.println("we don,t have an student with this ID");

    }
}
    }
    public void dory(){

        person =  arrayList.get(form);
    Todo();
    }
    public void sort(){
        String k = Admin1();
        if (k.equals("1")){
            System.out.println("type your code number");
            String s = sc.next();
            for (int i = 0 ; i < eeCo.getNumberEEG().size() ; i++){
                if (s.equals(eeCo.getNumberEEG().get(i))){
                    System.out.println("change the capacity");
                    String a =  sc.next();
                    eeCo.getCapacityEEG().remove(i);
                eeCo.setCapacityEEG(i , a);

                }
            }

            for (int i = 0 ; i < eeCo.getNumberEEP().size() ; i++){
                if (s.equals(eeCo.getNumberEEP().get(i))){
                    System.out.println("change the capacity");
                    String a =  sc.next();
                    eeCo.getCapacityEEP().remove(i);
                    eeCo.setCapacityEEP(i , a);

                }
            }
        }
        if (k.equals("2")){
            System.out.println("type your code number");
            String s = sc.next();
            for (int i = 0 ; i < ceCo.getNumberCEG().size() ; i++){
                if (s.equals(ceCo.getNumberCEG().get(i))){
                    System.out.println("change the capacity");
                    String a =  sc.next();
                    ceCo.getCapacityCEG().remove(i);
                    ceCo.setCapacityCEG(i , a);

                }
            }

            for (int i = 0 ; i < ceCo.getNumberCEP().size() ; i++){
                if (s.equals(ceCo.getNumberCEP().get(i))){
                    System.out.println("change the capacity");
                    String a =  sc.next();
                    ceCo.getCapacityCEP().remove(i);
                    ceCo.setCapacityCEP(i , a);

                }
            }
        }
        if (k.equals("3")){
            System.out.println("type your code number");
            String s = sc.next();
            for (int i = 0 ; i < meCo.getNumberMEG().size() ; i++){
                if (s.equals(meCo.getNumberMEG().get(i))){
                    System.out.println("change the capacity");
                    String a =  sc.next();
                    meCo.getCapacityMEG().remove(i);
                    meCo.setCapacityMEG(i , a);

                }
            }

            for (int i = 0 ; i < meCo.getNumberMEP().size() ; i++){
                if (s.equals(meCo.getNumberMEP().get(i))){
                    System.out.println("change the capacity");
                    String a =  sc.next();
                    meCo.getCapacityMEP().remove(i);
                    meCo.setCapacityMEP(i , a);

                }
            }
        }
        if (k.equals("4")){
            System.out.println("type your code number");
            String s = sc.next();
            for (int i = 0 ; i < mathCo.getNumberMAG().size() ; i++){
                if (s.equals(mathCo.getNumberMAG().get(i))){
                    System.out.println("change the capacity");
                    String a =  sc.next();
                    mathCo.getCapacityMAG().remove(i);
                    mathCo.setCapacityMAG(i , a);

                }
            }

            for (int i = 0 ; i < mathCo.getNumberMAP().size() ; i++){
                if (s.equals(mathCo.getNumberMAP().get(i))){
                    System.out.println("change the capacity");
                    String a =  sc.next();
                    mathCo.getCapacityMAP().remove(i);
                    mathCo.setCapacityMAP(i , a);

                }
            }
        }
    }
    public void ne(){
        String k= Admin1();
int s = 0; ;
        if (k.equals("1")){

            System.out.println("these are your general lessons at EE collage");
            for (int i = 0 ; i <eeCo.getNumberEEG().size();i++){
                s=i+1;
                System.out.println(eeCo.getCapacityEEG());
                System.out.println(s+" : "+eeCo.getLesEEG().get(i+1)+" / Capacity = " + eeCo.getCapacityEEG().get(i));
            }
            System.out.println();
            System.out.println("these are your professional lessons at EE collage");
            for (int i = 0 ; i <eeCo.getNumberEEP().size();i++){
                s=i+1;
                System.out.println(s+" : "+eeCo.getLesEEP().get(i+1)+" / Capacity = " + eeCo.getCapacityEEP().get(i));
            }
            System.out.println();
        }
        if (k.equals("2")){
            System.out.println("these are your general lessons at CE collage");
            for (int i = 0 ; i <ceCo.getNumberCEG().size();i++){
                s=i+1;
                System.out.println(s+" : "+ceCo.getLesCEG().get(i+1)+" / Capacity = " + ceCo.getCapacityCEG().get(i));
            }
            System.out.println();
            System.out.println("these are your professional lessons at CE collage");
            for (int i = 0 ; i <ceCo.getNumberCEP().size();i++){
                s=i+1;
                System.out.println(s+" : "+ceCo.getLesCEP().get(i+1)+" / Capacity = " + ceCo.getCapacityCEP().get(i));
            }
            System.out.println();
        }
        if (k.equals("3")){
            System.out.println("these are your general lessons at ME collage");
            for (int i = 0 ; i <meCo.getNumberMEG().size();i++){
                s=i+1;
                System.out.println(s+" : "+meCo.getLesMEG().get(i+1)+" / Capacity = " + meCo.getCapacityMEG().get(i));
            }
            System.out.println();
            System.out.println("these are your professional lessons at ME collage");
            for (int i = 0 ; i <meCo.getNumberMEP().size();i++){
                s=i+1;
                System.out.println(s+" : "+meCo.getLesMEP().get(i+1)+" / Capacity = " + meCo.getCapacityMEP().get(i));
            }
            System.out.println();

        }
        if (k.equals("4")){
            System.out.println("these are your general lessons at MA collage");
            for (int i = 0 ; i <mathCo.getNumberMAG().size();i++){
                s=i+1;
                System.out.println(s+" : "+mathCo.getLesMAG().get(i+1)+" / Capacity = " + mathCo.getCapacityMAG().get(i));
            }
            System.out.println();
            System.out.println("these are your professional lessons at MA collage");
            for (int i = 0 ; i <mathCo.getNumberMAP().size();i++){
                s=i+1;
                System.out.println(s+" : "+mathCo.getLesMAP().get(i+1)+" / Capacity = " + mathCo.getCapacityMAP().get(i));
            }
            System.out.println();
    }

    ne();
    }
    int j=0;
    public void SpecialRemove(){
        System.out.println("please enter your collage");
        System.out.println("1- EE");
        System.out.println("2- CE");
        System.out.println("3- ME");
        System.out.println("4- MATH");
        String number = sc.next();
        while (!number.equals("1") && !number.equals("2") &&!number.equals("3") &&!number.equals("4") ){

            while (number.equals("show")){
                show();
                number = sc.next();
            }
            if (number.equals("finish"))finish();

            if (number.equals("remove")){
                remove();

                number=sc.next();
            }

            if(number.equals("back"))BackToFirstPage();
            if (number.equals("exit") || number.equals("skip"))break;
            if (!number.equals("1") && !number.equals("2") &&!number.equals("3") &&!number.equals("4")){
                System.out.println("Your number is not linked try again");
                number = sc.next();}

        }
        int rox = 0;
        System.out.println("enter your number");
        String num = sc.next();

        if (number.equals("1")){
            for (int i = 0 ; i < eeCo.getNumberEEP().size() ; i++ ){
                if (num.equals(eeCo.getNumberEEP().get(i))){
                    for (int j = 1 ; j <= arrayList.get(form).getHashMap().size() ; j++){
                        if (arrayList.get(form).getHashMap().get(j)==null){
                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(arrayList.get(form).getHashMap().get(j));
                        if (matcher.find()){
                            arrayList.get(form).getCourseP().setCourseCredit(arrayList.get(form).getCourseP().getCourseCredit()-Integer.parseInt(eeCo.getCreditEEP().get(i)));
                            if(num.equals("2113")){
                               arrayList.get(form).setBp_cc(false);
                            }
                            if(num.equals("2114")){
                                arrayList.get(form).setSignal(false);}
                            rox = j ;
                            arrayList.get(form).getHashMap().put(rox,null);
                            arrayList.get(form).setRemover(arrayList.get(form).getRemover()+1);
                            String sr = String.valueOf(Integer.parseInt(eeCo.getCapacityEEP().get(i))+1);
                            eeCo.getCapacityEEP().remove(i);
                            eeCo.getCapacityEEP().add(i,sr);

                            break;
                        }

                    }
                }
            }

            for (int i = 0 ; i < eeCo.getNumberEEG().size() ; i++ ){

                if (num.equals(eeCo.getNumberEEG().get(i))){
                    for (int j = 1 ; j <= arrayList.get(form).getHashMap().size() ; j++){

                        if (arrayList.get(form).getHashMap().get(j)==null){

                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(arrayList.get(form).getHashMap().get(j));
                        if (matcher.find()){
                            arrayList.get(form).getCourseG().setCourseCredit(arrayList.get(form).getCourseG().getCourseCredit()-Integer.parseInt(eeCo.getCreditEEG().get(i)));
                            rox = j ;
                            arrayList.get(form).getHashMap().put(rox,null);
                            person.setRemover(arrayList.get(form).getRemover()+1);
                            String sr = String.valueOf(Integer.parseInt(eeCo.getCapacityEEG().get(i))+1);
                            eeCo.getCapacityEEG().remove(i);
                            eeCo.getCapacityEEG().add(i,sr);
                            break;
                        }

                    }
                }
            }
        }


        if (number.equals("2")){

            for (int i = 0 ; i < ceCo.getNumberCEP().size() ; i++ ){
                if (num.equals(ceCo.getNumberCEP().get(i))){
                    for (int j = 1 ; j <= arrayList.get(form).getHashMap().size() ; j++){
                        if (arrayList.get(form).getHashMap().get(j)==null){

                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(arrayList.get(form).getHashMap().get(j));
                        if (matcher.find()){
                            arrayList.get(form).getCourseP().setCourseCredit(arrayList.get(form).getCourseP().getCourseCredit()-Integer.parseInt(ceCo.getCreditCEP().get(i)));
                            if(num.equals("2111")){
                                arrayList.get(form).setAp_java(false);
                            }
                            if(num.equals("2112")){
                                arrayList.get(form).setBp_c(false);}

                            rox = j ;
                            arrayList.get(form).getHashMap().put(rox,null);
                            arrayList.get(form).setRemover(arrayList.get(form).getRemover()+1);
                            String sr = String.valueOf(Integer.parseInt(ceCo.getCapacityCEP().get(i))+1);
                            ceCo.getCapacityCEP().remove(i);
                            ceCo.getCapacityCEP().add(i,sr);

                            break;
                        }

                    }
                }
            }

            for (int i = 0 ; i < ceCo.getNumberCEG().size() ; i++ ){
                if (num.equals(ceCo.getNumberCEG().get(i))){
                    for (int j = 1 ; j <= arrayList.get(form).getHashMap().size() ; j++){
                        if (arrayList.get(form).getHashMap().get(j)==null){
                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(arrayList.get(form).getHashMap().get(j));
                        if (matcher.find()){
                            arrayList.get(form).getCourseG().setCourseCredit(arrayList.get(form).getCourseG().getCourseCredit()-Integer.parseInt(ceCo.getCreditCEG().get(i)));
                            if (num.equals("1111")){
                                arrayList.get(form).setGame(false);
                            }
                            String sr = String.valueOf(Integer.parseInt(ceCo.getCapacityCEG().get(i))+1);
                            ceCo.getCapacityCEG().remove(i);
                            ceCo.getCapacityCEG().add(i,sr);
                            rox = j;
                            arrayList.get(form).getHashMap().put(rox,null);
                            arrayList.get(form).setRemover(arrayList.get(form).getRemover()+1);break;
                        }

                    }
                }
            }
        }


        if (number.equals("3")){

            for (int i = 0 ; i < meCo.getNumberMEP().size() ; i++ ){
                if (num.equals(meCo.getNumberMEP().get(i))){
                    for (int j = 1 ; j <= arrayList.get(form).getHashMap().size() ; j++){
                        if (arrayList.get(form).getHashMap().get(j)==null){

                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(arrayList.get(form).getHashMap().get(j));
                        if (matcher.find()){
                            arrayList.get(form).getCourseP().setCourseCredit(arrayList.get(form).getCourseP().getCourseCredit()-Integer.parseInt(meCo.getCreditMEP().get(i)));
                           ;
                            if(num.equals("3113")){
                                arrayList.get(form).setLab_1(false);
                            }
                            if(num.equals("3114")){
                                arrayList.get(form).setChemistry(false);}

                            String sr = String.valueOf(Integer.parseInt(meCo.getCapacityMEP().get(i))+1);
                            meCo.getCapacityMEP().remove(i);
                            meCo.getCapacityMEP().add(i,sr);
                            rox = j ;
                            arrayList.get(form).getHashMap().put(rox,null);
                            arrayList.get(form).setRemover(arrayList.get(form).getRemover()+1);break;
                        }

                    }
                }
            }

            for (int i = 0 ; i < meCo.getNumberMEG().size() ; i++ ){
                if (num.equals(meCo.getNumberMEG().get(i))){
                    for (int j = 1 ; j <= arrayList.get(form).getHashMap().size() ; j++){
                        if (arrayList.get(form).getHashMap().get(j)==null){

                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(arrayList.get(form).getHashMap().get(j));
                        if (matcher.find()){
                            arrayList.get(form).getCourseG().setCourseCredit(arrayList.get(form).getCourseG().getCourseCredit()-Integer.parseInt(meCo.getCreditMEG().get(i)));
                            if (num.equals("1112")){
                                arrayList.get(form).setLab_2(false);
                            }
                            String sr = String.valueOf(Integer.parseInt(meCo.getCapacityMEG().get(i))+1);
                            meCo.getCapacityMEG().remove(i);
                            meCo.getCapacityMEG().add(i,sr);
                            rox = j ;
                            arrayList.get(form).getHashMap().put(rox,null);
                            arrayList.get(form).setRemover(arrayList.get(form).getRemover()+1);break;
                        }

                    }
                }
            }
        }


        if (number.equals("4")){

            for (int i = 0 ; i < mathCo.getNumberMAP().size() ; i++ ){
                if (num.equals(mathCo.getNumberMAP().get(i))){
                    for (int j = 1 ; j <= arrayList.get(form).getHashMap().size() ; j++){
                        if (arrayList.get(form).getHashMap().get(j)==null){

                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(arrayList.get(form).getHashMap().get(j));
                        if (matcher.find()){
                            arrayList.get(form).getCourseP().setCourseCredit(arrayList.get(form).getCourseP().getCourseCredit()-Integer.parseInt(mathCo.getCreditMAP().get(i)));

                            if(num.equals("3111")){
                                arrayList.get(form).setCalculus1(false);
                            }
                            if(num.equals("3112")){
                                arrayList.get(form).setCalculus2(false);}
                            String sr = String.valueOf(Integer.parseInt(mathCo.getCapacityMAP().get(i))+1);
                            mathCo.getCapacityMAP().remove(i);
                            mathCo.getCapacityMAP().add(i,sr);
                            rox = j ;
                            arrayList.get(form).getHashMap().put(rox,null);
                            arrayList.get(form).setRemover(arrayList.get(form).getRemover()+1);break;
                        }

                    }
                }
            }

            for (int i = 0 ; i < mathCo.getNumberMAG().size() ; i++ ){
                if (num.equals(mathCo.getNumberMAG().get(i))){
                    for (int j = 1 ; j <= arrayList.get(form).getHashMap().size() ; j++){
                        if (arrayList.get(form).getHashMap().get(j)==null){

                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(arrayList.get(form).getHashMap().get(j));
                        if (matcher.find()){
                            arrayList.get(form).getCourseG().setCourseCredit(arrayList.get(form).getCourseG().getCourseCredit()-Integer.parseInt(mathCo.getCreditMAG().get(i)));
                            if (num.equals("1114")){
                                arrayList.get(form).setTopology(false);
                            }
                            String sr = String.valueOf(Integer.parseInt(mathCo.getCapacityMAG().get(i))+1);
                            mathCo.getCapacityMAG().remove(i);
                            mathCo.getCapacityMAG().add(i,sr);
                            rox = j ;
                            arrayList.get(form).getHashMap().put(rox,null);
                            arrayList.get(form).setRemover(arrayList.get(form).getRemover()+1);
                            break;
                        }

                    }
                }
            }
        }
        System.out.println("your work has done what should we do ?");
        arrayList.add(arrayList.get(form));
        AdminFirstPage();

    }


    public void BackToFirstPage(){
        oz = false;
        init = false;
    System.out.println();
    login_page();
    Uni();
    if (person.getUserType().equals(UserType.USER)) {

            String ok ;

                System.out.println("if you want to know your schedule type show any where you want OK ?");
                ok = sc.next();


            while (ok.equals("show")) {
                show();
                ok = sc.next();
            }
            if (ok.equals("suggestion")){
                for (int i = 0 ; i < person.arrayList1.size() ; i++){
                    System.out.println(person.arrayList1.get(i));
                }
            }
            if (ok.equals("finish"))finish();
        Todo();
    }
    if (person.getUserType().equals(UserType.ADMIN)) {

    }
}
public void Todo(){
    String K = description();
    if (K.equals("1") ) {
        System.out.println("Please choose your general lessons at first or type to skip");
        for (int j = 1 ; j <= 1+addListEEG ; j++) {
            System.out.println(eeCo.getLesEEG().get(j)+"/ Capacity = "+eeCo.getCapacityEEG().get(j-1));
        }

        EECollege();
Todo();
    }

    if (K.equals("2")) {
        System.out.println("Please choose your general lessons at first or type to skip");
        for (int j = 1 ; j <= 1+addListCEG ; j++) {
            System.out.println(ceCo.getLesCEG().get(j)+"/ Capacity = "+ceCo.getCapacityCEG().get(j-1));
        }
        CECollege();
        Todo();
    }
    if (K.equals("3") ) {
        System.out.println("Please choose your general lessons at first or type to skip");
        for (int j = 1 ; j <= 1+addListMEG ; j++) {
            System.out.println(meCo.getLesMEG().get(j)+"/ Capacity = "+meCo.getCapacityMEG().get(j-1));
        }
        MECollege();
        Todo();
    }

    if (K.equals("4") ) {
        System.out.println("Please choose your general lessons at first or type to skip");
        for (int j = 1 ; j <= 1+addListMAG ; j++) {
            System.out.println(mathCo.getLesMAG().get(j)+"/ Capacity = "+mathCo.getCapacityMAG().get(j-1));
        }
        MATHCollege();
        Todo();
    }
}
    public void Uni(){
        System.out.println("welcome please enter your university");
        String uni = sc.next();
        while (!uni.equals("SHARIF")){

            if(uni.equals("back"))BackToFirstPage();

            if(uni.equals("exit"))break;
            System.out.println("Sorry it is not correct if you want to try again please type retry");
            String ans = sc.next();
            while(!ans.equals("retry")){
                if (ans.equals("exit"))break;
                System.out.println("you just can say legal words");
                ans= sc.next();}
            if (ans.equals("exit"))break;
            System.out.println("welcome please enter your university");
            uni = sc.next();
        }
    }

    public  void  show(){
        int x = 0 ;

        for (int i = 1 ; i <= person.getHashMap().size();i++){
            if (person.getHashMap().get(i)==null){
                x++;
                continue;
            }
            System.out.print(i-x+ ": ");

            System.out.println(person.getHashMap().get(i));

        }
    }




    public void EECollege(){
        String num ="";

            for (int i = 0 ; i < 1+addListEEG ; i++) {

             num = sc.next();



             boolean help = false;

for (int s= 0 ; s < 1+addListEEG ; s++){
    if (num.equals(eeCo.getNumberEEG().get(s))){
       help = true;
       break;
    }
}

            while (!help) {
                while (num.equals("show")) {
                    show();
                    num = sc.next();
                }
                if (num.equals("suggestion")){
                    for (int r = 0 ; r < person.arrayList1.size() ; r++){
                        System.out.println(person.arrayList1.get(r));
                    }
                }
                for (int s= 0 ; s < 1+addListEEG ; s++){
                    if (num.equals(eeCo.getNumberEEG().get(s))){
                        help = true;
                        break;
                    }
                }
                if (num.equals("finish")) finish();
                if (num.equals("remove")) {
                    if (person.getCourseP().getCourseCredit() + person.getCourseG().getCourseCredit()+dio+pio != 0) {
                        remove();
                    } else {
                        System.out.println("there is no lesson you can remove it");
                        System.out.println();
                    }
                }
                if (num.equals("back")) BackToFirstPage();
                if (num.equals("exit") || num.equals("skip")) break;
                if (!help) {

                    System.out.println("Change your number or type skip if you don,t want this lesson");
                    num = sc.next();}

                for (int s= 0 ; s < 1+addListEEG ; s++){
                    if (num.equals(eeCo.getNumberEEG().get(s))){
                        help = true;
                        break;
                    }
                }
            }
                if (num.equals("skip"))break;
                for (int y = 0 ; y < 1+addListEEG ; y++) {
                    if (num.equals(eeCo.getNumberEEG().get(y))){
                        if ((person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+Integer.parseInt(eeCo.getCreditEEG().get(i)))+dio+pio < 21  && person.getCourseG().getCourseCredit()+Integer.parseInt(eeCo.getCreditEEG().get(i))+pio < 6){
                            if (!num.equals("1113") || !person.isOop()){
                           if (!eeCo.getCapacityEEG().get(y).equals("0")){
                            person.getCourseG().EE(eeCo.getNumberEEG().get(y));
                            person.setCourseNumber(person.getCourseNumber()+1);
                                String sr = String.valueOf(Integer.parseInt(eeCo.getCapacityEEG().get(y))-1);
eeCo.getCapacityEEG().remove(y);
                                eeCo.setCapacityEEG(y,sr);

                            person.setHashMap(person.getHashMap(),person.getCourseNumber(),eeCo.getLesEEG().get(y+1)+"/ Capacity = "+eeCo.getCapacityEEG().get(y));
                            if (y!=0){
                           addLessonG(num ,eeCo.getNumberEEG().get(y),y);}

                            if (num.equals("1113")){
                                person.setOop(true);
                            }
                            break;}   else {
                                System.out.println("we don,t have capacity");
                            }
                        }
                            else {
                                System.out.println("you already have this class");
                            }
                        }
                        else {
                            System.out.println("if you choose this lesson your Course credit is more than 20 or your general course is more than 5");
                        }
                    }
                }

                if (i !=addListEEG ) {
                    System.out.println("if you want another lesson type yes or type no");
                    String a = sc.next();
                    if (a.equals("no"))break;
                    if (a.equals("yes")){
                        System.out.println("type another lesson code");
}}

                }
                System.out.println();
                System.out.println("Please choose your professional lesson or type to skip");
                for (int j = 1 ; j <3+addListEEP;j++){
                    System.out.println(eeCo.getLesEEP().get(j)+"/ Capacity = "+eeCo.getCapacityEEP().get(j-1));
                }
                ppp();

       }
    public void ppp(){

        for (int i = 0 ; i <2+addListEEP;i++){
            String num = sc.next();

            boolean help = false;

            for (int s= 0 ; s < 2+addListEEP ; s++){
                if (num.equals(eeCo.getNumberEEP().get(s))){
                    help = true;
                    break;
                }
            }

            while (!help) {
                while (num.equals("show")){
                    show();
                    num = sc.next();
                }
                if (num.equals("suggestion")) {
                    for (int r = 0; r < person.arrayList1.size(); r++) {
                        System.out.println(person.arrayList1.get(r));
                    }
                }
                for (int s= 0 ; s < 2+addListEEP ; s++){
                    if (num.equals(eeCo.getNumberEEP().get(s))){
                        help = true;
                        break;
                    }
                }

                if (num.equals("finish"))finish();
                if (num.equals("remove")){
                    if (person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio!=0){
                        remove();
                    }
                    else {
                        System.out.println("there is no lesson you can remove it");
                        System.out.println();
                    }
                }
                if(num.equals("back"))BackToFirstPage();
                if (num.equals("exit") || num.equals("skip")) break;
                if (!help){
                    System.out.println("Change your number or type skip if you don,t want this lesson");
                    num = sc.next();
                }

                for (int s= 0 ; s < 2+addListEEP ; s++){
                    if (num.equals(eeCo.getNumberEEP().get(s))){
                        help = true;
                        break;
                    }
                }

            }

            if (num.equals("skip"))break;
                for (int y = 0 ; y < 2+addListEEP ; y++) {
                    if (num.equals(eeCo.getNumberEEP().get(y))){
                        if ((person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio+Integer.parseInt(eeCo.getCreditEEP().get(i)) < 21  && person.getCourseG().getCourseCredit()+pio < 6)){
                            if ((!num.equals("2114") || !person.isBp_c()) && (!num.equals("2114") || !person.isSignal()) && (!num.equals("2113") || !person.isBp_cc())){
                           if (!eeCo.getCapacityEEP().get(y).equals("0")){
                            person.getCourseP().EE(eeCo.getNumberEEP().get(y));
                            person.setCourseNumber(person.getCourseNumber()+1);
                                String sr = String.valueOf(Integer.parseInt(eeCo.getCapacityEEP().get(y))-1);
                               eeCo.getCapacityEEP().remove(y);
                                eeCo.setCapacityEEP(y,sr);
                            person.setHashMap(person.getHashMap(),person.getCourseNumber(),eeCo.getLesEEP().get(y+1)+"/ Capacity = "+eeCo.getCapacityEEP().get(y));

                            if (y!=0 && y!=1){
                                addLessonP(num , eeCo.getNumberEEP().get(y),y);}

                            if (num.equals("2114")){
                                person.setSignal(true);
                            }
                                if (num.equals("2113")){
                                    person.setBp_cc(true);
                                }
                            break;
                        }   else {
                                System.out.println("we don,t have capacity");
                            }
                        }else {
                                System.out.println("you have another lesson at this time or you already have this class");
                            }}
                        else {
                            System.out.println("if you choose this lesson your Course credit is more than 20 or your general course is more than 5");

                        }
                    }
                }

if (!num.equals("skip") && !num.equals("exit")){

                if (i !=addListEEP+1 ) {
                    System.out.println("if you want another lesson type yes or type no");
                    String num1 = sc.next();
                    while (!num1.equals("yes")){
                    while (num1.equals("show")){
                        show();
                        num1 = sc.next();
                    }
                        if (num.equals("suggestion")) {
                            for (int r = 0; r < person.arrayList1.size(); r++) {
                                System.out.println(person.arrayList1.get(r));
                            }
                        }
                    if (num1.equals("finis"))finish();
                    if (num1.equals("remove")){
                        if (person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio!=0){
                            remove();
                        }
                        else {
                            System.out.println("there is no lesson you can remove it");
                            System.out.println();
                        }
                    }
                    if(num1.equals("back"))BackToFirstPage();
                    if (num1.equals("no"))break;
                        if(!num1.equals("yes")){
                            System.out.println("your word is not legal");
                            num1=sc.next();
                        }

                    }
if (num1.equals("no"))break;

  if (num1.equals("yes")){
                        System.out.println("type another lesson code");
                       }
                }}

            }

            CourseCredit = person.getCourseG().getCourseCredit() + person.getCourseP().getCourseCredit()+dio+pio;
            System.out.println("thanks for your cooperation your Course Credit is = " + CourseCredit);
            System.out.println();
        }

        public void CECollege(){

            String num ="";

            for (int i = 0 ; i < 1+addListCEG ; i++) {

                num = sc.next();


                boolean help = false;

                for (int s= 0 ; s < 1+addListCEG ; s++){
                    if (num.equals(ceCo.getNumberCEG().get(s))){
                        help = true;
                        break;
                    }
                }

                while (!help) {
                    while (num.equals("show")) {
                        show();
                        num = sc.next();
                    }
                    if (num.equals("suggestion")) {
                        for (int r = 0; r < person.arrayList1.size(); r++) {
                            System.out.println(person.arrayList1.get(r));
                        }
                    }
                    for (int s= 0 ; s < 1+addListCEG ; s++){
                        if (num.equals(ceCo.getNumberCEG().get(s))){
                            help = true;
                            break;
                        }
                    }
                    if (num.equals("finish")) finish();
                    if (num.equals("remove")) {
                        if (person.getCourseP().getCourseCredit() + person.getCourseG().getCourseCredit()+dio+pio != 0) {
                            remove();
                        } else {
                            System.out.println("there is no lesson you can remove it");
                            System.out.println();
                        }
                    }
                    if (num.equals("back")) BackToFirstPage();
                    if (num.equals("exit") || num.equals("skip")) break;
                    if (!help) {

                        System.out.println("Change your number or type skip if you don,t want this lesson");
                        num = sc.next();}


                    for (int s= 0 ; s < 1+addListCEG ; s++){
                        if (num.equals(ceCo.getNumberCEG().get(s))){
                            help = true;
                            break;
                        }
                    }
                }
                if (num.equals("skip"))break;
                for (int y = 0 ; y < 1+addListCEG ; y++) {
                    if (num.equals(ceCo.getNumberCEG().get(y))){
                        if ((person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio+Integer.parseInt(ceCo.getCreditCEG().get(i))) < 21  && person.getCourseG().getCourseCredit()+Integer.parseInt(ceCo.getCreditCEG().get(i))+pio < 6){
                            if (!num.equals("1111") || (!person.isChemistry() && !person.isAp_java() && !person.isLab_1()) && (!num.equals("1111") || !person.isGame())){
                           if (!ceCo.getCapacityCEG().get(y).equals("0")){
                            person.getCourseG().CE(ceCo.getNumberCEG().get(i));
                            person.setCourseNumber(person.getCourseNumber()+1);
                                String sr = String.valueOf(Integer.parseInt(ceCo.getCapacityCEG().get(y))-1);
                               ceCo.getCapacityCEG().remove(y);
                                ceCo.setCapacityCEG(y,sr);
                            person.setHashMap(person.getHashMap(),person.getCourseNumber(),ceCo.getLesCEG().get(y+1)+"/ Capacity = "+ceCo.getCapacityCEG().get(y));
                            if (y!=0){
                                addLessonG(num ,ceCo.getNumberCEG().get(y),y);}

                            if (num.equals("1111")){
                                person.setGame(true);
                            }
                            break;
                        }   else {
                                System.out.println("we don,t have capacity");
                            }
                        }
                            else {
                                System.out.println("you have another lesson at this time or you already have this class");
                            }
                        }
                        else {
                            System.out.println("if you choose this lesson your Course credit is more than 20 or your general course is more than 5");
                        }
                    }
                }

                if (i !=addListCEG ) {
                    System.out.println("if you want another lesson type yes or type no");
                    String a = sc.next();
                    if (a.equals("no"))break;
                    if (a.equals("yes")){
                        System.out.println("type another lesson code");}

                }}
                System.out.println();
                System.out.println("Please choose your professional lesson or type to skip");
                for (int j = 1 ; j <3+addListCEP;j++){
                    System.out.println(ceCo.getLesCEP().get(j)+"/ Capacity = "+ceCo.getCapacityCEP().get(j-1));
                }
                mmm();

            }
public void mmm(){

    for (int i = 0 ; i <2+addListCEP;i++){
        String num = sc.next();

        boolean help = false;

        for (int s= 0 ; s < 2+addListCEP ; s++){
            if (num.equals(ceCo.getNumberCEP().get(s))){
                help = true;
                break;
            }
        }
        while (!help) {
            while (num.equals("show")){
                show();
                num = sc.next();
            }

            for (int s= 0 ; s < 2+addListCEP ; s++){
                if (num.equals(ceCo.getNumberCEP().get(s))){
                    help = true;
                    break;
                }
            }
            if (num.equals("suggestion")) {
                for (int r = 0; r < person.arrayList1.size(); r++) {
                    System.out.println(person.arrayList1.get(r));
                }
            }
            if (num.equals("finish"))finish();
            if (num.equals("remove")){
                if (person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio!=0){
                    remove();
                }
                else {
                    System.out.println("there is no lesson you can remove it");
                    System.out.println();
                }
            }
            if(num.equals("back"))BackToFirstPage();
            if (num.equals("exit") || num.equals("skip")) break;
            if (!help){
                System.out.println("Change your number or type skip if you don,t want this lesson");
                num = sc.next();
            }

            for (int s= 0 ; s < 2+addListCEP ; s++){
                if (num.equals(ceCo.getNumberCEP().get(s))){
                    help = true;
                    break;
                }
            }
        }

        if (num.equals("skip"))break;
        for (int y = 0 ; y < 2+addListCEP ; y++) {
            if (num.equals(ceCo.getNumberCEP().get(y))){
                if (((!person.isLab_1() && !person.isChemistry() && !person.isGame()) || !num.equals("2111")) && (!person.isSignal() || !num.equals("2112")) && (!num.equals("2112") || !person.isBp_c()) && (!num.equals("2111") || !person.isAp_java())){
                if ((person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio+Integer.parseInt(ceCo.getCreditCEP().get(i))) < 21 && person.getCourseG().getCourseCredit()+pio < 6){
                 if (!ceCo.getCapacityCEP().get(y).equals("0")){
                    person.getCourseP().CE(ceCo.getNumberCEP().get(y));
                    person.setCourseNumber(person.getCourseNumber()+1);
                    String sr = String.valueOf(Integer.parseInt(ceCo.getCapacityCEP().get(y))-1);
                     ceCo.getCapacityCEP().remove(y);
                    ceCo.setCapacityCEP(y,sr);
                    person.setHashMap(person.getHashMap(),person.getCourseNumber(),ceCo.getLesCEP().get(y+1)+"/ Capacity = "+ceCo.getCapacityCEP().get(y));
                    if (y!=0 && y!=1){
                        addLessonP(num , ceCo.getNumberCEP().get(y),y);}


                    if(num.equals("2112")){
                       person.setBp_c(true);
                    }
                    if(num.equals("2111")){
                        person.setAp_java(true);
                    }
                    break;

                }   else {
                    System.out.println("we don,t have capacity");
                }
                }
                else {
                    System.out.println("if you choose this lesson your Course credit is more than 20 or your general course is more than 5");
                }}
                else {
                    System.out.println("you have another lesson at this time or you already have this class");
                }


            }
        }

        if (!num.equals("skip") && !num.equals("exit")){

            if (i !=addListCEP+1 ) {
                System.out.println("if you want another lesson type yes or type no");
                String num1 = sc.next();
                while (!num1.equals("yes")){
                    while (num1.equals("show")){
                        show();
                        num1 = sc.next();
                    }
                    if (num1.equals("finis"))finish();
                    if (num1.equals("remove")){
                        if (person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio!=0){
                            remove();
                        }
                        else {
                            System.out.println("there is no lesson you can remove it");
                            System.out.println();
                        }
                    }
                    if(num1.equals("back"))BackToFirstPage();
                    if (num1.equals("no"))break;
                    if(!num1.equals("yes")){
                        System.out.println("your word is not legal");
                        num1=sc.next();
                    }

                }
                if (num1.equals("no"))break;
                if (num1.equals("yes")){
                    System.out.println("type another lesson code");
                }
            }}

        }


        CourseCredit = person.getCourseG().getCourseCredit() + person.getCourseP().getCourseCredit()+dio+pio;
        System.out.println("thanks for your cooperation your Course Credit is = " + CourseCredit);
        System.out.println();
    }
    public void MECollege(){

        String num ="";

        for (int i = 0 ; i < 1+addListMEG ; i++) {

            num = sc.next();


            boolean help = false;

            for (int s= 0 ; s < 1+addListMEG ; s++){
                if (num.equals(meCo.getNumberMEG().get(s))){
                    help = true;
                    break;
                }
            }

            while (!help) {
                while (num.equals("show")) {
                    show();
                    num = sc.next();
                }

                for (int s= 0 ; s < 1+addListMEG ; s++){
                    if (num.equals(meCo.getNumberMEG().get(s))){
                        help = true;
                        break;
                    }
                }
                if (num.equals("suggestion")) {
                    for (int r = 0; r < person.arrayList1.size(); r++) {
                        System.out.println(person.arrayList1.get(r));
                    }
                }
                if (num.equals("finish")) finish();
                if (num.equals("remove")) {
                    if (person.getCourseP().getCourseCredit() + person.getCourseG().getCourseCredit()+dio+pio != 0) {
                        remove();
                    } else {
                        System.out.println("there is no lesson you can remove it");
                        System.out.println();
                    }
                }
                if (num.equals("back")) BackToFirstPage();
                if (num.equals("exit") || num.equals("skip")) break;
                if (!help) {

                    System.out.println("Change your number or type skip if you don,t want this lesson");
                    num = sc.next();}

                for (int s= 0 ; s < 1+addListMEG ; s++){
                    if (num.equals(meCo.getNumberMEG().get(s))){
                        help = true;
                        break;
                    }
                }
            }
            if (num.equals("skip"))break;
            for (int y = 0 ; y < 1+addListMEG ; y++) {
                if (num.equals(meCo.getNumberMEG().get(y))){
                    if ((person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio+Integer.parseInt(meCo.getCreditMEG().get(i))) < 21  && person.getCourseG().getCourseCredit()+Integer.parseInt(meCo.getCreditMEG().get(i))+pio < 6){
                        if (!num.equals("1112") || !person.isLab_2()){
                            if (!meCo.getCapacityMEG().get(y).equals("0")){
                        person.getCourseG().ME(meCo.getNumberMEG().get(i));
                        person.setCourseNumber(person.getCourseNumber()+1);
                            String sr = String.valueOf(Integer.parseInt(meCo.getCapacityMEG().get(y))-1);
                                meCo.getCapacityMEG().remove(y);
                            meCo.setCapacityMEG(y,sr);
                        person.setHashMap(person.getHashMap(),person.getCourseNumber(),meCo.getLesMEG().get(y+1)+"/ Capacity = "+meCo.getCapacityMEG().get(y));
                        if (y!=0){
                            addLessonG(num ,meCo.getNumberMEG().get(y),y);}

                        if (num.equals("1112")){
                            person.setLab_2(true);
                        }
                        break;}
                        else {
                                System.out.println("we don,t have capacity");
                        }
                        }
                        else {
                            System.out.println("you already have this class");
                        }
                    }

                    else {
                        System.out.println("if you choose this lesson your Course credit is more than 20 or your general course is more than 5");
                    }
                }
            }

            if (i !=addListMEG ) {
                System.out.println("if you want another lesson type yes or type no");
                String a = sc.next();
                if (a.equals("no"))break;
                if (a.equals("yes")){
                    System.out.println("type another lesson code");}

            }}
            System.out.println();
            System.out.println("Please choose your professional lesson or type to skip");
            for (int j = 1 ; j <3+addListMEP;j++){
                System.out.println(meCo.getLesMEP().get(j)+"/ Capacity = "+meCo.getCapacityMEP().get(j-1));
            }
            rrr();


    }
public void rrr(){

    for (int i = 0 ; i <2+addListMEP;i++){
        String num = sc.next();

        boolean help = false;

        for (int s= 0 ; s < 2+addListMEP ; s++){
            if (num.equals(meCo.getNumberMEP().get(s))){
                help = true;
                break;
            }
        }
        while (!help) {
            while (num.equals("show")){
                show();
                num = sc.next();
            }

            for (int s= 0 ; s < 2+addListMEP ; s++){
                if (num.equals(meCo.getNumberMEP().get(s))){
                    help = true;
                    break;
                }
            }
            if (num.equals("suggestion")) {
                for (int r = 0; r < person.arrayList1.size(); r++) {
                    System.out.println(person.arrayList1.get(r));
                }
            }
            if (num.equals("finish"))finish();
            if (num.equals("remove")){
                if (person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio!=0){
                    remove();
                }
                else {
                    System.out.println("there is no lesson you can remove it");
                    System.out.println();
                }
            }
            if(num.equals("back"))BackToFirstPage();
            if (num.equals("exit") || num.equals("skip")) break;
            if (!help){
                System.out.println("Change your number or type skip if you don,t want this lesson");
                num = sc.next();
            }
            if (num.equals("suggestion")) {
                for (int r = 0; r < person.arrayList1.size(); r++) {
                    System.out.println(person.arrayList1.get(r));
                }
            }
            for (int s= 0 ; s < 2+addListMEP ; s++){
                if (num.equals(meCo.getNumberMEP().get(s))){
                    help = true;
                    break;
                }
            }
        }
        if (num.equals("skip"))break;

        for (int y = 0 ; y < 2+addListMEP ; y++) {
            if (num.equals(meCo.getNumberMEP().get(y))){
                if ((person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio+Integer.parseInt(meCo.getCreditMEP().get(i))) < 21 &&   person.getCourseG().getCourseCredit()+pio < 6){
                    if (((!person.isGame() && !person.isAp_java()) || (!num.equals("3113") && !num.equals("3114") )) && (!person.isChemistry() || !num.equals("3113")) && (!person.isLab_1() || !num.equals("3114"))&& (!num.equals("3113") || !person.isLab_1()) && (!num.equals("3114") || !person.isChemistry ())){
             if (!meCo.getCapacityMEP().get(y).equals("0")){
                    person.getCourseP().ME(meCo.getNumberMEP().get(y));
                    person.setCourseNumber(person.getCourseNumber()+1);
                        String sr = String.valueOf(Integer.parseInt(meCo.getCapacityMEP().get(y))-1);
                 meCo.getCapacityMEP().remove(y);
                        meCo.setCapacityMEP(y,sr);
                    person.setHashMap(person.getHashMap(),person.getCourseNumber(),meCo.getLesMEP().get(y+1)+"/ Capacity = "+meCo.getCapacityMEP().get(y));
                    if (y!=0 && y!=1){
                        addLessonP(num ,meCo.getNumberMEP().get(y),y);}

                        if (num.equals("3113")) {
                            person.setLab_1(true);
                        }
                        if (num.equals("3114")) {
                            person.setChemistry(true);
                        }
                    break; }
                    else{
                            System.out.println("we don,t have capacity");
                        }}
                    else {
                        System.out.println("if you choose this lesson your Course credit is more than 20 or your general lesson is more than 5");
                        System.out.println("you have another lesson at this time or you already have this class");
                    }
                }
                else {
                    System.out.println("if you choose this lesson your Course credit is more than 20 or your general lesson is more than 5");

                }
            }
        }

        if (!num.equals("skip") && !num.equals("exit")){

            if (i !=addListMEP+1 ) {
                System.out.println("if you want another lesson type yes or type no");
                String num1 = sc.next();
                while (!num1.equals("yes")){
                    while (num1.equals("show")){
                        show();
                        num1 = sc.next();
                    }
                    if (num1.equals("finis"))finish();
                    if (num1.equals("remove")){
                        if (person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio!=0){
                            remove();
                        }
                        else {
                            System.out.println("there is no lesson you can remove it");
                            System.out.println();
                        }
                    }
                    if(num1.equals("back"))BackToFirstPage();
                    if (num1.equals("no"))break;
                    if(!num1.equals("yes")){
                        System.out.println("your word is not legal");
                        num1=sc.next();
                    }

                }
                if (num1.equals("no"))break;
                if (num1.equals("yes")){
                    System.out.println("type another lesson code");
                }
            }}

    }

    CourseCredit = person.getCourseG().getCourseCredit() + person.getCourseP().getCourseCredit()+dio+pio;
    System.out.println("thanks for your cooperation your Course Credit is = " + CourseCredit);
    System.out.println();
}
    public void MATHCollege(){

        String num ="";

        for (int i = 0 ; i < 1+addListMAG ; i++) {

            num = sc.next();



            boolean help = false;

            for (int s = 0; s < 1 +addListMAG; s++) {
                if (num.equals(mathCo.getNumberMAG().get(s))) {
                    help = true;
                    break;
                }
            }

            while (!help) {
                while (num.equals("show")) {
                    show();
                    num = sc.next();
                }

                for (int s = 0; s < 1 + addListMAG; s++) {
                    if (num.equals(mathCo.getNumberMAG().get(s))) {
                        help = true;
                        break;
                    }
                }
                if (num.equals("suggestion")) {
                    for (int r = 0; r < person.arrayList1.size(); r++) {
                        System.out.println(person.arrayList1.get(r));
                    }
                }
                if (num.equals("finish")) finish();
                if (num.equals("remove")) {
                    if (person.getCourseP().getCourseCredit() + person.getCourseG().getCourseCredit() + dio+pio != 0) {

                        remove();
                    } else {
                        System.out.println("there is no lesson you can remove it");
                        System.out.println();
                    }
                }
                if (num.equals("back")) BackToFirstPage();
                if (num.equals("exit") || num.equals("skip")) break;
                if (!help) {

                    System.out.println("Change your number or type skip if you don,t want this lesson");
                    num = sc.next();
                }

                for (int s = 0; s < 1 + addListMAG; s++) {
                    if (num.equals(mathCo.getNumberMAG().get(s))) {
                        help = true;
                        break;
                    }
                }
            }
            if (num.equals("skip")) break;
            for (int y = 0; y < 1 +addListMAG; y++) {
                if (num.equals(mathCo.getNumberMAG().get(y))) {
                    if ((person.getCourseP().getCourseCredit() + person.getCourseG().getCourseCredit()+dio+pio + Integer.parseInt(mathCo.getCreditMAG().get(i))) < 21 && person.getCourseG().getCourseCredit()+Integer.parseInt(mathCo.getCreditMAG().get(i))+pio < 6) {
                        if (!person.isTopology() || !num.equals("1114")){
                            if (!mathCo.getCapacityMAG().get(y).equals("0")){
                        person.getCourseG().MATH(mathCo.getNumberMAG().get(i));
                        person.setCourseNumber(person.getCourseNumber() + 1);
                            String sr = String.valueOf(Integer.parseInt(mathCo.getCapacityMAG().get(y))-1);
                                mathCo.getCapacityMAG().remove(y);
                            mathCo.setCapacityMAG(y,sr);
                        person.setHashMap(person.getHashMap(), person.getCourseNumber(), mathCo.getLesMAG().get(y + 1)+"/ Capacity = "+mathCo.getCapacityMAG().get(y));
                        if (y!=0){
                            addLessonG(num ,mathCo.getNumberMAG().get(y),y);}

                        if (num.equals("1114")){
                            person.setTopology(true);
                        }
                        break;}
                    else{
                                System.out.println("we don,t have capacity");
                        }}
                        else {
                            System.out.println("you already have this class");
                        }
                    } else {
                        System.out.println("if you choose this lesson your Course credit is more than 20 or your general course is more than 5");
                    }
                }
            }

            if (i != addListMAG) {
                System.out.println("if you want another lesson type yes or type no");
                String a = sc.next();
                if (a.equals("no"))break;
                if (a.equals("yes")) {
                    System.out.println("type code number");
                }

            }}

            System.out.println();
            System.out.println("Please choose your professional lesson or type to skip");
            for (int j = 1; j < 3 + addListMAP; j++) {
                System.out.println(mathCo.getLesMAP().get(j)+"/ Capacity = "+mathCo.getCapacityMAP().get(j-1));
            }


            fff();


    }
    public void fff(){

        for (int i = 0 ; i <2+addListMAP;i++){
            String num = sc.next();

            boolean help = false;

            for (int s= 0 ; s < 2+addListMAP ; s++){
                if (num.equals(mathCo.getNumberMAP().get(s))){
                    help = true;
                    break;
                }
            }
            while (!help) {
                while (num.equals("show")){
                    show();
                    num = sc.next();
                }
                if (num.equals("suggestion")) {
                    for (int r = 0; r < person.arrayList1.size(); r++) {
                        System.out.println(person.arrayList1.get(r));
                    }
                }
                for (int s= 0 ; s < 2+addListMAP ; s++){
                    if (num.equals(mathCo.getNumberMAP().get(s))){
                        help = true;
                        break;
                    }
                }
                if (num.equals("finish"))finish();
                if (num.equals("remove")){
                    if (person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio!=0){
                        remove();
                    }
                    else {
                        System.out.println("there is no lesson you can remove it");
                        System.out.println();
                    }
                }
                if(num.equals("back"))BackToFirstPage();
                if (num.equals("exit") || num.equals("skip")) break;
                if (!help){
                    System.out.println("Change your number or type skip if you don,t want this lesson");
                    num = sc.next();
                }

                for (int s= 0 ; s < 2+addListMAP ; s++){
                    if (num.equals(mathCo.getNumberMAP().get(s))){
                        help = true;
                        break;
                    }
                }
            }
            if (num.equals("skip"))break;

            for (int y = 0 ; y < 2+addListMAP ; y++) {
                if (num.equals(mathCo.getNumberMAP().get(y))){
                    if ((person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio+Integer.parseInt(mathCo.getCreditMAP().get(i))) < 21 && person.getCourseG().getCourseCredit()+pio < 6){
                        if ((!person.isCalculus2() || !num.equals("3111")) && (!person.isCalculus1() || !num.equals("3112")) && (!num.equals("3111") || !person.isCalculus1()) && (!num.equals("3112") || !person.isCalculus2 ())) {
                            if (!mathCo.getCapacityMAP().get(y).equals("0")){
                            person.getCourseP().MATH(mathCo.getNumberMAP().get(y));
                            person.setCourseNumber(person.getCourseNumber() + 1);
                            String sr = String.valueOf(Integer.parseInt(mathCo.getCapacityMAP().get(y))-1);
                                mathCo.getCapacityMAP().remove(y);
                            mathCo.setCapacityMAP(y,sr);
                            person.setHashMap(person.getHashMap(), person.getCourseNumber(),mathCo.getLesMAP().get(y + 1)+"/ Capacity = "+mathCo.getCapacityMAP().get(y));
                            if (y != 0 && y != 1) {
                                addLessonP(num,mathCo.getNumberMAP().get(y), y);
                            }

                            if (num.equals("3111")) {
                                person.setCalculus1(true);
                            }
                            if (num.equals("3112")) {
                                person.setCalculus2(true);
                            }
                            break;}
                            else {
                                System.out.println("we don,t have capacity");
                            }
                        }
                        else {
                            System.out.println("you have another lesson at this time or you already have this lesson");
                        }

                    }
                    else {
                        System.out.println("if you choose this lesson your Course credit is more than 20 or your general course is more than 5");
                    }
                }
            }

            if (!num.equals("skip") && !num.equals("exit")){

                if (i !=addListMAP+1 ) {
                    System.out.println("if you want another lesson type yes or type no");
                    String num1 = sc.next();
                    while (!num1.equals("yes")){
                        while (num1.equals("show")){
                            show();
                            num1 = sc.next();
                        }
                        if (num1.equals("finis"))finish();
                        if (num1.equals("remove")){
                            if (person.getCourseP().getCourseCredit()+person.getCourseG().getCourseCredit()+dio+pio!=0){
                                remove();
                            }
                            else {
                                System.out.println("there is no lesson you can remove it");
                                System.out.println();
                            }
                        }
                        if(num1.equals("back"))BackToFirstPage();
                        if (num1.equals("no"))break;
                        if(!num1.equals("yes")){
                            System.out.println("your word is not legal");
                            num1=sc.next();
                        }

                    }
                    if (num1.equals("no"))break;
                    if (num1.equals("yes")){
                        System.out.println("type another lesson code");
                    }
                }}

        }

        CourseCredit = person.getCourseG().getCourseCredit() + person.getCourseP().getCourseCredit()+dio+pio;
        System.out.println("thanks for your cooperation your Course Credit is = " + CourseCredit);
        System.out.println();
    }

    public String description(){
        System.out.println("please choose your Collage number");
        System.out.println("1- EE");
        System.out.println("2- CE");
        System.out.println("3- ME");
        System.out.println("4- MATH");
        String number = sc.next();
        while (!number.equals("1") && !number.equals("2") &&!number.equals("3") &&!number.equals("4") ){

            while (number.equals("show")){
                show();
                number = sc.next();
            }
            if (number.equals("suggestion")) {
                for (int r = 0; r < person.arrayList1.size(); r++) {
                    System.out.println(person.arrayList1.get(r));
                }
            }
            if (number.equals("finish"))finish();

            if (number.equals("remove")){
                remove();

                number=sc.next();
            }

            if(number.equals("back"))BackToFirstPage();
            if (number.equals("exit") || number.equals("skip"))break;
            if (!number.equals("1") && !number.equals("2") &&!number.equals("3") &&!number.equals("4")){
                System.out.println("Your number is not linked try again");
                number = sc.next();}

        }


    return number;
    }

    public void remove(){

        System.out.println("please enter your collage");
        System.out.println("1- EE");
        System.out.println("2- CE");
        System.out.println("3- ME");
        System.out.println("4- MATH");
        String number = sc.next();
        while (!number.equals("1") && !number.equals("2") &&!number.equals("3") &&!number.equals("4") ){

            while (number.equals("show")){
                show();
                number = sc.next();
            }
            if (number.equals("suggestion")) {
                for (int r = 0; r < person.arrayList1.size(); r++) {
                    System.out.println(person.arrayList1.get(r));
                }
            }
            if (number.equals("finish"))finish();

            if (number.equals("remove")){
                remove();

                number=sc.next();
            }

            if(number.equals("back"))BackToFirstPage();
            if (number.equals("exit") || number.equals("skip"))break;
            if (!number.equals("1") && !number.equals("2") &&!number.equals("3") &&!number.equals("4")){
                System.out.println("Your number is not linked try again");
                number = sc.next();}

        }
int rox = 0;
        System.out.println("enter your number");
        String num = sc.next();

        if (number.equals("1")){

            for (int i = 0 ; i < eeCo.getNumberEEP().size() ; i++ ){
                if (num.equals(eeCo.getNumberEEP().get(i))){
                    for (int j = 1 ; j <= person.getHashMap().size() ; j++){
                        if (person.getHashMap().get(j)==null){
                            continue;
                        }
                   Pattern pattern = Pattern.compile( num);
                   Matcher matcher = pattern.matcher(person.getHashMap().get(j));
                   if (matcher.find()){
                       person.getCourseP().setCourseCredit(person.getCourseP().getCourseCredit()-Integer.parseInt(eeCo.getCreditEEP().get(i)));

                       if(num.equals("2113")){
            person.setBp_cc(false);
                       }
                       if(num.equals("2114")){
         person.setSignal(false);}
                       rox = j ;


                       person.getHashMap().put(rox,null);
                       person.setRemover(person.getRemover()+1);
                       String sr = String.valueOf(Integer.parseInt(eeCo.getCapacityEEP().get(i))+1);
                       eeCo.getCapacityEEP().remove(i);
                      eeCo.getCapacityEEP().add(i,sr);

                       break;
                   }

                    }
                }
            }

            for (int i = 0 ; i < eeCo.getNumberEEG().size() ; i++ ){
                if (num.equals(eeCo.getNumberEEG().get(i))){
                    for (int j = 1 ; j <= person.getHashMap().size() ; j++){

                        if (person.getHashMap().get(j)==null){

                           continue;
                        }

                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(person.getHashMap().get(j));
                        if (matcher.find()){
                            person.getCourseG().setCourseCredit(person.getCourseG().getCourseCredit()-Integer.parseInt(eeCo.getCreditEEG().get(i)));
                       if (num.equals("1113")){
                           person.setOop(false);
                       }
                            rox = j ;
                            person.getHashMap().put(rox,null);
                            person.setRemover(person.getRemover()+1);
                            String sr = String.valueOf(Integer.parseInt(eeCo.getCapacityEEG().get(i))+1);
                            eeCo.getCapacityEEG().remove(i);
                            eeCo.getCapacityEEG().add(i,sr);
                            break;
                        }

                    }
                }
            }
        }


        if (number.equals("2")){

            for (int i = 0 ; i < ceCo.getNumberCEP().size() ; i++ ){
                if (num.equals(ceCo.getNumberCEP().get(i))){
                    for (int j = 1 ; j <= person.getHashMap().size() ; j++){
                        if (person.getHashMap().get(j)==null){

                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(person.getHashMap().get(j));
                        if (matcher.find()){
                            person.getCourseP().setCourseCredit(person.getCourseP().getCourseCredit()-Integer.parseInt(ceCo.getCreditCEP().get(i)));

                            if(num.equals("2111")){
                                person.setAp_java(false);
                            }
                            if(num.equals("2112")){
                                person.setBp_c(false);}
                            rox = j ;
                            person.getHashMap().put(rox,null);
                            person.setRemover(person.getRemover()+1);
                            String sr = String.valueOf(Integer.parseInt(ceCo.getCapacityCEP().get(i))+1);
                            ceCo.getCapacityCEP().remove(i);
                            ceCo.getCapacityCEP().add(i,sr);
                            break;
                        }

                    }
                }
            }

            for (int i = 0 ; i < ceCo.getNumberCEG().size() ; i++ ){
                if (num.equals(ceCo.getNumberCEG().get(i))){
                    for (int j = 1 ; j <= person.getHashMap().size() ; j++){
                        if (person.getHashMap().get(j)==null){
                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(person.getHashMap().get(j));
                        if (matcher.find()){
                            person.getCourseG().setCourseCredit(person.getCourseG().getCourseCredit()-Integer.parseInt(ceCo.getCreditCEG().get(i)));
                            if (num.equals("1111")){
                                person.setGame(false);
                            }
                            rox = j ;
                            person.getHashMap().put(rox,null);
                            person.setRemover(person.getRemover()+1);
                            String sr = String.valueOf(Integer.parseInt(ceCo.getCapacityCEG().get(i))+1);
                            ceCo.getCapacityCEG().remove(i);
                            ceCo.getCapacityCEG().add(i,sr);
                            break;
                        }

                    }
                }
            }
        }


        if (number.equals("3")){
            for (int i = 0 ; i < meCo.getNumberMEP().size() ; i++ ){
                if (num.equals(meCo.getNumberMEP().get(i))){
                    for (int j = 1 ; j <= person.getHashMap().size() ; j++){
                        if (person.getHashMap().get(j)==null){

                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(person.getHashMap().get(j));
                        if (matcher.find()){
                            person.getCourseP().setCourseCredit(person.getCourseP().getCourseCredit()-Integer.parseInt(meCo.getCreditMEP().get(i)));

                            if(num.equals("3113")){
                                person.setLab_1(false);
                            }
                            if(num.equals("3114")){
                                person.setChemistry(false);}
                            rox = j ;
                            person.getHashMap().put(rox,null);
                            person.setRemover(person.getRemover()+1);
                            String sr = String.valueOf(Integer.parseInt(meCo.getCapacityMEP().get(i))+1);
                            meCo.getCapacityMEP().remove(i);
                            meCo.getCapacityMEP().add(i,sr);
                            break;
                        }

                    }
                }
            }

            for (int i = 0 ; i < meCo.getNumberMEG().size() ; i++ ){
                if (num.equals(meCo.getNumberMEG().get(i))){
                    for (int j = 1 ; j <= person.getHashMap().size() ; j++){
                        if (person.getHashMap().get(j)==null){
                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(person.getHashMap().get(j));
                        if (matcher.find()){
                            person.getCourseG().setCourseCredit(person.getCourseG().getCourseCredit()-Integer.parseInt(meCo.getCreditMEG().get(i)));
                            if (num.equals("1112")){
                                person.setLab_2(false);
                            }
                            rox = j ;
                            person.getHashMap().put(rox,null);
                            person.setRemover(person.getRemover()+1);
                            String sr = String.valueOf(Integer.parseInt(meCo.getCapacityMEG().get(i))+1);
                            meCo.getCapacityMEG().remove(i);
                            meCo.getCapacityMEG().add(i,sr);
                            break;
                        }

                    }
                }
            }
        }


        if (number.equals("4")){
            for (int i = 0 ; i < mathCo.getNumberMAP().size() ; i++ ){
                if (num.equals(mathCo.getNumberMAP().get(i))){
                    for (int j = 1 ; j <= person.getHashMap().size() ; j++){
                        if (person.getHashMap().get(j)==null){
                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(person.getHashMap().get(j));
                        if (matcher.find()){
                            person.getCourseP().setCourseCredit(person.getCourseP().getCourseCredit()-Integer.parseInt(mathCo.getCreditMAP().get(i)));

                            if(num.equals("3111")){
                                person.setCalculus1(false);
                            }
                            if(num.equals("3112")){
                                person.setCalculus2(false);}
                            rox = j ;
                            person.getHashMap().put(rox,null);
                            person.setRemover(person.getRemover()+1);
                            String sr = String.valueOf(Integer.parseInt(mathCo.getCapacityMAP().get(i))+1);
                            mathCo.getCapacityMAP().remove(i);
                            mathCo.getCapacityMAP().add(i,sr);
                            break;
                        }

                    }
                }
            }

            for (int i = 0 ; i < mathCo.getNumberMAG().size() ; i++ ){
                if (num.equals(mathCo.getNumberMAG().get(i))){
                    for (int j = 1 ; j <= person.getHashMap().size() ; j++){
                        if (person.getHashMap().get(j)==null){
                            continue;
                        }
                        Pattern pattern = Pattern.compile(num);
                        Matcher matcher = pattern.matcher(person.getHashMap().get(j));
                        if (matcher.find()){
                            person.getCourseG().setCourseCredit(person.getCourseG().getCourseCredit()-Integer.parseInt(mathCo.getCreditMAG().get(i)));
                            if (num.equals("1114")){
                                person.setTopology(false);
                            }
                            rox = j ;
                            person.getHashMap().put(rox,null);
                            person.setRemover(person.getRemover()+1);
                            String sr = String.valueOf(Integer.parseInt(mathCo.getCapacityMAG().get(i))+1);
                            mathCo.getCapacityMAG().remove(i);
                            mathCo.getCapacityMAG().add(i,sr);
                            break;
                        }

                    }
                }
            }
        }




    }


    public void SignUp(){

        System.out.println("please enter your student number it should has 9 charecter");
        String stu = sc.next();

        for (int i = 1 ; i <= NumberOfPeople;i++){
            if(people.get(i).equals(stu)){
                System.out.println("you have another account ok ?");
                stu=sc.next();
                BackToFirstPage();
            }
        }
        while (stu.length() != 9){
            if (stu.equals("back"))BackToFirstPage();
            System.out.println("it is not legal");
         stu = sc.next();}

        for (int i = 1 ; i <= NumberOfPeople;i++){
            if(people.get(i).equals(stu)){
                System.out.println("you have another account ok ?");
                stu=sc.next();
                BackToFirstPage();
            }
        }


        people.put(NumberOfPeople+1 , stu);
        NumberOfPeople++;
    }
    public void finish(){

    arrayList.add(person);

        System.out.println("end thx for your being if you want to back to the first page please type back");
        String back = sc.next();
        while (!back.equals("back")){
            System.out.println("please type sth correctly");
            back = sc.next();
     }
        BackToFirstPage();
    }

}
