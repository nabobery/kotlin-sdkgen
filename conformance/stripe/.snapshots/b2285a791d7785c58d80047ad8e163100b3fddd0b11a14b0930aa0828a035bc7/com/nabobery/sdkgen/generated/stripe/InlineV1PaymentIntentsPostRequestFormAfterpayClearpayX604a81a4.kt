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

public enum class InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/afterpay_clearpay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/afterpay_clearpay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209) add(InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da) add(InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4NoMatchException("InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da>()
  return InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf1c61209")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xe20e37da")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
