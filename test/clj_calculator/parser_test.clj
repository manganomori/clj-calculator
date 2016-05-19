(ns clj-calculator.parser-test
  (:require [clojure.test :refer :all]
            [clj-calculator.parser :as p]))

(deftest parse-args-test
  (are [i o] (= o (p/parse-args i))
       (list "core.clj" "+" "2" "3") (list "+" (list "2" "3"))
       (list "core.clj" "+" "2" "3" "4") (list "+" (list "2" "3" "4"))))

(deftest parse-float-test
  (is (.equals (float 1.0) (p/parse-float "1")))
  (is (.equals (float 1.2) (p/parse-float "1.2"))))

(deftest format-float-test
  (are [i o] (.equals o (p/format-float i))
       1.2222 "1.22"
       1.2    "1.20"
       -1.294 "-1.29"))
