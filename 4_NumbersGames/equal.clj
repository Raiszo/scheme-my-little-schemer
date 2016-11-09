(def ='
  (fn [n m]
    (cond
      (> n m) false
      (< n m) false
      :else true)))