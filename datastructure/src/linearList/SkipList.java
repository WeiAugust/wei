package linearList;

import java.util.Random;

/**
 * @ClassName SkipList
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/19 8:58
 * @Version 1.0
 **/
public class SkipList {

    private static final int MAX_LEVEL = 16;
    private int levelCount = 1;
    private Node head = new Node(MAX_LEVEL);
    private Random random = new Random();

    public Node find(int value) {
        Node p = head;
        for (int i = levelCount - 1; i >= 0; i--) {
            while (p.forwards[i] != null && p.forwards[i].data < value) {
                p = p.forwards[i];
            }
        }
        if (p.forwards[0] != null && p.forwards[0].data == value) {
            return p.forwards[0];
        } else {
            return null;
        }
    }

    public void insert(int value) {
        int level = head.forwards[0] == null ? 1 : randomLevel();
        if (level > levelCount) {
            level = levelCount + 1;
        }
        Node newNode = new Node(level);
        newNode.data = value;
        Node update[] = new Node[level];
        for (int i = 0; i < level; i++) {
            update[i] = head;
        }
        Node p = head;

    }

    public class Node {
        private int data;
        private Node forwards[];
        public Node(int level) {
            forwards = new Node[level];
        }
    }
}
