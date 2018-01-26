import java.util.List;
import java.util.ArrayList;

public class Q17 {

    public static void main(String args[]) {
        String s1 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        String s2 = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        System.out.println(q17(s1));
        System.out.println(q17(s2));
        System.out.println(q17("dir"));
    }

    private static int q17(String s) {
        int max = 0;
        if (s.indexOf(".") < 0) {
            return max;
        }

        String[] paths = s.split("\n");
        List<Integer> nodes = new ArrayList<>();
        nodes.add(paths[0].length() + 1);
        for (int i = 1; i < paths.length; i++) {
            if (paths[i].indexOf(".") > -1) {
                String[] file = paths[i].split("\t");
                int length = file[file.length - 1].length();
                for (Integer node : nodes) {
                    length += node;
                }

                if (length > max) {
                    max = length;
                }
            } else {
                String[] dir = paths[i].split("\t");
                while (nodes.size() > dir.length - 1) {
                    nodes.remove(nodes.size() - 1);
                }

                nodes.add(dir[dir.length - 1].length() + 1);
            }
        }

        return max;
    }
}
