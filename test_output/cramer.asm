code segment
     PUSH 1
     POP AX
     MOV a, AX
     PUSH 2
     POP AX
     MOV b, AX
     PUSH 3
     POP AX
     MOV c, AX
     PUSH 4
     POP AX
     MOV d, AX
     PUSH 1
     POP AX
     MOV e, AX
     PUSH 1
     POP AX
     MOV f, AX
     PUSH e
     PUSH d
     POP CX
     POP AX
     TEST AX, AX
     JNS qxevk
     NEG AX
     NEG CX
qxevk:
     IMUL CX
     PUSH AX
     MOV DX, 0
     PUSH b
     PUSH f
     POP CX
     POP AX
     TEST AX, AX
     JNS iswzu
     NEG AX
     NEG CX
iswzu:
     IMUL CX
     PUSH AX
     MOV DX, 0
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     PUSH a
     PUSH d
     POP CX
     POP AX
     TEST AX, AX
     JNS mvymw
     NEG AX
     NEG CX
mvymw:
     IMUL CX
     PUSH AX
     MOV DX, 0
     PUSH b
     PUSH c
     POP CX
     POP AX
     TEST AX, AX
     JNS olinn
     NEG AX
     NEG CX
olinn:
     IMUL CX
     PUSH AX
     MOV DX, 0
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     POP CX
     POP AX
     TEST AX, AX
     JNS gmqws
     NEG AX
     NEG CX
gmqws:
     IDIV CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV x, AX
     PUSH a
     PUSH f
     POP CX
     POP AX
     TEST AX, AX
     JNS uaaoe
     NEG AX
     NEG CX
uaaoe:
     IMUL CX
     PUSH AX
     MOV DX, 0
     PUSH e
     PUSH c
     POP CX
     POP AX
     TEST AX, AX
     JNS uzpcl
     NEG AX
     NEG CX
uzpcl:
     IMUL CX
     PUSH AX
     MOV DX, 0
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     PUSH a
     PUSH d
     POP CX
     POP AX
     TEST AX, AX
     JNS xnhyw
     NEG AX
     NEG CX
xnhyw:
     IMUL CX
     PUSH AX
     MOV DX, 0
     PUSH b
     PUSH c
     POP CX
     POP AX
     TEST AX, AX
     JNS wbwvu
     NEG AX
     NEG CX
wbwvu:
     IMUL CX
     PUSH AX
     MOV DX, 0
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     POP CX
     POP AX
     TEST AX, AX
     JNS jucin
     NEG AX
     NEG CX
jucin:
     IDIV CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV y, AX
     PUSH x
     POP AX
     CALL print
     PUSH y
     POP AX
     CALL print
EXIT:
     INT 20
print: 
     TEST AX, AX
     JNS positive
     PUSH AX
     MOV DX, '-'
     MOV AH, 02H
     INT 21H
     POP AX
     NEG AX
positive:
     MOV SI, 10d
     XOR DX, DX
     MOV CX, 0
nonzero:
     DIV SI
     ADD DX, 48d
     PUSH DX
     INC CX
     XOR DX, DX
     CMP AX, 0h
     JNE nonzero
printloop:
     POP DX
     MOV AH, 02h
     INT 21h
     DEC CX
     JNZ printloop
     MOV DX, ' '
     MOV AH, 02h
     MOV DX, 0
     INT 21h
     ret
DATA: 
a DW 0
b DW 0
c DW 0
d DW 0
e DW 0
f DW 0
x DW 0
y DW 0
