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

public enum class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959Branch {
  InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b,
  InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f,
}

public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959Inspection(
  public val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b:
      Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b, matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959Inspection,
) {
  public val inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b) add(InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959Branch.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f) add(InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959Branch.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959NoMatchException("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959(element: JsonElement): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959Inspection {
  val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b>()
  val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f>()
  return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardX01f6e959Inspection(
    matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b = matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b,
    matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f = matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f,
    failures = buildList {
      if (!matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b) add("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b: value does not match InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1Xa2368d3b")
      if (!matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f) add("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f: value does not match InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X730abc1f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
