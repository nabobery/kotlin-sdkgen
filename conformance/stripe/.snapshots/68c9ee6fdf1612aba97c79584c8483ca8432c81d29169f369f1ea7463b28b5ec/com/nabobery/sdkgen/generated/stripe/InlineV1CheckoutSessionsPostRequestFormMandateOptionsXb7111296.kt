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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/pix/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/pix/properties/mandate_options
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296(
  public val amount: Int? = null,
  public val amountIncludesIof:
      InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofX3737cb64? = null,
  public val amountType:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae? = null,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val endDate: String? = null,
  public val paymentSchedule:
      InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd? = null,
  public val reference: String? = null,
  public val startDate: String? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var amountIncludesIof: InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofX3737cb64?
        = null

    public var amountType:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae? = null

    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public var endDate: String? = null

    public var paymentSchedule: InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd? =
        null

    public var reference: String? = null

    public var startDate: String? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296 = InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296(
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
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormAmountIncludesIofX3737cb64>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmountTypeX382ec7ae>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentScheduleX6d3e76cd>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296")
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

public fun inlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296(block: InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296 = InlineV1CheckoutSessionsPostRequestFormMandateOptionsXb7111296.build(block)
