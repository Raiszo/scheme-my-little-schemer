(def >'
  (fn [n m]
    (cond
      (zero? n) false
      (zero? m) true
      :else (>' (- n 1) (- m 1)))))