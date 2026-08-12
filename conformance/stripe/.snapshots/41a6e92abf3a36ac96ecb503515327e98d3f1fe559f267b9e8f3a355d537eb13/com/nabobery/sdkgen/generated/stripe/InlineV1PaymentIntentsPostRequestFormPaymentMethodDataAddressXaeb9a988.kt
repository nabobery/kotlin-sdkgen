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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/billing_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/billing_details/properties/address
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAddressXaeb9a988Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf1Xec5b3ee2")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X6369df7c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
