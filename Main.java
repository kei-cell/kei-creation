import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {


    public static ArrayList<Employee> main(String[] args) {

        String id = args[0];            //idには”　”が入る
        String name = args[1];          //名前には”　”が入る
        String birthday = args[2];          //誕生日には”　”が入る

        // ListAll()を受け取るための変数を設定
        ArrayList<Employee> persons = ListAll();

        // 返却用社員リストを設定
        ArrayList<Employee> resultList = persons;

        //入力不正の場合のリストを設定
        ArrayList<Employee> NonList = NonCollect();

        //入力した値に空文字が入っていた場合などを想定する
        // id、名前、生年月日全て未入力だった場合全件返却
        if (id == "" && name == "" && birthday == "") {
            return resultList;

        //不正入力の場合はNonListを返すように設定する
        //Id検索後、該当するリストがなかった場合
        }else if(Arrays.asList(persons).contains(id)){
                return NonList;
        //名前検索後、該当するリストがなかった場合
        }else if(Arrays.asList(persons).contains(name)){
            return NonList;
        //生年月日検索後、該当するリストがなかった場合
        }else if(Arrays.asList(persons).contains(birthday)){
            return NonList;
        }




        //もしIDに情報が入っていた場合はCollectIDs()メソッドを使う
        if (!"".equals(id)) {
            resultList = CollectIds(resultList, id);
            if(resultList.size() == 0) {
                return resultList;
            }
        }
        //もしIDに情報が入っていた場合はCollectNamesを使う
        if (!"".equals(name)) {
            resultList = CollectNames(resultList, name);
        }

        //もしIDに情報が入っていた場合はCollectBirthdayを使う
        if (!"".equals(birthday)) {
            resultList = CollectBirthday(resultList, birthday);
        }
        return resultList;
    }


    // データを格納するためのメソッド
    public static ArrayList<Employee> ListAll() {

        //ArrayListでインスタンスを生成し、List変数に格納する
        ArrayList<Employee> List = new ArrayList<Employee>();
        //下記のリストを加えていく
        List.add(new Employee(1111, "鈴木", new Date("2020/01/30")));
        List.add(new Employee(1111, "鈴木", new Date("2020/01/20")));
        List.add(new Employee(1122, "加藤", new Date("2020/01/10")));
        List.add(new Employee(1133, "鈴木", new Date("2020/01/31")));
        List.add(new Employee(1144, "山田", new Date("2020/01/21")));
        List.add(new Employee(2222, "鈴木", new Date("2020/01/22")));
        List.add(new Employee(2233, "佐藤", new Date("2020/01/23")));
        List.add(new Employee(2244, "加藤", new Date("2020/01/24")));
        List.add(new Employee(3311, "鈴木", new Date("2020/01/24")));
        List.add(new Employee(3344, "山田", new Date("2020/01/26")));

        return List;

    }

    // idが部分一致しているリストを返すメソッド
    // 入力11  5件　id　名前 生年月日　情報が返ってくる　
    public static ArrayList<Employee> CollectIds(ArrayList<Employee> persons, String id) {

        ArrayList<Employee> idsList = new ArrayList<Employee>();

        for (Employee person : persons) {
            int personId = person.getId();
            String stringId = String.valueOf(personId);

            if (stringId.contains(id)) {
                idsList.add(person);
            }
        }
        return idsList;
    }

    //名前の部分一致しているリストを返すメソッド
    // 入力1111  名前”鈴木”　によって　id　名前 生年月日　情報が返ってくる　
    public static ArrayList<Employee> CollectNames(ArrayList<Employee> persons, String name) {

        ArrayList<Employee> NamesList = new ArrayList<Employee>();

        for (Employee person : persons) {
            String stName = person.getName();

            if (stName.contains(name)) {
                NamesList.add(person);
            }

        }

        return NamesList;
    }

    //名前の部分一致しているリストを返すメソッド
    // 入力1111  名前”鈴木”　によって　id　名前 生年月日　情報が返ってくる　
    public static ArrayList<Employee> CollectBirthday(ArrayList<Employee> persons, String birthday) {

        ArrayList<Employee> BirthdayList = new ArrayList<Employee>();

        for (Employee person : persons) {
            Date personBirthday = person.getBirthday();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String stringBirthday = dateFormat.format(personBirthday);
            if (stringBirthday.contains(birthday)) {
                BirthdayList.add(person);
            }
        }
        return BirthdayList;
    }
    public static ArrayList<Employee> NonCollect() {

        ArrayList<Employee> NonList = new ArrayList<Employee>();

        return NonList;

    }
}


