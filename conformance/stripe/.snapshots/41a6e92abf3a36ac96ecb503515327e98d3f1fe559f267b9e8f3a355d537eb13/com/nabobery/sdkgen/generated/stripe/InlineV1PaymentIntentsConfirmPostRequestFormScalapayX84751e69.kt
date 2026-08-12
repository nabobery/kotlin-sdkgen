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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69Branch {
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69NoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69Inspection(
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef:
      Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/scalapay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/scalapay
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69Inspection,
) {
  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef) add(InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914) add(InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69 {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69NoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69Inspection {
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914>()
  return InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69Inspection(
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xbc3f24ef")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xc0ba7914")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
