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

public enum class InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cBranch {
  InvoicePaymentMethodOptionsBancontact,
}

public sealed class InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cNoMatchException(
  message: String,
) : InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cDecodingException(message)

internal data class InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cInspection(
  public val matchesInvoicePaymentMethodOptionsBancontact: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicePaymentMethodOptionsBancontact).count { it }
}

/**
 * This sub-hash contains details about the Bancontact payment method options to pass to invoices created by the
 * subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options/properties/bancontact
 */
@Serializable(with = InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c.Serializer::class)
public class InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cInspection,
) {
  public val invoicePaymentMethodOptionsBancontact: InvoicePaymentMethodOptionsBancontactView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicePaymentMethodOptionsBancontact) json.decodeFromJsonElement<InvoicePaymentMethodOptionsBancontactView>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cBranch>
    get() = buildSet {
      if (inspection.matchesInvoicePaymentMethodOptionsBancontact) add(InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cBranch.InvoicePaymentMethodOptionsBancontact)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c {
      val inspection = inspectInlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cNoMatchException("InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49c(element: JsonElement): InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cInspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cInspection(
    matchesInvoicePaymentMethodOptionsBancontact = false,
    failures = listOf("InvoicePaymentMethodOptionsBancontact: expected JSON object"),
  )
  val matchesInvoicePaymentMethodOptionsBancontact = raw["preferred_language"] != null
  return InlineSubscriptionsResourcePaymentMethodOptionsBancontactX9391c49cInspection(
    matchesInvoicePaymentMethodOptionsBancontact = matchesInvoicePaymentMethodOptionsBancontact,
    failures = buildList {
      if (!matchesInvoicePaymentMethodOptionsBancontact) add("InvoicePaymentMethodOptionsBancontact: required properties 'preferred_language' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
