public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String message = "";
        switch (shirtNum) {
            case 1:
                message = "goalie";
                break;
            case 2:
                message = "left back";
                break;
            case 3:
            case 4:
                message = "center back";
                break;
            case 5:
                message = "right back";
                break;
            case 6:
            case 7:
            case 8:
                message = "midfielder";
                break;
            case 9:
                message = "left wing";
                break;
            case 10:
                message = "striker";
                break;
            case 11:
                message = "right wing";
                break;
            default:
                throw new IllegalArgumentException("Throw IllegalArgumentException");
        }
        return message;
    }
}
