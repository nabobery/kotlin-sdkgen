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

public enum class InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9Branch {
  PaymentPagesCheckoutSessionCustomTextPosition,
}

public sealed class InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9Inspection(
  public val matchesPaymentPagesCheckoutSessionCustomTextPosition: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionCustomTextPosition).count { it }
}

/**
 * Custom text that should be displayed alongside the payment confirmation button.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_text/properties/submit
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9.Serializer::class)
public class InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9Inspection,
) {
  public val paymentPagesCheckoutSessionCustomTextPosition:
      PaymentPagesCheckoutSessionCustomTextPositionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionCustomTextPosition) json.decodeFromJsonElement<PaymentPagesCheckoutSessionCustomTextPositionView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionCustomTextPosition) add(InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9Branch.PaymentPagesCheckoutSessionCustomTextPosition)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9NoMatchException("InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9(element: JsonElement): InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9Inspection(
    matchesPaymentPagesCheckoutSessionCustomTextPosition = false,
    failures = listOf("PaymentPagesCheckoutSessionCustomTextPosition: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionCustomTextPosition = raw["message"].isString()
  return InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9Inspection(
    matchesPaymentPagesCheckoutSessionCustomTextPosition = matchesPaymentPagesCheckoutSessionCustomTextPosition,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionCustomTextPosition) add("PaymentPagesCheckoutSessionCustomTextPosition: required properties 'message' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
