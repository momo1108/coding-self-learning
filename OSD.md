안녕하세요, 오늘부터 2일간 여러분들에게 공공데이터를 활용하는 법을 가르쳐드릴 방혜찬 강사입니다. 만나서 반갑습니다.

이제 이번 과정이 6시간 씩 이틀동안 진행되다 보니까 주어진 시간이 길지 않아서, 이제 데이터 분석에 사용되는 여러가지 툴들을 어떻게 사용하는지 위주로 내용을 전달해드리려고 할거구요, 그래서 좀 진도가 빠를수도 있는데, 같이 한번 힘내서 진행하도록 하겠습니다. 자, 오늘 첫 시간이니까요, 어떤 것을 배울지 소개를 해드리겠습니다.

여러분들 교재 앞부분에도 나와있는 내용인데요, 보시면 이제 4가지 구간으로 나뉘어져있는데, 가장 먼저 공공데이터 수집이 있네요. 사실 이부분은 이제 어떤 것을 분석할 것인지 정하는 문제 정의를 하고 나서 실제로 관련 데이터를 수집하는 부분인데요, 우리는 여기서 공공데이터를 사용한다는 거. 보시면 방법이 굉장히 여러가지가 있어요. 데이터 웹 크롤링이랑 웹 상의 데이터 추출은 이제 크롤링으로 통합해서 생각하시면 되구요, 데이터 다운로드는 이제 사용할 데이터를 직접 웹상에서 다운로드 받는 거라고 생각하시면 되고, 뷰티풀숲은 이제 크롤링으로 가져온 정보들중에서 필요한 데이터들을 추출하는 라이브러리에요.

그 다음은 공공데이터 가공인데요, 수집단계에서 필요한 데이터들을 수집하시는데, 이렇게 직접적으로 찾아낸 데이터들을 보통 바로 사용할 수 있는 경우는 거의 없다고 생각하시면 됩니다. 이 데이터들에는 잘못 들어가 있는 내용들이나, 필요없는 내용들도 있을거구요, 또 중간중간 데이터가 빠져있는 부분들도 있을 수 있어요. 보통 그걸 결측값이라고 하죠. 또 한 쪽의 데이터랑 다른쪽의 데이터를 합쳐서 사용해야되는 경우도 굉장히 많죠. 이렇게 뭔가 부족한 데이터들을 뒤에 나오는 데이터 분석이나 예측쪽에서 사용할 수 있도록 정제하고 가공하는 과정이 이 부분입니다. 보시면 Pandas 라이브러리를 사용한다고 써있는데, 이 라이브러리는 데이터를 가공하거나 분석할 때 가장 많이 사용하는 라이브러리에요.

그 다음은 공공데이터 분석이죠. 이 부분은 이제 가공한 데이터를 가지고 간단한 연산을 해서 원하는 데이터를 만들어낸다던가, 시각화를 해서 데이터를 좀더 표현력있게 확인할 수 있고, 수치상으로는 확인하기 힘들었던 특징이나 패턴들을 확인하실 수 있어요.

마지막으로 공공데이터 예측 부분인데요, 여기는 머신러닝과 딥러닝을 사용해서 찾아낸 데이터들로 알고리즘을 분석하고 앞으로의 방향을 예측하는 과정입니다.

이중에서 오늘 배울 부분은, 데이터 수집부터, 일단은 여기 데이터 분석부분 맛보기까지 진행하고, 그 다음부터는 내일 마저 진행할 예정입니다.

자, 이렇게해서 과정 진행 방식은 다 설명을 드렸구요, 이제 수업이 진행될 환경 설정을 할건데, 우리는 수업할 때 왠만하면 크롬 브라우저를 사용할 거에요. 앞으로 데이터분석을 진행활 환경에서 브라우져들과 호환성 문제가 있는 부분이 있구요, 그런 부분에서 가장 안정성있는 브라우져가 크롬브라우져입니다.

파이썬 개발 환경이 굉장히 많은데, 그중에서 데이터 분석을 할 때 많이 사용하는 환경이 주피터 노트북이에요. 주피터 노트북은 웹 상에서        간단하게 사용할 수 있는 환경이에요. 여기 그림을 보시면, 코드를 블록에다가 입력하고 실행하면 바로 그 아래에 결과가 출력이 되서 개발을 대화형으로 할 수 있는 장점이 있어요. 

