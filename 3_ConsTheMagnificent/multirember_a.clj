(defn multirember [a lat]
  (when (seq lat)
    (if (= a (first lat))
      (multirember a (rest lat))
      (cons (first lat) (multirember a (rest lat))))))