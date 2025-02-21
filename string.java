public class string {

    static boolean Search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Ravindra";
        char target = 'R';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Search(name, target));
    }
}
