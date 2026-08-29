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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/grabpay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/grabpay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X2a65ddf7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
