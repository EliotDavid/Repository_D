# 첫번째 SQL 주석(한 줄 주석)
-- 두번째 SQL 주석(한 줄 주석)
-- 근데 -- 주석은 '-' 뒤에 반드시 띄어쓰기가 포함되어야 함 붙여서 쓰면 주석이 안됨 
/*
세번째
SQL
주석(여러 줄 주석)
 */
 
 # 데이터베이스 생성쿼리
 # CREATE DATABASE 데이터베이스명;
 
 
 # 테이블같은 경우에는 클래스와 연결된다고 했는데 이 데이터베이스는 Project와 연결이 됨
 # Project 하나당 데이터베이스 하나와 연결 할 수 있음
 # 실행하는 방법 ctrl + Enter 또는 번개모양 클릭하면 됨
 # 그리고 생성되었는지 안되었는지 확인해봐야되는데 왼쪽에 스키마스에서 새로고침모양 버튼을 누르면 내가 생성한 데이터베이스가 뜸
 
 
 CREATE DATABASE HOTEL;
 
 
 # 생성된 데이터베이스 목록보기 
 # SHOW DATABASES;
 # 그리고 나서 ctrl + Enter 누르면 됨
 # 지금 이 상태로는 데이터베이스 접속을 못 하고 
 # USE (데이터베이스명) 해야 데이터베이스를 실행시킬 수 있음 
 # 내가 생성한 것 외에 뭐가 있따면 그건 시스템이 생성한것들이라고 함
 SHOW DATABASES;
 
 # 데이터베이스 선택
 # USE 데이터베이스명
 # 그리고 나서 ctrl + Enter 하면 스키마스에 굵은 글씨로 내가 생성한 데이터베이스가 나타남 
 # 그 뜻이 내가 이 데이터베이스를 사용하고 있다라는 뜻이라고 함
 USE HOTEL;
 
 # 데이터베이스명 : HOTEL
 # 데이터베이스는 하나 이상의 테이블로 구성되며 이러한 테이블에 데이터를 저장하여 관리할 수 있음
 # 테이블 생성 구문은 아래와 같음 : 
 
 # CREATE TABLE 테이블명(
 # 필드명 필드타입 제약조건, ....
 # );
 
 # 테이블을 생성하기 위해서는 테이블 이름, 필드 목록과 각 필드의 타입을 명시해야함
 # VARCHAR()는 길이를 지정해줘야함 VARCHAR는 문자열을 의미함
 # 마지막에는 콤마를 뺌
 # 구문을 쓰고 ctrl + Enter하면 구문이 실행된거라고 함
 # 그리고 나서 다시 스키마에서 새로고침을 누르면 테이블이 생성된걸 확인할 수 있음
 # 아니면 SHOW TABLES; 를 쓰면  선택된 데이터베이스의 테이블을 조회함 즉 HOTEL이라는 데이터베이스 안에 있는 테이블을 확인할 수 있음 
 
 # 아이디는 자동으로 증가되고, 기본키로 설정할거고 이 아이디라는 애로 예약이라는 애를 구분지을거임
 # 이런 제약조건을 설정해주려면 AUTO_INCREMENT 제약조건을 걸어줘야되고 그 옆에 PRIMARY KEY라고 적으면됨
 # 그 다음 name 필드는 동명이인이 있을 수 있기 떄문에 중복값을 허용할거고 
 # 필수값으로 지정해줘야되기때문에 NOT NULL을 지정해줘야함(이 칸을 빈칸으로 두는 것을 허용할 수 없다라는 뜻임) 
 # 예약날짜도 필수값으로 지정해줘야되기 때문에 NOT NULL을 지정해줌
 # DEFAULT NOW() : 기본값을 현재 시간으로 지정해주겠다라는 뜻임 
 CREATE TABLE Reservation(
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    reservationDate DATE NOT NULL,
    roomNumber INT
 );
 
 SHOW TABLES;
 
 # 제약조건
 # 무결성 뜻 : 우리가 회원테이블이 있다고 치면 이 데이터를 관리함에 있어서 필수적으로 걸리는 조건이 있음
 # 예를 들면 주민등록번호가 있고 아이디가 있고 비밀번호가 있고 이메일이 있다면 
 # 아이디는 필수로 입력되어야되고 비밀번호도 필수로 입력되어야 하는데 이런 어떤 필수로 들어가야 되는 조건들을 무결성이라고 함
 # NOT NULL : 해당필드는 NULL 값을 저장할 수 없게 됨
 # UNIQUE : 해당 필드는 고유의 값을 가져야하기 때문에 그렇기 때문에 서로 다른 값을 가져야만 함(주민등록번호 같은거)
 # Primary KEy : 해당 필드가 Not NUL과 UNIQUE 제약조건의 특징을 모두 가지게 됨
 # Foreign Key : Foriegn Key가 a를 참조하고 있고 참조를 해주는 애가 참조를 하고 있는 애를 삭제를 하려고 할 적에 삭제를 할 수 없다라고 해줌 
 # 그리고 참조를 해주는 애를 지워도 참조를 하고 있는 애가 안 지워짐 
 # 이런 의미를 무결성이라고 한다고 함  
 
 # AUTO_INCREMENT : 게시물 작성할 때 Sequence(index) 1, 2, 3, 4 먹으면서 올라가야하는데 이 순차적으로 올라가는 숫자를 사용자가 입력하는게 아니라 이 뒤에 있는 값만 입력하면 AUTO_INCREMENT가 먹힌 애는 자동으로 1부터 자동으로 증가된 값을 달아줌 
 # AUTO_INCREMENT 키워드 다음에 대입연산자(=)를 사용하여 시작값을 변경할 수 있음
 
 
 # TABLE 수정
 # - 컬럼 추가 [ 테이블 수정에 컬럼 추가 ]
 # ALTER TABLE 테이블명 ADD 필드명 필드타입 제약조건;  : 어떤 테이블에 내용을 변경할 것이다 / 어떤 변경할 테이블 명? / 그리고 어떤 필드를 추가할거냐는 뜻
 # 처음에 시작할적에 작업할 때는 어떤 데이터베이스를 실행시킬건지 결정해야되서 그 데이터베이스 실행 구문에서 ctrl + Enter로 일단 실행해주고 
 # 그 다음 실행하고자 하는 구문을 작성하여 그 구문을 실행시켜야 함 
 # 그냥 다짜고짜 이 구문부터 실행하면 에러 뜸 
 ALTER TABLE Reservation ADD telNumber VARCHAR(20);
 
