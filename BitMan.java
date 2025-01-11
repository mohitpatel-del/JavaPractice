public class BitMan {
    public static void main(String[] args) {
//        int a  = 13;
//        int b = 20;
//        String binaryA = Integer.toBinaryString(a);
//        String binaryB = Integer.toBinaryString(b);
//        int count = 0;
//        int xor = a^b;
//        String xorBinary = Integer.toBinaryString(xor);
//        System.out.println("xor = "+ xorBinary);
//        for(int i = 0; i< xorBinary.length(); i++){
//            if(xorBinary.charAt(i) == '1'){
//                count++;
//            }
//        }
//
//        System.out.println(binaryA);
//        System.out.println(binaryB);
//        System.out.println("count = "+ count);

       int n  = 171;
       int res = 0;
       int rem;
       while(n>0){
           rem = n%10;
           res = (res*10)+rem;
           n = n/10;
       }
        System.out.println(res);

    }
}
