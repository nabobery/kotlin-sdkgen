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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711(
  public val amount: Int? = null,
  public val amountIncludesIof:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountIncludesIofXc99767e8? = null,
  public val endDate: String? = null,
  public val paymentSchedule:
      InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentScheduleXb139cb86? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var amountIncludesIof:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountIncludesIofXc99767e8? = null

    public var endDate: String? = null

    public var paymentSchedule:
        InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentScheduleXb139cb86? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711 = InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711(
      amount = amount,
      amountIncludesIof = amountIncludesIof,
      endDate = endDate,
      paymentSchedule = paymentSchedule,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountIncludesIof = rawObject["amount_includes_iof"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsAmountIncludesIofXc99767e8>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsPaymentScheduleXb139cb86>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711")
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

public fun inlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711(block: InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711 = InlineV1SubscriptionsPostRequestFormPaymentSettingsMandateOptionsX4e503711.build(block)
