package cn.icedsoul.userservice.constant;

public class CONSTANT {
    //JWT相关
    public static int EXPIRE_TIME = 60;
//    public static String SECRET_KEY = "authJWT";

    public static String GROUP_FIND_BY_IDS = "http://group-service:8081/v1/groups/{ids}";

    public static String USER_RELATION_SERVICE_BUILD_RELATION = "http://user-relation-service:8081/v1/userRelations";
    public static String GROUP_SERVICE_ADD_USER = "http://group-service:8081/v1/group/user";
}
