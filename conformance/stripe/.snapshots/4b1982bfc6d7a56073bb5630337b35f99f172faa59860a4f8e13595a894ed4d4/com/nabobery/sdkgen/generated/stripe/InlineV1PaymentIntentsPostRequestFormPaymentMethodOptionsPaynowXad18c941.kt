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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/paynow.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/paynow
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf1Xe9719978")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowAnyOf2Xaef54e7e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
