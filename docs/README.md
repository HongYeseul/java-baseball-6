## 기능 목록

### 진행
- [X] 상대방(컴퓨터)는 1에서 9까지 서로 다른 임의의 수(랜덤) 3개를 선택한다.
- [X] 사용자로부터 입력을 받는다.
- [X] 입력한 숫자에 대한 결과를 출력한다.
  - [X] 같은 수가 같은 자리에 있다면 — 스트라이크
  - [X] 다른 자리에 있다면 — 볼
  - [ ] 같은 수가 전혀 없다면 — 낫싱
- [ ] 사용자가 3가지의 숫자를 모두 맞힐 때(3스트라이크)까지 반복한다.
- [ ] 사용자가 3스트라이크 한다면 게임이 종료 된다.
- [ ] 이때, 사용자는 게임을 다시 시작하거나 완전히 종료할 수 있다.

### 입력 요구 사항
- [X] 1부터 9까지 자연수로 이루어져야 한다.
- [X] 사용자가 잘못된 값을 입력할 경우 ```IllegalArgumentException```을 발생시킨 후 애플리케이션은 종료된다.
- [X] **서로 다른** 3자리의 수를 입력해야 한다.
- [ ] 게임이 끝난 경우라면 재시작/종료를 구분하는 1과 2 중 하나의 수를 입력한다.
  - 1이면 재시작, 2라면 종료

### 출력 요구 사항
- [X] 게임 시작 문구
  ```
  숫자 야구 게임을 시작합니다.
  ```
- [X] 입력한 수에 대한 결과를 볼, 스트라이크 개수로 표시
  ```
  n볼 n스트라이크
  ```
- [ ] 하나도 없는 경우
  ```
  낫싱
  ```
- [ ] 3개의 숫자를 모두 맞힐 경우
  ```
  3스트라이크
  3개의 숫자를 모두 맞히셨습니다! 게임 종료
  ```
  재시작 가능하도록 하기
  ```
  게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
  ```