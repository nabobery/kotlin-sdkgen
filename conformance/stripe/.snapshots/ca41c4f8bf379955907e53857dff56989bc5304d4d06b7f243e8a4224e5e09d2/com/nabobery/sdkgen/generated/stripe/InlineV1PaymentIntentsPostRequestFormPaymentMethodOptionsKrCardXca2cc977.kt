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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/kr_card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/kr_card
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xd366c4e4")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2Xf4f29329")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
