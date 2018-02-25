code segment
     PUSH 15
     POP AX
     MOV n, AX
     PUSH 0
     POP AX
     MOV f0, AX
     PUSH f0
     POP AX
     CALL print
     PUSH 1
     POP AX
     MOV f1, AX
     PUSH f1
     POP AX
     CALL print
alafl:
     PUSH n
     POP AX
     CMP AX, 0
     JZ mazmy
     PUSH f0
     PUSH f1
     POP CX
     POP AX
     ADD AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV fnew, AX
     PUSH fnew
     POP AX
     CALL print
     PUSH f1
     POP AX
     MOV f0, AX
     PUSH fnew
     POP AX
     MOV f1, AX
     PUSH n
     PUSH 1
     POP CX
     POP AX
     SUB AX, CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV n, AX
     JMP alafl
mazmy:
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
f0 DW 0
fnew DW 0
f1 DW 0
n DW 0
