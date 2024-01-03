import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

tasks.named("bootJar") {
  enabled = false
}

tasks.named<Jar>("jar") {
  archiveClassifier.set("")
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3")
  implementation(project(":domain"))
  testImplementation("org.mybatis.spring.boot:mybatis-spring-boot-starter-test:3.0.3")
}
