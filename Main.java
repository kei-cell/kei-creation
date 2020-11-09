import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static int main(Employee input1) {
        int id = input1.getId();
        String name = input1.getName();
        Date birthday = input1.getBirthday();

        int idCheck = checkId(id);
        if (idCheck != 99) {
            // チェックエラーとして処理終了
            return idCheck;
        }

        int nameCheck = checkName(name);
        if (nameCheck < 99)
            // チェックエラーとして処理終了
            return nameCheck;
        
        int birthdayCheck = checkBirthday(birthday);

        if (birthdayCheck < 99){
            // チェックエラーとして処理終了
            return birthdayCheck;
        }
        return 99;

    }

    public static int checkId(int id) {
        // 境界値チェック
//        if((id.length() != 4 )){
//            System.out.print("4桁じゃありません");
//            return 5;
//     if (id.getBytes().length != id.length()) {
//            System.out.print("半角じゃありません");
//            return 6;
//        }
//        if (id == 0){
//            // IDが
//            System.out.println("IDが半角ではない");
//            return 1;
//        }
//        if(id >= 0){
//            System.out.println("境界値をこえてます");
//        }
//        String str = id.toString();
//        if (id.getBytes().length != id.length()) {
//            System.out.println("境界値を超えています");
//        }
//        String str = String.valueOf(id);
//        if (str.getBytes().length != str.length()) {
//            System.out.print("半角じゃありません");
//            return 1;
//        }
//        if(str.length() != 4){
//            System.out.println("境界値を超えています");
//            return 1;
//        }
//        int id = (int)NULL;
//            System.out.println("未入力です");
//            return 2;
//        if(id == 0){
//            System.out.println("未入力です");
//            return 2;
//        }
//        if((id.compareTo(9999)){)
//        if(id.equals(999))
//        String str2 = String.valueOf(id);
//        if(str2.contains(".")){
//            System.out.println("小数点です");
//            return 4;
//        }
//        String str2 = ("[0-8]{6}");
//        Pattern p1 = Pattern.compile(str2); //
//        Matcher m1 = p1.matcher(str);
//        if(m1.find()) {                 //マッチしているかどうかを調べている。
//            System.out.println("お試しが入っています");
//
//            return 1;
//        }
        String str = String.valueOf(id);
        if(str.length() != 4){
            System.out.println("境界値を超えています");
            return 1;
        }
        return 99;
    }

    public static int checkName(String name) {
        // 未入力チェック
        if(name == null || name.isEmpty()){
            System.out.println("Nameが未入力です");
            return 11;
        }
        if(name.contains(".")){
            System.out.println("名前の中に小数点があります");
            return 12;
        }
        // 空白チェック
        if(name.contains(" ")){
            System.out.println("空白です");
            return 13;
        }

        return 99;
    }

    public static int checkBirthday(Date birthday) {
        // 未入力チェック
        //String strDate = dateFormat.format(birthday);
//        String strDate = String.valueOf(birthday);
//        if(str == null || str.isEmpty()){
//            System.out.println("が未入力です");
//            return 21;
//        }
        //if(birthday.setLenient(false)){

        //日付の書式チェック
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");          //yyyy/mm/dd表式を取得
          String str = sdf.format(birthday);  //日付などを整形する

        //日付のチェック(日付前後)
        //Date now = new Date();
        //if(birthday.before(now)){
        //if(checkDate(str)){
         //   System.out.println("入力された日付今日の日付ではありません");
         //   return 23;
        //}


        return 99;
    }

    // yyyy/MM//dd形式でDateの型をString型で変換する処理をするメソッドを作りましょう
    // 引数ありでメソッドを作る
    // getBirthDay1()メソッドを持ってくる
        //Date ans = String.valueOf(birthday);
        //String str = java.sql.Date.valueOf(birthday);
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
//        String StrSdf = sdf2.format(birthday);
//        return StrSdf;
//    public static void main(String... args){
//
//        System.out.println("メソッドが呼び出されました");
//       getBirthDay1("2020/01/11") ;
//        //Main.getBirthDay1(Employee str)
        //Employee str2 = new Employee.getBirthDay1();
        //String name = input.getBirthday1();

       //社員情報を10件分表すメソッドを作りましょう
        public static ArrayList<Employee> EmployeeAll() {
          //インスタンスを10件生成
            Employee input = new Employee(1111, "青木", new Date("2020/01/30"));
            Employee input2 = new Employee(2222, "浅田", new Date("2020/02/30"));
            Employee input3 = new Employee(3333, "木村", new Date("2020/03/30"));
            Employee input4 = new Employee(4444, "沙汰", new Date("2020/04/30"));
            Employee input5 = new Employee(5555, "鈴木", new Date("2020/05/30"));
            Employee input6 = new Employee(6666, "斎藤", new Date("2020/06/30"));
            Employee input7 = new Employee(7777, "吉川", new Date("2020/07/30"));
            Employee input8 = new Employee(8888, "高橋", new Date("2020/08/30"));
            Employee input9 = new Employee(9999, "香川", new Date("2020/09/30"));
            Employee input10 = new Employee(1010, "大久保", new Date("2020/10/30"));

            // Employeeの要素を格納するためのリストを用意
            ArrayList<Employee> employeeList = new ArrayList<Employee>();

            employeeList.add(input);
            employeeList.add(input2);
            employeeList.add(input3);
            employeeList.add(input4);
            employeeList.add(input5);
            employeeList.add(input6);
            employeeList.add(input7);
            employeeList.add(input8);
            employeeList.add(input9);
            employeeList.add(input10);

            return employeeList;

        }



        public String getBirthDay2(Employee input3) {
        //Employee input = new Employee(1111, "鈴木", new Date(2020/01/30));
        String str2 = input3.getBirthDay1();
        return str2;
        }


}
index.html

