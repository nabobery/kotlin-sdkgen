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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/link.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/link
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124abInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X4c2c6d21")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2X00bc54e2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
