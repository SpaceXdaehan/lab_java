-- Alt+F10: 새 워크시트(sql 스크립트 파일) 만들기.
-- select 컬럼 이름, ... from 테이블 이름;
-- emp: 사원 테이블, dept: 부서 테이블
-- 사원 테이블에서 사번(empno), 사원 이름(ename)을 검색.
select empno, ename from emp;

-- 부서 테이블에서 모든 컬럼을 검색.
select deptno, dname, loc from dept;
select * from dept; -- 테이블에서 컬럼들이 만들어진 순서대로 결과가 출력됨.
select dname, loc, deptno from dept; -- select하는 컬럼 순서대로 출력됨.

-- 컬럼 이름에 별명(alias) 주기.
-- as "별명"에서는 큰따옴표("")를 사용함!
select deptno as "부서 번호", dname as "부서 이름"
from dept;

-- 별명은 원하는 컬럼에만 사용할 수도 있음.
select deptno, dname as "부서 이름"
from dept;

-- 연결 연산자(||): 2개 이상의 컬럼을 합쳐서 하나의 컬럼으로 출력.
-- '부서번호-부서이름' 형식의 문자열을 '부서 정보'라는 컬럼으로 출력.
-- SQL에서 문자열은 작은따옴표('')를 사용함!
-- 큰따옴표("")는 as 별명 구문에서만 사용함!
select deptno || '-' || dname as "부서 정보"
from dept;

-- 부서 테이블의 내용을 검색해서 '... 부서는 ...에 있습니다.' 형식으로 출력.
select dname || ' 부서는 ' || loc || '에 있습니다.' as "부서 위치"
from dept;

