import java.util.ArrayList;

public class Professional_C extends Course{



    @Override
public void EE(String NameCourse){
    if (NameCourse.equals("2114")){
        setCourseCredit(getCourseCredit()+3);
      }
    if (NameCourse.equals("2113")){
        setCourseCredit(getCourseCredit()+3);
}

}
@Override
    public void MATH(String course){
        if (course.equals("3111")){
            setCourseCredit(getCourseCredit()+4);
            }
        if (course.equals("3112")){
            setCourseCredit(getCourseCredit()+4);
            }

    }
@Override
    public void ME(String course){
        if (course.equals("3113")){
            setCourseCredit(getCourseCredit()+1);
  }
        if (course.equals("3114")){
            setCourseCredit(getCourseCredit()+3);
      }

    }
@Override
    public void CE(String course){
        if (course.equals("2111")){
            setCourseCredit(getCourseCredit()+3);
        }
        if (course.equals("2112")){
            setCourseCredit(getCourseCredit()+3);
            }

    }

    @Override
    public void EEd(String NameCourse){
        if (NameCourse.equals("2114")){
            setCourseCredit(getCourseCredit()-3);
        }
        if (NameCourse.equals("2113")){
            setCourseCredit(getCourseCredit()-3);
        }

    }
    @Override
    public void MATHd(String course){
        if (course.equals("3111")){
            setCourseCredit(getCourseCredit()-4);
        }
        if (course.equals("3112")){
            setCourseCredit(getCourseCredit()-4);
        }

    }
    @Override
    public void MEd(String course){
        if (course.equals("3113")){
            setCourseCredit(getCourseCredit()-1);
        }
        if (course.equals("3114")){
            setCourseCredit(getCourseCredit()-3);
        }

    }
    @Override
    public void CEd(String course){
        if (course.equals("2111")){
            setCourseCredit(getCourseCredit()-3);
        }
        if (course.equals("2112")){
            setCourseCredit(getCourseCredit()-3);
        }

    }



    @Override
    public void removeLessonP(String course,int number){
        if (course.length()==4){
            setCourseCredit(getCourseCredit()-number);
        }
    }
    public String ApCodeNumber(){
        return "2111";
    }
    public String Bp_cCodeNumber(){
        return "2112";
    }
    public String Bp_ccCodeNumber(){
        return "2113";
    }
    public String SignalCodeNumber(){
        return "2114";
    }
    public String Calculus_1CodeNumber(){
        return "3111";
    }
    public String Calculus_2CodeNumber(){
        return "3112";
    }
    public String Lab_1CodeNumber(){
        return "3113";
    }
    public String ChemistryCodeNumber(){
        return "3114";
    }


}
