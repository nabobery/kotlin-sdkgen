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

public enum class InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815Branch {
  PaypalSellerProtection,
}

public sealed class InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815NoMatchException(
  message: String,
) : InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815DecodingException(message)

internal data class InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815Inspection(
  public val matchesPaypalSellerProtection: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaypalSellerProtection).count { it }
}

/**
 * The level of protection offered as defined by PayPal Seller Protection for Merchants, for this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_paypal/properties/seller_protection
 */
@Serializable(with = InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815.Serializer::class)
public class InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815Inspection,
) {
  public val paypalSellerProtection: PaypalSellerProtectionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaypalSellerProtection) json.decodeFromJsonElement<PaypalSellerProtectionView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815Branch>
    get() = buildSet {
      if (inspection.matchesPaypalSellerProtection) add(InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815Branch.PaypalSellerProtection)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815 {
      val inspection = inspectInlinePaymentMethodDetailsPaypalSellerProtectionX4705f815(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815NoMatchException("InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsPaypalSellerProtectionX4705f815(element: JsonElement): InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815Inspection(
    matchesPaypalSellerProtection = false,
    failures = listOf("PaypalSellerProtection: expected JSON object"),
  )
  val matchesPaypalSellerProtection = raw["status"] != null
  return InlinePaymentMethodDetailsPaypalSellerProtectionX4705f815Inspection(
    matchesPaypalSellerProtection = matchesPaypalSellerProtection,
    failures = buildList {
      if (!matchesPaypalSellerProtection) add("PaypalSellerProtection: required properties 'status' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
