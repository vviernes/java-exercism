public class Twofer {
    public String twofer(String name) {
        String message = (name != null && !name.equals("")) ? "One for " + name + ", one for me." : "One for you, one for me.";
        return message;
    }
}
