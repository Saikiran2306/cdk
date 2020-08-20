/*function reporting count(*)
	mgr (int) -> number of people reporting to him
write a procedure 
		to accept mgr number from user and invoke reporting fn
*/

CREATE OR REPLACE FUNCTION reporting_count(num number)
RETURN number 
IS 
   ans number(2) := 0; 
BEGIN 
  select count(*) into ans from emp where mgr in (select mgr from emp where mgr=num); 
    
   RETURN ans; 
END; 
/

DECLARE
v_mgr emp.mgr%TYPE :=&mgr;
mytotal number(2) ;
BEGIN
  mytotal := reporting_count(v_mgr);
  dbms_output.put_line('Number of people reporting to  manager ' ||v_mgr||' = '||  mytotal );
END;
/
