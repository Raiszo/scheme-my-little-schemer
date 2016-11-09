(def length'
  (fn [lst]
    (if (empty? lst)
      0
      (+ 1 (length' (rest lst))))))
