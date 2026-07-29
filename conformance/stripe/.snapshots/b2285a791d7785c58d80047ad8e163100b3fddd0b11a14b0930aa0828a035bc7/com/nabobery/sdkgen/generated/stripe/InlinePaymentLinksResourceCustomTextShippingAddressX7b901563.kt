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

public enum class InlinePaymentLinksResourceCustomTextShippingAddressX7b901563Branch {
  PaymentLinksResourceCustomTextPosition,
}

public sealed class InlinePaymentLinksResourceCustomTextShippingAddressX7b901563DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceCustomTextShippingAddressX7b901563NoMatchException(
  message: String,
) : InlinePaymentLinksResourceCustomTextShippingAddressX7b901563DecodingException(message)

internal data class InlinePaymentLinksResourceCustomTextShippingAddressX7b901563Inspection(
  public val matchesPaymentLinksResourceCustomTextPosition: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceCustomTextPosition).count { it }
}

/**
 * Custom text that should be displayed alongside shipping address collection.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_text/properties/shipping_address
 */
@Serializable(with = InlinePaymentLinksResourceCustomTextShippingAddressX7b901563.Serializer::class)
public class InlinePaymentLinksResourceCustomTextShippingAddressX7b901563 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinksResourceCustomTextShippingAddressX7b901563Inspection,
) {
  public val paymentLinksResourceCustomTextPosition: PaymentLinksResourceCustomTextPositionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceCustomTextPosition) json.decodeFromJsonElement<PaymentLinksResourceCustomTextPositionView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentLinksResourceCustomTextShippingAddressX7b901563Branch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceCustomTextPosition) add(InlinePaymentLinksResourceCustomTextShippingAddressX7b901563Branch.PaymentLinksResourceCustomTextPosition)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinksResourceCustomTextShippingAddressX7b901563 {
      val inspection = inspectInlinePaymentLinksResourceCustomTextShippingAddressX7b901563(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinksResourceCustomTextShippingAddressX7b901563NoMatchException("InlinePaymentLinksResourceCustomTextShippingAddressX7b901563 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinksResourceCustomTextShippingAddressX7b901563(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentLinksResourceCustomTextShippingAddressX7b901563> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceCustomTextShippingAddressX7b901563 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceCustomTextShippingAddressX7b901563")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceCustomTextShippingAddressX7b901563) {
      encoder.requireJsonEncoder("InlinePaymentLinksResourceCustomTextShippingAddressX7b901563").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinksResourceCustomTextShippingAddressX7b901563(element: JsonElement): InlinePaymentLinksResourceCustomTextShippingAddressX7b901563Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinksResourceCustomTextShippingAddressX7b901563Inspection(
    matchesPaymentLinksResourceCustomTextPosition = false,
    failures = listOf("PaymentLinksResourceCustomTextPosition: expected JSON object"),
  )
  val matchesPaymentLinksResourceCustomTextPosition = raw["message"].isString()
  return InlinePaymentLinksResourceCustomTextShippingAddressX7b901563Inspection(
    matchesPaymentLinksResourceCustomTextPosition = matchesPaymentLinksResourceCustomTextPosition,
    failures = buildList {
      if (!matchesPaymentLinksResourceCustomTextPosition) add("PaymentLinksResourceCustomTextPosition: required properties 'message' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
