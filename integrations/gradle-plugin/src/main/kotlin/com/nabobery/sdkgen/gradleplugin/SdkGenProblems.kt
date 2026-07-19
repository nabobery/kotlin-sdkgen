package com.nabobery.sdkgen.gradleplugin

import org.gradle.api.GradleException
import org.gradle.api.problems.ProblemGroup
import org.gradle.api.problems.ProblemId
import org.gradle.api.problems.Problems
import java.nio.file.Path
import java.util.Locale

/** Gradle Problems API integration for cacheability and input diagnostics. */
internal object SdkGenProblems {
    private val group: ProblemGroup = ProblemGroup.create("com.nabobery.sdkgen", "SDKGen")

    fun report(
        problems: Problems,
        code: String,
        message: String,
        location: String,
        fallbackPath: Path? = null,
    ) {
        val problemId = ProblemId.create(code.lowercase(Locale.ROOT), code, group)
        problems.reporter.report(problemId) { spec ->
            spec.contextualLabel(location)
            fileLocation(location, fallbackPath)?.let(spec::fileLocation)
            spec.details(message)
            spec.solution("Correct the reported SDKGen input and rerun generation.")
        }
    }

    fun fail(
        problems: Problems,
        code: String,
        message: String,
        location: String,
        solution: String,
        fallbackPath: Path? = null,
    ): Nothing {
        val problemId = ProblemId.create(code.lowercase(Locale.ROOT), code, group)
        throw problems.reporter.throwing(GradleException("$code: $message"), problemId) { spec ->
            spec.contextualLabel(location)
            fileLocation(location, fallbackPath)?.let(spec::fileLocation)
            spec.details(message)
            spec.solution(solution)
        }
    }

    internal fun fileLocation(
        location: String,
        fallbackPath: Path?,
    ): String? {
        val filesystemPath =
            if (isLogicalLocation(location)) {
                null
            } else {
                runCatching { Path.of(location) }.getOrNull()
            }
        return (filesystemPath ?: fallbackPath)?.toString()
    }

    private fun isLogicalLocation(location: String): Boolean =
        location.regionMatches(
            thisOffset = 0,
            other = "sdkgen://",
            otherOffset = 0,
            length = "sdkgen://".length,
            ignoreCase = true,
        )
}
