select * from sys.databases;
use test1;
select * from sys.tables;

create table product(id int identity, name varchar(20), primary key(id)); 
sp_help product;
create table order1 (orderid int primary key identity, order_date date, pid int, foreign key(pid) references product(id));
insert into product values('book');
select * from product;
insert into order1 values(getdate(), 1);
select * from order1;

use test1;
select * from sys.tables;

sp_help student;
sp_columns student;
select * from student;

create procedure student_proc1 
 as 
begin
PRINT'student list'
 select * from student;
end;
exec student_proc1;
student_proc1;

drop procedure  student_proc1;

create procedure student_proc2 (@id1 int)
 as 
begin
PRINT'student with in parameter'
 select * from student where id=@id1;
end;
drop procedure  student_proc2;
student_proc2 10001;
exec student_proc2 10002;

sp_helptext  student_proc2;
select * from student;

alter procedure student_proc2 (@id1 int)
 as 
 if exists( select * from student where id=@id1)
begin
	PRINT'student with in parameter'
	 
	--select * from student where id=@id1
	return 0
end

else begin
	print 'no record present'
	return 1
end

exec student_proc2 1000;
exec student_proc2 1000776;

alter procedure student_proc2 (@id1 int)
 as 
if exists( select * from student where id=@id1)
begin
	PRINT'student with in parameter'
	 
	select * from student where id=@id1
	return 0
end

else begin
	print 'no record present'
	return 1
end
exec student_proc2 10001;

-- below not working 
declare @ret int; 
@ret=exec student_proc2 10001
select @ret;


SELECT 1 FROM sys.procedures WHERE [name] = 'student_proc1';
--if exists(SELECT 1 FROM sys.procedures WHERE [name] = 'student_proc1');

create procedure student_proc_search (@id1 int, @name1 varchar(20) OUTPUT, @dob1 date OUTPUT)
 as 
begin
	PRINT'student with in out parameter'
	 
	select  name, dob into @name1, @dob1  from student where id=@id1
end
select * from student;
--------------------
CREATE PROCEDURE SimpleInOutProcedure 
(
    @p_InputInt  INT,
    @p_OutputInt INT OUTPUT
)
AS
BEGIN
    SELECT 
       @p_OutputInt = @p_OutputInt
END
GO

DECLARE @p_OutputInt int = 4
EXEC SimpleInOutProcedure @p_InputInt = 1, @p_OutputInt = @p_OutputInt OUTPUT
SELECT @p_OutputInt


----------------------- 

CREATE PROCEDURE [dbo].[sample_Insert]
@name varchar(500),
@entryby int,
@RetVal INT = 0 OUT

AS

SET NOCOUNT ON



INSERT INTO dbo.Master
        ( name ,
          entry_date ,
          entry_by
        )
VALUES  ( @name , -- service_name - varchar(1000)
          dbo.GetActDate() , -- entry_date - datetime
          @entryby  -- entry_by - int
        )




IF @@ERROR =  0
BEGIN
SET @RetVal = 1 -- 1 IS FOR SUCCESSFULLY EXECUTED
End
ELSE
BEGIN
SET @RetVal = 0 -- 0 WHEN AN ERROR HAS OCCURED
End

 set ANSI_NULLS ON
 set QUOTED_IDENTIFIER ON
