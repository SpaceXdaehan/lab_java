/* 오라클 함수(function)
    1. 단일 행 함수:
       행(row)이 하나씩 함수의 argument로 전달되고, 행 마다 하나씩 결과가 리턴되는 함수.
    2. 다중 행 함수(그룹 함수):
       여러 개의 행이 함수의 argument로 전달되고, 하나의 결과가 리턴되는 함수.
       (예) 통계 관련 예: count, sum, avg, max, min, variance(분산), stddev(표준편차), ...
    (주의) 단일 행 함수와 그룹 함수는 동시에 select에서 사용할 수 없음!
*/

-- 단일 행 함수의 예 - 문자열을 소문자로 바꾸기.
select ename, lower(ename)
from emp;

-- to_char(): 날짜 타입 데이터를 원하는 문자열 포맷으로 출력.
select hiredate, to_char(hiredate, 'YYYY-MM-DD')
from emp;

-- nvl(컬럼, val): 컬럼이 null이면 val을 리턴하고, null이 아니면 원래 값을 리턴.
-- nvl2(컬럼, val1, val2): 컬럼이 null이 아니면 val1을 리턴하고, null이면 val2를 리턴.
select comm, nvl(comm, -1), nvl2(comm, comm, -1)
from emp;

-- 다중행 함수
-- count(컬럼): null이 아닌 행의 개수를 리턴.
select count(empno), count(mgr), count(comm)
from emp;

-- 테이블의 행(row)의 개수를 리턴.
select count(*) from emp;

-- 통계 함수: 합계, 평균, 최댓값, 최솟값, 분산, 표준편차
select sum(sal), avg(sal), max(sal), min(sal), variance(sal), stddev(sal)
from emp;

-- select nvl(sal, 0), sum(sal) from emp;
-- 단일 행 함수와 다중 행 함수는 함께 사용할 수 없음!

-- 그룹 별 쿼리:
-- select ... from ... [where ...] group by ... [having ...] order by ...;
-- 부서별 급여 평균
select deptno, avg(sal)
from emp
group by deptno
order by deptno;

-- 모든 문제에서 소수점은 반올림해서 소수점이하 2자리까리만 표시하세요.
-- Ex1. 부서별 급여 평균, 표준편차를 부서번호 오름차순으로 출력.
select deptno, round(avg(sal), 2) as "AVG_SAL", round(stddev(sal), 2) as "STD_SAL"
from emp
group by deptno
order by deptno;

-- Ex2. 직무별 직무, 직원수, 급여 최댓값, 최솟값, 평균을 직무 오름차순으로 출력.
select job, count(job) as "COUNT", 
    max(sal) as "MAX_SAL", min(sal) as "MIN_SAL", 
    round(avg(sal), 2) as "AVG_SAL"
from emp
group by job
order by job;

-- Ex3. 부서별, 직무별 부서번호, 직무, 직원수, 급여 평균을 검색
--      정렬 순서: (1) 부서번호 (2) 직무
select deptno, job, count(*) as "COUNT", round(avg(sal), 2) as "AVG_SAL"
from emp
group by deptno, job
order by deptno, job;

-- Ex4. 입사연도별 사원수를 검색. (힌트) to_char(날짜, 포맷) 이용.
select to_char(hiredate, 'YYYY') as "YEAR", count(*) as "COUNT"
from emp
group by to_char(hiredate, 'YYYY')
order by YEAR;


