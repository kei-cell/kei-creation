public class Main3 {
    public static int main(String[] args){

        String id = args[0];
        String name = args[1];
        String birthday = args[2];

        int idCheck = checkId(id);
        if (idCheck < 99){
            // チェックエラーとして処理終了
            return idCheck;
        }

        int nameCheck = checkName(name);
        if (nameCheck < 99){
            // チェックエラーとして処理終了
            return nameCheck;
        }
        int birthdayCheck = checkBirthday(birthday);
        if (birthdayCheck < 99){
            // チェックエラーとして処理終了
            return birthdayCheck;
        }



        return 99;
    }




    // IDのチェック
    private static int checkId(String id){

        // 未入力チェック
        if(id == null || id.isEmpty()){
            System.out.println("IDが未入力です");
            return 1;
        }

//        if(id.equals(" ") == true){
//            System.out.print("IDの項目に文字が入ってます");
//            return 2;
//        }

        for (int i = 0; i < id.length(); i++) {
            //i文字めの文字についてCharacter.isDigitメソッドで判定する
            // charAt 文字列からn番目の文字列を抜き出す
            if (Character.isDigit(id.charAt(i))) {
                System.out.println("半角数字ではない");
                return 3;
            }
        }
        if(id.length() > 4 == true){
            System.out.print("５桁の数が入っています");
            return 4;
        }
        return 99;
    }


    //Nameのチェック
    private static int checkName(String name) {
        // 未入力チェック
        if(name == null || name.isEmpty()){
            System.out.println("Nameが未入力です");
            return 11;
        }
        for (int i = 0; i < name.length(); i++) {
            //i文字めの文字についてCharacter.isDigitメソッドで判定する
            // charAt 文字列からn番目の文字列を抜き出す
            if (Character.isDigit(name.charAt(i))) {
                System.out.println("半角数字ではない");
                return 12;
            }
        }
        if(name.length() > 11 == true){
            System.out.print("12桁の数が入っています");
            return 13;
        }
        return 99;
    }
    private static int checkBirthday(String birthday) {
        // 未入力チェック
        if (birthday == null || birthday.isEmpty()) {
            System.out.println("未入力になっています。");
            return 21;
        }
        if (birthday.equals("　") == true) {
            System.out.print("文字列が入っています");
            return 22;
        }
        for (int i = 0; i < birthday.length(); i++) {
            //i文字めの文字についてCharacter.isDigitメソッドで判定する
            // charAt 文字列からn番目の文字列を抜き出す
            if (Character.isDigit(birthday.charAt(i))) {
                System.out.println("半角数字ではない");
                return 23;
            }
        }
        if (birthday.length() > 11 == true) {
            System.out.print("12桁の数が入っています");
            return 24;
        }
        return 99;
    }}
