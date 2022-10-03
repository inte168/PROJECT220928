//10번
import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망" };
    private static String[] eng = {"love", "baby", "money", "future", "hope" };
    public static String kor2Eng(String word) {
        for(int i =0; i<kor.length;i++) {
            if(word.equals(kor[i])){//입력한 단어와 같은 한글단어를 찾으면 그 index의 영어 단어를 return
                System.out.print(word + "은/는 ");
                return eng[i];
            }
        }
        return "false";
    }
}

public class DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while(true){
            System.out.print("한글 단어?");
            String search = sc.next();
            if(search.equals("그만")) break; //그만이 입력되면 종료

            String eng = Dictionary.kor2Eng(search);
            //위의 메소드에서 찾지 못한경우 false가 리턴됨.
            if(eng.equals("false")) System.out.println(search + "은/는 저의 사전에 없습니다.");
            else System.out.println(eng);
        }
        sc.close();
    }
}
