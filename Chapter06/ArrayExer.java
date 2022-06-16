package Chapter06;

public class ArrayExer {
    public static void main(String[] args) {
        char ch[] = new char[26];
        // ?我的做法
        // char c = 'A';
        //  for (int i = 0; i < ch.length; i++) {
        //      ch[i] = c;
        //      c++;
        //  }

        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char)('A' + i);
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}
