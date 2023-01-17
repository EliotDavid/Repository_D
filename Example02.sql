# BOARD 데이터베이스를 생성함
# DB 자체는 우리 PROJECT와 동일 선상에 있고
# 테이블이 클래스와 동일선상에 있음
# 칼럼들은 멤버변수와 동일함 
CREATE DATABASE PEED;

# 이 데이터베이스를 실행하는 SQL구문 실행
USE PEED;

# 그 데이터베이스안에 USER 라는 이름의 테이블을 생성
# 그 다음 우리 자바 프로젝트 안에 있는 멤버변수들 그대로 이 테이블의 칼럼에도 똑같이 써줌
# 기본키를 설정할 칼럼을 써줄 땐 PRIMARY KEY 제약조건도 넣어줌 
# 기본키의 제약조건은 NOT NULL과 UNIQUE KEY의 합의 결과임
# 기본키는 자동아이디(순번)증가부여기능이 들어가있어야함
# 테이블생성과 동시에 칼럼들 생성 구문
CREATE TABLE User (
	id INT PRIMARY KEY AUTO_INCREMENT, # 아이디 / 정수형태 / 기본키
	password VARCHAR(30) NOT NULL ,	# 비밀번호는 필수값이기때문에 NOT NULL 제약조건을 적어줌 / 그리고 사람마다 서로 다른 고유의 비밀번호를 가져야되나? 아님 똑같은 비밀번호를 가질수 있어서 UNIQUE KEY를 안 넣어줘도됨
	name VARCHAR(50) NOT NULL,  # 이름 : 길이 50의 가변문자열 / 필수값 
	telNumber VARCHAR(15) NOT NULL UNIQUE # 가변길이가 15인 전화번호 칼럼	/ 필수값 / 중복 불가능
);

# INSERT INTO User(id, password, name, telNumber) Values(100, angel1004, '임꺽정', '01012341234');
 
 # 게시물 Board라는 테이블을 생성할거임

 # 게시물 번호 (boardNumber)가 존재하고 정수형태로 관리 및 자동증가로 관리,
 # 게시물 번호로 각 데이터를 구분
 # 게시물 제목(boardTitle)이 존재하고 길이 200의 가변 문자열 및 필수 값으로 관리
 # 게시물 내용(boardContents)이 존재하고 길이의 제한이 없는 문자열 및 필수 값으로 관리
 # 게시물 작성일(boardDate)이 존재하고 날짜 타입 및 필수값으로 관리
 # 게시물 작성자(boardWriter)이 존재하고 정수형태 및 필수값으로 관리
 # 게시물 작성자 같은 경우에는 User테이블의 아이디를 참조해야 된다고 함(참조할 떄는 PK로 지정되어있는애로 꼭 지정해줘야 된다고 함)
 
 # 만약에 주소 경우에는 길이가 얼마나 될지 몰라서 아예 255로 잡아두는 경우도 있다고함
 
 CREATE TABLE Board(
	boardNumber INT AUTO_INCREMENT PRIMARY KEY,
    boardTitle VARCHAR(200) NOT NULL, # VARCHAR() 데이터타입은 가변길이 200바이트 이상은 못적는다고 함
    boardContents TEXT NOT NULL, # 길이제한이 없는 가변의 길이를 가진 데이터타입은 TEXT로 적는다고함
    boardDate DATE NOT NULL, # 날짜타입은 DATE 
    boardWriter INT NOT NULL # 얘는 User테이블의 Id를 참조한다고 함 
);

SELECT * FROM User;
# INSERT INTO User(id, password, name, telNumber) Values(100, angel1004, '임꺽정', '01012341234');
SELECT * FROM Board;


# User 레코드를 생성
# 아이디는 자동값을 그대로 사용하고 (AUTO_INCREMENT값을 그대로사용한다는 말이기떄문에 id는 빼고 넣으면됨)
# 비밀번호는 'P!ssw0rd', 이름 '고길동', 전화번호는 '010-4488-9944'인 데이터를 생성



# -- 회원가입 할 때 사용 -- 
INSERT INTO User(password, name, telNumber) Values('P!ssw0rd', '고길동', '010-4488-9944');

# -- 각종 회원정보 수정 할때 사용 -- 
# 패스워드를 기본값으로 줬다고 쳤을 때 User 테이블에서 이름이 고길동인 레코드의 비밀번호를 'qwer1234!!'로 수정
UPDATE User SET password = 'qwer1234!!' WHERE name = '고길동'; # User 테이블에서 User 테이블이 가지고 있는 레코드 중 이름이 고길동인 애를 찾아서 비밀번호를 qwer1234!!로 바꿔라


# User 테이블에서 id가 1인 레코드를 삭제
DELETE FROM User WHERE id = 1; # User 테이블에서 삭제하겠다 / 어디서 뭐를 찾아서 ? id가 1인 애를 찾아서   

