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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/paypal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/paypal
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X2a73e5ba")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
