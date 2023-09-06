select * from s_dept;
select * from s_emp;

-- group �� subgroup���� ����ȭ �ϱ� 
-- group by �� ���Ͽ� group���� �������� �ϴ� Į���� 
-- ������ �� ���ν� �׷��� ����ȭ �Ҽ� �ִ�
select dept_id , title ,count(*)
from s_emp
group by dept_id,title
;

select dept_id , title
from s_emp
where dept_id = 118
;        -- 118���� ���� 2���ִ��� Ȯ���Ϸ���

-- ���μ�������(dept_id), ����å���� (title) ����� �ο���(count(?)) �ٹ��ϴ��� 
select dept_id,title , count(*)   --�ϴ� �𸣴� * ����
from s_emp -- s_emp�� ������ title , dept_id ������
group by dept_id,title
;

-- �� �μ������� (dept_id), ����� ������(count()) �ٹ� �ϴ��� 
select dept_id, count(*)
from s_emp
group by dept_id
;

-- �� �μ���(dept_id)�� �޿�(salary)�� �ּҰ�(min(salary)) �� �ִ밪(max(salary))�� ��Ÿ ���ÿ� 
-- �ּҰ��� �ּҰ��� ���� �μ��� ������� ���ÿ� having  not in (min,max)? 

select dept_id ,min(salary),max(salary)
from s_emp 
group by dept_id 
having (min(salary) != max(salary) )
;

select dept_id,min(salary),max(salary)
from s_emp 
group by dept_id
having (min(salary) = max(salary) )
;


