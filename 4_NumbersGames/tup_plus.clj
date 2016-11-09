(def tup+
  (fn [l1 l2]
    (cond
      (empty? l1) l2
      (empty? l2) l1
      :else (cons
              (+ (first l1) (first l2))
              (tup+ (rest l1) (rest l2))))))