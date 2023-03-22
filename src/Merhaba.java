public class Merhaba {
    String genel = "Herkese";

    public String selamSoyle (String birine) {
        String soyle;
        if (birine != "") {
            soyle = "Merhaba " + birine;
        }else{
            soyle = "Merhaba " + genel;
        }
        return soyle;
    }




}









