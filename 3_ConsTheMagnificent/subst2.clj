(defn subst2 [new old1 old2 lat]
  (when (seq lat)
    (if (or (= old1 (first lat)) (= old2 (first lat)))
      (cons new (rest lat))
      (cons (first lat) (subst2 new old1 old2 (rest lat))))))