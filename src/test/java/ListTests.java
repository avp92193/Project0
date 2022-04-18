import java.util.List;

public class ListTests {

    @Tests

    void add_items() {
        names.add("John");
        names.add ("Jane"):
        names.add ("Harry");
        Assertions.assertEquals(expected 3, names.size());
    }
    @Tests

    void get_by_index(){
        List<String> names =null;
        names.add ("John");
        names.add ("Jane");
        names.add ("Harry");
        String.result=names.get(1);
        Assertions.AssertEquals (expected "Jane", result);

    }
    @Test

    void many_adds() {
        List<String> names=null;
        for (int i=0; i<1000; i++){
            names.add ("hello");
        }
        Assertions.AssertEquals(expected 1000, names.size());

    }

}