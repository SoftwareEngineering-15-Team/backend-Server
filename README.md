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
│  build.gradle 
│  gradlew 
│  gradlew.bat 
│  HELP.md 
│  README.md 
│  settings.gradle 
│
├─.gradle 
├─.idea 
├─gradle 
├─out 
└─src
    ├─main
    │  ├─generated
    │  ├─java
    │  │  └─softwareEngineering
    │  │      └─team15
    │  │          │  Team15Application.java
    │  │          │
    │  │          ├─info
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
    │  │          ├─main
    │  │          │      MainController.java
    │  │          │
    │  │          ├─prediction
    │  │          │  ├─AImodel
    │  │          │  │      PredictionModel.java
    │  │          │  │
    │  │          │  ├─controller
    │  │          │  │      PredictionController.java
    │  │          │  │
    │  │          │  └─service
    │  │          │          PredictionService.java
    │  │          │
    │  │          └─user
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
    │              clicktoinput.html
    │              index.html
    │              information.html
    │              informationdetail.html
    │              inputinfo.html
    │              main.html
    │              result.html
    │              submit_fail.html
    │              submit_success.html
    │              viewinfo.html
    │
    └─test
        └─java
            └─softwareEngineering
                └─team15
                        Team15ApplicationTests.java
```
