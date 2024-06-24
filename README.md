# backend-Server
사용자에게 보여지는 정보를 관리하는 서버(Server)입니다.

# instruction
### making bootjar 
gradle 에서
Tasks &rarr; build &rarr; bootJar 실행  
실행 결과 build &rarr; libs 경로에 jar 파일 생성

### execute 
```
cd build/libs
```
jar 파일이 있는 디렉토리로 이동
```
java -jar {jar 파일명}.jar
```
jar 파일 실행

# directory structure
```
│  .gitignore
│  README.md 
│  build.gradle 
│  gradlew 
│  gradlew.bat 
│  settings.gradle
|
├─gradle
│  └─wrapper
│          gradle-wrapper.jar
│          gradle-wrapper.properties
└─src
    ├─main
    │  ├─generated
    │  ├─java
    │  │  └─softwareEngineering
    │  │      └─team15
    │  │          │  Team15Application.java
    │  │          │
    │  │          ├─info (뇌졸중 관련 건강정보들을 제공하는 기능을 구현한 components)
    │  │          │  ├─controller
    │  │          │  │      InformationController.java
    │  │          │  │
    │  │          │  ├─model
    │  │          │  │      Infoform.java
    │  │          │  │      Information.java
    │  │          │  │
    │  │          │  ├─repository
    │  │          │  │      InformationRepository.java
    │  │          │  │
    │  │          │  └─service
    │  │          │          InformationService.java
    │  │          │
    │  │          ├─main (시작화면 -> 메인화면까지의 기본적인 기능을 구현한 components)
    │  │          │      MainController.java
    │  │          │
    │  │          ├─prediction (뇌졸중 발병확률을 예측하여 보여주는 기능을 구현한 components - AI모델과 연결되지 않아 random 확률을 display)
    │  │          │  ├─AImodel
    │  │          │  │      PredictionModel.java
    │  │          │  │
    │  │          │  ├─controller
    │  │          │  │      PredictionController.java
    │  │          │  │
    │  │          │  └─service
    │  │          │          PredictionService.java
    │  │          │
    │  │          └─user (사용자 정보를 입력하고 조회하고 수정하는 기능을 구현한 components)
    │  │              ├─controller
    │  │              │      UserController.java
    │  │              │
    │  │              ├─model
    │  │              │      Statusform.java
    │  │              │      Users.java
    │  │              │      UserStatuses.java
    │  │              │
    │  │              ├─repository
    │  │              │      UserRepository.java
    │  │              │      UserStatusRepository.java
    │  │              │
    │  │              └─service
    │  │                      UserService.java
    │  │
    │  └─resources
    │      │  application.yml
    │      │
    │      ├─static
    │      │      style.css
    │      │
    │      └─templates
    │              clicktoinput.html (사용자 입력 시작 화면)
    │              index.html (시작 화면)
    │              information.html (뇌졸중 관련 건강정보들 리스트 화면)
    │              informationdetail.html (뇌졸중 관련 건강정보들 세부 화면)
    │              inputinfo.html (사용자 상태정보 입력화면)
    │              main.html (메인 화면)
    │              result.html (뇌졸중 발병확률 예측 확룔 조회 화면)
    │              submit_fail.html (사용자정보 입력 실패시 화면 - 미구현)
    │              submit_success.html (사용자정보 입력 성공시 화면)
    │              viewinfo.html (사용자 정보 조회 화면)
    │
    └─test
        └─java
            └─softwareEngineering
                └─team15
                        Team15ApplicationTests.java
```
