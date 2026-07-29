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

public enum class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995Branch {
  Branch1,
  InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995NoMatchException(
  message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995DecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/to_postal_code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/to_postal_code
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c) json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c) add(InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995Branch.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995 {
      val inspection = inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995NoMatchException("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995(element: JsonElement): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c = element.isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c>()
  return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsToPostalCodeXfc13a995Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c = matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c) add("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c: value does not match InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa4a6ca6c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
