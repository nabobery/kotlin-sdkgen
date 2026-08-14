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

public enum class InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43,
}

public sealed class InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping/anyOf/0/properties/from_postal_code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/shipping/anyOf/0/properties/from_postal_code
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43) add(InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5Branch.InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5NoMatchException("InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5(element: JsonElement): InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43>()
  return InlineV1PaymentIntentsPostRequestFormAmountDetailsFromPostalCodeX71ddb9c5Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43 = matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43) add("InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43: value does not match InlineV1PaymentIntentsPostRequestFormAmountDetailsShippingAnyOf1AnyOf2Xdf196e43")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
