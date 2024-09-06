public class wrapperExample {
    public static void main(String[] args) {
        Integer a = 19;
        Integer num = 23;
        swap(a, num);
        System.out.println(a + " " + num);

        class A {
            int d;
            final int num = 0;
            String name;

            public A(String name) {
                System.out.println("object is created");
                this.name = name;

                A obj;
                for (int i = 0; i < 10000000; i++) {
                    obj = new A("random name");
                }
            }

            // Custom cleanup method if needed
            public void cleanup() {
                System.out.println("object is destroyed");
            }
        }

        // Force garbage collection (not guaranteed)
        //System.gc();
    }

    static void swap(Integer a, Integer n) {
        Integer temp = a;
        a = n;
        n = temp;
    }
}
