--EQUIJOIN
--selcet ���̺��.Į���� , ���̺��.Į���� ...
--from ���̺�1, ���̺� 2
--where ���̺�1.�÷�1 = ���̺�2.�÷�2;
--------------------------------------------------------------------------------
--���̺�1.�÷�1 = ���̺�2.�÷�2  �� ���̺��� �������� ���� �����Ű��
--Į������ ����
--------------------------------------------------------------------------------

select * from s_emp;
select * from s_dept;
select * from s_region; 

-- ���� ������ �ٹ��ϴ� ����� ���� �� ����� �̸��� �ٹ��ϴ� �μ����� ��Ÿ���ÿ�
-- �������� (region_id = 1) , ��� (title =���) 
-- �̸� (name ) �μ��� (name)
-- s_emp.name , s_dept.name
select s_emp.name , s_dept.name
from s_emp , s_dept
where title = '���'
and region_id = 1
and s_emp.dept_id =  s_dept.id
;

-------------------------------------------------------------------------------

-- ����� �̸��� �μ� �μ����� ��Ÿ���ÿ�
-- ���(title = ���) �̸� (name) �μ�(dept_id) �μ��� (name) 

-- �̸� (s_emp.name ) �μ� (s_emp.dept_id) �μ��� (s_dept.name)

select s_emp.name �̸� , s_dept.name �μ��� , dept_id �μ�
from s_emp , s_dept
where title = '���'
and s_emp.dept_id =  s_dept.id
;

-- �ߺ� name�̶� �տ� ���̺� ���� ?
select s_emp.name , s_dept.name , s_emp.dept_id 
from s_emp , s_dept
where s_emp.dept_id = s_dept.id
and title = '���'
;

-----------------------------------------------------------------------------

---- NON EQUIJOIN
--select e.name , s.salary , g.grade �޿����
--from s_emp e , salgrade g 
--where e_salary between g.losal and g.hisal;

--NoN EquiJoin�� ���÷��� ���� , �ٸ� �÷��� ���� ��Ȯ�� ��ġ���� �ʴ°��
-- ������ ���� �ٸ� �����ڸ� ����Ͽ� join�ϴ� ����� ���Ѵ�

select * from s_emp;
select * from s_dept;
select * from s_region; 
select * from salgrade;    -- grade , losal , hisal

--�������̺�� �޿� ���̺��� join�Ͽ� 
--����� �̸�(s_emp.name)�� �޿�(s_emp.salary) �ش�޿� ����� ��Ÿ���ÿ�
select em.name , em.salary , gs.grade
from s_emp em , salgrade gs
where em.salary between gs.losal and gs.hisal
;
select * from s_emp;
select * from s_dept;
select * from s_region; 
select * from salgrade;    -- grade , losal , hisal
select * from s_customer;

--------------------------------------------------------------------------------

---- OUTER JOIN
--���� (s_emp) ���̺�� �� (s_customer) ���̺��� 
--����� �̸���(s_emp.name) ��� (s_emp.id) ,
--�׸��� ����� �����̸�(s_customer.name) �� ��Ÿ���ÿ�
--���� ���Ͽ� ��翵�� ����� ������ ��� ���� �̸��� ��Ÿ���� ��������� �������� �����Ͻÿ�
select * from s_emp;
select * from s_customer;  
-- id , salse_rep_id

select e.name , e.id , c.name
from s_emp e , s_customer c
where e.id = c.sales_rep_id(+)
order by e.id
;


------------------------------------------------------------------------------
---- self join
--�ϳ��� ���̺��� ��ġ �������� ��ó�� ��밡��
--���̺� ���� alias�� ���� �ٸ��� ����
--�÷��� �̸� �տ� �ݵ�� ���̺��� alas�� �ٿ�����
--self join �� Ƚ���� ���ѵǾ� ��������
-----------------------------------------------------------
select * from s_emp;

select w.id ��� , w.name ����� , m.id �μ����� , m.name "�μ��� �̸�"
from s_emp w , s_emp m
where w.manager_id = m.id
;
--------------------------------------------------------------
--�����߿� �����̿� ���� ��å�� ������ ����� �̸�(name)�� 
--��å(title) �޿�(salary) �μ���ȣ(dept_id)�� 
--��Ÿ���ÿ� self join ���


---------------------------------------------------------------
----------set ������ 
--set ������ ���� 
--1. union : �� query ����� ������  
--2. intersect : �� query ����� �����տ� ���� �κ��� ����
--3. union all : �� query ����� ������
--4. minus : �� query ����� �ι�° query ����� ������
--
--set ������ ����---------------

--select Į��1 , Į��2 ...
--from ���̺� 1
--   set ������
--select Į��1 , Į��2...
--from ���̺�2
--order by ..
--;

select name, dept_id , title
from s_emp
where dept_id = 110
union -- ����� ������
select name , dept_id , title
from s_emp
where dept_id = 113
order by dept_id
;