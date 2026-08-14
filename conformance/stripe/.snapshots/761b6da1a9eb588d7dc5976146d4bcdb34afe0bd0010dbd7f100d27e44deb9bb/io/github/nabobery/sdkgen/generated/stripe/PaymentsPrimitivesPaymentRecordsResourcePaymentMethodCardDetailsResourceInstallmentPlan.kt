package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlanView(
  public val count: Int? = null,
  public val interval: InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc? = null,
  public val type: InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_installment_plan
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan(
  /**
   * Type of installment plan, one of `fixed_count`, `revolving`, or `bonus`.
   */
  public val type: InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa,
  /**
   * For `fixed_count` installment plans, this is the number of installment payments your customer will make to their
   * credit card.
   */
  public val count: Int? = null,
  /**
   * For `fixed_count` installment plans, this is the interval between installment payments your customer will make to
   * their credit card. One of `month`.
   */
  public val interval: InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc? = null,
) {
  public class Builder {
    private var typeValue: InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa? = null

    public var type: InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * For `fixed_count` installment plans, this is the number of installment payments your customer will make to their
     * credit card.
     */
    public var count: Int? = null

    /**
     * For `fixed_count` installment plans, this is the interval between installment payments your customer will make to
     * their credit card. One of `month`.
     */
    public var interval: InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan {
      check(typeValue != null) { "type is required" }
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan(
        type = type,
        count = count,
        interval = interval,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan must be a JSON object")
      val type = json.decodeRequired<InlinePaymentsPrimitivesPa2bc5TypeXb3aeaafa>(rawObject, "type")
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan(
        type = type,
        count = rawObject["count"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        interval = rawObject["interval"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa2bc5IntervalX8ad847bc?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.count?.let { put("count", json.encodeToJsonElement(it)) }
        value.interval?.let { put("interval", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan(block: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceInstallmentPlan is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
