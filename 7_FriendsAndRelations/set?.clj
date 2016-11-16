(defn member? [a lat]
  (cond
    (empty? lat) false
    (= (first lat) a) true
    :else (member? a (rest lat))))

(defn set?' [lat]
  (cond
    (empty? lat) true
    (member? (first lat) (rest lat)) false
    :else (set?' (rest lat))))