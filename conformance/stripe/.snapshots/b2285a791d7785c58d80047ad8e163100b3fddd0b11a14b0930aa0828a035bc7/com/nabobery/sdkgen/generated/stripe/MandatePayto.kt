package com.nabobery.sdkgen.generated.stripe

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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_payto
 */
@Serializable(with = MandatePayto.Serializer::class)
public class MandatePayto(
  /**
   * The type of amount that will be collected. The amount charged must be exact or up to the value of `amount` param
   * for `fixed` or `maximum` type respectively. Defaults to `maximum`.
   */
  public val amountType: InlineMandatePaytoAmountTypeXa993e554,
  /**
   * The periodicity at which payments will be collected. Defaults to `adhoc`.
   */
  public val paymentSchedule: InlineMandatePaytoPaymentScheduleX3b38629b,
  /**
   * Amount that will be collected. It is required when `amount_type` is `fixed`.
   */
  public val amount: Int? = null,
  /**
   * Date, in YYYY-MM-DD format, after which payments will not be collected. Defaults to no end date.
   */
  public val endDate: String? = null,
  /**
   * The number of payments that will be made during a payment period. Defaults to 1 except for when `payment_schedule`
   * is `adhoc`. In that case, it defaults to no limit.
   */
  public val paymentsPerPeriod: Int? = null,
  /**
   * The purpose for which payments are made. Has a default value based on your merchant category code.
   */
  public val purpose: InlineMandatePaytoPurposeXa378e6f3? = null,
  /**
   * Date, in YYYY-MM-DD format, from which payments will be collected. Defaults to confirmation time.
   */
  public val startDate: String? = null,
) {
  public class Builder {
    private var amountTypeValue: InlineMandatePaytoAmountTypeXa993e554? = null

    public var amountType: InlineMandatePaytoAmountTypeXa993e554
      get() = requireNotNull(amountTypeValue) { "amountType is required" }
      set(`value`) {
        amountTypeValue = value
      }

    private var paymentScheduleValue: InlineMandatePaytoPaymentScheduleX3b38629b? = null

    public var paymentSchedule: InlineMandatePaytoPaymentScheduleX3b38629b
      get() = requireNotNull(paymentScheduleValue) { "paymentSchedule is required" }
      set(`value`) {
        paymentScheduleValue = value
      }

    /**
     * Amount that will be collected. It is required when `amount_type` is `fixed`.
     */
    public var amount: Int? = null

    /**
     * Date, in YYYY-MM-DD format, after which payments will not be collected. Defaults to no end date.
     */
    public var endDate: String? = null

    /**
     * The number of payments that will be made during a payment period. Defaults to 1 except for when
     * `payment_schedule` is `adhoc`. In that case, it defaults to no limit.
     */
    public var paymentsPerPeriod: Int? = null

    /**
     * The purpose for which payments are made. Has a default value based on your merchant category code.
     */
    public var purpose: InlineMandatePaytoPurposeXa378e6f3? = null

    /**
     * Date, in YYYY-MM-DD format, from which payments will be collected. Defaults to confirmation time.
     */
    public var startDate: String? = null

    public fun build(): MandatePayto {
      check(amountTypeValue != null) { "amountType is required" }
      check(paymentScheduleValue != null) { "paymentSchedule is required" }
      return MandatePayto(
        amountType = amountType,
        paymentSchedule = paymentSchedule,
        amount = amount,
        endDate = endDate,
        paymentsPerPeriod = paymentsPerPeriod,
        purpose = purpose,
        startDate = startDate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MandatePayto = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MandatePayto> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MandatePayto {
      val jsonDecoder = decoder.requireJsonDecoder("MandatePayto")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MandatePayto must be a JSON object")
      val amountType = json.decodeRequired<InlineMandatePaytoAmountTypeXa993e554>(rawObject, "amount_type")
      val paymentSchedule = json.decodeRequired<InlineMandatePaytoPaymentScheduleX3b38629b>(rawObject, "payment_schedule")
      return MandatePayto(
        amountType = amountType,
        paymentSchedule = paymentSchedule,
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        endDate = rawObject["end_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        paymentsPerPeriod = rawObject["payments_per_period"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        purpose = rawObject["purpose"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineMandatePaytoPurposeXa378e6f3?>(element) },
        startDate = rawObject["start_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MandatePayto) {
      val jsonEncoder = encoder.requireJsonEncoder("MandatePayto")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount_type", json.encodeToJsonElement(value.amountType))
        put("payment_schedule", json.encodeToJsonElement(value.paymentSchedule))
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.endDate?.let { put("end_date", it) }
        value.paymentsPerPeriod?.let { put("payments_per_period", json.encodeToJsonElement(it)) }
        value.purpose?.let { put("purpose", json.encodeToJsonElement(it)) }
        value.startDate?.let { put("start_date", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mandatePayto(block: MandatePayto.Builder.() -> Unit): MandatePayto = MandatePayto.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MandatePayto is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
