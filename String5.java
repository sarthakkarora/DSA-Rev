// StringRotationCheck

public class String5 {

    public static boolean isRotatedByTwoPlaces(String original, String target) {
        if (original.length() != target.length()) {
            return false;
        }

        if (original.length() < 2) {
            return original.equals(target);
        }

        String leftRotation = original.substring(2) + original.substring(0, 2);

        String rightRotation = original.substring(original.length() - 2) + original.substring(0, original.length() - 2);

        return target.equals(leftRotation) || target.equals(rightRotation);
    }

    public static void main(String[] args) {
        String original = "sarthak";
        String target1 = "rthaksa"; 
        String target2 = "aksarth"; 

        System.out.println("Is '" + target1 + "' a rotation by two places of '" + original + "'? " + isRotatedByTwoPlaces(original, target1));
        System.out.println("Is '" + target2 + "' a rotation by two places of '" + original + "'? " + isRotatedByTwoPlaces(original, target2));
        
    }
}
