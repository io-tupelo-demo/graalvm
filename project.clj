(defproject hello-world "0.1.0-SNAPSHOT"
  :dependencies [ [org.clojure/clojure "1.10.1"]
                 [prismatic/schema "1.1.12"]
                 ]
  :repl-options {:init-ns hello-world.core}
  :main hello-world.core
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[lein-shell "0.5.0"]]} }
  :aliases {"native" ["shell"
                      "native-image"
                      "--report-unsupported-elements-at-runtime"
                      "--initialize-at-build-time"
                      "-jar" "./target/${:uberjar-name:-${:name}-${:version}-standalone.jar}"
                      "-H:Name=./target/${:name}"]
            }
  )
