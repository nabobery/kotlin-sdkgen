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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/blik.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/blik
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf2Xf3921a09")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
