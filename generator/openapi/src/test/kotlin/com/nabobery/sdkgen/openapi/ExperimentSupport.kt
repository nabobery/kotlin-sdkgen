package com.nabobery.sdkgen.openapi

import java.nio.file.Path
import kotlin.io.path.Path

object ExperimentSupport {
    val fixtureRoot: Path = propertyPath("intake.fixtureRoot")
    val snapshotRoot: Path = propertyPath("intake.snapshotRoot")
    val resultRoot: Path = propertyPath("intake.resultRoot")
    val openRouterFixture: Path = propertyPath("intake.openRouterFile")
    val modelSource: Path = propertyPath("intake.modelSource")
    val stressFixtures: List<Path> =
        (1..17).map { index ->
            val prefix = index.toString().padStart(2, '0')
            propertyPath("intake.stressRoot")
                .toFile()
                .listFiles()
                .orEmpty()
                .single { it.name.startsWith(prefix) }
                .toPath()
        }

    private fun propertyPath(name: String): Path = Path(requireNotNull(System.getProperty(name)))
}
