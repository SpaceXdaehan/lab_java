/*
DML(Data Manipulation Language): 데이터 조작 언어. insert, update, delete. [select]
- insert into TABLE [(COLUMN, ... )] values (값, ...);
- insert into TABLE1 
  select COLUMN, ... from TABLE2 [where ...];
- update TABLE set COLUMN = 값, ... [where 조건식];
- delete from TABLE [where 조건식];
*/

-- create table ... as select 구문: 테이블의 모양(컬럼 이름, 데이터 타입)과 데이터를 복사.
create table my_emp
as select * from emp;

select * from my_emp;

-- 테이블의 모양만 복사, 데이터는 복사하지 않는 경우:
create table my_emp2
as select * from emp where empno = -1;

select * from my_emp2;







