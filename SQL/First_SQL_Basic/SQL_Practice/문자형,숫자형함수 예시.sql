--�� �������� ��뿹 , ������ �켱����
select name , salary , dept_id
from s_emp
where (dept_id =110 or dept_id =113)
and salary >= 2000
;

--�켱���� 
--1. ��� �񱳿����� 
--2. and
--3. or
-------------------------------------------------------------------------------
-- ������ �Լ�
SELECT upper ('oracle SERVER') 
from dual;

select lower ('ORACLE server')
from dual;

select initcap ('Oracle Server')
from dual;

select concat('Oracle','SERver')
from dual;

select substr('��⵵ �����ֽ�' , 5 , 2)
from dual;

select length ('�ѱ⼱')
from dual;

select lpad ('�ѱ⼱' , 10 ,'+')
from dual;

select rpad ('ŷ���⼱',10,'*')
from dual;

select ltrim ('XXABAX','X')
from dual;

select translate ('AABBA' , 'B' ,'C')
from dual;

select replace ('jack and jue' ,'j' , 'bl')
from dual;



---------------------------------------------------------------
-- ������ �Լ�


select round (35.735,2)
from dual;

select mod(7,2) 
from dual;

select power (3,2)
from dual;

select sign(-15)
from dual;

select chr(65)
from dual;