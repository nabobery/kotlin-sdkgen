package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineImageGenerationProviderPreferencesSortX4cc00407Branch {
  ProviderSort,
  ProviderSortConfig,
  Branch3,
}

public sealed class InlineImageGenerationProviderPreferencesSortX4cc00407DecodingException(
  message: String,
) : SerializationException(message)

public class InlineImageGenerationProviderPreferencesSortX4cc00407NoMatchException(
  message: String,
) : InlineImageGenerationProviderPreferencesSortX4cc00407DecodingException(message)

internal data class InlineImageGenerationProviderPreferencesSortX4cc00407Inspection(
  public val matchesProviderSort: Boolean,
  public val matchesProviderSortConfig: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesProviderSort, matchesProviderSortConfig, matchesBranch3).count { it }
}

/**
 * The sorting strategy to use for this request, if "order" is not specified. When set, no load balancing is performed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationProviderPreferences/properties/sort
 */
@Serializable(with = InlineImageGenerationProviderPreferencesSortX4cc00407.Serializer::class)
public class InlineImageGenerationProviderPreferencesSortX4cc00407 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineImageGenerationProviderPreferencesSortX4cc00407Inspection,
) {
  public val providerSort: ProviderSort? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderSort) json.decodeFromJsonElement<ProviderSort>(raw) else null }

  public val providerSortConfig: ProviderSortConfig? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderSortConfig) json.decodeFromJsonElement<ProviderSortConfig>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineImageGenerationProviderPreferencesSortX4cc00407Branch>
    get() = buildSet {
      if (inspection.matchesProviderSort) add(InlineImageGenerationProviderPreferencesSortX4cc00407Branch.ProviderSort)
      if (inspection.matchesProviderSortConfig) add(InlineImageGenerationProviderPreferencesSortX4cc00407Branch.ProviderSortConfig)
      if (inspection.matchesBranch3) add(InlineImageGenerationProviderPreferencesSortX4cc00407Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineImageGenerationProviderPreferencesSortX4cc00407 {
      val inspection = inspectInlineImageGenerationProviderPreferencesSortX4cc00407(raw)
      if (inspection.matchCount == 0) {
        throw InlineImageGenerationProviderPreferencesSortX4cc00407NoMatchException("InlineImageGenerationProviderPreferencesSortX4cc00407 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineImageGenerationProviderPreferencesSortX4cc00407(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationProviderPreferencesSortX4cc00407> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImageGenerationProviderPreferencesSortX4cc00407 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImageGenerationProviderPreferencesSortX4cc00407")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationProviderPreferencesSortX4cc00407) {
      encoder.requireJsonEncoder("InlineImageGenerationProviderPreferencesSortX4cc00407").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineImageGenerationProviderPreferencesSortX4cc00407(element: JsonElement): InlineImageGenerationProviderPreferencesSortX4cc00407Inspection {
  val matchesProviderSort = element.isJsonDecodable<ProviderSort>()
  val matchesProviderSortConfig = element.isJsonDecodable<ProviderSortConfig>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineImageGenerationProviderPreferencesSortX4cc00407Inspection(
    matchesProviderSort = matchesProviderSort,
    matchesProviderSortConfig = matchesProviderSortConfig,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesProviderSort) add("ProviderSort: value does not match ProviderSort")
      if (!matchesProviderSortConfig) add("ProviderSortConfig: value does not match ProviderSortConfig")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
