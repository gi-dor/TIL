
NON EQUI JOIN

�� ����� ���� �޿��� �޿������ ���
�̷���� ����� �޿��� �޿� ����� ��ġ���� �ʾƼ� =�����ڷ� Join �Ҽ� ��� 


���� ���̺� �� �޿����̺��� JOIN �ؼ� ����� �̸��� �޿�,�޿������ ���
select *from s_Emp;
select * from salgrade;

select e.name , e.salary , g.grade
from s_emp e , salgrade g
where salary between losal and hisal
;

--OUTER JOIN 
--(+) �����ڸ� ���, ��ġ�� JOIN�� �����Ͱ� ������ �ʿ� ��ġ��
--where ������ �񱳿����� �������� ���� , ���� ��� ���ʿ� ����
--OUTER JOIN���� IN �̳� OR ��� �Ҽ� ����
--
--����� �̸� , ��� , ����� ������ ��Ÿ���ÿ�
--���� ����� ����� ������� ��� ���� �̸��� ��Ÿ���� 
--��������� ������������ ����

select * from s_emp;
select * from s_customer;

select e.name ��� , e.id ��� , c.name ���̸�
from s_emp e , s_customer c
where e.id (+)= c.sales_rep_id
order by 2 
;

-- set ������ ����
select name , dept_id , title
from s_Emp
where dept_id =110
union
select name , dept_id , title
from s_emp
where dept_id = 113
order by 1
;

select name , title , dept_id 
from s_emp
where dept_id = ( select dept_id
                    from s_emp
                    where name = '������' );

--
select dept_id 
from s_emp
where name = '������'
;

----------------------

--multi row subquery 
--main query �� ���޵Ǵ� ���� �������ΰ��
------------------------------------------------
select * from s_dept;
select * from s_region;

select id 
from s_dept
where region_id = 3;

select name, dept_id
from s_emp
where dept_id in (select id 
                  from s_dept 
                  where region_id = 3);