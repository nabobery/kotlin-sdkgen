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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

@Serializable
public data class InlineFileSearchServerToolFiltersXeddb71f8InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5View(
  public val key: String,
  public val type: InlineFileSearchServerToolFiltersAnyOf1TypeX62bfc18a,
  public val `value`: InlineFileSearchServerToolFiltersAnyOf1ValueXde529fb2,
)

public enum class InlineFileSearchServerToolFiltersXeddb71f8Branch {
  InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5,
  CompoundFilter,
}

public sealed class InlineFileSearchServerToolFiltersXeddb71f8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFileSearchServerToolFiltersXeddb71f8NoMatchException(
  message: String,
) : InlineFileSearchServerToolFiltersXeddb71f8DecodingException(message)

internal data class InlineFileSearchServerToolFiltersXeddb71f8Inspection(
  public val matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5: Boolean,
  public val matchesCompoundFilter: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5, matchesCompoundFilter).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/filters
 */
@Serializable(with = InlineFileSearchServerToolFiltersXeddb71f8.Serializer::class)
public class InlineFileSearchServerToolFiltersXeddb71f8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFileSearchServerToolFiltersXeddb71f8Inspection,
) {
  public val inlineFileSearchServerToolFiltersAnyOf1Xe0235bc5:
      InlineFileSearchServerToolFiltersXeddb71f8InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5View?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5) json.decodeFromJsonElement<InlineFileSearchServerToolFiltersXeddb71f8InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5View>(raw) else null }

  public val compoundFilter: CompoundFilterView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCompoundFilter) json.decodeFromJsonElement<CompoundFilterView>(raw) else null }

  public val matchedBranches: Set<InlineFileSearchServerToolFiltersXeddb71f8Branch>
    get() = buildSet {
      if (inspection.matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5) add(InlineFileSearchServerToolFiltersXeddb71f8Branch.InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5)
      if (inspection.matchesCompoundFilter) add(InlineFileSearchServerToolFiltersXeddb71f8Branch.CompoundFilter)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFileSearchServerToolFiltersXeddb71f8 {
      val inspection = inspectInlineFileSearchServerToolFiltersXeddb71f8(raw)
      if (inspection.matchCount == 0) {
        throw InlineFileSearchServerToolFiltersXeddb71f8NoMatchException("InlineFileSearchServerToolFiltersXeddb71f8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFileSearchServerToolFiltersXeddb71f8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFileSearchServerToolFiltersXeddb71f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileSearchServerToolFiltersXeddb71f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileSearchServerToolFiltersXeddb71f8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileSearchServerToolFiltersXeddb71f8) {
      encoder.requireJsonEncoder("InlineFileSearchServerToolFiltersXeddb71f8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFileSearchServerToolFiltersXeddb71f8(element: JsonElement): InlineFileSearchServerToolFiltersXeddb71f8Inspection {
  val raw = element as? JsonObject ?: return InlineFileSearchServerToolFiltersXeddb71f8Inspection(
    matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 = false,
    matchesCompoundFilter = false,
    failures = listOf("InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5: expected JSON object", "CompoundFilter: expected JSON object"),
  )
  val matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 = raw["key"].isString() && raw["type"] != null && raw["value"] != null
  val matchesCompoundFilter = raw["filters"] != null && raw["type"] != null
  return InlineFileSearchServerToolFiltersXeddb71f8Inspection(
    matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 = matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5,
    matchesCompoundFilter = matchesCompoundFilter,
    failures = buildList {
      if (!matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5) add("InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5: required properties 'key', 'type', 'value' do not match their declared types")
      if (!matchesCompoundFilter) add("CompoundFilter: required properties 'filters', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
