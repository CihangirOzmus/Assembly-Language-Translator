code segment
     PUSH 3
     POP AX
     MOV a, AX
     PUSH 4
     POP AX
     MOV b, AX
     PUSH a
     PUSH b
     POP CX
     POP AX
     ADD AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV a, AX
     PUSH a
     PUSH b
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV b, AX
     PUSH a
     PUSH b
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV a, AX
     PUSH a
     POP AX
     CALL print
     PUSH b
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
