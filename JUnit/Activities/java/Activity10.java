
    import java.util.HashSet;

    public class Activity10 {
        public static void main(String[] args) {
            HashSet<String> hs = new HashSet<String>();
            hs.add("R");
            hs.add("A");
            hs.add("T");
            hs.add("N");
            hs.add("A");
            hs.add("G");

            //Print HashSet
            System.out.println("Original HashSet: " + hs);
            //Print size of HashSet
            System.out.println("Size of HashSet: " + hs.size());

            //Remove element
            System.out.println("Removing T from HashSet: " + hs.remove("T"));
            //Remove element that is not present
            if(hs.remove("G")) {
                System.out.println("G removed from the Set");
            } else {
                System.out.println("G is not present in the Set");
            }

            //Search for element
            System.out.println("Checking if A is present: " + hs.contains("A"));
            //Print updated HashSet
            System.out.println("Updated HashSet: " + hs);
        }
    }

