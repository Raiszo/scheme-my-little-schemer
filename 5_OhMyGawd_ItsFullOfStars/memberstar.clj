(defn member' [a l]
  (cond
    (empty? l) false
    (seq? (first l)) (or (member' a (first l)) (member' a (rest l)))
    (= a (first l)) true
    :else (member' a (rest l))))