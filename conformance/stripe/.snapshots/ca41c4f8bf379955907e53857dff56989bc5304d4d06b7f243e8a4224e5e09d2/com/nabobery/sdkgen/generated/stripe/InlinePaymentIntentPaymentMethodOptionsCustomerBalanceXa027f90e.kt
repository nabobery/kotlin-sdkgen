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

public enum class InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eBranch {
  PaymentMethodOptionsCustomerBalance,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eNoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eInspection(
  public val matchesPaymentMethodOptionsCustomerBalance: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodOptionsCustomerBalance, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/customer_balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/customer_balance
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eInspection,
) {
  public val paymentMethodOptionsCustomerBalance: PaymentMethodOptionsCustomerBalanceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodOptionsCustomerBalance) json.decodeFromJsonElement<PaymentMethodOptionsCustomerBalanceView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodOptionsCustomerBalance) add(InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eBranch.PaymentMethodOptionsCustomerBalance)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eBranch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eNoMatchException("InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eInspection(
    matchesPaymentMethodOptionsCustomerBalance = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentMethodOptionsCustomerBalance: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentMethodOptionsCustomerBalance = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90eInspection(
    matchesPaymentMethodOptionsCustomerBalance = matchesPaymentMethodOptionsCustomerBalance,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentMethodOptionsCustomerBalance) add("PaymentMethodOptionsCustomerBalance: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
