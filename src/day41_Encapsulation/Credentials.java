package day41_Encapsulation;

public class Credentials {

    private String userNAme="cybertek";
    private double password=45468741;

    public  String getUserNAme(){ // read only
        return  userNAme;
    }

    public double getPassword(){ // read only
        return password;
    }

    public void setUserNAme(String userNAme){ // return type is Void we have to provode arguments Param
        if (userNAme.length()< 8){
            return;
        }
        this.userNAme = userNAme;
    }

    public void setPassword(double password){
        this.password=password;
    }





}
