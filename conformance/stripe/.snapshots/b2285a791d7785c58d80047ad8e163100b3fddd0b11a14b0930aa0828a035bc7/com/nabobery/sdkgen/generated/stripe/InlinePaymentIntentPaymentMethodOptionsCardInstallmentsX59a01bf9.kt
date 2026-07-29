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

public enum class InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9Branch {
  PaymentMethodOptionsCardInstallments,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9NoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9Inspection(
  public val matchesPaymentMethodOptionsCardInstallments: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsCardInstallments).count { it }
}

/**
 * Installment details for this payment.
 *
 * For more information, see the [installments integration guide](https://docs.stripe.com/payments/installments).
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_card/properties/installments
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9Inspection,
) {
  public val paymentMethodOptionsCardInstallments: PaymentMethodOptionsCardInstallmentsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsCardInstallments) json.decodeFromJsonElement<PaymentMethodOptionsCardInstallmentsView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsCardInstallments) add(InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9Branch.PaymentMethodOptionsCardInstallments)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9 {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9NoMatchException("InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9Inspection(
    matchesPaymentMethodOptionsCardInstallments = false,
    failures = listOf("PaymentMethodOptionsCardInstallments: expected JSON object"),
  )
  val matchesPaymentMethodOptionsCardInstallments = raw["enabled"] != null
  return InlinePaymentIntentPaymentMethodOptionsCardInstallmentsX59a01bf9Inspection(
    matchesPaymentMethodOptionsCardInstallments = matchesPaymentMethodOptionsCardInstallments,
    failures = buildList {
      if (!matchesPaymentMethodOptionsCardInstallments) add("PaymentMethodOptionsCardInstallments: required properties 'enabled' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
