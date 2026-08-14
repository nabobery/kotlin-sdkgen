package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eBranch {
  Branch1,
  InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801,
}

public sealed class InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eNoMatchException(
  message: String,
) : InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eDecodingException(message)

internal data class InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801).count { it }
}

/**
 * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice do not apply to this
 * invoice item. Pass an empty string to remove previously-defined tax rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/tax_rates
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801:
      InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801) json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eBranch.Branch1)
      if (inspection.matchesInlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801) add(InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eBranch.InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e {
      val inspection = inspectInlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eNoMatchException("InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e) {
      encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e(element: JsonElement): InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801 = element.isJsonDecodable<InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801>()
  return InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801 = matchesInlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801) add("InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801: value does not match InlineV1InvoiceitemsPostRequestFormTaxRatesAnyOf2X87ef1801")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
