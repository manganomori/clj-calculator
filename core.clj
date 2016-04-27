(ns clj-calculator.core)

(load-file "./parsers.clj")
(require '[clj-calculator.parser :as parser])

(defn main
  []
  (println (parser/call  *command-line-args*)))

(main)
