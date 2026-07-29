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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineShippingRateTaxCodeX5b0a4373Branch {
  Branch1,
  TaxCode,
}

public sealed class InlineShippingRateTaxCodeX5b0a4373DecodingException(
  message: String,
) : SerializationException(message)

public class InlineShippingRateTaxCodeX5b0a4373NoMatchException(
  message: String,
) : InlineShippingRateTaxCodeX5b0a4373DecodingException(message)

internal data class InlineShippingRateTaxCodeX5b0a4373Inspection(
  public val matchesBranch1: Boolean,
  public val matchesTaxCode: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTaxCode).count { it }
}

/**
 * A [tax code](https://docs.stripe.com/tax/tax-categories) ID. The Shipping tax code is `txcd_92010001`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate/properties/tax_code
 */
@Serializable(with = InlineShippingRateTaxCodeX5b0a4373.Serializer::class)
public class InlineShippingRateTaxCodeX5b0a4373 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineShippingRateTaxCodeX5b0a4373Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val taxCode: TaxCode? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxCode) json.decodeFromJsonElement<TaxCode>(raw) else null }

  public val matchedBranches: Set<InlineShippingRateTaxCodeX5b0a4373Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineShippingRateTaxCodeX5b0a4373Branch.Branch1)
      if (inspection.matchesTaxCode) add(InlineShippingRateTaxCodeX5b0a4373Branch.TaxCode)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineShippingRateTaxCodeX5b0a4373 {
      val inspection = inspectInlineShippingRateTaxCodeX5b0a4373(raw)
      if (inspection.matchCount == 0) {
        throw InlineShippingRateTaxCodeX5b0a4373NoMatchException("InlineShippingRateTaxCodeX5b0a4373 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineShippingRateTaxCodeX5b0a4373(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineShippingRateTaxCodeX5b0a4373> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineShippingRateTaxCodeX5b0a4373 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineShippingRateTaxCodeX5b0a4373")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineShippingRateTaxCodeX5b0a4373) {
      encoder.requireJsonEncoder("InlineShippingRateTaxCodeX5b0a4373").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineShippingRateTaxCodeX5b0a4373(element: JsonElement): InlineShippingRateTaxCodeX5b0a4373Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTaxCode = element.isJsonDecodable<TaxCode>()
  return InlineShippingRateTaxCodeX5b0a4373Inspection(
    matchesBranch1 = matchesBranch1,
    matchesTaxCode = matchesTaxCode,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesTaxCode) add("TaxCode: value does not match TaxCode")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
