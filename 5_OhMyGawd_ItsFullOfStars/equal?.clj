(def atom? #(not (seq? %)))

(defn equal? [l1 l2]
  (cond
    (atom? l1)
      (if (atom? l2)
        (= l1 l2)
        false)
    (atom? l2) false
    (empty? l1) (empty? l2)
    (equal? (first l1) (first l2)) (equal? (rest l1) (rest l2))
    :else false))