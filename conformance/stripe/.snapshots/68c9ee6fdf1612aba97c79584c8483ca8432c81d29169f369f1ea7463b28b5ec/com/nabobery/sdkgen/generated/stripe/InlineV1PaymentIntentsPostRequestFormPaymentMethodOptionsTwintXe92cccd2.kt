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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/twint.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/twint
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf1Xa8d3840c")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintAnyOf2X69e0c503")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
