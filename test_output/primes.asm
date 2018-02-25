code segment
     PUSH 10
     POP AX
     MOV i, AX
     PUSH 7
     POP AX
     MOV aprev, AX
     PUSH 1
     POP AX
     MOV n, AX
hguym:
     PUSH i
     POP AX
     CMP AX, 0
     JZ nfkbh
     PUSH n
     PUSH 1
     POP CX
     POP AX
     ADD AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV n, AX
     PUSH n
     POP AX
     MOV k, AX
     PUSH aprev
     POP AX
     MOV m, AX
lrgyn:
     PUSH m
     POP AX
     CMP AX, 0
     JZ jysbw
     PUSH m
     POP AX
     MOV t, AX
     PUSH k
     PUSH m
     POP CX
     POP AX
     DIV CX
     PUSH DX
     MOV DX, 0
     POP AX
     MOV m, AX
     PUSH t
     POP AX
     MOV k, AX
     JMP lrgyn
jysbw:
     PUSH aprev
     PUSH k
     POP CX
     POP AX
     ADD AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV anew, AX
     PUSH i
     PUSH 1
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV i, AX
     PUSH anew
     PUSH aprev
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     PUSH 1
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     CMP AX, 0
     JZ miyvm
     PUSH anew
     PUSH aprev
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     CALL print
miyvm:
     PUSH anew
     POP AX
     MOV aprev, AX
     JMP hguym
nfkbh:
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
anew DW 0
t DW 0
i DW 0
k DW 0
m DW 0
n DW 0
aprev DW 0
