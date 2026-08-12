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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis/properties/scanned_repositories/items
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis/properties/scanned_repositories/items
 */
@Serializable(with = InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8.Serializer::class)
public class InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8(
  public val analysisStatus: CodeScanningVariantAnalysisStatus,
  public val repository: CodeScanningVariantAnalysisRepository,
  /**
   * The size of the artifact. This is only available for successful analyses.
   */
  public val artifactSizeInBytes: Int? = null,
  /**
   * The reason of the failure of this repo task. This is only available if the repository task has failed.
   */
  public val failureMessage: String? = null,
  /**
   * The number of results in the case of a successful analysis. This is only available for successful analyses.
   */
  public val resultCount: Int? = null,
) {
  public class Builder {
    private var analysisStatusValue: CodeScanningVariantAnalysisStatus? = null

    public var analysisStatus: CodeScanningVariantAnalysisStatus
      get() = requireNotNull(analysisStatusValue) { "analysisStatus is required" }
      set(`value`) {
        analysisStatusValue = value
      }

    private var repositoryValue: CodeScanningVariantAnalysisRepository? = null

    public var repository: CodeScanningVariantAnalysisRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    /**
     * The size of the artifact. This is only available for successful analyses.
     */
    public var artifactSizeInBytes: Int? = null

    /**
     * The reason of the failure of this repo task. This is only available if the repository task has failed.
     */
    public var failureMessage: String? = null

    /**
     * The number of results in the case of a successful analysis. This is only available for successful analyses.
     */
    public var resultCount: Int? = null

    public fun build(): InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8 {
      check(analysisStatusValue != null) { "analysisStatus is required" }
      check(repositoryValue != null) { "repository is required" }
      return InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8(
        analysisStatus = analysisStatus,
        repository = repository,
        artifactSizeInBytes = artifactSizeInBytes,
        failureMessage = failureMessage,
        resultCount = resultCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8 must be a JSON object")
      val analysisStatus = json.decodeRequired<CodeScanningVariantAnalysisStatus>(rawObject, "analysis_status")
      val repository = json.decodeRequired<CodeScanningVariantAnalysisRepository>(rawObject, "repository")
      return InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8(
        analysisStatus = analysisStatus,
        repository = repository,
        artifactSizeInBytes = rawObject["artifact_size_in_bytes"]?.let { json.decodeFromJsonElement<Int>(it) },
        failureMessage = rawObject["failure_message"]?.let { json.decodeFromJsonElement<String>(it) },
        resultCount = rawObject["result_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("analysis_status", json.encodeToJsonElement(value.analysisStatus))
        put("repository", json.encodeToJsonElement(value.repository))
        value.artifactSizeInBytes?.let { put("artifact_size_in_bytes", json.encodeToJsonElement(it)) }
        value.failureMessage?.let { put("failure_message", it) }
        value.resultCount?.let { put("result_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8(block: InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8.Builder.() -> Unit): InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8 = InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