# - 컬럼삭제
# ALTER TABLE 테이블명 DROP 필드명; // 어떤 테이블에서 내용을 변경할거다 / 어떤 내용을 변경할거냐? 필드명을 삭제할것이다 / 하나 떨어뜨릴것이다 
# 그리고 나서 새로고침눌러서 테이블을 클릭해서 확인하면 해당 필드가 삭제된것을 확인할수 있음
ALTER TABLE Reservation DROP roomNumber;

# - 컬럼 수정 
# ALTER TABLE Reservation MODIFY COLUMN 필드명 필드타입 [제약조건];
ALTER TABLE Reservation MODIFY COLUMN reservationDate VARCHAR(20) NOT NULL;

# DROP TABLE(테이블자체를 날려버리는거임, 정의 자체도 날려버림, 테이블의 존재자체가 없어짐)과 TRUNCATE TABLE(데이터가 다 없어지고 다음에 데이터를 생성하면 ID가 1부터 시작해서 데이터가 넘어감 그니깐 테이블을 새로 생성한 그 상황 : CREAT TABLE한 순간으로 돌아가는 것과 같은 상황 / 테이블 자체가 날라가지만 정의 자체는 남아있음), DELETE FROM 테이블명(인덱스는 그대로 남아있음 그 전에 데이터가 100까지 있었는데 삭제를 했다면 데이터는 다 날라가지만 인덱스는 살아있어서 데이터는 아무런 데이터가 없는 상태인데 인덱스는 101부터 시작하는 상태임)의 차이 

