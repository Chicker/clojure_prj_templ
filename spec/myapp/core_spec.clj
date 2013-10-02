(ns myapp.core-spec
  (:require [myapp.core :refer :all]
            [speclj.core :refer :all]))

(describe "tests for method add"
  (it "should return 3"
      (should= 3 (add 1 2))))

