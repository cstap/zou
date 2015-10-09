(defproject zou/web "0.1.0-SNAPSHOT"
  :dependencies [[zou/common :version]
                 [zou/component :version]
                 [org.immutant/web "2.1.1"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [ring/ring-devel "1.4.0"]
                 [metosin/ring-http-response "0.6.5"]
                 [ring-logger "0.7.5"]
                 [ring.middleware.conditional "0.2.0"]
                 [bidi "1.22.1"]
                 [prone "0.8.2"]
                 [hawk "0.2.5"]]
  :plugins [[lein-modules "0.3.11"]])
