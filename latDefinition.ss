(define (lat? l)
    (cond
        ((null? l) #f)
            ((atom? (car l))  (lat? (cdr l)))
                (else #f)))
