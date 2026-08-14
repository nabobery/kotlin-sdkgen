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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping/anyOf/0/properties/to_postal_code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping/anyOf/0/properties/to_postal_code
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0NoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf2X656d3fda")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
