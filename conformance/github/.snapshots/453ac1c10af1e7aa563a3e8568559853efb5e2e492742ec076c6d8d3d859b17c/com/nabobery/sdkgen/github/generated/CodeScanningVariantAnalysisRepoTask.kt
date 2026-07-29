package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis-repo-task.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis-repo-task
 */
@Serializable(with = CodeScanningVariantAnalysisRepoTask.Serializer::class)
public class CodeScanningVariantAnalysisRepoTask(
  public val analysisStatus: CodeScanningVariantAnalysisStatus,
  public val repository: SimpleRepository,
  /**
   * The size of the artifact. This is only available for successful analyses.
   */
  public val artifactSizeInBytes: Int? = null,
  /**
   * The URL of the artifact. This is only available for successful analyses.
   */
  public val artifactUrl: String? = null,
  /**
   * The SHA of the commit the CodeQL database was built against. This is only available for successful analyses.
   */
  public val databaseCommitSha: String? = null,
  /**
   * The reason of the failure of this repo task. This is only available if the repository task has failed.
   */
  public val failureMessage: String? = null,
  /**
   * The number of results in the case of a successful analysis. This is only available for successful analyses.
   */
  public val resultCount: Int? = null,
  /**
   * The source location prefix to use. This is only available for successful analyses.
   */
  public val sourceLocationPrefix: String? = null,
) {
  public class Builder {
    private var analysisStatusValue: CodeScanningVariantAnalysisStatus? = null

    public var analysisStatus: CodeScanningVariantAnalysisStatus
      get() = requireNotNull(analysisStatusValue) { "analysisStatus is required" }
      set(`value`) {
        analysisStatusValue = value
      }

    private var repositoryValue: SimpleRepository? = null

    public var repository: SimpleRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    /**
     * The size of the artifact. This is only available for successful analyses.
     */
    public var artifactSizeInBytes: Int? = null

    /**
     * The URL of the artifact. This is only available for successful analyses.
     */
    public var artifactUrl: String? = null

    /**
     * The SHA of the commit the CodeQL database was built against. This is only available for successful analyses.
     */
    public var databaseCommitSha: String? = null

    /**
     * The reason of the failure of this repo task. This is only available if the repository task has failed.
     */
    public var failureMessage: String? = null

    /**
     * The number of results in the case of a successful analysis. This is only available for successful analyses.
     */
    public var resultCount: Int? = null

    /**
     * The source location prefix to use. This is only available for successful analyses.
     */
    public var sourceLocationPrefix: String? = null

    public fun build(): CodeScanningVariantAnalysisRepoTask {
      check(analysisStatusValue != null) { "analysisStatus is required" }
      check(repositoryValue != null) { "repository is required" }
      return CodeScanningVariantAnalysisRepoTask(
        analysisStatus = analysisStatus,
        repository = repository,
        artifactSizeInBytes = artifactSizeInBytes,
        artifactUrl = artifactUrl,
        databaseCommitSha = databaseCommitSha,
        failureMessage = failureMessage,
        resultCount = resultCount,
        sourceLocationPrefix = sourceLocationPrefix,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningVariantAnalysisRepoTask = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningVariantAnalysisRepoTask> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningVariantAnalysisRepoTask {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningVariantAnalysisRepoTask")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningVariantAnalysisRepoTask must be a JSON object")
      val analysisStatus = json.decodeRequired<CodeScanningVariantAnalysisStatus>(rawObject, "analysis_status")
      val repository = json.decodeRequired<SimpleRepository>(rawObject, "repository")
      return CodeScanningVariantAnalysisRepoTask(
        analysisStatus = analysisStatus,
        repository = repository,
        artifactSizeInBytes = rawObject["artifact_size_in_bytes"]?.let { json.decodeFromJsonElement<Int>(it) },
        artifactUrl = rawObject["artifact_url"]?.let { json.decodeFromJsonElement<String>(it) },
        databaseCommitSha = rawObject["database_commit_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        failureMessage = rawObject["failure_message"]?.let { json.decodeFromJsonElement<String>(it) },
        resultCount = rawObject["result_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        sourceLocationPrefix = rawObject["source_location_prefix"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningVariantAnalysisRepoTask) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningVariantAnalysisRepoTask")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("analysis_status", json.encodeToJsonElement(value.analysisStatus))
        put("repository", json.encodeToJsonElement(value.repository))
        value.artifactSizeInBytes?.let { put("artifact_size_in_bytes", json.encodeToJsonElement(it)) }
        value.artifactUrl?.let { put("artifact_url", it) }
        value.databaseCommitSha?.let { put("database_commit_sha", it) }
        value.failureMessage?.let { put("failure_message", it) }
        value.resultCount?.let { put("result_count", json.encodeToJsonElement(it)) }
        value.sourceLocationPrefix?.let { put("source_location_prefix", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningVariantAnalysisRepoTask(block: CodeScanningVariantAnalysisRepoTask.Builder.() -> Unit): CodeScanningVariantAnalysisRepoTask = CodeScanningVariantAnalysisRepoTask.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeScanningVariantAnalysisRepoTask is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
