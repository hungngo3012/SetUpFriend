public class TestCase3 {
    public static void main(String[] args) throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "13df";
        ResponseLogin resp = TestCaseLoginApi.callAPI(phonenumber, password, uuid);
        String token = resp.data.token;
        String user_id = "5fbdcf81c8accf0017c07e0a";
        String is_accepted = "1";
        ResponseSetAcceptFriend res = TestCaseSetAcceptFriendApi.callAPI(token,user_id,is_accepted);
        if (!("1001".equals(res.code)) && !("Can not connect to DB.".equals(res.message))) throw new AssertionError();
        System.out.println("Satisfied! Finished");
    }
}
