public class Test {
    // public static void main(String[] args) {
    // int value1 = 10;
    // int value2 = value1;
    // value2 = 20;
    // System.out.println("value1=" + value1);
    // System.out.println("value2=" + value2);

    // int[] valueArray1 = { 1, 2, 3 };
    // int[] valueArray2 = valueArray1;
    // valueArray2[1] = 20;
    // System.out.println("valueArray1[1]=" + valueArray1[1]);
    // System.out.println("valueArray2[1]=" + valueArray2[1]);

    // String[] array = { "あいうえお", "123", "true" };
    // System.out.println(array[0]);
    //

    // public static void main(String[] args) {
    // System.out.println("mainメソッドを実行します。");
    // greet();
    // eat();
    // System.out.println("mainメソッドを実行しました。");
    // }

    // public static void greet() {
    // System.out.println("greetメソッドを実行します。");
    // System.out.println("こんにちは！");
    // System.out.println("greetメソッドを実行しました。");
    // }

    // public static void eat() {
    // System.out.println("eatメソッドを実行します。");
    // System.out.println("食べます。");
    // }

    //
    // public static void main(String[] args) {
    // greet("あだ", 19);
    // }

    // public static void greet(String name, int number) {
    // System.out.println(name + "さんの年齢は" + number + "です");
    // }
    // public static void main(String[] args) {
    // System.out.print("start");
    // for (int i = 0; i < args.length; i++) {
    // System.out.print(args[i] + "");
    // }
    // System.out.print("end");
    // }

    //
    // public static void main(String[] args) {
    // for (int i = 0; i <= 100; i++) {
    // if (String.valueOF(i).contains("3")) {
    // System.out.println("fizzLabel");
    // } else if (String.valueOF(i).contains("5")) {
    // System.out.println("buzzLabel");
    // } else if (String.valueOF(i).contains("3") &&
    // String.valueOF(i).contains("5")) {
    // System.out.println("bothLabel");
    // } else {
    // System.out.println(i);
    // }
    // }
    // }

    // 数値の判定
    // public static int fizzBuzz(){
    // if(i%fizz==0 && i%==0){
    // System.out.println("bothLabel");
    // }else if(i%fizz==0){
    // System.out.println("fizz");
    // }else if(i%buzz==0){
    // System.out.println("buzz");
    // }
    // }
    // 指定の文字列の判定
    // public static String main() {
    // if (String.valueOF(i).contains("3")) {
    // System.out.println("fizzLabel");
    // } else if (String.valueOF(i).contains("5")) {
    // System.out.println("buzzLabel");
    // } else if (String.valueOF(i).contains("3") &&
    // String.valueOF(i).contains("5")) {
    // System.out.println("bothLabel");
    // } else {
    // System.out.println(i);
    // }
    // return i;
    // }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String numStr = String.valueOf(i);
            if (numStr.contains("3") && numStr.contains("5")) {
                System.out.println("bothLabel");
            } else if (numStr.contains("5")) {
                System.out.println("buzzLabel");
            } else if (numStr.contains("3")) {
                System.out.println("fizzLabel");
            } else {
                System.out.println(i);
            }
        }
    }

}
