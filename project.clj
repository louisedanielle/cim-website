<<<<<<< HEAD
(defproject cim_portfolio "0.1.0"
  :description "A portfolio analysis program written in Clojure"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/data.csv "1.0.1"]
                 [clj-time "0.15.2"]
                 [clj-http "3.12.3"]
                 [cheshire "5.12.0"]
                 [clojure.java-time "1.4.2"]
                 [clj-python/libpython-clj "2.025"]]
  :main ^:skip-aot cim-portfolio.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}
  :plugins [[org.clojars.benfb/lein-gorilla "0.6.0"]]
)
=======
(defproject cryogen "0.1.0"
            :description "Simple static site generator"
            :url "https://github.com/lacarmen/cryogen"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.11.1"]
                           [ring/ring-devel "1.8.2"]
                           [compojure "1.6.2"]
                           [ring-server "0.5.0"]
                           [cryogen-flexmark "0.1.4"]
                           [cryogen-core "0.4.4"]]
            :plugins [[lein-ring "0.12.5"]]
            :main cryogen.core
            :ring {:init cryogen.server/init
                   :handler cryogen.server/handler}
            :aliases {"serve"      ["run" "-m" "cryogen.server"]
                      "serve:fast" ["run" "-m" "cryogen.server" "fast"]})
>>>>>>> origin/main
