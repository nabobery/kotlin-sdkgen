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

public enum class InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47Branch {
  InvoicePaymentMethodOptionsUsBankAccount,
}

public sealed class InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47NoMatchException(
  message: String,
) : InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47DecodingException(message)

internal data class InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47Inspection(
  public val matchesInvoicePaymentMethodOptionsUsBankAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsUsBankAccount).count { it }
}

/**
 * This sub-hash contains details about the ACH direct debit payment method options to pass to invoices created by the
 * subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options/properties/us_bank_acc
 * ount
 */
@Serializable(with = InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47.Serializer::class)
public class InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47Inspection,
) {
  public val invoicePaymentMethodOptionsUsBankAccount: InvoicePaymentMethodOptionsUsBankAccountView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsUsBankAccount) json.decodeFromJsonElement<InvoicePaymentMethodOptionsUsBankAccountView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47Branch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsUsBankAccount) add(InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47Branch.InvoicePaymentMethodOptionsUsBankAccount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47 {
      val inspection = inspectInlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47NoMatchException("InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47(element: JsonElement): InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47Inspection(
    matchesInvoicePaymentMethodOptionsUsBankAccount = false,
    failures = listOf("InvoicePaymentMethodOptionsUsBankAccount: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsUsBankAccount = true
  return InlineSubscriptionsResourcePaymentMethodOptionsUsBankAccountXd7ad0d47Inspection(
    matchesInvoicePaymentMethodOptionsUsBankAccount = matchesInvoicePaymentMethodOptionsUsBankAccount,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsUsBankAccount) add("InvoicePaymentMethodOptionsUsBankAccount: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
