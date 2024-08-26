import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}

public class NAry {

    public static void dfs(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
       
        for (Node child : root.children) {
            dfs(child, list);
        }
        list.add(root.val);
    }

    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public static void main(String[] args) {
        Node child1 = new Node(5);
        Node child2 = new Node(6);
        List<Node> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);

        Node root = new Node(3, children);

        NAry nAry = new NAry();
        List<Integer> result = nAry.postorder(root);

        System.out.println(result); 
    }
}
