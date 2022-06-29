package algorithmsAndDataStructures;

import java.util.*;

public class TreeCLass {
    public static void main(String[] args) {

        Tree root =
                new Tree(10,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)),
                                new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));
        System.out.println("Sum for the tree recursive= " + root.sumRecursion());
        System.out.println("Sum for the tree = " + sumDeep(root));
        System.out.println(sumWide(root));
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        public int sumRecursion() {
            int sum = value;

            if (left != null) sum += left.sumRecursion();
            if (right != null) sum += right.sumRecursion();

            return sum;
        }
    }

    public static int sumDeep(Tree root) {
        Stack<Tree> stack = new Stack<>();
        stack.push(root);

        int sum = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.pop();
            sum += node.value;
            System.out.println(node.value);

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }

        return sum;
    }

    public static int sumWide(Tree root) {
        Queue<Tree> stack = new LinkedList<>() ;
        stack.add(root);

        int sum = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.remove();
            sum += node.value;
            System.out.println(node.value);

            if (node.right != null) stack.add(node.right);
            if (node.left != null) stack.add(node.left);
        }

        return sum;
    }

}
