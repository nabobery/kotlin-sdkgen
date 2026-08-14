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

public enum class InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccBranch {
  PaymentIntentPaymentMethodOptionsUsBankAccount,
  PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccNoMatchException(
  message: String,
) : InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccInspection(
  public val matchesPaymentIntentPaymentMethodOptionsUsBankAccount: Boolean,
  public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentIntentPaymentMethodOptionsUsBankAccount, matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccInspection,
) {
  public val paymentIntentPaymentMethodOptionsUsBankAccount:
      PaymentIntentPaymentMethodOptionsUsBankAccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentPaymentMethodOptionsUsBankAccount) json.decodeFromJsonElement<PaymentIntentPaymentMethodOptionsUsBankAccountView>(raw) else null }

  public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
      PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccBranch>
    get() = buildSet {
      if (inspection.matchesPaymentIntentPaymentMethodOptionsUsBankAccount) add(InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccBranch.PaymentIntentPaymentMethodOptionsUsBankAccount)
      if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add(InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccBranch.PaymentIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc {
      val inspection = inspectInlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccNoMatchException("InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc) {
      encoder.requireJsonEncoder("InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc(element: JsonElement): InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccInspection {
  val raw = element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccInspection(
    matchesPaymentIntentPaymentMethodOptionsUsBankAccount = false,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("PaymentIntentPaymentMethodOptionsUsBankAccount: expected JSON object", "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesPaymentIntentPaymentMethodOptionsUsBankAccount = true
  val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42eccInspection(
    matchesPaymentIntentPaymentMethodOptionsUsBankAccount = matchesPaymentIntentPaymentMethodOptionsUsBankAccount,
    matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesPaymentIntentPaymentMethodOptionsUsBankAccount) add("PaymentIntentPaymentMethodOptionsUsBankAccount: required properties  do not match their declared types")
      if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) add("PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
