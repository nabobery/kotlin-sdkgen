package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4(
  public val customMandateUrl:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae? = null,
  defaultFor: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa>? = null,
  public val intervalDescription: String? = null,
  public val paymentSchedule:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053? = null,
  public val transactionType:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX1413cfd1? = null,
) {
  public val defaultFor:
      List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa>? =
      defaultFor?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var customMandateUrl:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae? = null

    private var defaultForValue:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa>? = null

    public var defaultFor:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa>?
      get() = defaultForValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultForValue = value?.let { collection0 -> collection0.toList() }
      }

    public var intervalDescription: String? = null

    public var paymentSchedule:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053? = null

    public var transactionType:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX1413cfd1? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4(
      customMandateUrl = customMandateUrl,
      defaultFor = defaultFor,
      intervalDescription = intervalDescription,
      paymentSchedule = paymentSchedule,
      transactionType = transactionType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4(
        customMandateUrl = rawObject["custom_mandate_url"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae>(it) },
        defaultFor = rawObject["default_for"]?.let { json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitItemXf16657aa>>(it) },
        intervalDescription = rawObject["interval_description"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentSchedule = rawObject["payment_schedule"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaymentScheduleXdba62053>(it) },
        transactionType = rawObject["transaction_type"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX1413cfd1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4")
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXa13a19b4.build(block)
