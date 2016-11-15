(defn numbered? [aexp]
  (if (seq? aexp)
    (and (numbered? (first aexp)) (numbered? (first (rest (rest aexp)))))
    (number? aexp)))