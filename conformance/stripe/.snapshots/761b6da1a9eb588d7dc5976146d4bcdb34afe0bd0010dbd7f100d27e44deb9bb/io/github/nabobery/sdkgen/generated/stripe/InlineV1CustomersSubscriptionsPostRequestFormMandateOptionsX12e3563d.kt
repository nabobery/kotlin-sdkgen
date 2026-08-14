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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/pix/anyOf/0/pro
 * perties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/pix/anyOf/0/pro
 * perties/mandate_options
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d(
  public val amount: Int? = null,
  public val amountIncludesIof:
      InlineV1CustomersSubscriptionsPostRequestFormAmountIncludesIofX0d0d5453? = null,
  public val endDate: String? = null,
  public val paymentSchedule:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentScheduleX922eb494? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var amountIncludesIof:
        InlineV1CustomersSubscriptionsPostRequestFormAmountIncludesIofX0d0d5453? = null

    public var endDate: String? = null

    public var paymentSchedule:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentScheduleX922eb494? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d(
      amount = amount,
      amountIncludesIof = amountIncludesIof,
      endDate = endDate,
      paymentSchedule = paymentSchedule,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAmountIncludesIofX0d0d5453>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentScheduleX922eb494>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
        value.endDate?.let { put("end_date", it) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d(block: InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d = InlineV1CustomersSubscriptionsPostRequestFormMandateOptionsX12e3563d.build(block)
