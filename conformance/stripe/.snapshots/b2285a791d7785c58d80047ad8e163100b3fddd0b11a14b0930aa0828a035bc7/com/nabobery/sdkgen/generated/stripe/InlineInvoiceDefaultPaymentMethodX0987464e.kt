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

public enum class InlineInvoiceDefaultPaymentMethodX0987464eBranch {
  Branch1,
  PaymentMethod,
}

public sealed class InlineInvoiceDefaultPaymentMethodX0987464eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceDefaultPaymentMethodX0987464eNoMatchException(
  message: String,
) : InlineInvoiceDefaultPaymentMethodX0987464eDecodingException(message)

internal data class InlineInvoiceDefaultPaymentMethodX0987464eInspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentMethod: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentMethod).count { it }
}

/**
 * ID of the default payment method for the invoice. It must belong to the customer associated with the invoice. If not
 * set, defaults to the subscription's default payment method, if any, or to the default payment method in the
 * customer's invoice settings.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/default_payment_method
 */
@Serializable(with = InlineInvoiceDefaultPaymentMethodX0987464e.Serializer::class)
public class InlineInvoiceDefaultPaymentMethodX0987464e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceDefaultPaymentMethodX0987464eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentMethod: PaymentMethod? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethod) json.decodeFromJsonElement<PaymentMethod>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceDefaultPaymentMethodX0987464eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceDefaultPaymentMethodX0987464eBranch.Branch1)
      if (inspection.matchesPaymentMethod) add(InlineInvoiceDefaultPaymentMethodX0987464eBranch.PaymentMethod)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceDefaultPaymentMethodX0987464e {
      val inspection = inspectInlineInvoiceDefaultPaymentMethodX0987464e(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceDefaultPaymentMethodX0987464eNoMatchException("InlineInvoiceDefaultPaymentMethodX0987464e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceDefaultPaymentMethodX0987464e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceDefaultPaymentMethodX0987464e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceDefaultPaymentMethodX0987464e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceDefaultPaymentMethodX0987464e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceDefaultPaymentMethodX0987464e) {
      encoder.requireJsonEncoder("InlineInvoiceDefaultPaymentMethodX0987464e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceDefaultPaymentMethodX0987464e(element: JsonElement): InlineInvoiceDefaultPaymentMethodX0987464eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentMethod = element.isJsonDecodable<PaymentMethod>()
  return InlineInvoiceDefaultPaymentMethodX0987464eInspection(
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
