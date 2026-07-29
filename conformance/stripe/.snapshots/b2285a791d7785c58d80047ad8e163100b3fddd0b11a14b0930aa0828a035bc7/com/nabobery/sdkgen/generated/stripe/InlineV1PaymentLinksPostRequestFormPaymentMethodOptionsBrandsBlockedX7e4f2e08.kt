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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08Branch {
  Branch1,
  InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb,
}

public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions/anyOf
 * /0/properties/brands_blocked.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions/anyOf
 * /0/properties/brands_blocked
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08Inspection,
) {
  public val branch1:
      List<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613>>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08Branch.Branch1)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb) add(InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08Branch.InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08NoMatchException("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08(element: JsonElement): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardItemX9bca4613>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb>()
  return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb = matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb) add("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb: value does not match InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf2X48ed44bb")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