# 테이블 삭제
# - DROP
# DROP TABLE 테이블명;
# DROP 삭제는 테이블존재를 삭제해버림
DROP TABLE Reservation; 
 
 # - TRUNCATE
 # TRUNCATE TABLE 테이블명;
 # 해당 테이블을 생성 직후의 상태로 되돌림
 INSERT INTO Reservation(name, reservationDate) VALUES('홍길동', now());
 SELECT * FROM Reservation;
 
 TRUNCATE TABLE Reservation;
 
 # - DELETE FROM 
 # DELETE FROM 테이블명; / 일단 이렇게 구문을 실행하면 에러가 뜸
 # 에러가 뜨면 EDIT - PREFERENCES - SQL EDITOR - OTHER - SAFE UPDATES 체크를 풀고 WORKBENCH를 껐다가 다시 켜서 다시 데이터베이스 실행구문 USE HOTEL을 실행시키고 아래 DELETE FROM 테이블명 구문을 실행시키고 이 테이블을 조회하는 구문인 SELECT * FROM 테이블명;을 실행시키면 데이터가 다 날라가있는걸 확인할 수 있음
 # 거기에서 데이터를 다시 입력하는 INSERT INTO RESERVATION(NAME, RESERVATIONdATE) VALUES('홍길동', NOW());를 실행시키면 레코드는 날아갔지만 인덱스는 살아있기 때문에 이후 인덱스부터 레코드가 쌓이는걸 확인할 수 있음
 # 이게 DELETE FROM 테이블명의 구문의 특성이자 정상적인 동작임
 # 얘는 단순히 레코드만 삭제함
 DELETE FROM Reservation;
 
 # 새로운 SQL만드는 방법은 왼쪽 상단메뉴에서 FILE 밑에 있는 SQL + 모양 아이콘을 클릭해서 새로운 SQL을 만들어주면 됨
 
 ### DML ###
 
 # - 데이터 삽입문 
 # INSERT INTO 테이블명(컬럼명1, 컬럼명2, ...) VALUES(데이터값1, 데이터값2, ...);
 # 혹은 INSERT INTO 테이블명 VALUES(데이터값1, 데이터값2, ...) ;
 # 각 컬럼에 매칭되는 값을 순서에 맞게 작성하여야 함 그래야 순서에 맞게 각 값들이 컬럼들에 저장이됨
 
 INSERT INTO Reservation(name, reservationDate, roomNumber) VALUES('김철수', '2023-01-17', 3134);
 #SELECT * FROM Reservation;
 INSERT INTO Reservation VALUES(4, '이영희', '2022-10-11', 908); # AUTO_INCREMENT로 지정해줬지만 에러가 뜨는 이유는 더 이상 부여할 인덱스가 없다는 의미에서 에러가 나는거라고하는데 그러면 어떻게 처리해야되지? 
																# 칼럼없이 바로 값들을 넣어주려할 때는 모든 값들을 다 넣어줘야함 (그러니까 초기 칼럼 생성할 때 id 칼럼도 생성했으니 id칼럼에 대한 값도 넣어줘야한다고함 그러면 입력한 인덱스번호에 해당 데이터들이 생성됨)

INSERT INTO Reservation(reservationDate, roomNumber) VALUES('1999-02-10', 1004); # 이렇게 하면 에러가 뜨는데 에러가 뜨는 이유는 빠진 칼럼값들이 필수값으로 제약조건을 걸어두었기 때문에 빠질 수 없는 칼럼들이라 꼭 입력해야되는 칼럼들이라서 무결성제약조건에 걸려서 에러가뜨는거임
																				# NOT NULL 조건으로 걸린 name 컬럼 값을 지정하지 않았기 때문에 삽입 에러가 발생
# 이제 이 구문들을 자바이클립스에서 사용할건데 자바이클립스에서 이 구문들을 실행시킬 때 주의해야될 점은 실행시키기 전에 NOT NULL로 지정되어 있는 애들을 찾아서 NULL인지 아닌지에 대한 검증을 해줘야함(검증코드를 따로 작성해줘야함)
SELECT * FROM Reservation;


# UPDATE구문 
# - 데이터 수정 
# UPDATE 테이블명 SET 컬럼1 = 값1, ....[WHERE 컬럼 = 값]; // 컬럼1은 값1으로 바꿔라는 뜻
# WHERE : 조건을 지정해주는 키워드, 조건에 해당하는 대한 레코드에만 명령을 실행함

