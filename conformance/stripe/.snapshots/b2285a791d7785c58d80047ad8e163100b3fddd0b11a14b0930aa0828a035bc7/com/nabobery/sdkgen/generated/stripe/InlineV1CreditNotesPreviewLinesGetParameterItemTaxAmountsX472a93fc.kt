package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcBranch {
  Branch1,
  InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4,
}

public sealed class InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcNoMatchException(
  message: String,
) : InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcDecodingException(message)

internal data class InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/8/schema/items/properties/tax_a
 * mounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/8/schema/items/properties/tax_a
 * mounts
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc.Serializer::class)
public class InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcInspection,
) {
  public val branch1:
      List<InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf1ItemX67e231cd>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf1ItemX67e231cd>>(raw) else null }

  public val inlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4:
      InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4) json.decodeFromJsonElement<InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcBranch.Branch1)
      if (inspection.matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4) add(InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcBranch.InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc {
      val inspection = inspectInlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcNoMatchException("InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc) {
      encoder.requireJsonEncoder("InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fc(element: JsonElement): InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf1ItemX67e231cd>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4 = element.isJsonDecodable<InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4>()
  return InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsX472a93fcInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4 = matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4) add("InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4: value does not match InlineV1CreditNotesPreviewLinesGetParameterItemTaxAmountsAnyOf2Xcb2404a4")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
