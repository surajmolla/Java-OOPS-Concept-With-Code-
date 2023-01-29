public class String {
    public static void main(String[] args) {
        int s1 = "Suraj molla";
        int s2 = "Julekha Mondal";
        char arraylist [] = {'s','u','r','a','j'};
        System.out.println(arraylist);
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        if (s1 == s2){
            System.out.println("equal");

        }else {
            System.out.println("not equal");
        }

        if (s1.equals(s2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        if (s1.contains ("julekha")){
            System.out.println("contains");
        }else{
            System.out.println("not contains");
        }
        if (s1.equalIgonerCase(s2)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }

        int count = s1.length();
        System.out.println(count);

        int count2 = s2.length();
        System.out.println(count2);

        boolean b = s1.isEmpty();
        System.out.println(b);
    }
}