# IS NULL : WHERE 조건에서 해당 컬럼이 NULL인 레코드를 고를 때 사용
UPDATE Reservation SET roomNumber = 502 WHERE roomNumber IS NULL; # 해당 필드가 NULL이면 바꿔라는 뜻임 
																	# Reservation테이블에서 해당 이름(roomNumber)으로 된 컬럼 중에 NULL 값이 있는 애를 찾아서 그 NULL 값을 502라는 값으로 채워줘라는 뜻
# 또는
UPDATE Reservation SET reservationDate = '2023-01-30' WHERE name = '김철수';

UPDATE Reservation SET roomNumber = 1001; # 조건을 걸어주지 않으면 모든 데이터에 대해서 작동을 함 // 조건을 걸어주지 않으면 Reservation 테이블의 모든 roomNumber 컬럼값이 1001로 바뀜


# 데이터 삭제 
# - DELETE 
# DELETE FROM 테이블명 [WHERE 칼럼 = 값] // 해당 테이블에서 삭제해라 / 그 테이블에서 어디를? 아이디가 7인 애를

DELETE FROM Reservation WHERE id = 7; # 실행해보면 7번이 없어진거를 확인할 수 있음

# 데이터를 넣는 코드 아이디는 오토인크리먼트되어있기 때문에 아이디는 빼고 적어주면 됨 
# insert는 레코드값 삽입 구문이라고 생각해도 됨 
INSERT INTO Reservation(name, reservationDate, roomNumber) VALUES('고수', '2023-03-02', 904);
INSERT INTO Reservation(name, reservationDate) Values('한효주', '2023-06-27');

# 전부다 쓸 때는 아무것도 안쓰고 바로 VALUES간다고 함
INSERT INTO Reservation VALUES(20, '고길동', '2023-03-02', 3414);

# 데이터검색
# - SELECT
# 지정한 테이블에서 선택한 컬럼을 검색할 때 사용함
# 문법 : SELECT 칼럼명1 FROM 테이블명 [WHERE 조건]; // 대괄호 안에 where 조건은 써도 되고 안 써도 된다는 표현임 // 필요하면 써야함
# 여러 개 할 때는 : SELECT 칼럼명1, 칼럼명2, .... FROM 테이블명 [WHERE 조건];

# 이름만 검색하는 sql문
SELECT name FROM Reservation;

# 이름과 룸넘버를 검색하는 sql문
SELECT name, roomNumber From Reservation;

# 이름과 룸넘버를 검색해달라(칼럼이 name이고 roomNumber를 보여달라 / 그 날짜로 예약한 사람의 이름과 방번호를 알려달라/ 선택해서 보여달라 어디서? 예약날짜가 2023-03-02인 애를 찾아서) / 뭐를 찾아서? 예약날짜가 2023-03-02인 사람을 찾아서
SELECT name, roomNumber From Reservation WHERE reservationDate = '2023-03-02'; 

# SELECT * 으로 모든 컬럼을 선택할 수 있음
SELECT * FROM Reservation;
SELECT * FROM Reservation WHERE name = '홍길동';

# Java에서는 =이 대입연산자였고 비교연산자 중 같다 의미를 가진 연산자는 == 이거나 아니면 .equals() 메서드인데 


# WHERE문 뒤 비교연산자 및 논리연산자로 조건을 추가하여 검색할 수 있음
# Java에서는 비교연산을 추가할 때 비교연산자들을 적어야했지만 SQL에서는 그냥 영어 그대로 적으면 된다고 함(AND, OR 등) 
SELECT * FROM Reservation WHERE name = '홍길동' AND reservationDate < '2023-04-01'; # 이렇게 하면 이름이 홍길동인 애만 뽑음 // 왜냐면 아직은 동명이인이 없기 때문임
SELECT * FROM Reservation WHERE name = '홍길동' OR reservationDate < '2023-04-01'; # 이러면 둘 중 하나라도 성립하면 그에 성립하는 애들은 다 나옴(일단 아이디가 홍길동인애랑 예약날짜가 똑같은 애들은 무조건 나오고 나머지는 날짜를 비교연산해서 그 날짜 이하인 애들은 다 나옴)
																					# DB 안에서는 날짜를 String 타입으로 입력받아 비교연산 할 때는 DB는 Java와 다르게 날짜를 진짜 날짜로 변환해서 비교연산해주는 기능이 있어서 그 날짜가 비교날짜보다 큰지 작은지 비교 가능하다고 함
