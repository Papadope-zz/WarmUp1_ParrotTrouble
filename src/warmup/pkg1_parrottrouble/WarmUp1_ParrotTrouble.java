package warmup.pkg1_parrottrouble;

public class WarmUp1_ParrotTrouble {

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }
    
    public static boolean parrotTrouble(boolean talking, int hour){
        if(talking){
            if((hour < 7) || (hour > 20)){
                return true;
            }
        }
        else{
            return false;
        }
        return !talking;
    }
    
}
