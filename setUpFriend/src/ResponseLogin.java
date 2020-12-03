public class ResponseLogin {
    public String code;
    public String message;
    public Data data;
    public class Data{
        String id;
        String username;
        String token;
        String avatar;
        String active;
    }
}