잠깐 교재로 가서 개발환경을 좀 볼게요. 교재 37페이지 아래쪽을 보시면요, 이제 anaconda라는게 있는데요, 아나콘다는 주피터노트북뿐만 아니라 데이터분석에 필요한 기본적인 패키지들을 한꺼번에 같이 설치해주는 프로그램이에요. 근데 저희가 사용할 환경은 이 아나콘다 환경은 아니구요, 여러분들의 노트북이 다 OS나 성능도 다 다르니까, 이런 기능들을 제공해주는 웹 서비스를 사용을 할 거에요. 우리가 사용할거는, 구글에서 제공하는 코랩이라는 환경을 사용을 할거에요.

 자 그럼 아나콘다 설치를 진행을 해볼게요. 아나콘다 설치파일을 반드시 관리자 권한으로 실행해 주시구요,

 기본 설치 경로가 사용자 계정 밑으로 되어있어요. 우리는 편의상 경로를 직접 C 밑으로 지정해줘서 넘어가겠습니다.



 이제 설치가 되는 동안에 교재를 살펴볼게요. 이제 1장은 빅데이터에 대한 내용이에요. 빅 데이터의 개요, 데이터 분석을 하는 이유, 이런 내용이 쭉 나와있는데요, 이런 내용은 오전 수업 때 들으셨을 테니까 넘어가시구요,  우리가 배우는 내용은 17쪽에 보시면 분석 세부 절차가 나와있어요. 우리 과정이 시간상 머신러닝까지는 들어가지 못하기 때문에, 아까 설명드린대로 business 이해, data 이해, data preparation까지 데이터를 정제하는 방법을 배우신다는 것을 알아두시구요. 다음은 파이썬 기본 문법으로 바로 넘어갈게요.

 자, 교재 2장 2페이지부터 볼게요. 아까 말씀드린대로 여기 나와있는 내용들을 3일동안 쭉 배우실거구요, 

**(2-3페이지)**  파이썬 개요입니다. 파이썬은 요새 떠오르는 언어죠, 귀도 반 로섬이 만든 언어인데, 나온지는 오래됐어요. 근데 요즘에 머신러닝이나 딥러닝쪽에 활용이 되면서 가장 핫한 언어중에 하나가 됐습니다.

 두번째 줄을 보시면, pypl 프로그래밍 언어 순위 1위라고 나와있는데요, 이걸 좀 보여드릴게요. 

http://pypl.github.io/PYPL.html

 이건 이제 실제로 사용되고있는 프로그래밍 순위는 아니구요, 프로그래밍 언어 튜토리얼을 사람들이 얼마나 검색했는지를 분석해서 순위를 낸 사이트에요. 이건 이제 2020년 1월 자료인데, 보시다시피 사람들이 파이썬 튜토리얼을 요즘 정말 압도적으로 찾아보고있죠.

그 다음은 이제 티오베 순위 4위라고 나와있는데요, 이것도 같이 보실게요.

https://www.tiobe.com/tiobe-index/

 이 순위는 전세계적으로 엔지니어의 숫자, 교육 과정들을 집계해서 나온 현재 프로그래밍 언어 순위에요. 이게 더 정확한 순위라고 볼 수 있겠죠. 사실 아직도 제일 많이 쓰는 언어는 JAVA에요. 엔터프라이즈쪽은 거의 JAVA쪽이 잡고있죠. 그 다음에 이제 C 언어, 그 다음이 파이썬이죠. 중요한 점은 파이썬의 인기가 빠르게 증가하고 있다는 점이죠.

 그래서 파이썬이 요즘 많이 쓰이고 있고, 계속해서 많은 모듈들이 추가가 되고있는 상태다 라는걸 알아두시구요.

 (2-4)장점을 보시면 파이썬은 이제 다양한 플랫폼에서 사용이 가능하고, 무료지만 강력하다 라는점. 

 (2-5) 단점으로는, C언어같이 하드웨어를 직접 건드리기는 적합하지 않다는점, 2점대 버전과 3점대 버전이 호환되지 않는다는 점이에요. 그래서 요즘은 거의 3점대 버전으로 사용을 하구요, 우리가 사용할 아나콘다는 내부적으로 python 3.7버전을 사용하고 있어요.

 (2-6) 여기에 파이썬으로 할 수 있는 것들이 나와있구요, 

 (2-7)다음은 우리가 사용할 개발 환경에 관한 내용인데, 사실 환경은 이클립스라던지, 파이참이라던지 여러가지 많은데, 우리는 필요한 패키지들을 한번에 다 설치해주는 아나콘다를 사용할 거에요.

 자, 이제 아나콘다를 사용해볼게요. 아나콘다 설치가 다 되셨죠?

