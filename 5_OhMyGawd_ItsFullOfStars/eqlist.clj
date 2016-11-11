(defn eqlist? [l1 l2]
  (cond
    (empty? l1) (empty? l2)
    (empty? l2) false
    (and (seq? (first l1)) (seq? (first l2))) (and (eqlist? (first l1) (first l2)) (eqlist? (rest l1) (rest l2)))
    (and (not (seq? (first l1))) (not (seq? (first l2)))) (and (= (first l1) (first l2)) (eqlist? (rest l1) (rest l2)))
    :else false))