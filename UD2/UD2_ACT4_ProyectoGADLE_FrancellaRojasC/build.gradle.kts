plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Estas son las 4 dependencias que me pediste
    implementation("com.mysql:mysql-connector-j:8.4.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.1")
    implementation("org.apache.commons:commons-lang3:3.14.0")
    implementation("joda-time:joda-time:2.12.7")
}