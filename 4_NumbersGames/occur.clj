(defn occur [a lst]
  (if (empty? lst)
    0
    (+
     (if (= (first lst) a) 1 0)
     (occur a (rest lst)))))
