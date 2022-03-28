package Group.CodingTasks;

public class Task4 {
}
class Registration{
    private String email;
    private String userName;
    private String password;

    void setEmail(String email){
        if(email.endsWith("yahoo.com")){
            this.email=email;
        }else{
            System.out.println("Invalid email type please create yahoo email");
        }
    }
    void setUserName(String userName){
        if(!userName.isEmpty()&&userName.length()>6){
            this.userName=userName;
        }else{
            System.out.println("Invalid username: please refer to requirements when making username");
        }
    }
    void setPassword(String password){
        if(!password.isEmpty()&&password.length()>6&&!password.contains(userName)){
            this.password=password;
        }else{
            System.out.println("Invalid password: please refer to requirements when making password");
        }

    }
    String getEmail(){
        return email;
    }
    String getUserName(){
        return userName;
    }
    String getPassword(){
        return password;
    }

    public static void main(String[] args) {
        Registration applicant1=new Registration();
        applicant1.setEmail("Tarik@yahoo.com");
        System.out.println(applicant1.getEmail());
        applicant1.setUserName("tabraham23");
        System.out.println(applicant1.getUserName());
        applicant1.setPassword("lalakers6073");
        System.out.println(applicant1.getPassword());
    }

}
