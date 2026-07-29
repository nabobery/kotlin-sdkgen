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

public enum class InlineCheckoutSessionTotalDetailsXcd1469e3Branch {
  PaymentPagesCheckoutSessionTotalDetails,
}

public sealed class InlineCheckoutSessionTotalDetailsXcd1469e3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionTotalDetailsXcd1469e3NoMatchException(
  message: String,
) : InlineCheckoutSessionTotalDetailsXcd1469e3DecodingException(message)

internal data class InlineCheckoutSessionTotalDetailsXcd1469e3Inspection(
  public val matchesPaymentPagesCheckoutSessionTotalDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionTotalDetails).count { it }
}

/**
 * Tax and discount details for the computed total amount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/total_details
 */
@Serializable(with = InlineCheckoutSessionTotalDetailsXcd1469e3.Serializer::class)
public class InlineCheckoutSessionTotalDetailsXcd1469e3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionTotalDetailsXcd1469e3Inspection,
) {
  public val paymentPagesCheckoutSessionTotalDetails: PaymentPagesCheckoutSessionTotalDetailsView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionTotalDetails) json.decodeFromJsonElement<PaymentPagesCheckoutSessionTotalDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionTotalDetailsXcd1469e3Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionTotalDetails) add(InlineCheckoutSessionTotalDetailsXcd1469e3Branch.PaymentPagesCheckoutSessionTotalDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionTotalDetailsXcd1469e3 {
      val inspection = inspectInlineCheckoutSessionTotalDetailsXcd1469e3(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionTotalDetailsXcd1469e3NoMatchException("InlineCheckoutSessionTotalDetailsXcd1469e3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionTotalDetailsXcd1469e3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionTotalDetailsXcd1469e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionTotalDetailsXcd1469e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionTotalDetailsXcd1469e3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionTotalDetailsXcd1469e3) {
      encoder.requireJsonEncoder("InlineCheckoutSessionTotalDetailsXcd1469e3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionTotalDetailsXcd1469e3(element: JsonElement): InlineCheckoutSessionTotalDetailsXcd1469e3Inspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionTotalDetailsXcd1469e3Inspection(
    matchesPaymentPagesCheckoutSessionTotalDetails = false,
    failures = listOf("PaymentPagesCheckoutSessionTotalDetails: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionTotalDetails = raw["amount_discount"] != null && raw["amount_tax"] != null
  return InlineCheckoutSessionTotalDetailsXcd1469e3Inspection(
    matchesPaymentPagesCheckoutSessionTotalDetails = matchesPaymentPagesCheckoutSessionTotalDetails,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionTotalDetails) add("PaymentPagesCheckoutSessionTotalDetails: required properties 'amount_discount', 'amount_tax' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
