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

public enum class InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbBranch {
  Address,
}

public sealed class InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbNoMatchException(
  message: String,
) : InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbDecodingException(message)

internal data class InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbInspection(
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
 * sdkgen://source/openapi.json#/components/schemas/payment_method_card_wallet_masterpass/properties/billing_address
 */
@Serializable(with = InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb.Serializer::class)
public class InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbInspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbBranch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbBranch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb {
      val inspection = inspectInlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbNoMatchException("InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb) {
      encoder.requireJsonEncoder("InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fb(element: JsonElement): InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbInspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlinePaymentMethodCardWalletMasterpassBillingAddressX9cc916fbInspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
