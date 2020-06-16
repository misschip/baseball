#### JSP와 Ajax를 활용하여 데이터베이스 정보 보여주기 (야구 선수 정보)

## 테이블 생성
````sql
create table baseball (
    id number primary key,
    name varchar2(15) not null,
    num number not null,
    position varchar2(30) not null,
    team varchar(30) not null
);
````

## 테이블 데이터 입력
````sql
INSERT INTO baseball (id,name,num,position,team) VALUES (1,'강동호',51,'투수','롯데');
INSERT INTO baseball (id,name,num,position,team) VALUES (2,'강로한',54,'외야수','롯데');
INSERT INTO baseball (id,name,num,position,team) VALUES (3,'김민수',5,'내야수','롯데');
INSERT INTO baseball (id,name,num,position,team) VALUES (4,'김준태',44,'포수','롯데');

INSERT INTO baseball (id,name,num,position,team) VALUES (5,'가뇽',40,'투수','기아');
INSERT INTO baseball (id,name,num,position,team) VALUES (6,'김민식',24,'포수','기아');
INSERT INTO baseball (id,name,num,position,team) VALUES (7,'김선빈',3,'내야수','기아');
INSERT INTO baseball (id,name,num,position,team) VALUES (8,'나지완',29,'외야수','기아');

INSERT INTO baseball (id,name,num,position,team) VALUES (9,'길지석',93,'투수','sk');
INSERT INTO baseball (id,name,num,position,team) VALUES (10,'김태우',8,'포수','sk');
INSERT INTO baseball (id,name,num,position,team) VALUES (11,'김교람',98,'내야수','sk');
INSERT INTO baseball (id,name,num,position,team) VALUES (12,'강지광',99,'외야수','sk');

INSERT INTO baseball (id,name,num,position,team) VALUES (13,'유희관',29,'투수','두산');
INSERT INTO baseball (id,name,num,position,team) VALUES (14,'박세혁',10,'포수','두산');
INSERT INTO baseball (id,name,num,position,team) VALUES (15,'허경민',13,'내야수','두산');
INSERT INTO baseball (id,name,num,position,team) VALUES (16,'정수빈',31,'외야수','두산');

INSERT INTO baseball (id,name,num,position,team) VALUES (17,'윤성환',1,'투수','삼성');
INSERT INTO baseball (id,name,num,position,team) VALUES (18,'강민호',47,'포수','삼성');
INSERT INTO baseball (id,name,num,position,team) VALUES (19,'이학주',53,'내야수','삼성');
INSERT INTO baseball (id,name,num,position,team) VALUES (20,'최선호',59,'외야수','삼성');

INSERT INTO baseball (id,name,num,position,team) VALUES (21,'김민성',55,'투수','nc');
INSERT INTO baseball (id,name,num,position,team) VALUES (22,'김형준',22,'포수','nc');
INSERT INTO baseball (id,name,num,position,team) VALUES (23,'박준영',13,'내야수','nc');
INSERT INTO baseball (id,name,num,position,team) VALUES (24,'박시원',96,'외야수','nc');

INSERT INTO baseball (id,name,num,position,team) VALUES (25,'고우석',19,'투수','lg');
INSERT INTO baseball (id,name,num,position,team) VALUES (26,'김형준',22,'포수','lg');
INSERT INTO baseball (id,name,num,position,team) VALUES (27,'김용의',5,'내야수','lg');
INSERT INTO baseball (id,name,num,position,team) VALUES (28,'김현수',22,'외야수','lg');

INSERT INTO baseball (id,name,num,position,team) VALUES (29,'강재민',62,'투수','한화');
INSERT INTO baseball (id,name,num,position,team) VALUES (30,'깅종민',47,'포수','한화');
INSERT INTO baseball (id,name,num,position,team) VALUES (31,'김현민',66,'내야수','한화');
INSERT INTO baseball (id,name,num,position,team) VALUES (32,'김광명',114,'외야수','한화');

INSERT INTO baseball (id,name,num,position,team) VALUES (33,'김태훈',17,'투수','키움');
INSERT INTO baseball (id,name,num,position,team) VALUES (34,'배현호',2,'포수','키움');
INSERT INTO baseball (id,name,num,position,team) VALUES (35,'김혜성',3,'내야수','키움');
INSERT INTO baseball (id,name,num,position,team) VALUES (36,'송유현',53,'외야수','키움');

INSERT INTO baseball (id,name,num,position,team) VALUES (37,'강장산',57,'투수','kt');
INSERT INTO baseball (id,name,num,position,team) VALUES (38,'고성민',52,'포수','kt');
INSERT INTO baseball (id,name,num,position,team) VALUES (39,'김영환',9,'내야수','kt');
INSERT INTO baseball (id,name,num,position,team) VALUES (40,'배정대',27,'외야수','kt');
````