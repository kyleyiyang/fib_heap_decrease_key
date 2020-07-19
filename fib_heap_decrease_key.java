FIB-HEAP-DECREASE-KEY.H; x; k/
1 if k > x:key
2 error “new key is greater than current key”
3 x:key D k
4 y D x:p
5 if y ¤ NIL and x:key < y:key
6 CUT.H; x; y/
7 CASCADING-CUT.H; y/
8 if x:key < H:min:key
9 H:min D x
CUT.H; x; y/
1 remove x from the child list of y, decrementing y:degree
2 addx to the root list of H
3 x:p D NIL
4 x:mark D FALSE
CASCADING-CUT.H; y/
1 ´ D y:p
2 if ´ ¤ NIL
3 if y:mark == FALSE
4 y:mark D TRUE
5 else CUT.H; y; ´/
6 CASCADING-CUT.H; ´/
