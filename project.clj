(defproject ckeditor-cljs-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :cljsbuild
  {
   :builds
   [{
     ; The path to the top-level ClojureScript source directory:
     :source-paths ["src/cljs"]
     ; The standard ClojureScript compiler options:
     ; (See the ClojureScript compiler documentation for details.)
     :compiler
     {
      :optimizations :whitespace
      :pretty-print true
      :output-to "resources/public/core.js"}}]})
