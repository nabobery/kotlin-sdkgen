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

public enum class InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eBranch {
  Address,
}

public sealed class InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eNoMatchException(
  message: String,
) : InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eDecodingException(message)

internal data class InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eInspection(
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
 * sdkgen://source/openapi.json#/components/schemas/payment_method_card_wallet_visa_checkout/properties/billing_address
 */
@Serializable(with = InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e.Serializer::class)
public class InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eInspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eBranch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eBranch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e {
      val inspection = inspectInlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eNoMatchException("InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e) {
      encoder.requireJsonEncoder("InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76e(element: JsonElement): InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eInspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlinePaymentMethodCardWalletVisaCheckoutBillingAddressX4741e76eInspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
