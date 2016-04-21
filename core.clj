(load-file "./parsers.clj")

(defn main
  []
  (println (call (parse-args *command-line-args*))))

(main)
