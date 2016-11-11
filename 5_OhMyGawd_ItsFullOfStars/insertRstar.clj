(defn insertR' [new old l]
  (when (seq l)
    (cond
      (seq? (first l)) (cons (insertR' new old (first l)) (insertR' new old (rest l)))
      (= old (first l)) (cons old (cons new (insertR' new old (rest l))))
      :else (cons (first l) (insertR' new old (rest l))))))