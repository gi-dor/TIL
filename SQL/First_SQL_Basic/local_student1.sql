-- �μ��� ��� �޿�
select * from s_emp;

select dept_id, avg(salary) from s_emp 
where title = '���'
group by dept_id
order by dept_id
;

---select������ group �Լ� �߸��Ȼ��
-- �� ������ (region)���� �μ� (dept_id)�� ����� ��Ÿ���ÿ�
select region_id , count(id) from s_dept
group by region_id
order by region_id;


--- �� �μ�����(dept_id) ��� �޿� avg(salary)�� ���ϴµ� ��� �޿��� 2000 �̻�
select dept_id ,avg(salary) 
from s_emp  ----- 1��
group by dept_id  --- 3 ��
having  avg(salary) >= 2000 ---- group ���ǽ� 
--- having dept_id = 101 and avg(salary) >= 2000
order by dept_id
;

--- �� ��å �� (title)�� �޿��� ���� sum(salary)�� ���ϵ�, ��å�� ���� �̻��� ����
--- �޿� ������ 8000 �̻��� sum(salary) >= 8000 ��å�� ��Ÿ���� 
--- �޿� ���տ� ���� ������������ ����
select *
from s_emp
where title not like '%����'
group by title
having sum (salary)>=8000
order by sum
;


select * from s_emp
where title not like '%����'
group by title --- �� ��å title ���� 
having sum (salary) >= 8000 --- sum (salary) >= 8000
;






