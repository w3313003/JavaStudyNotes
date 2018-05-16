package Exception;


public class index {
    public static void main(String[] args) {
        new index().run(2);
    }
    public void run(double x) {
//        Class t = Test.class;
//        Method m = t.getMethod("getName");
//        Object obj = t.newInstance();
//        System.out.println(m.invoke(obj));
        assert x >= 0;
        double y = Math.sqrt(x);

    }

}

class Test {
    public String name = "zj";
    public String getName() {
        return name;
    }
}
