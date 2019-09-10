package Database;

import android.provider.BaseColumns;

public final  class AppMaster{
    private AppMaster(){}

    public static class User implements BaseColumns{
        public static final String TABLE_NAME = "User Table";
        public static final String COLUM_NAME_USERNAME = "name";
        public static final String COLUM_NAME_PASSWORD = "password";
        public static final String COLUM_NAME_TYPE = "type";
    }

    public static class User2 implements BaseColumns{
        public static final String TABLE_NAME = "Message Table";
        public static final String COLUM_NAME_USER = "user";
        public static final String COLUM_NAME_SUBJECT = "subject";
        public static final String COLUM_NAME_TYPE = "message";
    }


}
