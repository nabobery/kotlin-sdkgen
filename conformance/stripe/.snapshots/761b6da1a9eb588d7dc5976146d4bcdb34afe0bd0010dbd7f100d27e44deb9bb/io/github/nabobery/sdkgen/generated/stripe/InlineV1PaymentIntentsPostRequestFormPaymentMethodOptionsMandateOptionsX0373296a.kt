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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a(
  public val amount: Int? = null,
  public val amountIncludesIof:
      InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e? = null,
  public val amountType:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAmountTypeX5e5ac69e? = null,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val endDate: String? = null,
  public val paymentSchedule: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb? = null,
  public val reference: String? = null,
  public val startDate: String? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var amountIncludesIof: InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e? =
        null

    public var amountType:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAmountTypeX5e5ac69e? = null

    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public var endDate: String? = null

    public var paymentSchedule: InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb? =
        null

    public var reference: String? = null

    public var startDate: String? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a(
      amount = amount,
      amountIncludesIof = amountIncludesIof,
      amountType = amountType,
      currency = currency,
      endDate = endDate,
      paymentSchedule = paymentSchedule,
      reference = reference,
      startDate = startDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixAmountTypeX5e5ac69e>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentScheduleX43407eeb>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.endDate?.let { put("end_date", it) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
        value.reference?.let { put("reference", it) }
        value.startDate?.let { put("start_date", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX0373296a.build(block)
