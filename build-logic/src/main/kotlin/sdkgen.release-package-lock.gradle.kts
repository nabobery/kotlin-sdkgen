import com.nabobery.sdkgen.buildlogic.release.PrepareReleasePackageLock
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

val sdkgenVersion = providers.gradleProperty("sdkgenVersion")

plugins.withType<NodeJsRootPlugin> {
    val version = sdkgenVersion.get()
    if (!version.endsWith("-SNAPSHOT")) {
        val releaseLockDirectory = layout.buildDirectory.dir("kotlin-js-release-store")
        val prepareReleasePackageLock =
            tasks.register<PrepareReleasePackageLock>("prepareReleasePackageLock") {
                developmentLockFile.set(layout.projectDirectory.file("kotlin-js-store/package-lock.json"))
                releaseVersion.set(version)
                releaseLockFile.set(releaseLockDirectory.map { it.file("package-lock.json") })
            }

        extensions.configure<NpmExtension> {
            lockFileDirectory.set(releaseLockDirectory)
            restorePackageLockTaskProvider.configure {
                dependsOn(prepareReleasePackageLock)
            }
        }
    }
}
