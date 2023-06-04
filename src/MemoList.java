import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoList extends MemoScreen{
    Scanner sc = new Scanner(System.in);
    public int postNubmeri =0;
    //    MemoVo mv = new MemoVo();
//    private HashMap< String, List<MemoPsw>> memoList;
    private MemoPsw mmp = new MemoPsw();
    //    private  ArrayList<MemoPsw> memoWls = new ArrayList<>();
    private List<MemoPsw> writeMemo =new ArrayList<>();

    public MemoList(){
//        memoList = new HashMap<>();
    }
    public void inputMemo(){

//        System.out.println("이름을 작성하십시오.");
//        System.out.println("이름_>");
//        String userName = sc.nextLine();
//        System.out.println("psw를 작성하십시오.");
//        System.out.println("psw_>");
//        String userPsw = sc.nextLine();
//        System.out.println("메모를 작성하시오 .");
//        System.out.println("메모_>");
//        String userMemo = sc.nextLine();
sc.nextLine();
        System.out.println("메모를 작성하시오 .");
        System.out.println("메모_>");
        String userMemo = sc.nextLine();
        System.out.println("이름을 입력하시오");
        System.out.println("이름_>");
        String userName = sc.nextLine();
        System.out.println("psw를 입력하시오");
        System.out.println("psw_>");
        String userPsw = sc.nextLine();


        System.out.println("메모작성을 완료하시겠습니까? y/n _>"); String yorn = sc.nextLine();
        if (yorn.equals("y")){
            postNubmeri += 1;//메모작성이 완료되면 글번호가 생성되어 객체배열 제일 앞에 저장됨
        }else if (yorn.equals("n")){
            showScreen();
        }
        //        LocalDateTime time = LocalDateTime.now();

        LocalDateTime lt = LocalDateTime.now();
        String time = lt.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss"));
        writeMemo.add(new MemoPsw(postNubmeri,userName,userMemo,userPsw,time));

//        MemoPsw[] me = new MemoPsw[1];
//        me[0]= new MemoPsw(userName,userMemo,userPsw,time);
//        memoWls.add(me[0]);




        choiceMenu();
    }
    public void showMemoList(){
        System.out.println(writeMemo);
        for (int i = writeMemo.size(); i > 0; i--) {
            System.out.println(writeMemo.get(i-1).getPostNumber() + ". " + writeMemo.get(i-1).getName()
                    + " | " +writeMemo.get(i-1).getMemoField() + " | " + writeMemo.get(i-1).getTime() );
        }//각각의 객체배열의 원소를 받아와서 출력함
        choiceMenu();

    }
    public void editMemo(){

        System.out.println("변경하실 postNumber 를 입력하시오");
        System.out.println("_>");
        int pon = sc.nextInt();
        sc.nextLine();
        System.out.println("해당 메모를 변경하시겠습니까? y/n"+
                writeMemo.get(pon-1).getPostNumber()+"번글 작성자 :" + writeMemo.get(pon-1).getName());
        System.out.println("_>");
        String yorn = sc.nextLine();
        if (yorn.equals("y")){
            System.out.println("psw를 입력해주십시오_>");
            String editpsw = sc.nextLine();
            if (writeMemo.get(pon-1).getPsw().equals(editpsw)){
                System.out.println("변경하여 저정할 메모를 입력하십시오_>");String editmemo = sc.nextLine();
                writeMemo.get(pon-1).setMemoField(editmemo);
                System.out.println("저장되었습니다.");
                choiceMenu();
            }else {
                System.out.println("psw가 틀렸습니다. 처음화면으로 돌아갑니다.");
                choiceMenu();
            }
        }


    }
    public void choiceMenu(){
        showScreen();
        int choiceNumber = sc.nextInt();
        switch (choiceNumber){
            case 1://입력 intputMemo()
                inputMemo();
            case 2://목록조회 showMemolist()
                showMemoList();
            case 3:
                editMemo();//수정 showMemolist()에서 목록들고와서 editMemo()로 수정
            case 4://삭제 showMemolist()에서 목록들고와서 deletMemo()로 삭제 이때 페스워드도 가져와 비교할것
            case 5://종료메뉴 터미널 종료메서드
                System.exit(0);
            default:
                System.out.println("잘못된입력입니다. 1부터 5까지의 숫자들만 입력해주세요.다시입력해주세요");
                showScreen();


        }

    }

}
