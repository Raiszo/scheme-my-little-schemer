; There is some misconception
; about the cons vs conj
;
; To summarize, here is a little
; statement writen by a guy named
; 'Michal Marczyk' in stack overflow
; concerning the use of cons vs conj
;
;     "The intention behind the names is,
;     I believe, that cons means to cons(truct aseq), whereas conj
;     means to conj(oin an item onto a collection). The seq being
;     constructed by cons starts with the element passed as its first
;     argument and has as its next / rest part the thing resulting from
;     the application of seq to the second argument; as displayed above,
;     the whole thing is of class clojure.lang.Cons. In contrast, conj
;     always returns a collection of roughly the same type as the
;     collection passed to it."

; So we will keep the function 'cons'.

(cons 1 '(1 2 3 4))
