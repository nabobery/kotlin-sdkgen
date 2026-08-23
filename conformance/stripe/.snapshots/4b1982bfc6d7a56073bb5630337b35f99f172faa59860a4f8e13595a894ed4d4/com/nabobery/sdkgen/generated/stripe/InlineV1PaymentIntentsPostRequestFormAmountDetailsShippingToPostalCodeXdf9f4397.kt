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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping/anyOf/0/properties/to_postal_code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping/anyOf/0/properties/to_postal_code
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397NoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingToPostalCodeXdf9f4397Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2X48b0f6dc")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
