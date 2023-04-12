-- 제약조건(constraint):
-- 테이블에 데이터들을 insert할 때, 조건을 만족하는 값들만 insert될 수 있도록 만들어 주는 기능.
-- 테이블을 생성(create table)할 때 제약조건을 정의.
-- 테이블을 변경(alter table)할 때 제약조건을 추가/변경/삭제.
-- 종류: primary key, not null, unique, check, foreign key
-- 테이블 생성할 때 제약조건 이름을 설정하지 않으면, 시스템에서 자동으로 이름을 부여.
--   (예) SYS_C008813 -> insert할 때 제약조건에 위배가 되면 에러 메시지에서 볼 수 있음.

-- 테이블을 생성하면서 제약 조건 이름 만들기 1: 컬럼 정의에서.
create table ex2 (
    id      number(4)
            constraint ex2_id_pk primary key, -- constraint 이름 내용
    name    varchar2(100)
            constraint ex2_name_nn not null,
    email   varchar2(100)
            constraint ex2_email_uq unique,
    gender  varchar2(1)
            constraint ex2_gender_ck check(gender in ('M', 'F'))
);

-- 테이블을 생성하면서 제약조건 이름 만들기 2: 컬럼 정의와 제약조건 정의를 따로.
create table ex3 (
    -- 컬럼 정의:
    id      number(4),
    name    varchar2(100),
    email   varchar2(100),
    gender  varchar2(1),
    -- 제약 조건 정의: constraint 이름 내용 (컬럼)
    constraint ex3_id_pk primary key (id),
    constraint ex3_name_nn check (name is not null), -- not null (컬럼)은 안됨!
    constraint ex3_email_uq unique (email),
    constraint ex3_gender_ck check (gender in ('F', 'M'))
);

-- foreign key(외래키): 다른 테이블의 primary key(고유키)를 참조하는 제약조건.
-- 데이터를 insert할 때 다른 테이블의 PK에 없는 값은 insert되지 않도록 하기 위해서.

-- ex_dept 테이블에서 deptid 컬럼: PK
-- ex_emp 테이블의 deptid 컬럼 ex_dept.detpid 컬럼을 참조 -> FK
create table ex_dept (
    deptid      number(2)
                constraint dept_deptid_pk primary key,
    dname       varchar2(100)
                constraint dept_dname_nn not null
);

create table ex_emp1 (
    empid   number(4)
            constraint emp1_empid_pk primary key,
    ename   varchar2(100)
            constraint emp1_ename_nn not null,
    deptid  number(2)
            -- [constraint 이름] references 테이블 (PK인 컬럼)
            constraint emp1_deptid_fk references ex_dept (deptid)
);

create table ex_emp2 (
    empid   number(4),
    ename   varchar2(100),
    deptid  number(2),
    constraint emp2_empid_pk primary key (empid),
    constraint emp2_ename_nn check (ename is not null),
    -- constraint 이름 foreign key (컬럼) references 테이블 (PK 컬럼)
    constraint emp2_deptid_fk foreign key (deptid) references ex_dept (deptid)
);









