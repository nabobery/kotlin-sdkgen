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

public enum class InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/afterpay_clearpay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/afterpay_clearpay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417) add(InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24) add(InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6NoMatchException("InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24>()
  return InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4d2b0417")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X9a316b24")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
