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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentLinkShippingAddressCollectionXeac79dd6Branch {
  PaymentLinksResourceShippingAddressCollection,
}

public sealed class InlinePaymentLinkShippingAddressCollectionXeac79dd6DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinkShippingAddressCollectionXeac79dd6NoMatchException(
  message: String,
) : InlinePaymentLinkShippingAddressCollectionXeac79dd6DecodingException(message)

internal data class InlinePaymentLinkShippingAddressCollectionXeac79dd6Inspection(
  public val matchesPaymentLinksResourceShippingAddressCollection: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceShippingAddressCollection).count { it }
}

/**
 * Configuration for collecting the customer's shipping address.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/shipping_address_collection
 */
@Serializable(with = InlinePaymentLinkShippingAddressCollectionXeac79dd6.Serializer::class)
public class InlinePaymentLinkShippingAddressCollectionXeac79dd6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinkShippingAddressCollectionXeac79dd6Inspection,
) {
  public val paymentLinksResourceShippingAddressCollection:
      PaymentLinksResourceShippingAddressCollectionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceShippingAddressCollection) json.decodeFromJsonElement<PaymentLinksResourceShippingAddressCollectionView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinkShippingAddressCollectionXeac79dd6Branch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceShippingAddressCollection) add(InlinePaymentLinkShippingAddressCollectionXeac79dd6Branch.PaymentLinksResourceShippingAddressCollection)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinkShippingAddressCollectionXeac79dd6 {
      val inspection = inspectInlinePaymentLinkShippingAddressCollectionXeac79dd6(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinkShippingAddressCollectionXeac79dd6NoMatchException("InlinePaymentLinkShippingAddressCollectionXeac79dd6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinkShippingAddressCollectionXeac79dd6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinkShippingAddressCollectionXeac79dd6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinkShippingAddressCollectionXeac79dd6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkShippingAddressCollectionXeac79dd6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkShippingAddressCollectionXeac79dd6) {
      encoder.requireJsonEncoder("InlinePaymentLinkShippingAddressCollectionXeac79dd6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinkShippingAddressCollectionXeac79dd6(element: JsonElement): InlinePaymentLinkShippingAddressCollectionXeac79dd6Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinkShippingAddressCollectionXeac79dd6Inspection(
    matchesPaymentLinksResourceShippingAddressCollection = false,
    failures = listOf("PaymentLinksResourceShippingAddressCollection: expected JSON object"),
  )
  val matchesPaymentLinksResourceShippingAddressCollection = raw["allowed_countries"] != null
  return InlinePaymentLinkShippingAddressCollectionXeac79dd6Inspection(
    matchesPaymentLinksResourceShippingAddressCollection = matchesPaymentLinksResourceShippingAddressCollection,
    failures = buildList {
      if (!matchesPaymentLinksResourceShippingAddressCollection) add("PaymentLinksResourceShippingAddressCollection: required properties 'allowed_countries' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
