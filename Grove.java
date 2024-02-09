public class Grove {
    Tree[] trees = new Tree[12];
    String speciesName;

    public Grove(String name) {
        speciesName = name;
    }

    public int plantTree(Tree tree) {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null) {
                trees[i] = tree;
                return i;
            }
        }
        return -1;
    }

    public Tree harvestTree(int spot) {
        Tree temp = trees[spot];
        trees[spot] = null;
        return temp;
    }

    public String toString() {
        int count = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] != null) {
                count++;
            }
        }
        return "" + count;
    }
}
