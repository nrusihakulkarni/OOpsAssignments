package StudentPersentages;
class StudentDatacollection {

    private String studentName;
    private String collegeName;
    private int mobileNo;
    private int marathi;
    private int hindi;
    private int english;
    private int history;
    private int math;


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setMarathi(int marathi) {
        this.marathi = marathi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public  void printPersentage() {

        System.out.println("Persentages = " + (((marathi + hindi + english + history) * 100) / 500) + "%");

    }

    @Override
    public String toString() {
        return "StudentDatacollection{" + "studentName='" + studentName + '\'' + ", collegeName='" + collegeName + '\'' + ", mobileNo=" + mobileNo + ", marathi=" + marathi + ", hindi=" + hindi + ", english=" + english + ", history=" + history + ", math=" + math + '}';
    }
}


public class StudentPersenteage {
    public static void main(String[] args) {


        StudentDatacollection studentDatacollection = new StudentDatacollection();
        studentDatacollection.setStudentName("akash");
        studentDatacollection.setCollegeName("VDF Latur");
        studentDatacollection.setMobileNo(988898348);
        studentDatacollection.setMarathi(36);
        studentDatacollection.setHindi(78);
        studentDatacollection.setEnglish(78);
        studentDatacollection.setHistory(89);
        studentDatacollection.setMath(56);
        System.out.println(studentDatacollection);
        studentDatacollection.printPersentage();
    }
}
