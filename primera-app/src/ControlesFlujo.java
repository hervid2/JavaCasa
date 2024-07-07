//Control RETURN:
//------------------

public class ControlesFlujo {
    public static void main(String[] args) throws Exception {
        int i;

        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                return;

            }
            System.out.println(i);
        }
    }
}
/*
//Control CONTINUE:
//------------------

public class ControlesFlujo {
    public static void main(String[] args) throws Exception {
        int i;

        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                continue;

            }
            System.out.println(i);
        }
    }
}
*/
/*
//Control BREAK:
//------------------

public class ControlesFlujo {
    public static void main(String[] args) throws Exception {
        int i;

        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;

            }
            System.out.println(i);
        }
    }
} */