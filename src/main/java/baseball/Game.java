package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.regex.Pattern;

public class Game {
    private boolean playing;
    private int strikeCnt;
    private int ballCnt;

    private void init(){
        strikeCnt = 0;
        ballCnt = 0;
    }

    public void setGame(){
        playing = true;
    }

    public boolean isPlaying(){
        return playing;
    }

    public void run(){
        // TODO: 해당 메소드 로직 줄이기
        Computer computer = new Computer();
        User user = new User();

        setGame();

        System.out.println("숫자 야구 게임을 시작합니다.");

        while (isPlaying()){
            computer.init();

            // 상대방(컴퓨터)은제 1에서 9까지 서로 다른 임의의 수(랜덤) 3개를 선택
            computer.selectRandomNumber();

            while (isThreeStrike()){
                System.out.print("숫자를 입력 해 주세요 : ");
                user.init();
                user.selectUserNumber();

                // 입력한 숫자에 대한 결과 출력
                play(computer, user);
                System.out.println(getGameResult());
            }

            isReplay();
        }
    }

    public void play(Computer computer, User user){
        init();

        for(int index=0; index<3; index++){
            if(computer.getComputerNumber(index) == user.getUserNumber(index)){
                strikeCnt++;
            } else if(computer.isComputerContains(user.getUserNumber(index))){
                ballCnt++;
            }
        }
    }

    public int getStrikeCnt(){
        return strikeCnt;
    }

    public int getBallCnt(){
        return ballCnt;
    }

    public String getGameResult(){
        // TODO: 리팩토링
        //  String값을 넘기는 것이 아닌 getStrikeCnt()와 getBallCnt()를 사용하여 다른 클래스에서 출력 할 수 있도록 바꿀 필요가 있어보임
        if(strikeCnt > 0){
            if(strikeCnt == 3){
                return "3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료";
            }
            if(ballCnt > 0){
                return ballCnt+"볼 "+strikeCnt+"스트라이크";
            }
            return strikeCnt+"스트라이크";
        }
        else if(ballCnt > 0){
            return ballCnt+"볼";
        }
        return "낫싱";
    }

    public boolean isOneOrTwo(String str) {
        return Pattern.matches("[1|2]", str);
    }

    public void isReplay(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        if(!isOneOrTwo(input)){
            throw new IllegalArgumentException("게임을 시작하려면 1혹은 2를 입력해야 합니다.");
        }
        init();

        if(Integer.parseInt(input) == 2){
            playing = false;
        }
    }

    public boolean isThreeStrike(){
        return !(strikeCnt == 3);
    }
}
