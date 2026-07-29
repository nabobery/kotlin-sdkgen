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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/payto
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf1Xa937b482")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xe030a6ae")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
