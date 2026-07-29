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

public enum class InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651Branch {
  Branch1,
  InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2,
}

public sealed class InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651NoMatchException(
  message: String,
) : InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651DecodingException(message)

internal data class InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2).count { it }
}

/**
 * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/tax_code
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2:
      InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2) json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651Branch.Branch1)
      if (inspection.matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2) add(InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651Branch.InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651 {
      val inspection = inspectInlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651NoMatchException("InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651) {
      encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651(element: JsonElement): InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2 = element.isJsonDecodable<InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2>()
  return InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2 = matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2) add("InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2: value does not match InlineV1InvoiceitemsPostRequestFormTaxCodeAnyOf2X83b47ec2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
