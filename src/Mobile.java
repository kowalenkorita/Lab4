public interface Mobile {
    void startCall (String number);
    String searchForCall ();
    void acceptCall (String number);
    void breakCall ();
    public static void main(String[] args){
        SiemensMobile mob = new Model();
        mob.connectToSiemensOnline();
        mob.startCall("89999999999");
        System.out.println(mob.searchForCall());
        mob.acceptCall("8111111119");
        mob.breakCall();
    }
}

abstract class SiemensMobile implements Mobile {
    Boolean incomingCall=true;
    Boolean isTalkingNow;
    int siemensSerialNumber;
    abstract void connectToSiemensOnline();
}

class Model extends SiemensMobile {

    @Override
    void connectToSiemensOnline() {
        System.out.println("Подсоединились к сервису Сименс Онлайн");
    }

    @Override
    public void startCall(String number) {
        isTalkingNow = true;
    }

    @Override
    public String searchForCall() {
        while (true){
            if (incomingCall){
                if (isTalkingNow){
                    return "Линяя занята";
                } else return "Вызов принят";
            }
        }
    }

    @Override
    public void acceptCall(String number) {
        isTalkingNow = true;
    }

    @Override
    public void breakCall() {
        isTalkingNow = false;
        System.out.println("Вызов завершен");
    }
}
