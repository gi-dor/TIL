--select count(title) 
--select count(name)
--select avg(salary) ��� ����
--select sum (salary) ���� �հ�

-- group by having ��


select title
from s_emp
group by title
;
-- ��å�� ǥ��

select  dept_id
from s_emp
group by dept_id
;

-- �μ� Ȯ��
select *
from s_dept
;
-- �ٹ��ڵ� �̸� �μ� ��å Ȯ��
select name , dept_id  ,title
from s_emp
;
--��� �μ��� ���� �������
select dept_id ,avg(salary)
from s_emp
where title ='���'
group by dept_id
;

-- �� �μ��� ��ձ޿� 
select dept_id,avg(salary)
from s_emp
group by dept_id
;
-- �� �μ���dept_id�� ��å�� ����� ���޵��� ��� �޿�
select dept_id , avg(salary)
from s_emp
where title = '��� '
group by dept_id
;

select name
from s_emp
where name like '��_'  -- �̸� �˻��ȵ�
;
select name
from s_emp
where name like '��__' -- �̸� �˻���
;

select name 
from s_emp
where name like '��%'  -- �̸� �˻���
;

select name
from s_emp
where name like '%��%'  -- �˻���
;

-- select������ group�Լ� �߸����
 select region_id , count(name)
 from s_dept
;  -- �� ���� �ϱ� ? , count�� �׷� �Լ��ε� group by ���� ���� 
-- group by region_id
-- 
select name
from s_dept
;

select * 
from s_dept 
;
-- �� ����region_id ���� ��� �μ��� �ִ��� ��Ÿ���ÿ�
select region_id , count(name)
from s_dept
group by region_id
;
select *
from s_dept
;
select * from s_customer;
select * from s_region;
select * from s_dept;
select * from s_emp;

-- �� �μ�(dept_id)���� ��� �޿�(avg(salary))�� ���϶� , ��� ��� �޿��� 2000�̻��� �μ��� ��Ÿ���ÿ�
select * from s_emp;

select name , avg(salary)
from s_dept
where avg(salary) >= 2000
group by name  -- ���� ��  ? where��� having ����Ѵ�? group���� �� �� �μ��� ��ձ޿��� ���ϴ� having ��� ?
; 

select * from s_dept;

select name , avg(salary)
from s_dept
group by name
having avg(salary) >= 2000
;-------------------having �ߴµ� �� �� �ȵǴ°ɱ�?
-------------------- dept ���̺� ���� avg(salary) ������ ����ü� ��� ?                  
------------ avg(salary)�� ������ s_emp ���̺� ����ϴµ� �μ� �̸�name �� ��ȸ �ش޶��ؼ� ?
-----------------------s_ emp���� name�� ��� �̸��̴� ������ ...


select dept_id , avg(salary)
from s_emp
group by dept_id
having avg(salary) >= 2000
;

select *
from s_dept
;

select *
from s_emp
;

-- having �� ��� ����
-- ���޺��� ��� ���� ������� ��ȸ
select title, avg(salary) , count(*)
from s_emp
group by title
-- having count(*)>2 -- 2�� �̻��� ����� �����ִ� ���ǽ�
; -- ���� ���� ���δ� ��ȸ


select *
from s_dept
;

-- �� ��å(title)���� �޿��� ����sum(salary)�� ���϶�
-- ��å�� ���� (title != '����') �� ����� ����
-- �޿��� �Ѿ��� 8000�̻���(sum(salary)) ��å�� ��Ÿ���� 
-- �޿� ���տ� ���� ��������(order by )���� �����Ͻÿ� 
select * 
from s_emp
;
select title, sum(salary) 
from s_emp
--where title not like '%����'
group by title
-- having title not like '%����'
having sum(salary) >= 8000
order by sum(salary)
;

-- �� �μ���(dept_id)�� ��å(title)�� ����� �����鿡 ���� ��ձ޿� avg(salary)�� ���϶�

select * from s_customer;
select * from s_region;
select * from s_dept;
select * from s_emp;

select dept_id, avg(salary)
from s_emp
where title = '���'
group by dept_id
;