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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a(
  public val customMandateUrl:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5? = null,
  defaultFor: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4>? = null,
  public val intervalDescription: String? = null,
  public val paymentSchedule:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f? = null,
  public val transactionType:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb? = null,
) {
  public val defaultFor:
      List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4>? =
      defaultFor?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var customMandateUrl:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5? = null

    private var defaultForValue:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4>? = null

    public var defaultFor:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4>?
      get() = defaultForValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultForValue = value?.let { collection0 -> collection0.toList() }
      }

    public var intervalDescription: String? = null

    public var paymentSchedule:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f? = null

    public var transactionType:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a(
      customMandateUrl = customMandateUrl,
      defaultFor = defaultFor,
      intervalDescription = intervalDescription,
      paymentSchedule = paymentSchedule,
      transactionType = transactionType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a(
        customMandateUrl = rawObject["custom_mandate_url"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX9581a6a5>(it) },
        defaultFor = rawObject["default_for"]?.let { json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemX5bf47ce4>>(it) },
        intervalDescription = rawObject["interval_description"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleX7221206f>(it) },
        transactionType = rawObject["transaction_type"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customMandateUrl?.let { put("custom_mandate_url", json.encodeToJsonElement(it)) }
        value.defaultFor?.let { put("default_for", json.encodeToJsonElement(it)) }
        value.intervalDescription?.let { put("interval_description", it) }
        value.paymentSchedule?.let { put("payment_schedule", json.encodeToJsonElement(it)) }
        value.transactionType?.let { put("transaction_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXab7daf8a.build(block)
