; Parsers
(defn parse-args
  [[_ & [operator & args]]]
  (list operator args))

(defn parse-float
  [string]
  (Float. string))

(defn format-float
  [float-number]
  (format "%.2f" float-number))

(defn call
  [[operator args]]

  (format-float
    (reduce
      (eval (read-string operator))
      (map parse-float args))))
