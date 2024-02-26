package pro.sky.denisdemo;

public class Main {
    public static void main(String[] args) {

        String str = new String("1111 2222 <> 4444");
        if (str.contains("<") && str.contains(">") && str.indexOf(">") != str.indexOf('<') + 1)
        {
            int index1 = str.indexOf('<') + 1;
            int index2 = str.indexOf(">");
            String substring = str.substring(index1, index2);
            StringBuilder stringBuilder = new StringBuilder(substring.toLowerCase());
            for (int i = 0; i < stringBuilder.length(); i++) {
                stringBuilder.setCharAt(i, '*');
            }
            str = str.substring(0, index1) + stringBuilder + str.substring(index2, str.length());
            System.out.println(str);
        }
        else System.out.println(str + ": old string doesn't need to be changed");

    }
}