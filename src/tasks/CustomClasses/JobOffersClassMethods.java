package tasks.CustomClasses;

public class JobOffersClassMethods {
    /*
      Attributes
            Location, salary, jobTitle, hasBenifit(boolean), WFH(boolean), hasPTO(boolean), isFullTime
        Actions:
                setInfo
                getInfo
     */
    public String location;
    public int salary;
    public String jobTitle;
    public boolean hasBenefits;
    public String FullTimeJob;
    public String degree;



    public void setInfoEmployee(String offerLocation, int offerSalary, String offerTitle, boolean offerBenefits,
                                String offerFTime, String neededdegree ){
        location=offerLocation;
        salary=offerSalary;
        jobTitle=offerTitle;
        hasBenefits=offerBenefits;
        FullTimeJob=offerFTime;
        degree=neededdegree;
    }


    public  void getInfEmployee(){
        System.out.println("--------------------");
        System.out.println("Offers is coming from: "+location+", but also available for Remotely.");
        System.out.println("Offer's title is "+jobTitle);
        System.out.println("Offers is contract for 6months and it's salary $"+salary+"k with package of benefits:: "
                +hasBenefits+" and plus there is chanaces of being reassigned as a "+FullTimeJob+" employee");
        System.out.println("Based on experinces , degree shows that you can aply with your "+degree);
    }
}
