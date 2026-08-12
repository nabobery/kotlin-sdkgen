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

public enum class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffBranch {
  Branch1,
  InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b,
}

public sealed class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffNoMatchException(
  message: String,
) : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffDecodingException(message)

internal data class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_amounts
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff.Serializer::class)
public class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffInspection,
) {
  public val branch1:
      List<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72>>(raw) else null }

  public val inlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b) json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b) add(InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffBranch.InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff {
      val inspection = inspectInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffNoMatchException("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff) {
      encoder.requireJsonEncoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adff(element: JsonElement): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf1ItemX7f5b2e72>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b = element.isJsonDecodable<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b>()
  return InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsX8ea7adffInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b = matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b) add("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b: value does not match InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxAmountsAnyOf2X01b8d97b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
