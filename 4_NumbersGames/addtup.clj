(def addtup
  (fn [lst]
    (if (empty? lst)
      0
      (+ (first lst) (addtup (rest lst))))))

(def addtup' #( reduce + % )) ;this is a more idiomatice implementation
