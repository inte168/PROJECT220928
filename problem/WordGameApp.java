//오픈챌린지.
import java.util.Scanner;


class Player {
    String name;
    String word;
    void getWordFromUser(){
        Scanner scanner = new Scanner(System.in);//위치상 scanner 닫기가 안됨..
        System.out.print(name + ">>");
        String word = scanner.next();
        this.word = word;//단어를 받고 클래스 변수에 저장해줌.
    }
    boolean checkSuccess(String lastWord){
        //마지막 글자, 첫글자 뽑아내고
        int lastIndex = lastWord.length() -1;
        char last = lastWord.charAt(lastIndex);
        char first = word.charAt(0);

        //비교
        if(last != first) {//다르면 false, 같으면 true 리턴.
            System.out.print(name+"이(가) 졌습니다.");
            return false;
        }
        return true;
    }
}

public class WordGameApp {
    public static void main(String[] args){//메인에선 시작 출력 후 run 메소드 실행.
        System.out.println("끝말잇기 게임을 시작합니다...");
        run();
    }

    static void run(){
        Scanner scanner = new Scanner(System.in);
        //인원조사
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int num = scanner.nextInt();

        //참가자 정리
        Player[] player = new Player[num];
        for(int i =0;i<num;i++){
            System.out.print("참가자의 이름을 입력하세요>>");
            String name = scanner.next();
            player[i] = new Player();
            player[i].name = name;
        }

        //시작하는 단어
        System.out.println("시작하는 단어는 아버지입니다.");
        String word = "아버지";

        //게임 진행
        int i=0;
        while(true) {
            player[i].getWordFromUser();
            if(!(player[i].checkSuccess(word))){
                break;
            }
            word = player[i].word;//이전 단어를 교체.
            
            if (i==num-1) i=0; //이번이 마지막 번호(num-1)이면 0으로, 아니면 ++
            else i++;
        }
        scanner.close();
    }
}
