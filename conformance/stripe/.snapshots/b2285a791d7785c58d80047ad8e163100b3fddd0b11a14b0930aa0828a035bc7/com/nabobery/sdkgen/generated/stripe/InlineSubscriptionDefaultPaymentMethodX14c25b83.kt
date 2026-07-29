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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSubscriptionDefaultPaymentMethodX14c25b83Branch {
  Branch1,
  PaymentMethod,
}

public sealed class InlineSubscriptionDefaultPaymentMethodX14c25b83DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionDefaultPaymentMethodX14c25b83NoMatchException(
  message: String,
) : InlineSubscriptionDefaultPaymentMethodX14c25b83DecodingException(message)

internal data class InlineSubscriptionDefaultPaymentMethodX14c25b83Inspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentMethod: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentMethod).count { it }
}

/**
 * ID of the default payment method for the subscription. It must belong to the customer associated with the
 * subscription. This takes precedence over `default_source`. If neither are set, invoices will use the customer's
 * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_settin
 * gs-default_payment_method) or
 * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/default_payment_method
 */
@Serializable(with = InlineSubscriptionDefaultPaymentMethodX14c25b83.Serializer::class)
public class InlineSubscriptionDefaultPaymentMethodX14c25b83 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionDefaultPaymentMethodX14c25b83Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentMethod: PaymentMethod? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethod) json.decodeFromJsonElement<PaymentMethod>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionDefaultPaymentMethodX14c25b83Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionDefaultPaymentMethodX14c25b83Branch.Branch1)
      if (inspection.matchesPaymentMethod) add(InlineSubscriptionDefaultPaymentMethodX14c25b83Branch.PaymentMethod)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionDefaultPaymentMethodX14c25b83 {
      val inspection = inspectInlineSubscriptionDefaultPaymentMethodX14c25b83(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionDefaultPaymentMethodX14c25b83NoMatchException("InlineSubscriptionDefaultPaymentMethodX14c25b83 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionDefaultPaymentMethodX14c25b83(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionDefaultPaymentMethodX14c25b83> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionDefaultPaymentMethodX14c25b83 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionDefaultPaymentMethodX14c25b83")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionDefaultPaymentMethodX14c25b83) {
      encoder.requireJsonEncoder("InlineSubscriptionDefaultPaymentMethodX14c25b83").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionDefaultPaymentMethodX14c25b83(element: JsonElement): InlineSubscriptionDefaultPaymentMethodX14c25b83Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentMethod = element.isJsonDecodable<PaymentMethod>()
  return InlineSubscriptionDefaultPaymentMethodX14c25b83Inspection(
    matchesBranch1 = matchesBranch1,
    matchesPaymentMethod = matchesPaymentMethod,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPaymentMethod) add("PaymentMethod: value does not match PaymentMethod")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
