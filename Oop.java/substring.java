public class substring {
   
    // public static void main(String[] args) {
    //     String fruits[]={"mango", "banana", "apple"};
    //     String largest = fruits[0];
    //     for (int i=1; i<fruits.length; i++){
    //         if(largest.compareTo(fruits[i]) < 0 ){
    //             largest = fruits[i];
    //         }
    //     }
    //     System.out.println(largest);
    // // }/
    // public static void main(String[] args) {
    //     StringBuilder Sb= new StringBuilder("");
    //     for(char ch='a'; ch<'m'; ch++){
    //         Sb.append(ch);
    //     }
    //     System.out.println(Sb);

    // }
    
        public static String compress(String str) {
            String newStr = "";
            int count = 1;
    
            for (int i = 0; i < str.length(); i++) {
                while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                    count++;
                }
                newStr += str.charAt(i);
                if (count > 1) {
                    newStr += count.toString();
                    count = 1;
                }
            }
            return newStr;
        }
    
        public static void main(String[] args) {
            String str = "aaabbcccdd";
            System.out.println(compress(str));
        }
    }
