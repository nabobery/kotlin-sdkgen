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

public enum class InlinePaymentsPrimitivesPa30b9PlanX60befe21Branch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan,
}

public sealed class InlinePaymentsPrimitivesPa30b9PlanX60befe21DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentsPrimitivesPa30b9PlanX60befe21NoMatchException(
  message: String,
) : InlinePaymentsPrimitivesPa30b9PlanX60befe21DecodingException(message)

internal data class InlinePaymentsPrimitivesPa30b9PlanX60befe21Inspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan).count { it }
}

/**
 * Installment plan selected for the payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_installments/properties/plan
 */
@Serializable(with = InlinePaymentsPrimitivesPa30b9PlanX60befe21.Serializer::class)
public class InlinePaymentsPrimitivesPa30b9PlanX60befe21 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentsPrimitivesPa30b9PlanX60befe21Inspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlanView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlanView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentsPrimitivesPa30b9PlanX60befe21Branch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan) add(InlinePaymentsPrimitivesPa30b9PlanX60befe21Branch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentsPrimitivesPa30b9PlanX60befe21 {
      val inspection = inspectInlinePaymentsPrimitivesPa30b9PlanX60befe21(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentsPrimitivesPa30b9PlanX60befe21NoMatchException("InlinePaymentsPrimitivesPa30b9PlanX60befe21 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentsPrimitivesPa30b9PlanX60befe21(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa30b9PlanX60befe21> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa30b9PlanX60befe21 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentsPrimitivesPa30b9PlanX60befe21")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa30b9PlanX60befe21) {
      encoder.requireJsonEncoder("InlinePaymentsPrimitivesPa30b9PlanX60befe21").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentsPrimitivesPa30b9PlanX60befe21(element: JsonElement): InlinePaymentsPrimitivesPa30b9PlanX60befe21Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentsPrimitivesPa30b9PlanX60befe21Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan = raw["type"] != null
  return InlinePaymentsPrimitivesPa30b9PlanX60befe21Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
