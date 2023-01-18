package Seminar_02.Task3;

/**Пробная документация*/
public interface myIf {
    int getUserID();
    default int getAdminID(){
        return 1;
    }
    static int getUniversalID(){
        return 100500;
    }
}
