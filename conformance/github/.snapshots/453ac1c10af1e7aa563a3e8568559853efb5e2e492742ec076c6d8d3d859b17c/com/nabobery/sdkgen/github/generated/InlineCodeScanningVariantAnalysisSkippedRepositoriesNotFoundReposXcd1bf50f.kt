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
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis/properties/skipped_repositories/prope
 * rties/not_found_repos.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis/properties/skipped_repositories/prope
 * rties/not_found_repos
 */
@Serializable(with = InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f.Serializer::class)
public class InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f(
  /**
   * The total number of repositories that were skipped for this reason.
   */
  public val repositoryCount: Int,
  repositoryFullNames: List<String>,
) {
  /**
   * A list of full repository names that were skipped. This list may not include all repositories that were skipped.
   */
  public val repositoryFullNames: List<String> = repositoryFullNames.toList()

  public class Builder {
    private var repositoryCountValue: Int? = null

    public var repositoryCount: Int
      get() = requireNotNull(repositoryCountValue) { "repositoryCount is required" }
      set(`value`) {
        repositoryCountValue = value
      }

    private var repositoryFullNamesValue: List<String>? = null

    public var repositoryFullNames: List<String>
      get() = requireNotNull(repositoryFullNamesValue) { "repositoryFullNames is required" }.toList()
      set(`value`) {
        repositoryFullNamesValue = value.toList()
      }

    public fun build(): InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f {
      check(repositoryCountValue != null) { "repositoryCount is required" }
      check(repositoryFullNamesValue != null) { "repositoryFullNames is required" }
      return InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f(
        repositoryCount = repositoryCount,
        repositoryFullNames = repositoryFullNames,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f must be a JSON object")
      val repositoryCount = json.decodeRequired<Int>(rawObject, "repository_count")
      val repositoryFullNames = json.decodeRequired<List<String>>(rawObject, "repository_full_names")
      return InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f(
        repositoryCount = repositoryCount,
        repositoryFullNames = repositoryFullNames,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository_count", json.encodeToJsonElement(value.repositoryCount))
        put("repository_full_names", json.encodeToJsonElement(value.repositoryFullNames))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f(block: InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f.Builder.() -> Unit): InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f = InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
