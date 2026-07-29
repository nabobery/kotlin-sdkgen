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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/link.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/link
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40aInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf2Xe670c7f7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
