(defproject zou/web "0.1.0-alpha4-SNAPSHOT"
  :dependencies [[zou/common :version]
                 [zou/component :version]
                 [zou/lib :version]
                 [org.immutant/web "2.1.2"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-defaults "0.1.5"]
                 [ring/ring-devel "1.4.0"]
                 [metosin/ring-http-response "0.6.5"]
                 [ring-logger "0.7.5"]
                 [ring.middleware.conditional "0.2.0"]
                 [ring-webjars "0.1.1"]
                 [bidi "1.25.1"]
                 [com.cemerick/url "0.1.1" :exclusions [pathetic]]
                 [pathetic "0.5.1"]
                 [prone "1.0.2"]
                 [hawk "0.2.10"]]
  :plugins [[lein-modules "0.3.11"]])
