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

public enum class InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01Branch {
  PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity,
}

public sealed class InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01Inspection(
  public val matchesPaymentPagesCheckoutSessionOptionalItemAdjustableQuantity: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionOptionalItemAdjustableQuantity).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_optional_item/properties/adjustable_q
 * uantity.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_optional_item/properties/adjustable_q
 * uantity
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01.Serializer::class)
public class InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01Inspection,
) {
  public val paymentPagesCheckoutSessionOptionalItemAdjustableQuantity:
      PaymentPagesCheckoutSessionOptionalItemAdjustableQuantityView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionOptionalItemAdjustableQuantity) json.decodeFromJsonElement<PaymentPagesCheckoutSessionOptionalItemAdjustableQuantityView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionOptionalItemAdjustableQuantity) add(InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01Branch.PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01NoMatchException("InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01(element: JsonElement): InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01Inspection(
    matchesPaymentPagesCheckoutSessionOptionalItemAdjustableQuantity = false,
    failures = listOf("PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionOptionalItemAdjustableQuantity = raw["enabled"] != null
  return InlinePaymentPagesCheckoutSessionOptionalItemAdjustableQuantityX23657d01Inspection(
    matchesPaymentPagesCheckoutSessionOptionalItemAdjustableQuantity = matchesPaymentPagesCheckoutSessionOptionalItemAdjustableQuantity,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionOptionalItemAdjustableQuantity) add("PaymentPagesCheckoutSessionOptionalItemAdjustableQuantity: required properties 'enabled' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
