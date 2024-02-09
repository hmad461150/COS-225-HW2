public class GroveTester {
    public static void main(String[] args) {
        Grove grove1 = new Grove("grove1");
        System.out.println(grove1);
        
        for (int i = 0; i < 7; i++) {
            grove1.plantTree(new Tree(i,37, "Spruce"));
        }

        System.out.println(grove1);

        grove1.harvestTree(3);
        grove1.harvestTree(5);

        System.out.println(grove1);

        Tree maple = new Tree(8, 13, "Maple");
        grove1.plantTree(maple);
        System.out.println(grove1);

    }
}