SELECT * FROM Reservation WHERE roomNumber IS NOT NULL; # NULL인 애만 제외하고 보여달라
SELECT * FROM Reservation WHERE roomNumber is NUll; # NULL인 애만 보여달라

# 이름에 길동이라는 말이 포함된 애를 뽑고 싶다면
SELECT * FROM Reservation WHERE name LIKE '%길동'; # 패턴을 입력하는 구문인데 여기서 패턴이란 '%길동'에서 %를 말함 (그리고 정확히 해석하면 뒤에 이름이 길동인애를 보여달라는 말임)
													# LIKE : 문자열 타입인 칼럼에만 쓸 수 있음
                                                    # LIKE를 쓸 적에 길동% 이라고 적으면 앞에서부터 길동이라고 시작하는 애를 말하는거고, %길동 하면 뒤에서부터 길동인 애를 찾아라는 말임                                
SELECT * FROM Reservation WHERE name LIKE '%길동' AND roomNumber IS NOT NULL;

# DISTINCT : 특정 칼럼의 중복제거 
SELECT DISTINCT name, roomNumber FROM Reservation; # SELECT DISTINCT가 하나의 구문이고 이 검색결과에서 중복을 제거한다는 뜻임 그래서 만약에 한효주에 방번호가 없는 데이터가 2개 있다면 중복데이터를 지우고 하나만 남겨둠


# ORDER BY : 뒤어 어떤 칼럼을 기준으로 정렬을 할 것이냐는 의미임
# ORDER BY 컬럼명 [정렬방법] 
# ASC : 오름차순
# DESC : 내림차순 
# ORDER BY 자체는 기본값이 오름차순이기 때문에 굳이 ASC를 안 붙여도 오름차순이 됨

# 특정 컬럼을 기준으로 정렬 : ORDER BY 
SELECT * FROM Reservation ORDER BY reservationDate; # 날짜가 오름차순으로 정렬되어서 나옴
SELECT * FROM Reservation ORDER BY reservationDate DESC; # 이렇게 하면 날짜가 내림차순으로 정렬되어서 나옴

# 여러 컬럼을 기준으로 정렬을 하겠다하면 아래처럼 하면 됨 
SELECT * FROM Reservation ORDER BY reservationDate DESC, roomNumber DESC; # 이렇게 하면 예약날짜와 방번호가 내림차순된 데이터로 출력됨
SELECT * FROM Reservation ORDER BY roomNumber DESC, reservationDate DESC; # 이 코드는 위 코드와 정렬 순서가 다름  
																			# ORDERBY 뒤에 첫번째로 오는 컬럼이 우선순위가 됨
																			# 그러니까 roomNumber를 먼저 정렬을 하고 그 정렬된 roomNumber기준으로 reservationDate가 정렬된 순서임	
                                                                            
# AS : 별칭 사용
SELECT name AS eman, roomNumber FROM Reservation; # 결과의 필드명을 잘보면 name이 eman으로 바껴서 나옴 이렇게 AS를 써서 칼럼명을 바꿔줄 수 있음
												  # 나중에 테이블들을 Join했을 때 쓰는데, A라는 테이블과 B라는 테이블이 있을 때 B테이블의 주키가 A라는 테이블에 똑같은 값으로 있는 필드(A의 주키)와 연결되어서 나중에 출력하려고 할 때 두 클래스 중 하나의 값만 가져와서 출력하는데 		
SELECT name, roomNumber FROM Reservation AS R;     # 이렇게 테이블이름도 바꿔줄수있는데 테이블이름 바꾼거는 달라진게 눈에 확연히 보이지 않은게 보일만큼 별반차이가 없는 걸 알 수 있음                                                                        


# MySQL의 데이터타입중에 문자열 타입인 CHAR 예제
# 고정길이 문자열 / 길이로 지정할 수 있는 값의 범위 0 ~ 255임
ALTER TABLE Reservation ADD note CHAR(4);

# DESCRIBE 테이블명; : 테이블의 정보를 볼 수 있음 
DESCRIBE Reservation;
 
SELECT note FROM Reservation WHERE name = '노트';
INSERT INTO Reservation(name, reservationDate, note) VALUES('노트', now(), ''); 																