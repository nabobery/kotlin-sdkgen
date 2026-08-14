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

public enum class InlinePaymentMethodCustomerX819912bcBranch {
  Branch1,
  Customer,
}

public sealed class InlinePaymentMethodCustomerX819912bcDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCustomerX819912bcNoMatchException(
  message: String,
) : InlinePaymentMethodCustomerX819912bcDecodingException(message)

internal data class InlinePaymentMethodCustomerX819912bcInspection(
  public val matchesBranch1: Boolean,
  public val matchesCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCustomer).count { it }
}

/**
 * The ID of the Customer to which this PaymentMethod is saved. This will not be set when the PaymentMethod has not been
 * saved to a Customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method/properties/customer
 */
@Serializable(with = InlinePaymentMethodCustomerX819912bc.Serializer::class)
public class InlinePaymentMethodCustomerX819912bc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodCustomerX819912bcInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val customer: Customer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<Customer>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodCustomerX819912bcBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentMethodCustomerX819912bcBranch.Branch1)
      if (inspection.matchesCustomer) add(InlinePaymentMethodCustomerX819912bcBranch.Customer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCustomerX819912bc {
      val inspection = inspectInlinePaymentMethodCustomerX819912bc(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCustomerX819912bcNoMatchException("InlinePaymentMethodCustomerX819912bc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCustomerX819912bc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodCustomerX819912bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCustomerX819912bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCustomerX819912bc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCustomerX819912bc) {
      encoder.requireJsonEncoder("InlinePaymentMethodCustomerX819912bc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCustomerX819912bc(element: JsonElement): InlinePaymentMethodCustomerX819912bcInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCustomer = element.isJsonDecodable<Customer>()
  return InlinePaymentMethodCustomerX819912bcInspection(
    matchesBranch1 = matchesBranch1,
    matchesCustomer = matchesCustomer,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCustomer) add("Customer: value does not match Customer")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
