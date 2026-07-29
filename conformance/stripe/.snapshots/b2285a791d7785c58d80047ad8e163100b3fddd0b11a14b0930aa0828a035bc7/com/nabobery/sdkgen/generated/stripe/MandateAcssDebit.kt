package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_acss_debit
 */
@Serializable(with = MandateAcssDebit.Serializer::class)
public class MandateAcssDebit(
  /**
   * Payment schedule for the mandate.
   */
  public val paymentSchedule: InlineMandateAcssDebitPaymentScheduleX56c488b6,
  /**
   * Transaction type of the mandate.
   */
  public val transactionType: InlineMandateAcssDebitTransactionTypeXaf9f9ebd,
  defaultFor: List<InlineMandateAcssDebitDefaultForItemX1a0cdd90>? = null,
  /**
   * Description of the interval. Only required if the 'payment_schedule' parameter is 'interval' or 'combined'.
   */
  public val intervalDescription: String? = null,
) {
  /**
   * List of Stripe products where this mandate can be selected automatically.
   */
  public val defaultFor: List<InlineMandateAcssDebitDefaultForItemX1a0cdd90>? =
      defaultFor?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var paymentScheduleValue: InlineMandateAcssDebitPaymentScheduleX56c488b6? = null

    public var paymentSchedule: InlineMandateAcssDebitPaymentScheduleX56c488b6
      get() = requireNotNull(paymentScheduleValue) { "paymentSchedule is required" }
      set(`value`) {
        paymentScheduleValue = value
      }

    private var transactionTypeValue: InlineMandateAcssDebitTransactionTypeXaf9f9ebd? = null

    public var transactionType: InlineMandateAcssDebitTransactionTypeXaf9f9ebd
      get() = requireNotNull(transactionTypeValue) { "transactionType is required" }
      set(`value`) {
        transactionTypeValue = value
      }

    private var defaultForValue: List<InlineMandateAcssDebitDefaultForItemX1a0cdd90>? = null

    /**
     * List of Stripe products where this mandate can be selected automatically.
     */
    public var defaultFor: List<InlineMandateAcssDebitDefaultForItemX1a0cdd90>?
      get() = defaultForValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultForValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Description of the interval. Only required if the 'payment_schedule' parameter is 'interval' or 'combined'.
     */
    public var intervalDescription: String? = null

    public fun build(): MandateAcssDebit {
      check(paymentScheduleValue != null) { "paymentSchedule is required" }
      check(transactionTypeValue != null) { "transactionType is required" }
      return MandateAcssDebit(
        paymentSchedule = paymentSchedule,
        transactionType = transactionType,
        defaultFor = defaultFor,
        intervalDescription = intervalDescription,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MandateAcssDebit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MandateAcssDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MandateAcssDebit {
      val jsonDecoder = decoder.requireJsonDecoder("MandateAcssDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MandateAcssDebit must be a JSON object")
      val paymentSchedule = json.decodeRequired<InlineMandateAcssDebitPaymentScheduleX56c488b6>(rawObject, "payment_schedule")
      val transactionType = json.decodeRequired<InlineMandateAcssDebitTransactionTypeXaf9f9ebd>(rawObject, "transaction_type")
      return MandateAcssDebit(
        paymentSchedule = paymentSchedule,
        transactionType = transactionType,
        defaultFor = rawObject["default_for"]?.let { json.decodeFromJsonElement<List<InlineMandateAcssDebitDefaultForItemX1a0cdd90>>(it) },
        intervalDescription = rawObject["interval_description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MandateAcssDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("MandateAcssDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_schedule", json.encodeToJsonElement(value.paymentSchedule))
        put("transaction_type", json.encodeToJsonElement(value.transactionType))
        value.defaultFor?.let { put("default_for", json.encodeToJsonElement(it)) }
        value.intervalDescription?.let { put("interval_description", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mandateAcssDebit(block: MandateAcssDebit.Builder.() -> Unit): MandateAcssDebit = MandateAcssDebit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MandateAcssDebit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
