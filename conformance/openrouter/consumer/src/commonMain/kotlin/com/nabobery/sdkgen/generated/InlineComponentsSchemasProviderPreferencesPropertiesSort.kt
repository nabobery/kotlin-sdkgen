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

public enum class InlineComponentsSchemasProviderPreferencesPropertiesSortBranch {
  ProviderSort,
  ProviderSortConfig,
  Branch3,
}

public sealed class InlineComponentsSchemasProviderPreferencesPropertiesSortDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasProviderPreferencesPropertiesSortNoMatchException(
  message: String,
) : InlineComponentsSchemasProviderPreferencesPropertiesSortDecodingException(message)

internal data class InlineComponentsSchemasProviderPreferencesPropertiesSortInspection(
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
@Serializable(with = InlineComponentsSchemasProviderPreferencesPropertiesSort.Serializer::class)
public class InlineComponentsSchemasProviderPreferencesPropertiesSort internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasProviderPreferencesPropertiesSortInspection,
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

  public val matchedBranches: Set<InlineComponentsSchemasProviderPreferencesPropertiesSortBranch>
    get() = buildSet {
      if (inspection.matchesProviderSort) add(InlineComponentsSchemasProviderPreferencesPropertiesSortBranch
        .ProviderSort)
      if (inspection.matchesProviderSortConfig) add(InlineComponentsSchemasProviderPreferencesPropertiesSortBranch
        .ProviderSortConfig)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasProviderPreferencesPropertiesSortBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasProviderPreferencesPropertiesSort {
      val inspection = inspectInlineComponentsSchemasProviderPreferencesPropertiesSort(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasProviderPreferencesPropertiesSortNoMatchException("InlineComponentsSchemasProviderPreferencesPropertiesSort " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasProviderPreferencesPropertiesSort(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasProviderPreferencesPropertiesSort> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasProviderPreferencesPropertiesSort {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasProviderPreferencesPropertiesSort")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasProviderPreferencesPropertiesSort) {
      encoder.requireJsonEncoder("InlineComponentsSchemasProviderPreferencesPropertiesSort").encodeJsonElement(value
        .raw)
    }
  }
}

private fun inspectInlineComponentsSchemasProviderPreferencesPropertiesSort(element: JsonElement): InlineComponentsSchemasProviderPreferencesPropertiesSortInspection {
  val matchesProviderSort = element.isJsonDecodable<ProviderSort>()
  val matchesProviderSortConfig = element.isJsonDecodable<ProviderSortConfig>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasProviderPreferencesPropertiesSortInspection(
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
