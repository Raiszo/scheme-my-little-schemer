(defn occur' [a l]
  (cond
    (empty? l) 0
    (seq? (first l)) (+ (occur' a (first l)) (occur' a (rest l)))
    (= a (first l)) (+ 1 (occur' a (rest l)))
    :else (occur' a (rest l))))