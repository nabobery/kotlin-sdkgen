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

public enum class InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911Branch {
  Address,
}

public sealed class InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911NoMatchException(
  message: String,
) : InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911DecodingException(message)

internal data class InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_wallet_masterpass/properties/shipping_ad
 * dress
 */
@Serializable(with = InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911.Serializer::class)
public class InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911Inspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911Branch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911Branch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911 {
      val inspection = inspectInlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911NoMatchException("InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911(element: JsonElement): InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911Inspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlinePaymentMethodDetailsCardWalletMasterpassShippingAddressXa2825911Inspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
