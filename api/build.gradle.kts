import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

tasks.named("bootJar") {
  enabled = false
}

tasks.named<Jar>("jar") {
  archiveClassifier.set("")
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-validation")
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
  implementation("net.devfit.petclinic:openapi-spring:0.1.7")
  implementation(project(":domain"))
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.mockito.kotlin:mockito-kotlin:5.2.1")
}
