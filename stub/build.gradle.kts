import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

tasks.named("bootJar") {
  enabled = false
}

tasks.named<Jar>("jar") {
  archiveClassifier.set("")
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation(project(":domain"))
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}
