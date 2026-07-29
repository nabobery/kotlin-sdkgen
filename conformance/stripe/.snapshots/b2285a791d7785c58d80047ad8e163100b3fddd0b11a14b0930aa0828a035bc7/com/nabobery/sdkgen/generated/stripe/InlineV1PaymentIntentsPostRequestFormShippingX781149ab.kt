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

public enum class InlineV1PaymentIntentsPostRequestFormShippingX781149abBranch {
  InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d,
  InlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa,
}

public sealed class InlineV1PaymentIntentsPostRequestFormShippingX781149abDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormShippingX781149abNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormShippingX781149abDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormShippingX781149abInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d, matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa).count { it }
}

/**
 * Shipping information for this PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/shipping
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormShippingX781149ab.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormShippingX781149ab internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormShippingX781149abInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d:
      InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa:
      InlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa>(raw) else null }

  public val matchedBranches: Set<InlineV1PaymentIntentsPostRequestFormShippingX781149abBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d) add(InlineV1PaymentIntentsPostRequestFormShippingX781149abBranch.InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa) add(InlineV1PaymentIntentsPostRequestFormShippingX781149abBranch.InlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormShippingX781149ab {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormShippingX781149ab(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormShippingX781149abNoMatchException("InlineV1PaymentIntentsPostRequestFormShippingX781149ab matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormShippingX781149ab(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormShippingX781149ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormShippingX781149ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormShippingX781149ab")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormShippingX781149ab) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormShippingX781149ab").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormShippingX781149ab(element: JsonElement): InlineV1PaymentIntentsPostRequestFormShippingX781149abInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d>()
  val matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa>()
  return InlineV1PaymentIntentsPostRequestFormShippingX781149abInspection(
    matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d = matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d,
    matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa = matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d) add("InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d: value does not match InlineV1PaymentIntentsPostRequestFormShippingAnyOf1X16d9814d")
      if (!matchesInlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa) add("InlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa: value does not match InlineV1PaymentIntentsPostRequestFormShippingAnyOf2X0bafd7fa")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
