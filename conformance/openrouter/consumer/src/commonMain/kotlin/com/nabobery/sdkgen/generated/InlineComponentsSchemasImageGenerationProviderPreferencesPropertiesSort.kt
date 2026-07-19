package com.nabobery.sdkgen.generated

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

public enum class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortBranch {
  ProviderSort,
  ProviderSortConfig,
  Branch3,
}

public sealed class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortNoMatchException(
  message: String,
) : InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortDecodingException(message)

internal data class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortInspection(
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
 */
@Serializable(with = InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort.Serializer::class)
public class InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortInspection,
) {
  public val providerSort: ProviderSort? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderSort) json
        .decodeFromJsonElement<ProviderSort>(raw) else null }

  public val providerSortConfig: ProviderSortConfig? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderSortConfig) json
        .decodeFromJsonElement<ProviderSortConfig>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortBranch>
    get() = buildSet {
      if (inspection
        .matchesProviderSort) add(InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortBranch
          .ProviderSort)
      if (inspection
        .matchesProviderSortConfig) add(InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortBranch
          .ProviderSortConfig)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortBranch
        .Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort {
      val inspection = inspectInlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortNoMatchException("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort) {
      encoder.requireJsonEncoder("InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSort(element: JsonElement): InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortInspection {
  val matchesProviderSort = element.isJsonDecodable<ProviderSort>()
  val matchesProviderSortConfig = element.isJsonDecodable<ProviderSortConfig>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasImageGenerationProviderPreferencesPropertiesSortInspection(
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
