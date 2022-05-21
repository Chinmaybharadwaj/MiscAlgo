public class CheckAnagrams{
    public static void main(String[] args) {
        boolean res = checkAnaa("abcz", "azcb");
        System.out.println(res);

        
    }

    static boolean checkAnaa(String s1,String s2){
        int s1_Hash[] = new int[26];
        int s2_Hash[] = new int[26];

        System.out.println("Check Anagrams");

        if(s1.length()!=s2.length()){
            System.out.println("Not an anagaram");
            return false; 
        }


        for(int i=0;i<s1.length();i++){
            int ascii = (int)s1.charAt(i);
            int indexval = ascii - 97;
            s1_Hash[indexval] = s1_Hash[indexval] + 1;
        }
        for(int i=0;i<s2.length();i++){
            int ascii = (int)s2.charAt(i);
            int indexval = ascii - 97;
            s2_Hash[indexval] = s2_Hash[indexval] + 1;
        }
        return (checkTwoHash(s1_Hash, s2_Hash));
    }

    static boolean checkTwoHash(int arr1[],int arr2[]){
        if(arr1.hashCode() == arr2.hashCode()){
            return true;
        }

        return true;
    }
}