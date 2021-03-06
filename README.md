## 1단계 요구사항 -  HTTP 캐시 적용하기
- HTTP Cache의 종류를 학습
- 지하철 노선도 조회 시 ETag를 통해 캐시를 적용
- LineControllerTest의 ETag 테스트를 성공 시키기



## 추가로 생각해보기
### 서버 캐시 적용
- 서버의 리소스를 줄이기 위해서는 서버쪽에도 캐시 설정이 필요


## 2단계 요구사항  - 출발역과 도착역의 최단 경로를 조회하는 기능 구현
- 기본적인 기능 구현(Happy Case)을 목표로하고 예외 상황(Side Case)에 대한 처리는 다음 단계에서 고려
- TDD 프로세스를 따라서 개발 진행
- 인수 조건 & 인수 테스트 작성
- 기능 구현시 필요한 단위 테스트 작성
- 중복코드를 제거(테스트 코드도 마찬가지로 중복제거)
- 객체지향 생활체조 준수


## 3단계 요구사항 3단계 - 예외처리 및 Side 케이스
- Happy 케이스 이외 예외 상황에 대한 기능 구현
- 단위 테스트를 통해 Side 케이스 검증

### Side 케이스 예시
- 출발역과 도착역이 같은 경우
- 출발역과 도착역이 연결이 되어 있지 않은 경우 (중간경로가 없음)
- 존재하지 않은 출발역이나 도착역을 조회 할 경우