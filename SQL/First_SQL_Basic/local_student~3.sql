--1. ��å�� ����� ������ ��ȸ �Ͻÿ�  �����ȸ
select *  -- ��系�� ��ȸ
from s_emp
where title = '���'
;

select name, title -- �̸��� ���޸� ��ȸ
from s_emp 
where title = '���';

-- ������ 3000�� ������ ��ȸ �Ͻÿ� 
select *
from s_emp
where salary = 3000
;
-- �μ��� 113�� ���� �̸��� �μ�, ��å�� ��ȸ
select name , dept_id ,title
from s_emp
where dept_id = 113;

-- ��å�� ������ǥ�̻� �̰�  ������ 4000�� ������ ��ȸ
select* 
from s_emp
where title = '������ǥ�̻�' and salary = 4000
;
-- ��å�� ������ǥ�̻� , ������ 4000 �� ����� �̸��� �Ի糯¥, ��å, ���� ��ȸ 
select name , start_date , title , salary
from s_emp
where title = '������ǥ�̻�' and salary = 4000
;
--select* 
--from s_emp 
--where salary && title  = 4000 && '������ǥ�̻�';

-- ��å�� ����̰� �μ��� 100�� ������ ��ȸ
select *  
from s_emp
where title = '���' and dept_id = 110
;
-- �̸��� �μ� ��ȣ ���� ��ȸ
-- �μ��� 113�̰� ������ 2300 �λ��
select name , dept_id , salary
from s_emp 
where dept_id = 113 and salary = 2300
;

-- ������ 2000 ~ 3000 ����� ������������ ��ȸ
select * 
from s_emp
where salary between 2000 and 3000
order by salary desc
;

-- ������ 2000 ~ 4000�� ��� �� ��å�� ������ȸ
select title, salary
from s_emp 
where salary between 2000 and 4000 
group by title, salary
;

-- ������ 300 ~1500 �� ����� ��å�� ����ε�
-- ��å�� �̸� ������ ��ȸ
select title, name, salary
from s_emp
where salary between 300 and 1500 and title = '���'
;
-- ������� ��ȸ
select * 
from s_emp
where salary between 500 and 1000 and title = '���'
;


select *
from s_emp 
where title = '%����%'
;
