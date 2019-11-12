#!/usr/bin/env groovy
import com.cleverbuilder.GlobalVars
println GlobalVars.foo

def call(String name = 'human') {
  echo "Hello, ${name}."
}

