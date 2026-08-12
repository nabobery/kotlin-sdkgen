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

public enum class InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680Branch {
  PaymentPagesCheckoutSessionCustomTextPosition,
}

public sealed class InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680Inspection(
  public val matchesPaymentPagesCheckoutSessionCustomTextPosition: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionCustomTextPosition).count { it }
}

/**
 * Custom text that should be displayed alongside shipping address collection.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_text/properties/shipping_addre
 * ss
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680.Serializer::class)
public class InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680Inspection,
) {
  public val paymentPagesCheckoutSessionCustomTextPosition:
      PaymentPagesCheckoutSessionCustomTextPositionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionCustomTextPosition) json.decodeFromJsonElement<PaymentPagesCheckoutSessionCustomTextPositionView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionCustomTextPosition) add(InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680Branch.PaymentPagesCheckoutSessionCustomTextPosition)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680NoMatchException("InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680(element: JsonElement): InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680Inspection(
    matchesPaymentPagesCheckoutSessionCustomTextPosition = false,
    failures = listOf("PaymentPagesCheckoutSessionCustomTextPosition: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionCustomTextPosition = raw["message"].isString()
  return InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680Inspection(
    matchesPaymentPagesCheckoutSessionCustomTextPosition = matchesPaymentPagesCheckoutSessionCustomTextPosition,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionCustomTextPosition) add("PaymentPagesCheckoutSessionCustomTextPosition: required properties 'message' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
