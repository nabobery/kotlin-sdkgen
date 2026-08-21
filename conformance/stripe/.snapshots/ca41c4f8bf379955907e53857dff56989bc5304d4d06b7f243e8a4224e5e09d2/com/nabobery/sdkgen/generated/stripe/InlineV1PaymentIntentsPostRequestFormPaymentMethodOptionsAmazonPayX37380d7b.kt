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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/amazon_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/amazon_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7bInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf80717ef")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X1c1b53f6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
