(def div'
  (fn [n m]
    (if (< n m)
      0
      (+ 1 (div' (- n m) m)))))