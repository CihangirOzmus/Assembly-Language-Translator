begin 
  i := 10 ;

  aprev :=  7 ;
  n := 1 ;
  while ( i ) do begin 
     n := n + 1 ;
     k := n ;
     m := aprev ;
     while ( m ) do begin
       t := m ;
       m := k mod m ;
       k := t 
     end  ; 
     anew :=  aprev + k ;
     i := i - 1 ;
     if ( anew - aprev - 1 ) then 
          print ( anew-aprev ) ;      
     aprev := anew 
   end
end 
