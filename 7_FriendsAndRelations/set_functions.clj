(defn rember [a lat]
  (when (seq lat)
    (if (= a (first lat))
      (rest lat)
      (cons (first lat) (rember a (rest lat))))))

(defn subset? [set1 set2]
  (if (empty? set2)
    (empty? set1)
    (subset? (rember (first set2) set1) (rest set2))
))

(defn eqset? [set1 set2]
  (and
    (subset? set1 set2)
    (subset? set2 set1)))