(defn value [aexp]
  (if (seq? aexp)
    ((if (= (first (rest aexp)) '+) + - ) (value (first aexp)) (value (first (rest (rest aexp)))))
    aexp))