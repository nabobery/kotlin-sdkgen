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

public enum class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aBranch {
  Branch1,
  InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aNoMatchException(
  message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aDecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/from_postal_code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/from_postal_code
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b) json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b) add(InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aBranch.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a {
      val inspection = inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aNoMatchException("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742a(element: JsonElement): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b = element.isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b>()
  return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsFromPostalCodeXb5bc742aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b = matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b) add("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b: value does not match InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X7d49668b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
