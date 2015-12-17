(ns zou.web.handler-test
  (:require [clojure.test :as t]
            [midje.sweet :refer :all]
            [ring.mock.request :as mock]
            [zou.web.handler :as sut]))

(def req (assoc (mock/request :get "/")
                :params {:a :aa :b {:c :d}}
                :zou/container {:view :view'}))

(t/deftest args-mapper-impl-test
  (fact
    (sut/defhandler a [a b|c |params|b $view $req $request |params :as {aa :a}]
      [a c b $view $req $request aa])
    (sut/invoke-with-mapper a req) => [:aa :d {:c :d} :view' req req :aa])
  (fact
    (sut/defhandler b
      "doc"
      {:a :b}
      [a])
    (meta #'b) => (contains {:doc "doc"
                             :a :b})))
