(defn insertL' [new old l]
  (when (seq l)
    (cond
      (seq? (first l)) (cons (insertL' new old (first l)) (insertL' new old (rest l)))
      (= old (first l)) (cons new (cons old (insertL' new old (rest l))))
      :else (cons (first l) (insertL' new old (rest l))))))