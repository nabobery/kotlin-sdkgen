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

public enum class InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebBranch {
  Branch1,
  InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c,
}

public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebNoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/custom_fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/custom_fields
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebInspection,
) {
  public val branch1:
      List<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7>>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebBranch.Branch1)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c) add(InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebBranch.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebNoMatchException("InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55eb(element: JsonElement): InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemXe5bcdfa7>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c>()
  return InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX0e1c55ebInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c = matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c) add("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c: value does not match InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
