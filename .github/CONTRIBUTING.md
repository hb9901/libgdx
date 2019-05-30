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
   
3. **문제를 분리하세요** &mdash; [reduced test case]
(https://github.com/libgdx/libgdx/wiki/Getting-Help#executable-example-code)를 생성해주세요.

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

### Contributor License Agreement

Libgdx는 [Apache 2.0 license](http://en.wikipedia.org/wiki/Apache_License)하에 있습니다. 이 프로젝트에 공헌하기 위해서는  [contributor license agreement](https://github.com/libgdx/libgdx/blob/master/CLA.txt)에 대해 동의해야 합니다. 이를 프린트에서 빈 칸을 채우고 [`contact@badlogicgames.com`](mailto:contact@badlogicgames.com?subject=[LibGDX]%20CLA) `[Libgdx] CLA`와 함께 보내세요.


### Eclipse Formatter

If you work on libGDX code, we require you to use the [Eclipse formatter](https://github.com/libgdx/libgdx/blob/master/eclipse-formatter.xml) located in the root directory of the repository.

Failure to use the formatter will result in Nate being very upset.

If you are using IntelliJ IDEA, you can still make use of the eclipse code formatter. See [this article](http://blog.jetbrains.com/idea/2014/01/intellij-idea-13-importing-code-formatter-settings-from-eclipse/?utm_source=hootsuite&utm_campaign=hootsuite) for more information.

### Code Style

LibGDX does not have an official coding standard. We mostly follow the usual [Java style](http://www.oracle.com/technetwork/java/codeconvtoc-136057.html), and so should you.

A few things we'd rather not like to see:

  * underscores in any kind of identifier
  * [Hungarian notation](http://en.wikipedia.org/wiki/Hungarian_notation)
  * Prefixes for fields or arguments
  * Curlies on new lines
  * Conditional block bodies without curlies when the block spans more than one line

If you modify an existing file, follow the style of the code in there.

If you create a new file, make sure to add the Apache file header, as seen [here](https://github.com/libgdx/libgdx/blob/master/gdx/src/com/badlogic/gdx/Application.java).

If you create a new class, please add at least class documentation that explains the usage and scope of he class. You can omit Javadoc for methods that are self-explanatory.

If your class is explicitly thread-safe, mention it in the Javadoc. The default assumption is that classes are not thread-safe, to reduce the amount of costly locks in the code base.

### Performance Considerations

LibGDX is meant to run on both desktop and mobile platforms, including browsers (JavaScript!). While the desktop HotSpot VM can take quite a beating in terms of unnecessary allocations, Dalvik and consorts don't.

A couple of guidelines:

  * Avoid temporary object allocation wherever possible
  * Do not make defensive copies
  * Avoid locking. libGDX classes are, by default, not thread-safe unless explicitly specified
  * Do not use boxed primitives
  * Use the collection classes in the [`com.badlogic.gdx.utils` package](https://github.com/libgdx/libgdx/tree/master/gdx/src/com/badlogic/gdx/utils)
  * Do not perform argument checks for methods that may be called thousands of times per frame
  * Use pooling if necessary, if possible, avoid exposing the pooling to the user as it complicates the API

### Git

Most of the libGDX team members are Git novices. As such, we are just learning the ropes ourselves. To lower the risk of getting something wrong, we'd kindly ask you to keep your pull requests small if possible. A changeset of 3000 files is likely not to get merged.

We do open new branches for bigger API changes. If you help out with a new API, make sure your pull request targets that specific branch.

Pull requests for the master repository will be checked by multiple core contributors before inclusion. We may reject your pull request to `master` if we do not deem them to be ready or fitting. Please don't take offense in that case. LibGDX is used by thousands of projects around the world. We need to make sure things stay somewhat sane and stable.
