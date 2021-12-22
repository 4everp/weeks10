package week10;

public class PositiveNumber{
    public static void main(String[] args) {
        //การเขียนแบบ if else
        //ให้รับค่าตัวเลข แล้วบอกให้ได้ว่าเป็นจำนวนเต็มบวกหรือไม่
        int number = 22;

          String  result = "";
        //กรณีของตรวจสอบเต็ม[บวก]
        if (number>0){
        result =number+" เป็นจำนวนเต็มบวก";

        }
       //กรณีของตรวจสอบเต็มลบ
      }else if (number<0){
        result =number+" เป็นจำนวนเต็มลบ";

        //กรณีของตรวจสอบเต็มศูนย์
      } else {
        result =number+" เป็นจำนวนเต็ม0";

      }
      System.out.println(result);
         //เขียนแบบ if อย่างเดียว
    //     //ให้รับค่าตัวเลข แล้วบอกให้ได้ว่าเป็นจำนวนเต็มบวกหรือไม่
    //     int number = 55;
    //     if (number>0){
    //         System.out.println("เป็นจำนวนเต็มบวก");

    //     }
    //    //กรณีของตรวจสอบเต็มลบ
    //    if (number<0){
    //     System.out.println("เป็นจำนวนเต็มบวก");

    //     //กรณีของตรวจสอบเต็มศูนย์
    //    if (number ==0){
    //     System.out.println("เป็นจำนวนเต็มบวก");

    //      }
    }
}