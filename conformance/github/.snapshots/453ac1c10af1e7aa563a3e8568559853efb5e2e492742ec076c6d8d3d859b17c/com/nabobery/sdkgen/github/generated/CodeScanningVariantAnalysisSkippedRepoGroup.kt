package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis-skipped-repo-group.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis-skipped-repo-group
 */
@Serializable(with = CodeScanningVariantAnalysisSkippedRepoGroup.Serializer::class)
public class CodeScanningVariantAnalysisSkippedRepoGroup(
  repositories: List<CodeScanningVariantAnalysisRepository>,
  /**
   * The total number of repositories that were skipped for this reason.
   */
  public val repositoryCount: Int,
) {
  /**
   * A list of repositories that were skipped. This list may not include all repositories that were skipped. This is
   * only available when the repository was found and the user has access to it.
   */
  public val repositories: List<CodeScanningVariantAnalysisRepository> = repositories.toList()

  public class Builder {
    private var repositoriesValue: List<CodeScanningVariantAnalysisRepository>? = null

    public var repositories: List<CodeScanningVariantAnalysisRepository>
      get() = requireNotNull(repositoriesValue) { "repositories is required" }.toList()
      set(`value`) {
        repositoriesValue = value.toList()
      }

    private var repositoryCountValue: Int? = null

    public var repositoryCount: Int
      get() = requireNotNull(repositoryCountValue) { "repositoryCount is required" }
      set(`value`) {
        repositoryCountValue = value
      }

    public fun build(): CodeScanningVariantAnalysisSkippedRepoGroup {
      check(repositoriesValue != null) { "repositories is required" }
      check(repositoryCountValue != null) { "repositoryCount is required" }
      return CodeScanningVariantAnalysisSkippedRepoGroup(
        repositories = repositories,
        repositoryCount = repositoryCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningVariantAnalysisSkippedRepoGroup = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningVariantAnalysisSkippedRepoGroup> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningVariantAnalysisSkippedRepoGroup {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningVariantAnalysisSkippedRepoGroup")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningVariantAnalysisSkippedRepoGroup must be a JSON object")
      val repositories = json.decodeRequired<List<CodeScanningVariantAnalysisRepository>>(rawObject, "repositories")
      val repositoryCount = json.decodeRequired<Int>(rawObject, "repository_count")
      return CodeScanningVariantAnalysisSkippedRepoGroup(
        repositories = repositories,
        repositoryCount = repositoryCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningVariantAnalysisSkippedRepoGroup) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningVariantAnalysisSkippedRepoGroup")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repositories", json.encodeToJsonElement(value.repositories))
        put("repository_count", json.encodeToJsonElement(value.repositoryCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningVariantAnalysisSkippedRepoGroup(block: CodeScanningVariantAnalysisSkippedRepoGroup.Builder.() -> Unit): CodeScanningVariantAnalysisSkippedRepoGroup = CodeScanningVariantAnalysisSkippedRepoGroup.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeScanningVariantAnalysisSkippedRepoGroup is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
