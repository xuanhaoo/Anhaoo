package learn.javaBase.anonymousTest;

public class ThreadTest {

    public static void main(String[] args) {
        Edge[] graph = new Edge[3];
        int j = 0;
        for (int i = 0; i < 3;i++) {
            Edge u = new Edge();
            u.setA(i);
            u.setB(j+5);
            graph[i] = u;
            j++;
        }
        for (Edge g : graph) {
            System.out.println(g.getA() + "--" + g.getB());
        }
        System.out.println();
        boolean f = isConnected(graph, 2, 7);
        System.out.println(f);
    }



    static boolean isConnected(Edge[] graph, int p, int q) {

        // 二分法查找
        int left = 0;
        int right = graph.length - 1;
        boolean flag = false;
        // int length = graph.length;
        while (left < graph.length) {
            int middle = (left + right) / 2;

            Edge temp = graph[middle];
            if ((temp.getA() == p && temp.getB() == q) || (temp.getB() == p && temp.getA() == q)) {
                flag = true;
                break;
            } else {
                left++;
//                right--;
            }
        }

        return flag;
    }
}
    class Edge {
private int a;
private int b;

public int getA() {
        return a;
        }

public void setA(int a) {
        this.a = a;
        }

public int getB() {
        return b;
        }

public void setB(int b) {
        this.b = b;
        }
        }

