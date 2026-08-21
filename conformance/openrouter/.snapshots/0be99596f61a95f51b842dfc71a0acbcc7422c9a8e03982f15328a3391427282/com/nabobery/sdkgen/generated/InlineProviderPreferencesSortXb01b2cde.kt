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

public enum class InlineProviderPreferencesSortXb01b2cdeBranch {
  ProviderSort,
  ProviderSortConfig,
  Branch3,
}

public sealed class InlineProviderPreferencesSortXb01b2cdeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineProviderPreferencesSortXb01b2cdeNoMatchException(
  message: String,
) : InlineProviderPreferencesSortXb01b2cdeDecodingException(message)

internal data class InlineProviderPreferencesSortXb01b2cdeInspection(
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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderPreferences/properties/sort
 */
@Serializable(with = InlineProviderPreferencesSortXb01b2cde.Serializer::class)
public class InlineProviderPreferencesSortXb01b2cde internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineProviderPreferencesSortXb01b2cdeInspection,
) {
  public val providerSort: ProviderSort? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderSort) json.decodeFromJsonElement<ProviderSort>(raw) else null }

  public val providerSortConfig: ProviderSortConfig? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProviderSortConfig) json.decodeFromJsonElement<ProviderSortConfig>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineProviderPreferencesSortXb01b2cdeBranch>
    get() = buildSet {
      if (inspection.matchesProviderSort) add(InlineProviderPreferencesSortXb01b2cdeBranch.ProviderSort)
      if (inspection.matchesProviderSortConfig) add(InlineProviderPreferencesSortXb01b2cdeBranch.ProviderSortConfig)
      if (inspection.matchesBranch3) add(InlineProviderPreferencesSortXb01b2cdeBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineProviderPreferencesSortXb01b2cde {
      val inspection = inspectInlineProviderPreferencesSortXb01b2cde(raw)
      if (inspection.matchCount == 0) {
        throw InlineProviderPreferencesSortXb01b2cdeNoMatchException("InlineProviderPreferencesSortXb01b2cde matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineProviderPreferencesSortXb01b2cde(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineProviderPreferencesSortXb01b2cde> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProviderPreferencesSortXb01b2cde {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProviderPreferencesSortXb01b2cde")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineProviderPreferencesSortXb01b2cde) {
      encoder.requireJsonEncoder("InlineProviderPreferencesSortXb01b2cde").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineProviderPreferencesSortXb01b2cde(element: JsonElement): InlineProviderPreferencesSortXb01b2cdeInspection {
  val matchesProviderSort = element.isJsonDecodable<ProviderSort>()
  val matchesProviderSortConfig = element.isJsonDecodable<ProviderSortConfig>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineProviderPreferencesSortXb01b2cdeInspection(
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
