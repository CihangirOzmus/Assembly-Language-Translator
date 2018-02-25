code segment
     PUSH 555
     POP AX
     MOV a, AX
     PUSH 115
     POP AX
     MOV b, AX
zeynt:
     PUSH b
     POP AX
     CMP AX, 0
     JZ tahgm
     PUSH b
     POP AX
     MOV t, AX
     PUSH a
     PUSH b
     POP CX
     POP AX
     DIV CX
     PUSH DX
     MOV DX, 0
     POP AX
     MOV b, AX
     PUSH t
     POP AX
     MOV a, AX
     JMP zeynt
tahgm:
     PUSH a
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
t DW 0
