public class MemoVo {
    String name;
    int postNumber;
    String time;
    String memoField;
    MemoVo(){

    }
    MemoVo( int postNumber,String name,String memoField){
        this.name =name;
        this.postNumber = postNumber;
        this.memoField = memoField;
    }

    public MemoVo(String name,String memoField) {
        this.name = name;
        this.memoField = memoField;
    }




    public void setMemoField(String memoField) {
        this.memoField = memoField;
    }

    public String getName() {
        return name;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public String getTime() {
        return time;
    }

    public String getMemoField() {
        return memoField;
    }



}
