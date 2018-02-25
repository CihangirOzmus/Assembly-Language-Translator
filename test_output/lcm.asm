code segment
     PUSH 5
     POP AX
     MOV a, AX
     PUSH 17
     POP AX
     MOV b, AX
     PUSH a
     POP AX
     MOV aa, AX
     PUSH b
     POP AX
     MOV bb, AX
tgzin:
     PUSH b
     POP AX
     CMP AX, 0
     JZ pnizq
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
     JMP tgzin
pnizq:
     PUSH a
     POP AX
     MOV gcd, AX
     PUSH aa
     PUSH bb
     POP CX
     POP AX
     TEST AX, AX
     JNS gogif
     NEG AX
     NEG CX
gogif:
     IMUL CX
     PUSH AX
     MOV DX, 0
     PUSH gcd
     POP CX
     POP AX
     TEST AX, AX
     JNS bxxgo
     NEG AX
     NEG CX
bxxgo:
     IDIV CX
     PUSH AX
     MOV DX, 0
     POP AX
     MOV lcm, AX
     PUSH lcm
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
aa DW 0
bb DW 0
a DW 0
b DW 0
t DW 0
lcm DW 0
gcd DW 0
