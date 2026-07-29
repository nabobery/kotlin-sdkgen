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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/scalapay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/scalapay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1X3724cdf9")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf2X4b74015c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
