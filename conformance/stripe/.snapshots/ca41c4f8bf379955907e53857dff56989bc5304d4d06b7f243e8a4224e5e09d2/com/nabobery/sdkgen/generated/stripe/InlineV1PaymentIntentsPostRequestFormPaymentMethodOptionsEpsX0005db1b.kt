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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/eps.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/eps
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1bInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf1Xcb2dd033")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsAnyOf2X2a773e63")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
