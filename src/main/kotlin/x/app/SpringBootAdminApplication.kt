package x.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootAdminApplication

fun main(args: Array<String>) {
    runApplication<SpringBootAdminApplication>(*args)
}
