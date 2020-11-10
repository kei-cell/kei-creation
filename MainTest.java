import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    public void 正常終了(){
        Employee input = new Employee(1111, "鈴木", new Date("2020/01/30"));
        int result = Main.main(input);
        assertEquals(99,result);
    }


    @Test
    public void 境界値チェック(){
        Employee input = new Employee(11111, "鈴木", new Date("2020/01/30"));
        int result =Main.main(input);
        assertEquals(1,result);
    }
    @Test
    public void 名前未入力チェック(){
        Employee input = new Employee(1111, "", new Date("2020/01/30"));
        int result = Main.main(input);
         assertEquals(11,result);

    }
    @Test
    public void 名前小数点チェック(){
        Employee input = new Employee(1111, ".", new Date("2020/01/30"));
        int result = Main.main(input);
        assertEquals(12,result);
    }
    @Test
    public void 空白チェック(){
        Employee input = new Employee(1111, " ", new Date("2020/01/30"));
        int result = Main.main(input);
        assertEquals(13,result);
    }

    // employeeListに10件の情報が入っているか
    public void 社員情報10件() {
        // EmployeeAllの結果を取得 ヒント
        Main input = new ArrayList<Employee>();
        if(ArrayList<Employee> result = Main.EmployeeAll();
        assertEquals(employeeList,result);
    }


    // employeeListの2件目のidが2222であることのテスト
    public void 社員2件目idﾁｪｯｸ() {

    }
}
