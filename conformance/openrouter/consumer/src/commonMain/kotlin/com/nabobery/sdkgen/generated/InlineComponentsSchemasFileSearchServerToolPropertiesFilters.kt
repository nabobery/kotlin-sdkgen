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

public enum class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersBranch {
  InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0,
  CompoundFilter,
  Branch3,
}

public sealed class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersNoMatchException(
  message: String,
) : InlineComponentsSchemasFileSearchServerToolPropertiesFiltersDecodingException(message)

internal data class InlineComponentsSchemasFileSearchServerToolPropertiesFiltersInspection(
  public val matchesInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0: Boolean,
  public val matchesCompoundFilter: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0, matchesCompoundFilter,
      matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters.
 */
@Serializable(with = InlineComponentsSchemasFileSearchServerToolPropertiesFilters.Serializer::class)
public class InlineComponentsSchemasFileSearchServerToolPropertiesFilters internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasFileSearchServerToolPropertiesFiltersInspection,
) {
  public val inlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0:
      InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0>(raw) else null }

  public val compoundFilter: CompoundFilter? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCompoundFilter) json
        .decodeFromJsonElement<CompoundFilter>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0) add(InlineComponentsSchemasFileSearchServerToolPropertiesFiltersBranch.InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0)
      if (inspection.matchesCompoundFilter) add(InlineComponentsSchemasFileSearchServerToolPropertiesFiltersBranch
        .CompoundFilter)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasFileSearchServerToolPropertiesFiltersBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasFileSearchServerToolPropertiesFilters {
      val inspection = inspectInlineComponentsSchemasFileSearchServerToolPropertiesFilters(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasFileSearchServerToolPropertiesFiltersNoMatchException("InlineComponentsSchemasFileSearchServerToolPropertiesFilters " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasFileSearchServerToolPropertiesFilters(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileSearchServerToolPropertiesFilters> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileSearchServerToolPropertiesFilters {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasFileSearchServerToolPropertiesFilters")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFileSearchServerToolPropertiesFilters) {
      encoder.requireJsonEncoder("InlineComponentsSchemasFileSearchServerToolPropertiesFilters")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasFileSearchServerToolPropertiesFilters(element: JsonElement): InlineComponentsSchemasFileSearchServerToolPropertiesFiltersInspection {
  val matchesInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0>()
  val matchesCompoundFilter = element.isJsonDecodable<CompoundFilter>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasFileSearchServerToolPropertiesFiltersInspection(
    matchesInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0 =
      matchesInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0,
    matchesCompoundFilter = matchesCompoundFilter,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesInlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0) add("InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0: " +
        "value does not match InlineComponentsSchemasFileSearchServerToolPropertiesFiltersAnyOf0")
      if (!matchesCompoundFilter) add("CompoundFilter: value does not match CompoundFilter")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
