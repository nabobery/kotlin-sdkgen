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

public enum class InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deBranch {
  InvoicePaymentMethodOptionsCustomerBalance,
}

public sealed class InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deNoMatchException(
  message: String,
) : InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deDecodingException(message)

internal data class InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deInspection(
  public val matchesInvoicePaymentMethodOptionsCustomerBalance: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsCustomerBalance).count { it }
}

/**
 * This sub-hash contains details about the Bank transfer payment method options to pass to invoices created by the
 * subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options/properties/customer_ba
 * lance
 */
@Serializable(with = InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de.Serializer::class)
public class InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deInspection,
) {
  public val invoicePaymentMethodOptionsCustomerBalance:
      InvoicePaymentMethodOptionsCustomerBalanceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsCustomerBalance) json.decodeFromJsonElement<InvoicePaymentMethodOptionsCustomerBalanceView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deBranch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsCustomerBalance) add(InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deBranch.InvoicePaymentMethodOptionsCustomerBalance)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de {
      val inspection = inspectInlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deNoMatchException("InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818de(element: JsonElement): InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deInspection(
    matchesInvoicePaymentMethodOptionsCustomerBalance = false,
    failures = listOf("InvoicePaymentMethodOptionsCustomerBalance: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsCustomerBalance = true
  return InlineSubscriptionsResourcePaymentMethodOptionsCustomerBalanceX313818deInspection(
    matchesInvoicePaymentMethodOptionsCustomerBalance = matchesInvoicePaymentMethodOptionsCustomerBalance,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsCustomerBalance) add("InvoicePaymentMethodOptionsCustomerBalance: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
