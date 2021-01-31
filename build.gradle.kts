plugins {
    id("idea")
    kotlin("jvm") version "1.4.21"
    id("com.adarshr.test-logger") version "2.1.1"
    id("info.solidsoft.pitest") version "1.5.2"
}

group = "com.zlrx.presentation"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val junit5Version = "5.6.1"
val junitPlatformVersion = "1.6.1"

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junit5Version")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junit5Version")
    testImplementation("org.junit.platform:junit-platform-runner:$junitPlatformVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

configure<info.solidsoft.gradle.pitest.PitestPluginExtension> {
    junit5PluginVersion.set("0.12")
    avoidCallsTo.set(setOf("kotlin.jvm.internal"))
    mutators.set(setOf("STRONGER")) //DEFAULTS,STRONGER,ALL, ("NON_VOID_METHOD_CALLS","OBBN","UOI3"),"UOI1"
    targetClasses.set(setOf("com.zlrx.*"))
    targetTests.set(setOf("com.zlrx.*"))
    threads.set(Runtime.getRuntime().availableProcessors())
    outputFormats.set(setOf("XML", "HTML"))
}