넥스트, 넥스트 누르시고, 필요없는 내용들 체크 다 풀어주시고 피니시 눌러주실게요. 이제 몇가지 세팅을 더 할건데, 여러분들 윈도우즈 메뉴를 보면 아나콘다 64bit가 쭉 설치된게 보일거에요. 이중에서 저희가 사용할것은 브라우저 기반으로 사용할 수 있는 주피터 노트북을 사용할 거에요. 여기 주피터 노트북을 마우스 우클릭하셔서 작업표시줄에 고정을 누르실게요. 그 다음에 주피터노트북에서 사용할 워크스페이스를 하나 만들건데요, 윈도우에 파일 탐색기 여시고, C로 가실게요. 여기에 새폴더를 하나 만드시고, py_workspace라는 폴더를 하나 만들게요. 이 폴더를 홈 위치로 잡고 여기에 필요한 작업들을 쭉 진행할 계획이에요. 이 폴더 안에다가 폴더를 하나 새로 만들게요. 새폴더해서 day1이라고 만들어주시구요. 날짜별로 day2 day3하면서 다양한 실습들을 여러분과 함께 해볼겁니다. 그 다음에 파이썬 워크스페이스의 경로를 이렇게 클릭해서 복사해주시구요, 그리고 작업표시줄에 고정해놓은 주피터 노트북 아이콘을 우클릭해주시구요, 주피터 노트북을 우클릭하셔서, 속성을 눌러주세요. 

 그 다음에 여기 유저 프로파일 부분을 드래그해주시고, 아까 복사해놓은 파이 워크스페이스 경로를 붙여넣기해주세요. 이렇게 하지 않으면,  사용자 유저 계정 밑에가 홈으로 잡혀서 작업경로를 찾아가기가 굉장히 불편해요. 이제 적용, 확인 누르시고, 주피터 노트북을 눌러서 실행해보세요. 그러면 이제 파이 워크스페이스가 홈 경로로 잡혀있을 거에요.

 그럼 이제 정상적으로 동작이 되는지 확인해보고, 2장 내용을 진행해보도록 하겠습니다. day1 폴더를 눌러주시구요, 이 안에다가 이제  우리가 필요한 파일들을 만들거에요. new 누르시고, python3를 누르시면, 새로운 파일이 만들어져요. 이 파일로 이제 간단한 사용 방법을 알려드릴게요. 파일 이름이 이렇게 언타이틀로 만들어지는데 이걸 클릭하셔서 TestHello라고 이름을 바꿔줄게요.

 이렇게하면 이제 확장자가 ipython notebook이라고 해서 파일이 만들어지는데, 이 파일을 이제 복사하셔서 다른 컴퓨터에서도 주피터 노트북으로 그대로 사용하실 수 있어요.



딥러닝도 사실 머신러닝의 범주에 포함되어 있는데, 이렇게 따로 구분되어지는 이유는 딥러닝의 모델이 사람의 뇌를 형상화해서 만들어졌기 때문이에요.  지금 딥러닝의 종류를 크게 두가지를 사용하죠. 첫번째는 Convolutional Nerual Network(CNN), 두번째는 Recurrent Neural Network(RNN), 이렇게 두가지를 많이 사용하는데, CNN같은 경우에는 뇌가 사물을 이해하는 과정, 그리고 RNN은 뇌가 문맥을 이해하는 과정을 형상화 했는데 여기에 사용된 딥러닝 알고리즘에 이제 깊은 이해도가 필요하다 보니 머신러닝에서 따로 분류해서 생각을 많이 해요.

그래서 교재 156페이지에 여기를 보시면, 딥러닝은 인공신경망 구조를 사용하는데, 인공신경망은 뇌에서 뉴런들이 모여 신호를 전달하는 과정을 모델링하여 만든것이다 라고 나와있죠.

다음장 보시면 이제 딥러닝의 대표 모델들이 나오는데, 먼저 CNN이 나와있네요. CNN은 보통 이미지 처리에 많이 사용합니다. 여기보시면 입력 이미지, 필터, 합성곱이라고 나와있는데, 입력 이미지가 어떤 이미지인지 구분하기 위해서 필요한 패턴들을 먼저 찾아내고, 그 패턴들을 필터화시킵니다. 그 다음에 그 필터와 원본 이미지 데이터와의 값을 서로 곱해줘서 각 필터마다 해당하는 결과들이 나오는 거구요, 그 다음에 데이터가 너무 크고 많아지니까 크기를 줄이는 subsampling 과정을 거칩니다., 마찬가지로 다시 필터를 통해서 패턴에 대한 값을 추출하고, subsampling 하고, 이런 과정들을 반복해서 최종적으로 해당 이미지의 분류 결과를 출력하는 그런 모델이라고 생각하시면 되겠습니다.

그 다음은 RNN인데, RNN은 순차적인 데이터를 입력받아서 결과값을 도출하는데 사용하는 모델이에요. 보통 자연어 처리나 시계열 데이터에 많이 사용합니다. 그림을 보시면 이전 입력값들에 의한 상태값이 계속해서 다음 뉴런의 상태값에 영향을 주죠. 그래서 순차적인 데이터를 받아서 순서에 따른 영향을 분석하고 최적화된 결과를 도출한다.



서울시 자치구 년도별 CCTV 설치 현황

서울시 주민등록인구 (구별) 통계

서울시 5대 범죄 발생현황 통계



pairplot 상관관계 계수 출력

heatmap 색깔반전



uci ml repository

- 독립변수
  - `CRIM`: 범죄율
  - `INDUS`: 비소매상업지역 면적 비율
  - `NOX`: 일산화질소 농도
  - `RM`: 주택당 방 수
  - `LSTAT`: 인구 중 하위 계층 비율
  - `B`: 인구 중 흑인 비율
  - `PTRATIO`: 학생/교사 비율
  - `ZN`: 25,000 평방피트를 초과 거주지역 비율
  - `CHAS`: 찰스강의 경계에 위치한 경우는 1, 아니면 0
  - `AGE`: 1940년 이전에 건축된 주택의 비율
  - `RAD`: 방사형 고속도로까지의 거리
  - `DIS`: 직업센터의 거리
  - `TAX`: 재산세율
- 종속변수
  - 보스턴 506개 타운의 1978년 주택 가격 중앙값 (단위 1,000 달러)