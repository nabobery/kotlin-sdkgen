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

public enum class InlineCheckoutSessionCustomerDetailsX1b41d011Branch {
  PaymentPagesCheckoutSessionCustomerDetails,
}

public sealed class InlineCheckoutSessionCustomerDetailsX1b41d011DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionCustomerDetailsX1b41d011NoMatchException(
  message: String,
) : InlineCheckoutSessionCustomerDetailsX1b41d011DecodingException(message)

internal data class InlineCheckoutSessionCustomerDetailsX1b41d011Inspection(
  public val matchesPaymentPagesCheckoutSessionCustomerDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionCustomerDetails).count { it }
}

/**
 * The customer details including the customer's tax exempt status and the customer's tax IDs. Customer's address
 * details are not present on Sessions in `setup` mode.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/customer_details
 */
@Serializable(with = InlineCheckoutSessionCustomerDetailsX1b41d011.Serializer::class)
public class InlineCheckoutSessionCustomerDetailsX1b41d011 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionCustomerDetailsX1b41d011Inspection,
) {
  public val paymentPagesCheckoutSessionCustomerDetails:
      PaymentPagesCheckoutSessionCustomerDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionCustomerDetails) json.decodeFromJsonElement<PaymentPagesCheckoutSessionCustomerDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionCustomerDetailsX1b41d011Branch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionCustomerDetails) add(InlineCheckoutSessionCustomerDetailsX1b41d011Branch.PaymentPagesCheckoutSessionCustomerDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionCustomerDetailsX1b41d011 {
      val inspection = inspectInlineCheckoutSessionCustomerDetailsX1b41d011(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionCustomerDetailsX1b41d011NoMatchException("InlineCheckoutSessionCustomerDetailsX1b41d011 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionCustomerDetailsX1b41d011(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionCustomerDetailsX1b41d011> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionCustomerDetailsX1b41d011 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionCustomerDetailsX1b41d011")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionCustomerDetailsX1b41d011) {
      encoder.requireJsonEncoder("InlineCheckoutSessionCustomerDetailsX1b41d011").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionCustomerDetailsX1b41d011(element: JsonElement): InlineCheckoutSessionCustomerDetailsX1b41d011Inspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionCustomerDetailsX1b41d011Inspection(
    matchesPaymentPagesCheckoutSessionCustomerDetails = false,
    failures = listOf("PaymentPagesCheckoutSessionCustomerDetails: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionCustomerDetails = true
  return InlineCheckoutSessionCustomerDetailsX1b41d011Inspection(
    matchesPaymentPagesCheckoutSessionCustomerDetails = matchesPaymentPagesCheckoutSessionCustomerDetails,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionCustomerDetails) add("PaymentPagesCheckoutSessionCustomerDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
