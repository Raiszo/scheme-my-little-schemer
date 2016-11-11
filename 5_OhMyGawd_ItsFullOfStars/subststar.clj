(defn subst' [new old l]
  (when (seq l)
    (cond
      (seq? (first l)) (cons (subst' new old (first l)) (subst' new old (rest l)))
      (= old (first l)) (cons new (subst' new old (rest l)))
      :else (cons (first l) (subst' new old (rest l))))))