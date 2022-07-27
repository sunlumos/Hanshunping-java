package poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        // 编译类型和运行类型
        // 编译类型看的是定义的时候,=的左边的类型
        //体验对象多态特点
        //animal 编译类型就是 Animal , 运行类型 Animal
        Animal animal = new Animal();
        animal.cry(); //动物在叫

        // 运行类型变为dog
         //因为运行时 , 执行到改行时，animal运行类型是Dog,所以cry就是Dog的cry
        animal = new Dog();
        animal.cry();//小狗汪汪叫

        //animal 编译类型 Animal,运行类型就是 Cat
        animal = new Cat();
        animal.cry(); //小猫喵喵叫
    }
}
