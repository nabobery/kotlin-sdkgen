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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/naver_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/naver_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf1Xa4379c03")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayAnyOf2Xd664d65d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
