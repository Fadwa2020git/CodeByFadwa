public class CracklePop {

    public String cracklePopMethod(int n) {
        if (n%5==0 && n%3==0) {
            return "CracklePop";
        } else if (n%3==0){
            return "Crackle";
        } else if (n%5==0) {
            return "Pop";
        }
        return new String();
    }

}
