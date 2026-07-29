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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1X5e8d62fd")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xd9866b5c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
