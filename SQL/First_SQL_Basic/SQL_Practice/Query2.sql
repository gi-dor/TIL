
select min(salary),dept_id 
from s_emp 
group by dept_id;

--From������ SubQuery
-- A��� ���̺��� �������� ���� ���� ��� from���� ���̺� ��ü�� ����Ϸ� ����ϸ� ȿ���� ������
-- �׷��� �Ϻ� ��,�÷��� �����ؼ� ���̺��� ���� 
-- from ������ SubQuery �� ȿ�� ���� �˻��� ���� �̰��� INLINE VIEW �����



-- �̸� �μ��� , ���� , �� ����鸸
select * from s_emp;
select * from s_dept;

-- 1. ���̺� ��ü �÷��� ����ϱ⿡ ������ ���� ���Ƽ� ȿ�� ������ ���ϴٰ���
select e.name , e.title , d.name 
from s_emp e, s_dept d
where e.dept_id = d.id
and e.title = '���';


-- 2. �Ϻ� �÷�, ���� �����ؼ� ���̺� ���� ��� ȿ�� ��
SELECT e.name �̸� , e.title ����, d.name �μ�
from
    (select name , title , dept_id
    from s_emp
    where title = '���') e , s_dept d
where e.dept_id = d.id;


-- Hanving�������� SubQuery
select avg(salary) 
from s_emp
where dept_id = 113;

select dept_id , avg(salary)
from s_Emp
group by dept_id
having avg(salary) >  (select avg(salary) 
                        from s_emp
                        where dept_id = 113);

-- ���� ���� ��� �޿� (avg(salary))�� �޴� ��å(title)�� ���� 
-- �� ��å�� ��� �޿��� ��Ÿ���ÿ�

-- ���޺��� ��ձ޿�
select title ,avg(salary)
from s_emp
group by title
;
-- �������� ��տ���
select min(avg(salary))
from s_emp
group by title
;
        
--
select title , avg(salary)
from s_emp
group by title
having avg(salary) = ( select min(avg(salary)) -- min(avg)�� 
                        from s_emp
                        group by title);
                        

