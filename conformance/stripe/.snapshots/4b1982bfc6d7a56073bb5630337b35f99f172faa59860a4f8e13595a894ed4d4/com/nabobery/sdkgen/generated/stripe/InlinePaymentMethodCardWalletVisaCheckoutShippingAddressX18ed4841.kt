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

public enum class InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841Branch {
  Address,
}

public sealed class InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841NoMatchException(
  message: String,
) : InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841DecodingException(message)

internal data class InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841Inspection(
  public val matchesAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAddress).count { it }
}

/**
 * Owner's verified shipping address. Values are verified or provided by the wallet directly (if supported) at the time
 * of authorization or settlement. They cannot be set or mutated.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_card_wallet_visa_checkout/properties/shipping_address
 */
@Serializable(with = InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841.Serializer::class)
public class InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841Inspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841Branch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841Branch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841 {
      val inspection = inspectInlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841NoMatchException("InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841) {
      encoder.requireJsonEncoder("InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841(element: JsonElement): InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841Inspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlinePaymentMethodCardWalletVisaCheckoutShippingAddressX18ed4841Inspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
