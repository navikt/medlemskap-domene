plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.61"
    `java-library`
    `maven-publish`
}

val githubUser: String by project
val githubPassword: String by project

repositories {
    jcenter()
    maven {
        url = uri("https://maven.pkg.github.com/navikt/medlemskap-domene")
        credentials {
            username = githubUser
            password = githubPassword
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))
}

version = properties["version"] ?: "local"

publishing {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/navikt/medlemskap-domene")
            credentials {
                username = System.getenv("GITHUB_USERNAME")
                password = System.getenv("GITHUB_PASSWORD")
            }
        }
    }
    publications {
        create<MavenPublication>("mavenJava") {

            pom {
                name.set("medlemskap-domene")
                description.set("Felles domeneobjekter for medlemskap")
                url.set("https://github.com/navikt/medlemskap-domene")
                groupId = "no.nav.medlemskap"
                artifactId = "medlemskap-domene"
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }

                scm {
                    connection.set("scm:git:https://github.com/navikt/medlemskap-domene.git")
                    developerConnection.set("scm:git:https://github.com/navikt/medlemskap-domene.git")
                    url.set("https://github.com/navikt/medlemskap-domene")
                }
            }
            from(components["java"])
        }
    }
}
