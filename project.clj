(defproject myapp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 ; Testing framework
                 [speclj "2.5.0"]]
  :plugins [[speclj "2.5.0"]]
  :test-paths ["spec/"]
  :jvm-opts ["-Dfile.encoding=utf-8"])
