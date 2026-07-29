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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineInvoiceShippingDetailsX786d6124Branch {
  Shipping,
}

public sealed class InlineInvoiceShippingDetailsX786d6124DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceShippingDetailsX786d6124NoMatchException(
  message: String,
) : InlineInvoiceShippingDetailsX786d6124DecodingException(message)

internal data class InlineInvoiceShippingDetailsX786d6124Inspection(
  public val matchesShipping: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesShipping).count { it }
}

/**
 * Shipping details for the invoice. The Invoice PDF will use the `shipping_details` value if it is set, otherwise the
 * PDF will render the shipping address from the customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/shipping_details
 */
@Serializable(with = InlineInvoiceShippingDetailsX786d6124.Serializer::class)
public class InlineInvoiceShippingDetailsX786d6124 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceShippingDetailsX786d6124Inspection,
) {
  public val shipping: ShippingView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesShipping) json.decodeFromJsonElement<ShippingView>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceShippingDetailsX786d6124Branch>
    get() = buildSet {
      if (inspection.matchesShipping) add(InlineInvoiceShippingDetailsX786d6124Branch.Shipping)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceShippingDetailsX786d6124 {
      val inspection = inspectInlineInvoiceShippingDetailsX786d6124(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceShippingDetailsX786d6124NoMatchException("InlineInvoiceShippingDetailsX786d6124 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceShippingDetailsX786d6124(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceShippingDetailsX786d6124> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceShippingDetailsX786d6124 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceShippingDetailsX786d6124")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceShippingDetailsX786d6124) {
      encoder.requireJsonEncoder("InlineInvoiceShippingDetailsX786d6124").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceShippingDetailsX786d6124(element: JsonElement): InlineInvoiceShippingDetailsX786d6124Inspection {
  val raw = element as? JsonObject ?: return InlineInvoiceShippingDetailsX786d6124Inspection(
    matchesShipping = false,
    failures = listOf("Shipping: expected JSON object"),
  )
  val matchesShipping = true
  return InlineInvoiceShippingDetailsX786d6124Inspection(
    matchesShipping = matchesShipping,
    failures = buildList {
      if (!matchesShipping) add("Shipping: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
