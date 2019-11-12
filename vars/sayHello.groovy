#!/usr/bin/env groovy
import com.cleverbuilder.GlobalVars


def call(String name = GlobalVars.foo) {
  echo "Hello, ${name}."
}

