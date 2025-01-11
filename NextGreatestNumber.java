public class NextGreatestNumber {
    public static void main(String[] args) {
        char letters[] = new char[]{'b','c','d','e','f','g', 'h'};

        char target = 'b';

        char ans = Ceiling(letters, target);
        System.out.println(ans);

        System.out.println(target);

        char ans2 = floor(letters, target);
        System.out.println(ans2);
    }
    public static char Ceiling(char letters[], char target){
        int s = 0;
        int e = letters.length-1;

        for(int i = 0; i< e; i++){
            int mid = s+(e-s)/2;

            if(s == letters.length-1){
                return letters[mid-e];
            }

            if(letters[mid]==target){
                return letters[mid+1];
            }
            else if(letters[mid]> target){
                e = mid-1;
            }
            else if(letters[mid]<target){
                s = mid+1;
            }
        }
        return letters[s];
    }

    public static char floor(char letters[], char target){
        int s = 0;
        int e = letters.length-1;

        for(int i = 0; i< e; i++){
            int mid = s+(e-s)/2;

            if(s == letters.length-1){
                return letters[mid-1];
            }

            if(letters[mid]==target){
                return letters[mid-1];
            }
            else if(letters[mid]> target){
                e = mid-1;
            }
            else if(letters[mid]<target){
                s = mid+1;
            }
        }
        return letters[e];
    }
}
