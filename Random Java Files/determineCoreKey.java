public class determineCoreKey{
    public static void main(String[] args){
        int max1= 122;
        int min1= 97;
        int range1 = max1-min1+1;
        int random1= (int) (Math.random()*range1) +1;
        random1 = random1+96;
        switch (random1) {
            case 97:
            case 98:
            case 99:System.out.print("Your letter is: "+ (char)random1+ ", your value on the keypad is located on: 2");
                break;
        
            case 100:
            case 101:
            case 102:System.out.print("Your letter is: "+  (char)random1+ ", your value on the keypad is located on: 3");
                break;
            
            case 103:
            case 104:
            case 105:System.out.print("Your letter is: "+  (char)random1+ ", your value on the keypad is located on: 4");
                break;

            case 106:
            case 107:
            case 108:System.out.print("Your letter is: "+  (char) random1+ ", your value on the keypad is located on: 5");
                break;

            case 109:
            case 110:
            case 111:System.out.print("Your letter is: "+  (char) random1+ ", your value on the keypad is located on: 6");
                break;

            case 112:
            case 113:
            case 114:
            case 115:System.out.print("Your letter is: "+  (char) random1+ ", your value on the keypad is located on: 7");
                break;

            case 116:
            case 117:
            case 118:System.out.print("Your letter is: "+  (char) random1+ ", your value on the keypad is located on: 8");
                break;

            case 119:
            case 120:
            case 121:
            case 122:System.out.print("Your letter is: "+  (char) random1+ ", your value on the keypad is located on: 9");
                break;
        }
    }
}