package com.nabobery.sdkgen.conformance.parity

import java.io.File

public fun main(args: Array<String>) {
    require(args.size >= 4) {
        "Usage: <repository-root> <markdown-output> <json-output> <evidence.json>... [--enforce]"
    }

    val enforce = args.last() == "--enforce"
    val providedFiles =
        args.drop(3).let { if (enforce) it.dropLast(1) else it }.map(::File)
    require(providedFiles.isNotEmpty()) { "At least one file argument is required" }

    val repositoryRoot = File(args[0])
    val mdFile = File(args[1])
    val jsonFile = File(args[2])

    val evidenceDir = repositoryRoot.resolve("conformance/parity/evidence")
    val registryFile =
        providedFiles
            .firstOrNull { it.name == "parity-rows.json" }
            ?: repositoryRoot.resolve("conformance/parity/registry/parity-rows.json")
    val policyFile =
        providedFiles
            .firstOrNull { it.name == "parity-policy.json" }
            ?: evidenceDir.resolve("parity-policy.json")

    require(registryFile.isFile) { "Registry file does not exist: ${registryFile.path}" }
    require(policyFile.isFile) { "Policy file does not exist: ${policyFile.path}" }

    val evidenceFiles =
        providedFiles
            .filter { file ->
                file.name != registryFile.name &&
                    file.name != policyFile.name
            }

    val currentCommitSha = ParityRegistry.currentCommitSha(repositoryRoot)
    val report =
        ParityAggregator.aggregate(
            evidence = evidenceFiles.map { EvidenceLoader.loadEvidence(it) },
            registry = EvidenceLoader.loadRegistry(registryFile),
            policy = EvidenceLoader.loadPolicy(policyFile),
            inputErrors = ParityRegistry.repositoryInputErrors(repositoryRoot),
            expectedPassedCommitSha = currentCommitSha,
        )
    val jsonContent = ParityJsonRenderer.render(report)
    val markdownContent = ParityMarkdownRenderer.render(report)

    mdFile.parentFile?.mkdirs()
    mdFile.writeText(markdownContent)

    jsonFile.parentFile?.mkdirs()
    jsonFile.writeText(jsonContent)

    val gateResult = ParityGate.validate(report, currentCommitSha)
    if (enforce && !gateResult.passed) {
        throw IllegalStateException("Parity Gate Failed:\n" + gateResult.errors.joinToString("\n"))
    }

    println("Generated parity matrices with gate status ${report.summary.gateStatus.serialValue()}")
}
