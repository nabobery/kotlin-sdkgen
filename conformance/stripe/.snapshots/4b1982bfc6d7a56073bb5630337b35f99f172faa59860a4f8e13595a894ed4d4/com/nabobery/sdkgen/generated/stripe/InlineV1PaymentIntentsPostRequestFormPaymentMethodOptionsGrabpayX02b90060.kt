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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/grabpay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/grabpay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1Xed63024b")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf2X8c112c56")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
