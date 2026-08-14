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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentIntentCustomerX0992ed81Branch {
  Branch1,
  Customer,
  DeletedCustomer,
}

public sealed class InlinePaymentIntentCustomerX0992ed81DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentCustomerX0992ed81NoMatchException(
  message: String,
) : InlinePaymentIntentCustomerX0992ed81DecodingException(message)

internal data class InlinePaymentIntentCustomerX0992ed81Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * ID of the Customer this PaymentIntent belongs to, if one exists.
 *
 * Payment methods attached to other Customers cannot be used with this PaymentIntent.
 *
 * If [setup_future_usage](https://api.stripe.com#payment_intent_object-setup_future_usage) is set and this
 * PaymentIntent's payment method is not `card_present`, then the payment method attaches to the Customer after the
 * PaymentIntent has been confirmed and any required actions from the user are complete. If the payment method is
 * `card_present` and isn't a digital wallet, then a
 * [generated_card](https://docs.stripe.com/api/charges/object#charge_object-payment_method_details-card_present-generat
 * ed_card) payment method representing the card is created and attached to the Customer instead.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/customer
 */
@Serializable(with = InlinePaymentIntentCustomerX0992ed81.Serializer::class)
public class InlinePaymentIntentCustomerX0992ed81 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentCustomerX0992ed81Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val deletedCustomer: DeletedCustomer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomer>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentCustomerX0992ed81Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentIntentCustomerX0992ed81Branch.Branch1)
      if (inspection.matchesCustomer) add(InlinePaymentIntentCustomerX0992ed81Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlinePaymentIntentCustomerX0992ed81Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentCustomerX0992ed81 {
      val inspection = inspectInlinePaymentIntentCustomerX0992ed81(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentCustomerX0992ed81NoMatchException("InlinePaymentIntentCustomerX0992ed81 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentCustomerX0992ed81(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentCustomerX0992ed81> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentCustomerX0992ed81 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentCustomerX0992ed81")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentCustomerX0992ed81) {
      encoder.requireJsonEncoder("InlinePaymentIntentCustomerX0992ed81").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentCustomerX0992ed81(element: JsonElement): InlinePaymentIntentCustomerX0992ed81Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  val matchesDeletedCustomer = element.isJsonDecodable<DeletedCustomer>()
  return InlinePaymentIntentCustomerX0992ed81Inspection(
    matchesBranch1 = matchesBranch1,
    matchesCustomer = matchesCustomer,
    matchesDeletedCustomer = matchesDeletedCustomer,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCustomer) add("Customer: value does not match Customer")
      if (!matchesDeletedCustomer) add("DeletedCustomer: value does not match DeletedCustomer")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
