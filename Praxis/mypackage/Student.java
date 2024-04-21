public class Student{

    private String fname;
    private String lname;
    private String middleName = "";
    private int iDNum;
    private float gPA;

    public String getFname(){
        return fname;
    }

    public void setFname(String fName){
        this.fname = fname;
    }

    public String getLname(){
        return lname;
    }

    public void setLName(String lname){
        this.lname = lname;
    }

    public String getMiddleName(){
        return middleName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public void setFullName(String fname, String lname, String middleName){
        this.fname = fname;
        this.lname = lname;
        this.middleName = middleName;
    }

    public int getIDNum(){
        return iDNum;
    }

    public void setIDNum(int iDNum){
        this.iDNum = iDNum;
    }

    public float getGPA(){
        return gPA;
    }

    public void setGPA(float gPA){
        this.gPA = gPA;
    }
}