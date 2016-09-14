(def lat?
  (fn [x]
    (cond
      (empty? x) true
      (seq? (first x)) false
      :else (lat? (rest x)))))
