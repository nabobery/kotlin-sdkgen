package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f(
  public val amount: Int,
  public val amountType: InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3,
  public val interval: InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc,
  public val reference: String,
  public val startDate: Int,
  public val description: String? = null,
  public val endDate: Int? = null,
  public val intervalCount: Int? = null,
  supportedTypes: List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX418a1f70>? = null,
) {
  public val supportedTypes:
      List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX418a1f70>? =
      supportedTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var amountTypeValue: InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3? =
        null

    public var amountType: InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3
      get() = requireNotNull(amountTypeValue) { "amountType is required" }
      set(`value`) {
        amountTypeValue = value
      }

    private var intervalValue: InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc? = null

    public var interval: InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    private var referenceValue: String? = null

    public var reference: String
      get() = requireNotNull(referenceValue) { "reference is required" }
      set(`value`) {
        referenceValue = value
      }

    private var startDateValue: Int? = null

    public var startDate: Int
      get() = requireNotNull(startDateValue) { "startDate is required" }
      set(`value`) {
        startDateValue = value
      }

    public var description: String? = null

    public var endDate: Int? = null

    public var intervalCount: Int? = null

    private var supportedTypesValue:
        List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX418a1f70>? = null

    public var supportedTypes:
        List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX418a1f70>?
      get() = supportedTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f {
      check(amountValue != null) { "amount is required" }
      check(amountTypeValue != null) { "amountType is required" }
      check(intervalValue != null) { "interval is required" }
      check(referenceValue != null) { "reference is required" }
      check(startDateValue != null) { "startDate is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f(
        amount = amount,
        amountType = amountType,
        interval = interval,
        reference = reference,
        startDate = startDate,
        description = description,
        endDate = endDate,
        intervalCount = intervalCount,
        supportedTypes = supportedTypes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val amountType = json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormAmountTypeX453c27a3>(rawObject, "amount_type")
      val interval = json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc>(rawObject, "interval")
      val reference = json.decodeRequired<String>(rawObject, "reference")
      val startDate = json.decodeRequired<Int>(rawObject, "start_date")
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f(
        amount = amount,
        amountType = amountType,
        interval = interval,
        reference = reference,
        startDate = startDate,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<Int>(it) },
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        supportedTypes = rawObject["supported_types"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemX418a1f70>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("amount_type", json.encodeToJsonElement(value.amountType))
        put("interval", json.encodeToJsonElement(value.interval))
        put("reference", value.reference)
        put("start_date", json.encodeToJsonElement(value.startDate))
        value.description?.let { put("description", it) }
        value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
        value.supportedTypes?.let { put("supported_types", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f(block: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX604eed4f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
