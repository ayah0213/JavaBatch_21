package tasks.CustomClasses;

public class JobOfferObjects {
    public static void main(String[] args) {

        JobOffersClassMethods jobOffer= new JobOffersClassMethods();

        jobOffer.setInfoEmployee("Washington DC",100,
                "SOFTWARE DEVELOPMENT IN TESTING",true,"Full Time","2 years of AC");

        jobOffer.getInfEmployee();
    }
}
