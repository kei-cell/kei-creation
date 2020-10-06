import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    public void 正常テスト(){
        //Employee input = new Employee(null, null, null);
        String[] args = {"1111", "鈴木", "2020/01/30"};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(1,result);
    }
    @Test
    public void ID全入力正常(){
        String[] args = {"1111", "", ""};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(2,result);
    }
    @Test
    public void 名前全入力正常(){
        String[] args = {"", "山田", ""};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(2,result);
    }
    @Test
    public void 生年月日全入力正常(){
        String[] args = {"", "", "2020/01/31"};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(1,result);
    }
    @Test
    public void ID部分一致正常(){
        String[] args = {"11", "", ""};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(6,result);
    }
    @Test
    public void 名前部分一致正常(){
        String[] args = {"", "鈴", ""};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(5,result);
    }
    @Test
    public void 生年月日部分一致正常(){
        String[] args = {"", "", "2020"};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(10,result);
    }
    @Test
    public void 未入力正常(){
        String[] args = {"", "", ""};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(10,result);
    }
    @Test
    public void ID入力不正(){
        String[] args = {"5555", "", ""};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(0,result);
    }
    @Test
    public void 名前入力不正(){
        String[] args = {"", "小泉", ""};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(0,result);
    }
    @Test
    public void 生年月日入力不正(){
        String[] args = {"", "", "2020/01/01"};
        ArrayList<Employee> List = Main.main(args);
        int result = List.size();
        assertEquals(0,result);
    }










}