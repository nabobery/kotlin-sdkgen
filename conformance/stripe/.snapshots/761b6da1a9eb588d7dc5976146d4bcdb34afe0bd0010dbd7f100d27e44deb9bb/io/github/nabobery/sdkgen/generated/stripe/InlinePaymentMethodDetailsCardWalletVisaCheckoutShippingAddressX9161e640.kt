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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640Branch {
  Address,
}

public sealed class InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640NoMatchException(
  message: String,
) : InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640DecodingException(message)

internal data class InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_wallet_visa_checkout/properties/shipping
 * _address
 */
@Serializable(with = InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640.Serializer::class)
public class InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640Inspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640Branch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640Branch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640 {
      val inspection = inspectInlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640NoMatchException("InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640(element: JsonElement): InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640Inspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlinePaymentMethodDetailsCardWalletVisaCheckoutShippingAddressX9161e640Inspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
