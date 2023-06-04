
public class MemoPsw extends MemoVo{
    String psw;
    String time;

    public MemoPsw() {

    }




    public MemoPsw(int postNumber, String name,  String memoField, String psw, String time) {
        super(postNumber, name, memoField);

        this.psw = psw;
        this.time = time;
    }

//    @Override
//    public String toString() {
//        System.out.println();
//        return name + " | " + memoField + " | " + time;
//    }

    public String getPsw() {
        return psw;
    }
    public String getTime ()  {
        return time;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
