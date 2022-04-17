package com.atguigu.boot01helloworld.test;

/**
 * @author chenlong
 * @since 2022/4/1 15:53
 */
public class GenericTest {
    public static void main(String[] args) {
        Box<String> name = new Box<>("cron");
        Box<Integer> age = new Box<>(712);
        Box<Number> number = new Box<>(314);

        getData(name);
        getData(age);
        getData(number);

//        getUpperNumberData(name);
        getUpperNumberData(age);
        getUpperNumberData(number);

//        getLowerNumberData(name);
//        getLowerNumberData(age);
        getLowerNumberData(number);
    }

    public static void getData(Box<?> data) {
        System.out.println("data: " + data.getData());
    }

    public static void getUpperNumberData(Box<? extends Number> data) {
        System.out.println("data: " + data.getData());
    }

    public static void getLowerNumberData(Box<? super Number> data) {
        System.out.println("data:" + data.getData());
    }

}

class Box<T> {
    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
