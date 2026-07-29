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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping/anyOf/0/properties/amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping/anyOf/0/properties/amount
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6NoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AmountX6902beb6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X3588b884")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
