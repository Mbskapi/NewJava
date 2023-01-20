public class BigDog {
    private String name;
    private int size;

    @Override
    public String toString() {
        return "BigDog{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public String bark() {
        if (size > 70) {
            System.out.println("woof, woof, woof");

        } else {
            if (size < 15) {
                System.out.println("waaam, waaam,waaam");

           } else {
               System.out.println("yip, yip, yip");

            }
        }
        return null;
    }


}


