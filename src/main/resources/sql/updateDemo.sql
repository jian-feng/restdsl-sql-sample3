update demo set datetime=now() 
where id = :#${body[id]}