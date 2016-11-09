(def tup+
  (fn [l1 l2]
    (when (seq l1)
      (cons
        (+ (first l1) (first l2))
        (tup+ (rest l1) (rest l2))))))