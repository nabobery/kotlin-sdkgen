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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/samsung_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/samsung_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xdb676fbc")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9b9cde4b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
