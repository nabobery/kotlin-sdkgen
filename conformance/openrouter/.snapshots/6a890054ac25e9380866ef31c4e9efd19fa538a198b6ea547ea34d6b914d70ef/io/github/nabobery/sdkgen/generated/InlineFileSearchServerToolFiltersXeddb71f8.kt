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

public enum class InlineFileSearchServerToolFiltersXeddb71f8Branch {
  InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5,
  CompoundFilter,
  Branch3,
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
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5, matchesCompoundFilter, matchesBranch3).count { it }
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
      InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5) json.decodeFromJsonElement<InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5>(raw) else null }

  public val compoundFilter: CompoundFilter? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCompoundFilter) json.decodeFromJsonElement<CompoundFilter>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineFileSearchServerToolFiltersXeddb71f8Branch>
    get() = buildSet {
      if (inspection.matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5) add(InlineFileSearchServerToolFiltersXeddb71f8Branch.InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5)
      if (inspection.matchesCompoundFilter) add(InlineFileSearchServerToolFiltersXeddb71f8Branch.CompoundFilter)
      if (inspection.matchesBranch3) add(InlineFileSearchServerToolFiltersXeddb71f8Branch.Branch3)
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
  val matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 = element.isJsonDecodable<InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5>()
  val matchesCompoundFilter = element.isJsonDecodable<CompoundFilter>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineFileSearchServerToolFiltersXeddb71f8Inspection(
    matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5 = matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5,
    matchesCompoundFilter = matchesCompoundFilter,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesInlineFileSearchServerToolFiltersAnyOf1Xe0235bc5) add("InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5: value does not match InlineFileSearchServerToolFiltersAnyOf1Xe0235bc5")
      if (!matchesCompoundFilter) add("CompoundFilter: value does not match CompoundFilter")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
