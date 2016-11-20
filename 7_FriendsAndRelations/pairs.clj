(defn a-pair? [l]
  (cond
    (not (seq? l)) false
    (empty? l) false
    (empty? (rest l)) false
    (empty? (rest (rest l))) true
    :else false))

(def fst #(first %))
(def snd #(first (rest %)))
(def thrd #(first (rest (rest %))))

(defn build [s1 s2]
  (cons s1 (cons s2 '())))
