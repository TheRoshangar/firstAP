import java.util.ArrayList;

public class General_C extends  Course{


    @Override
    public void removeLessonG(String course,int number){
        if (course.length()==4){
            setCourseCredit(getCourseCredit()-number);
        }
    }
@Override
    public void EE(String NameCourse){
     if (NameCourse.equals("1113")){
         setCourseCredit(getCourseCredit()+3);

}

 }
@Override
    public void MATH(String course){
        if (course.equals("1114")){
setCourseCredit(getCourseCredit()+3);
}

    }
@Override
    public void ME(String course){
        if (course.equals("1112")){
            setCourseCredit(getCourseCredit()+1);
            }

    }
@Override
    public void CE(String course){
        if (course.equals("1111")){
            setCourseCredit(getCourseCredit()+3);
            }

    }

    @Override
    public void EEd(String NameCourse){
        if (NameCourse.equals("1113")){
            setCourseCredit(getCourseCredit()-3);

        }

    }
    @Override
    public void MATHd(String course){
        if (course.equals("1114")){
            setCourseCredit(getCourseCredit()-3);
        }

    }
    @Override
    public void MEd(String course){
        if (course.equals("1112")){
            setCourseCredit(getCourseCredit()-1);
        }

    }
    @Override
    public void CEd(String course){
        if (course.equals("1111")){
            setCourseCredit(getCourseCredit()-3);
        }

    }

    public String GameCodeNumber(){
    return "1111";
    }
    public String Lab_2_CodeNumber(){
    return "1112";
    }
    public String OopCodeNumber(){
    return "1113";
    }
    public String TopologyCodeNumber(){
    return "1114";
    }


}
