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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/pix
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf1X99e36980")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAnyOf2Xf594e8ec")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
