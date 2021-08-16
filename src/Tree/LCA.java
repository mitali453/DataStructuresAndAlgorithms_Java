/* Created by IntelliJ IDEA.
 *  Author: Mitali Varshney
 *  Date: 8/12/2021
 *  Time: 11:09 AM
 */
package Tree;

//LCA means last common ancestor of a binary tree.

import java.util.ArrayList;

public class LCA {
    int key;
    LCA left;
    LCA right;

    LCA(int k) {
        key = k;
    }
}

class LCAMain {
    public static boolean findPath(LCA root, ArrayList p, int n) {
        if (root == null) {
            return false;
        }
        p.add(root);
        if (root.key == n) {
            return true;
        }
        if (findPath(root.left, p, n) || findPath(root.right, p, n)) {
            return true;
        }
        p.remove(p.size() - 1);
        return false;
    }

    public static LCA lCA(LCA root, int n1, int n2) {
        ArrayList path1 = new ArrayList();
        ArrayList path2 = new ArrayList();
        if (findPath(root, path1, n1) == false || findPath(root, path2, n2) == false) {
            return null;
        }
        for (int i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i + 1) != path2.get(i + 1)) {
                return (LCA) path1.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LCA root = new LCA(10);
        root.left = new LCA(20);
        root.right = new LCA(30);
        root.right.right = new LCA(50);
        root.right.left = new LCA(40);
        int n1 = 20;
        int n2 = 50;
        LCA a = lCA(root, n1, n2);
        System.out.println(a.key);
    }
}
