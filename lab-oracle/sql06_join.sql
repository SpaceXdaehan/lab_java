/* Join: 2개 이상의 테이블에서 검색하는 것.

join 문법:
  (1) ANSI 표준 문법:
      SELECT 컬럼, ...
      FROM 테이블1
            join 종류 테이블2 ON join 조건;
  (2) Oracle 문법:
      SELECT 컬럼, ...
      FROM 테이블1, 테이블2, ...
      WHERE join 조건;
join 종류:
  (1) inner join
  (2) outer join
      - left outer join
      - right outer join
      - full outer join
*/

-- inner join과 outer join의 차이점을 보기 위해서.
insert into emp (empno, ename, deptno)
values (1004, '오쌤', 50);

commit;

-- 사번, 이름, 부서번호, 부서이름을 검색. inner join.
select e.empno, e.ename, e.deptno, d.dname
from emp e
    inner join dept d on e.deptno = d.deptno;

select e.empno, e.ename, e.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno;

-- left outer join
select e.empno, e.ename, e.deptno, d.dname
from emp e
    left outer join dept d on e.deptno = d.deptno;

select e.empno, e.ename, e.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno(+);

-- right outer join
select e.empno, e.ename, d.deptno, d.dname
from emp e
    right outer join dept d on e.deptno = d.deptno;

select e.empno, e.ename, d.deptno, d.dname
from emp e, dept d
where e.deptno(+) = d.deptno;

-- full outer join
select e.empno, e.ename, e.deptno, d.deptno, d.dname
from emp e
    full outer join dept d on e.deptno = d.deptno;

-- Oracle에서는 full outer join 문법을 제공하지 않음.
-- left outer join 결과와 right outer join 결과를 합집합(union)하면 됨.
select e.empno, e.ename, e.deptno, d.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno(+) -- left outer join
union                        -- 합집합
select e.empno, e.ename, e.deptno, d.deptno, d.dname
from emp e, dept d
where e.deptno(+) = d.deptno; -- right outer join

-- inner join에서 inner는 생략 가능. inner join = join
-- left/right/full outer join에서 outer 생략가능함. left outer join = left join

