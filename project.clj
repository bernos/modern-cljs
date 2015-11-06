(defproject modern-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.5.3"

  ;; clj and cljs source paths
  :source-paths ["src/clj" "src/cljs"]

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.145"]
                 [compojure "1.4.0"]
                 [domina "1.0.3"]]

  :plugins [[lein-cljsbuild "1.1.0"]
            [lein-ring "0.9.7"]]

  :ring {:handler modern-cljs.core/handler}

  :cljsbuild {:builds
              [{:source-paths ["src/cljs"]
                :compiler {:output-to "resources/public/js/modern.js"
                           :optimizations :whitespace
                           :pretty-print true}}]}

  :clean-targets ^{:protect false} [:target-path "out" "repl" "resources/public/js/"])
