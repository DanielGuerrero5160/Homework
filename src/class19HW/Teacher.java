package class19HW;

public class Teacher {
    public String name;
  public  String subject;
   public int yearsExperience;

   public void printInfo(){
        System.out.println("Name is:"+name+" Subject is:"+ subject+" Years of Experience:"+yearsExperience);
    }
    protected void discipline(){
        System.out.println("Sending you to detention");
    }
    void printSubject(){
        System.out.println("I am a "+subject+" teacher!");
    }
  private  void practice(){
        System.out.println("Here is some more homework to practice "+subject);
    }
}
