--JOIN ?
--�ϳ��̻��� ���̺�κ��� ������ ������ �˻��ϴ� ���
--pk fk �� �����Ǿ� join
--pk fk ������� ������ ������ �������ε� join ����
select * from e_emp;
select * from s_dept;
--equi join  
--�÷� ���� ������ ���� ��Ȯ�� ��ġ�Ұ�� ��� 

--���� ���̺� , �μ� ���̺��� join  �Ͽ� ����� �̸��� �μ� �μ����� ��Ÿ���ÿ�

select e.name , e.dept_id , d.name
from s_emp e , s_dept d
;

--- alias 
select e.name �̸� , e.dept_id �μ� , d.name �μ���
from s_emp e , s_dept d
;

--- non equi join
--���÷��� ���� �ٸ� �÷��� ���� ��Ȯ�� ��ġ���� �ʴ°��

--���� ���̺�� �޿� ���̺��� join �Ͽ� 
--����� �̸��� �޿� �ش� �޿������ ��Ÿ���ÿ�
select * from s_emp;
select * from salgrade;

select e.name , e.salary , g.grade
from s_emp e, salgrade g
where e.salary between g.losal and g.hisal
;

select e.name �̸� , e.salary ���� , g.grade ���
from s_emp e , salgrade g 
where e.salary between g.losal and g.hisal
;



--- outer join 
--join ���� ���������ʴ°�� �� �������� ������ �Ҷ�

--��� �̸� , ���̸�
select * from s_emp;
select *from s_customer;

select e.name "��� ����" , c .name "�� ����"
from s_emp e , s_customer c
where e.id (+)= c.sales_rep_id
;
--
--�������̺�� �� ���̺��� 
--����� �̸� name, ���id  ����� �����̸� customer.name ��ȸ
--���� ��翵�� ����� ������ ���� �̸��� ��Ÿ����
--��� ������ ������������ ����

select * from s_emp;
select * from s_customer;

select e.id ��� , e.name �̸�, c.name  ����
from s_emp e , s_customer c
where e.id (+)= c.sales_rep_id
order by e.id
;

--self join
--�ϳ��� ���̺��� ��ġ �������ΰŸ��� ��밡��
--���̺� ����alias�� �ٸ��� ����
--�÷��̸��տ� ���̺��� alias �����

select * from s_emp;

select s.id , s.name , e.manager_id , e.name 
from s_emp s , s_emp e
where s.manager_id = e.id
;

--�����߿� '������'�� ���� ��å�� ������ ����� '�̸�'�� '��å' '�޿�' '�μ���ȣ'�� ��Ÿ���ÿ�
--self join ���

select s.name �̸�, s.title ����, s.salary ���� , s.dept_id �μ���ȣ 
from s_emp s, s_emp e
where s.title = e.title
and s.title = '����'
;

SELECT s.name, s.title, s.salary, s.dept_id
FROM s_emp s , s_emp e
where s.title = e.title
and s.title LIKE '%����%'
;

----------------------------

select name , dept_id , title
from s_emp 
where dept_id =110
union
select name , dept_id , title
from s_emp 
where dept_id =113
order by 1;

select name , dept_id , title
from s_emp 
where dept_id =110
union all
select name , dept_id , title
from s_emp 
where dept_id =113
order by 1;


select name , dept_id , title
from s_emp 
where dept_id =110
intersect
select name , dept_id , title
from s_emp 
where dept_id =113
order by 1;

select name , dept_id , title
from s_emp 
where dept_id =110
minus
select name , dept_id , title
from s_emp 
where dept_id =113
order by 1;

select name , title , dept_id
from s_emp 
where dept_id = (select dept_id 
                    from s_emp 
                    where name ='������');
                    
                    
select name , dept_id
from s_emp
where dept_id  in (select id 
                    from s_dept
                    where region_id =3);
                