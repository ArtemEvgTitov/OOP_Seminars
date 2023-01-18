package Seminar_02.Task3;

public interface myIf {
    int getUserID();
    default int getAdminID(){
        return 1;
    }
}
