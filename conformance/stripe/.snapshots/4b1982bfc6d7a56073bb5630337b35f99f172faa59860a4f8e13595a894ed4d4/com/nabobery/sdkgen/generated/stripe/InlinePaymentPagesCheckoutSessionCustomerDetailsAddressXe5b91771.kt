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

public enum class InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771Branch {
  Address,
}

public sealed class InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771NoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771Inspection(
  public val matchesAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAddress).count { it }
}

/**
 * The customer's address after a completed Checkout Session. Note: This property is populated only for sessions on or
 * after March 30, 2022.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_customer_details/properties/address
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771.Serializer::class)
public class InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771Inspection,
) {
  public val address: AddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771Branch>
    get() = buildSet {
      if (inspection.matchesAddress) add(InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771Branch.Address)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771 {
      val inspection = inspectInlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771NoMatchException("InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771(element: JsonElement): InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771Inspection(
    matchesAddress = false,
    failures = listOf("Address: expected JSON object"),
  )
  val matchesAddress = true
  return InlinePaymentPagesCheckoutSessionCustomerDetailsAddressXe5b91771Inspection(
    matchesAddress = matchesAddress,
    failures = buildList {
      if (!matchesAddress) add("Address: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
