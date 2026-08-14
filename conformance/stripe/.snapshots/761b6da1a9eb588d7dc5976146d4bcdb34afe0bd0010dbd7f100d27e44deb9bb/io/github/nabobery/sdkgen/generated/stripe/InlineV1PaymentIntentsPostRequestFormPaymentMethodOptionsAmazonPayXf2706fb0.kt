package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/amazon_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/amazon_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4f607cf2")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X01ef3b77")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
