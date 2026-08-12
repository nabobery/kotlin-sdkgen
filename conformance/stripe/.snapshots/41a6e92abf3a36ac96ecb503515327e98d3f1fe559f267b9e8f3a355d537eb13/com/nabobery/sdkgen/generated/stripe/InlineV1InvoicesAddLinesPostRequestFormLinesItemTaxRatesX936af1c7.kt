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

public enum class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7Branch {
  Branch1,
  InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4,
}

public sealed class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7NoMatchException(
  message: String,
) : InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7DecodingException(message)

internal data class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/tax_rates
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7.Serializer::class)
public class InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4:
      InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4) json.decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4) add(InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7Branch.InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7 {
      val inspection = inspectInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7NoMatchException("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7) {
      encoder.requireJsonEncoder("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7(element: JsonElement): InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4 = element.isJsonDecodable<InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4>()
  return InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesX936af1c7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4 = matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4) add("InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4: value does not match InlineV1InvoicesAddLinesPostRequestFormLinesItemTaxRatesAnyOf2X9d285ae4")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
