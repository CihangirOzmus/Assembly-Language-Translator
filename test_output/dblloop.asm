code segment
     PUSH 3
     POP AX
     MOV n, AX
     PUSH 4
     POP AX
     MOV m, AX
     PUSH 0
     POP AX
     MOV sum, AX
nnofj:
     PUSH n
     POP AX
     CMP AX, 0
     JZ zecvc
qoygz:
     PUSH m
     POP AX
     CMP AX, 0
     JZ zcqut
     PUSH sum
     PUSH n
     POP CX
     POP AX
     ADD AX, CX
     PUSH AX
     MOV DX, 0
     PUSH m
     POP CX
     POP AX
     ADD AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV sum, AX
     PUSH m
     PUSH 1
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV m, AX
     JMP qoygz
zcqut:
     PUSH n
     PUSH 1
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV n, AX
     JMP nnofj
zecvc:
     PUSH sum
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
sum DW 0
m DW 0
n DW 0
