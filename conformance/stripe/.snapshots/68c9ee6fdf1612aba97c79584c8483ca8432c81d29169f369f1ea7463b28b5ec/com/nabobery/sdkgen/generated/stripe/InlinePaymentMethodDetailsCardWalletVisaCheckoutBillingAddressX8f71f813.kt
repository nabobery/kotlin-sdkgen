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

public enum class InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813Branch {
  Address,
}

public sealed class InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813NoMatchException(
  message: String,
) : InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813DecodingException(message)

internal data class InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813Inspection(
  public val matchesAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAddress).count { it }
}

/**
 * Owner's verified billing address. Values are verified or provided by the wallet directly (if supported) at the time
 * of authorization or settlement. They cannot be set or mutated.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_wallet_visa_checkout/properties/billing_
 * address
 */
@Serializable(with = InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813.Serializer::class)
public class InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813Inspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813Branch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813Branch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813 {
      val inspection = inspectInlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813NoMatchException("InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813(element: JsonElement): InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813Inspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlinePaymentMethodDetailsCardWalletVisaCheckoutBillingAddressX8f71f813Inspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
