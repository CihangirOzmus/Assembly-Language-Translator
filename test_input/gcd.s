begin 
  a := 555 ;
  b := 115 ; 
  while (b) do begin 
       t := b ; 
       b := a mod b ; 
       a := t 
  end ; 
  print a
end 
