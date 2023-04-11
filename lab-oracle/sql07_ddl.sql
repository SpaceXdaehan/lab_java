/*
SQL 종류:
1. DQL(Data Query Language): 데이터 질의 언어. select 문장.
2. DML(Data Manipulation Language): 데이터 조작 언어.
   - insert, update, delete.
   - 테이블에 행(row)을 추가, 변경, 삭제하는 SQL 문장.
3. DDL(Data Definition Language): 데이터 정의 언언.
   - create, alter, truncate, drop.
   - 테이블, 사용자 계정을 생성, 변경, 삭제하는 SQL 문장.
4. TCL(Transaction Control Language): 트랜잭션 관리(제어) 문장.
   - commit: 데이터베이스의 변경 내용을 영구 저장.
   - rollback: 직전의 commit 상태로 되돌리기.
*/

/*
테이블 생성:
create table 테이블이름 (
    컬럼이름  데이터타입  [제약조건  기본값],
    ...
);

데이터 타입의 이름(키워드)은 데이터베이스 종류에 따라서 다름!
Oracle의 데이터 타입: number, varchar2, date, timestamp, clob, blob, ...
*/

/*
테이블 이름: students
컬럼:
  - stuno: 학생 아이디. 학번. 숫자(6자리 정수).
  - stuname: 학생 이름. 문자열(10글자).
  - birthday: 학생 생일. 날짜.
*/
create table students (
    stuno       number(6),
    stuname     varchar2(10 char),
    birthday    date
);
