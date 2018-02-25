begin
   n := 15 ; 
   f0 := 0 ;
   print f0 ;
   f1 := 1 ;
   print f1 ; 
   while ( n ) do  begin 
      fnew := f0 + f1 ;
      print fnew ; 
      f0 := f1 ;
      f1 := fnew ; 
      n := n - 1  
    end 
end 
