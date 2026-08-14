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

public enum class InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bBranch {
  PaymentMethodDetailsCardInstallmentsPlan,
}

public sealed class InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bNoMatchException(
  message: String,
) : InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bDecodingException(message)

internal data class InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bInspection(
  public val matchesPaymentMethodDetailsCardInstallmentsPlan: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodDetailsCardInstallmentsPlan).count { it }
}

/**
 * Installment plan selected for this PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_card_installments/properties/plan
 */
@Serializable(with = InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b.Serializer::class)
public class InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bInspection,
) {
  public val paymentMethodDetailsCardInstallmentsPlan: PaymentMethodDetailsCardInstallmentsPlanView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodDetailsCardInstallmentsPlan) json.decodeFromJsonElement<PaymentMethodDetailsCardInstallmentsPlanView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodDetailsCardInstallmentsPlan) add(InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bBranch.PaymentMethodDetailsCardInstallmentsPlan)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b {
      val inspection = inspectInlinePaymentMethodOptionsCardInstallmentsPlanXd122284b(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bNoMatchException("InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b) {
      encoder.requireJsonEncoder("InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodOptionsCardInstallmentsPlanXd122284b(element: JsonElement): InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bInspection(
    matchesPaymentMethodDetailsCardInstallmentsPlan = false,
    failures = listOf("PaymentMethodDetailsCardInstallmentsPlan: expected JSON object"),
  )
  val matchesPaymentMethodDetailsCardInstallmentsPlan = raw["type"] != null
  return InlinePaymentMethodOptionsCardInstallmentsPlanXd122284bInspection(
    matchesPaymentMethodDetailsCardInstallmentsPlan = matchesPaymentMethodDetailsCardInstallmentsPlan,
    failures = buildList {
      if (!matchesPaymentMethodDetailsCardInstallmentsPlan) add("PaymentMethodDetailsCardInstallmentsPlan: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
