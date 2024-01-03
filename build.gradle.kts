import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "3.2.0"
  id("io.spring.dependency-management") version "1.1.4"
  kotlin("jvm") version "1.9.20"
  kotlin("plugin.spring") version "1.9.20"
}

allprojects {
  apply(plugin = "org.springframework.boot")
  apply(plugin = "io.spring.dependency-management")
  apply(plugin = "org.jetbrains.kotlin.jvm")
  apply(plugin = "org.jetbrains.kotlin.plugin.spring")

  group = "net.devfit.petclinic"
  version = "0.0.1-SNAPSHOT"

  repositories {
    mavenCentral()
    maven {
      url = uri("https://maven.pkg.github.com/t-kiyono/petclinic-openapi")
      credentials {
        username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
        password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
      }
    }
  }

  java {
    sourceCompatibility = JavaVersion.VERSION_21
  }

  java {
    sourceCompatibility = JavaVersion.VERSION_21
  }

  tasks.withType<KotlinCompile> {
    kotlinOptions {
      freeCompilerArgs += "-Xjsr305=strict"
      jvmTarget = "21"
    }
  }

  tasks.withType<Test> {
    useJUnitPlatform()
  }
}

dependencyManagement {
  dependencies {
    dependency("org.mockito.kotlin:mockito-kotlin:5.2.1")
  }
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter")
  implementation("org.springframework.boot:spring-boot-starter-actuator")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation(project(":api"))
  implementation(project(":domain"))
  implementation(project(":stub"))
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.mockito.kotlin:mockito-kotlin")
}
