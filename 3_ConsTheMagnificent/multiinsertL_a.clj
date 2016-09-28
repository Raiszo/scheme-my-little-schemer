(defn multiinsertL [new old lat]
  (when (seq lat)
    (if (= old (first lat))
      (cons new (cons (first lat) (multiinsertL new old (rest lat))))
      (cons (first lat) (multiinsertL new old (rest lat))))))