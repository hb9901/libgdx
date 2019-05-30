# libGDX에 기여하기

쉽고 효과적인 기여를 위해서 이 문서를 읽어주세요.

이 가이드라인은 오픈 소스 프로젝트에 기여한 개발자들을 존중하는데 도움을 주고, 또한
개발자들이 당신이 발행한 이슈를 다루고, 당신의 패치를 평가하게끔 도와줄 것 입니다.


## 이슈 트래커  이용하기

이슈 트래커는 [버그 리포트] (#bugs) , [기능 요청] (#features) , 그리고
[제출 요청](#pull-requests), 에 사용되는 채널입니다. 
하지만 다음의 제한 사항들을 준수해 주세요.

* 개인적인 지원 요청을 위해 이슈트래커를 사용하지 말아주세요. ([the forum](http://badlogicgames.com/forum/) or IRC
  를 이용해주세요.). [Getting Help] 역시 참고해주세요(https://github.com/libgdx/libgdx/wiki/Getting-Help).
  
* 이슈에 벗어난 주제는 삼가해주세요. 주제에 맞게 의견을 주고받고 다른 사람들의 주장을 존중해주세요.



<a name="bugs"></a>
## 버그 신고

버그는 저장소의 코드에 의해 발생되는 '증명 가능한' 문제입니다.
좋은 버그 신고는 매우 도움이 됩니다 - 도움에 감사합니다!

버그 신고를 위한 가이드라인:

1. **GitHub issue search를 사용하세요** &mdash; issue가 이미 발행되었는지 
   확인하세요. open issue를 포함한 모든 issue들을 검색해보세요
   
2. **issue가 수정되어졌는지 확인하세요** &mdash; 가장 최근에 만든 master 
   브랜치나 개발 브랜치를 이용해서 issue를 재생성해보세요
   
3. **문제를 분리하세요** &mdash; [reduced test case](https://github.com/libgdx/libgdx/wiki/Getting-Help#executable-example-code)
를 생성해주세요.

좋은 버그 신고는 더 이상의 정보없이 다른 사람이 이해할 수 있어야 합니다. 당신의 환경이 어떠한가요?
어떤 단계가 issue를 재생성할까요? 어떤 브라우저와 OS가 문제를 겪었나요? 당신은 어떤 결과를 원하나요?
이러한 자세한 설명들은 다른 사람들이 잠재적 버그까지 수정하는데 도움을 줍니다.
 
당신이 버그를 발견하였고 이를 스스로 고쳐보고 싶다면 수정사항에 대한 설명과 함께
[pull request](#pull-requests)를 생성해보세요. pull request면 충분하니 버그 신고로 또다른 issue를 
발행할 필요는 없습니다.

[Getting Help](https://github.com/libgdx/libgdx/wiki/Getting-Help)에서 더 많은 설명과 예시를 참고하세요


<a name="features"></a>
## 기능 요청

기능요청은 언제나 환영합니다. 하지만 기능요청에 앞서 잠시 그 기능이 이 프로젝트의 목표와 잘 맞는지 
생각해주세요. 이 기능의 장점을 프로젝트 개발자들에게 설득시킬 수 있는 건 당신밖에 없음을 인식하고
가능한 자세하게 정보를 제공해주세요.

<a name="pull-requests"></a>
## Pull requests

libGDX에 기여하는 방법은 쉽습니다.:

  * libGDX [`http://github.com/libgdx/libgdx`](http://github.com/libgdx/libgdx)를 포크하세요
  * [소스를 이용하는 법](https://github.com/libgdx/libgdx/wiki/Running-demos-%26-tests)을 배우세요
  * GitHub에 Pull requests하세요!

### API 변경 & 추가사항
만약 당신이 공용 API를 수정하거나 새로운 것을 추가할 때 저정소의 [CHANGES](https://github.com/libgdx/libgdx/blob/master/CHANGES)파일에
이러한 변경사항들을 추가하세요. CHANGES 파일뿐만 아니라, 그런 변경사항들은 모든 커뮤니티에 전해지도록 [blog](http://www.badlogicgames.com)와 [Twitter](http://www.twitter.com/badlogicgames)에 전달해주세요.

만약 당신이 다른 개발자들과 머리를 맞대거나 pull request를 하고 싶다면 GitHub에서 토론을 시작하거나 새로운 스레드를 [이 sub-forum](http://www.badlogicgames.com/forum/viewforum.php?f=23)에서 진행하세요. 회원 가입을 위해선 badlogicgames dot com에 email을 쓰고 
당신의 포럼 아이디를 확인 받아야합니다. 또한 페이지 아래에 있는 버튼을 통해 포럼을 정기 구독해야 합니다. 혹은 핵심 개발자들이 있는IRC(irc.freenode.org, #libgdx)에 방문하셔도 됩니다.

### 라이선스 동의

Libgdx는 [Apache 2.0 license](http://en.wikipedia.org/wiki/Apache_License)하에 있습니다. 이 프로젝트에 공헌하기 위해서는  [contributor license agreement](https://github.com/libgdx/libgdx/blob/master/CLA.txt)에 대해 동의해야 합니다. 이를 프린트에서 빈 칸을 채우고 [`contact@badlogicgames.com`](mailto:contact@badlogicgames.com?subject=[LibGDX]%20CLA) `[Libgdx] CLA`와 함께 보내세요.

CLA에 동의하는 것은 저희가 당신의 코드에 기여할 수 있게 합니다. 이것은 독점적인 라이선스가 아니므로 당신은 당신의 코드에 대한
권리를 가지고 있습니다만 만약 중요한 코드를 작성하고 나중에 다시 가져가기로 결심했을 때에 대한 대비책이 될 것입니다.

### Eclipse Formatter

libGDX 코드로 작업하는 경우 저장소의 루트 디렉토리에 있는 [Eclipse formatter](https://github.com/libgdx/libgdx/blob/master/eclipse-formatter.xml)를 사용해야 합니다.

IntelliJ IDEA를 사용한다면 eclipse code formatter를 사용할 수 있습니다. 자세한 내용은 [이 글](http://blog.jetbrains.com/idea/2014/01/intellij-idea-13-importing-code-formatter-settings-from-eclipse/?utm_source=hootsuite&utm_campaign=hootsuite)을 참고하세요.

### 코드 스타일

LibGDX에는 공식 코딩 스타일이 없습니다. 이 프로젝트의 대부분은 [자바 스타일](http://www.oracle.com/technetwork/java/codeconvtoc-136057.html)
을 따르고 있습니다.

이 프로젝트에서 하지 말아야 할 것들:

  * 식별자에 밑줄을 긋는 것
  * [헝가리 표기법](http://en.wikipedia.org/wiki/Hungarian_notation)
  * 필드 또는 인수의 접두사
  * 새로운 라인의 커클
  * 블록이 둘 이상의 라인에 걸쳐있을 때 중괄호가 없는 조건부 블록 본문

만약 기존에 존재하는 파일을 수정하는 경우 코드 스타일을 유지해 주세요

새 파일을 만드는 경우 [여기](https://github.com/libgdx/libgdx/blob/master/gdx/src/com/badlogic/gdx/Application.java)에 표시된대로 Apache
파일 해더를 추가해야 합니다..

새 클래스를 만드는 경우 클래스의 사용법과 범위를 설명하는 클래스를 문서에 추가해야 합니다. 클래스가 명백한 메서드는 Javadoc을 생략할 수 있습니다.

클래스가 스레드에 안전하면 Javadoc에 올리세요. 코드 베이스를 lock 걸기 위한 비용을 줄이기 위해 클래스는 스레드로부터 안전하지 않다는 것이 기본 사항입니다.

### 성능 고려 사항

LibGDX는 브라우저 (JavaScript!)를 포함하여 데스크톱 및 모바일 플랫폼에서 실행됩니다. 데스크톱 핫스팟 VM은 불필요한 할당 측면에서 상당히 
비싸지만 Dalvik과 협력업체는 그렇지 않습니다.

가이드라인:

  * 임시 객체 할당을 피하세요.
  * 방어적 사본을 만들지 마세요.
  * 잠그지 마세요. libGDX 클래스는 기본적으로 지정하지 않는 한 스레드로부터 안전하지 않습니다.
  * 박스형 프리미티브를 사용하지 마세요.
  * [`com.badlogic.gdx.utils` package](https://github.com/libgdx/libgdx/tree/master/gdx/src/com/badlogic/gdx/utils)
    의 컬렉션 클래스를 사용하세요
  * 프레임 당 수천 번 호출 될 수 있는 메소드에 대한 인수 검사를 수행하지 마세요.
  * 가능한 경우 풀링을 사용하세요, API를 복잡하게 만들 때 풀링이 사용자에게 노출되지 않도록 하세요.

### Git

대부분의 libGDX의 팀 멤버는 Git 초심자들입니다. 그래서 저희는 저희 스스로의 고리를 배우는 중입니다. 따라서 잘못될 가능성을 줄이기 위해 최대한
pull request를 적게 해주었으면 합니다. 3000파일의 변화는 병합되기가 힘듭니다ㅠㅠ.

저희는 큰 API 변화를 위해서 새로운 브랜치를 엽니다. 만약 새로운 API에 도움을 준다면 그 브랜치에 맞게 pull request를 해주길 바랍니다.

Master 저장소에 대한 Pull request는 포함되기 전에 핵심 기여자들에게 확인을 받습니다. 저희는 master에 대한 당신의 pull request가 적절하지 
못하다면 이를 거절할 것 입니다. 제발 이 경우를 위반하지 말아주세요. LibGDX는 전 세계의 수천가지 프로젝트에 이용되고 있습니다. 이 프로젝트가
안정화되게 도와주세요
