(def <'
  (fn [n m]
    (cond
      (zero? m) false
      (zero? n) true
      :else (<' (- n 1) (- m 1)))))