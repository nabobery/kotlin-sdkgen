package com.nabobery.sdkgen.conformance.parity

import org.w3c.dom.Element
import java.io.File

/**
 * Produces one transport-contract evidence artifact from a complete Gradle JUnit XML report.
 *
 * The expected test class and inventory are fixed by this producer rather than inferred from
 * whatever happens to be present in the report, preventing filtered or stale test runs from
 * being accepted as complete ContractKit evidence.
 */
public object TransportParityProducerCli {
    @JvmStatic
    public fun main(args: Array<String>) {
        require(args.size == 9) {
            "Usage: <repository-root> <registry.json> <producer> <subject> <task> <run-id> " +
                "<expected-test-class> <junit-xml-directory> <output.json>"
        }
        val repositoryRoot = File(args[0])
        val registry = EvidenceLoader.loadRegistry(File(args[1]))
        val producer = args[2]
        val subject = args[3]
        val task = args[4]
        val runId = args[5]
        val expectedClass = args[6]
        val output = File(args[8])
        val definition =
            registry.bundle.rows.single { row ->
                row.subject == subject && row.id in registry.bundle.producers[producer].orEmpty()
            }
        require(definition.matrix == MatrixType.TRANSPORT) {
            "Transport producer '$producer' owns non-transport row '${definition.id}'"
        }
        require(definition.evidenceLevel == EvidenceLevel.RUNTIME_CONTRACT) {
            "Transport producer '$producer' row must use runtimeContract evidence"
        }

        val validation =
            runCatching {
                require(VALID_RUN_ID.matches(runId)) { "Transport parity run id is missing or invalid" }
                validateTransportContractReport(File(args[7]), expectedClass)
                val toolchainSha256 =
                    repositoryRoot
                        .resolve("gradle/libs.versions.toml")
                        .readBytes()
                        .sha256()
                require(toolchainSha256 == ParityRegistry.TOOLCHAIN_SHA256) {
                    "Transport producer toolchain digest is stale"
                }
                TransportProvenance(
                    commitSha = ParityRegistry.currentCommitSha(repositoryRoot),
                    toolchainSha256 = toolchainSha256,
                )
            }
        val bundle =
            if (validation.isSuccess) {
                val fixtureId = definition.fixtureId
                val provenance = validation.getOrThrow()
                EvidenceBundle(
                    schemaVersion = "v1alpha1",
                    kind = EvidenceKind.PRODUCER,
                    producer = producer,
                    execution =
                        ExecutionEnvelope(
                            task = task,
                            status = ExecutionStatus.PASSED,
                            requestedFixtureIds = listOf(fixtureId),
                            startedFixtureIds = listOf(fixtureId),
                            passedFixtureIds = listOf(fixtureId),
                        ),
                    rows =
                        listOf(
                            ProducerEvidenceRow(
                                id = definition.id,
                                status = ParityStatus.PASSED,
                                commitSha = provenance.commitSha,
                                toolchainSha256 = provenance.toolchainSha256,
                            ),
                        ),
                )
            } else {
                val fixtureId = definition.fixtureId
                val reason =
                    validation
                        .exceptionOrNull()
                        ?.message
                        ?.takeIf(String::isNotBlank)
                        ?: "Transport ContractKit report validation failed."
                EvidenceBundle(
                    schemaVersion = "v1alpha1",
                    kind = EvidenceKind.PRODUCER,
                    producer = producer,
                    execution =
                        ExecutionEnvelope(
                            task = task,
                            status = ExecutionStatus.FAILED,
                            requestedFixtureIds = listOf(fixtureId),
                            startedFixtureIds = listOf(fixtureId),
                            failedFixtureIds = listOf(fixtureId),
                            reason = reason,
                        ),
                    rows =
                        listOf(
                            ProducerEvidenceRow(
                                id = definition.id,
                                status = ParityStatus.FAILED,
                                reason = reason,
                            ),
                        ),
                )
            }
        CanonicalEvidenceWriter.writeEvidenceAndSidecar(bundle, output)
    }
}

internal fun validateTransportContractReport(
    input: File,
    expectedClass: String,
) {
    val xmlFiles =
        input
            .walkTopDown()
            .filter { file -> file.isFile && file.extension == "xml" }
            .sortedBy { file -> file.relativeTo(input).invariantSeparatorsPath }
            .toList()
    require(xmlFiles.isNotEmpty()) { "JUnit XML report is missing" }

    val observed = mutableListOf<String>()
    xmlFiles.forEach { file ->
        val document = secureJUnitDocument(file)
        val cases = document.getElementsByTagName("testcase")
        for (index in 0 until cases.length) {
            val testCase = cases.item(index) as Element
            if (testCase.getAttribute("classname") != expectedClass) continue
            require(testCase.getElementsByTagName("failure").length == 0) {
                "ContractKit test '${testCase.getAttribute("name")}' failed"
            }
            require(testCase.getElementsByTagName("error").length == 0) {
                "ContractKit test '${testCase.getAttribute("name")}' errored"
            }
            require(testCase.getElementsByTagName("skipped").length == 0) {
                "ContractKit test '${testCase.getAttribute("name")}' was skipped"
            }
            observed +=
                testCase
                    .getAttribute("name")
                    .substringBefore('(')
                    .removeSuffix("[jvm]")
        }
    }
    require(observed.size == observed.distinct().size) {
        "ContractKit report contains duplicate test cases for $expectedClass"
    }
    val observedSet = observed.toSet()
    require(observedSet == transportContractTestInventory) {
        val missing = (transportContractTestInventory - observedSet).sorted()
        val unexpected = (observedSet - transportContractTestInventory).sorted()
        "Incomplete ContractKit inventory for $expectedClass; missing=$missing unexpected=$unexpected"
    }
    require("contractSkipReportIsConsistent" in observedSet) {
        "ContractKit skip report test is missing for $expectedClass"
    }
}

private val VALID_RUN_ID: Regex = Regex("[A-Za-z0-9][A-Za-z0-9._:-]{0,127}")

internal val transportContractTestInventory: Set<String> =
    setOf(
        "abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded",
        "bufferedResponseDoesNotReadAheadBeforeConsumerDemand",
        "bufferedRoundTripPreservesRequestAndRepeatedHeaders",
        "bytesAndReplayFactoryAreIdenticalAcrossAttempts",
        "callerOwnedEngineRemainsUnchanged",
        "cancellationIdentityIsPreservedMidBody",
        "capabilitiesMatchExpectations",
        "closingStreamMidBodyCancelsExchange",
        "connectionFailureBeforeSendIsTypedAndPreservesCause",
        "contractSkipReportIsConsistent",
        "declaredAttemptDeadlineIsHonored",
        "declaredIdleDeadlineRejectsSlowLorisBody",
        "emptyResponseBodyReachesEof",
        "hostileChunkSizesPreserveBytes",
        "multipartBodyExecutesWithExactBytesAndReplays",
        "nonSuccessResponseBodyIsAvailable",
        "oneMiBResponseBodyIsByteFaithful",
        "oneShotBodyIsConsumedExactlyOnce",
        "redirectsAreSurfacedWithoutAutomaticFollowing",
        "responseClosePreservesNormalAndFailureCauses",
        "sseBytesAreIncrementalAndUnmodified",
        "streamingChunksArriveIncrementally",
        "unsupportedStreamingIsDeclaredForRuntimePreflight",
    )

private data class TransportProvenance(
    val commitSha: String,
    val toolchainSha256: String,
)
