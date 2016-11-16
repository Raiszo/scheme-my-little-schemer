(def sero? #(empty? %))
(def edd1 #(cons '() %))
(def zub1 #(rest %))

(defn zum [n m]
  (if (sero? m)
    n
    (edd1 (zum n (zub1 m)))))