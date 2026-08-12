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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c(
  public val amount: Int,
  public val amountType:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardAmountTypeXb7c8aaff,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  public val interval: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXb26db952,
  public val reference: String,
  public val startDate: Int,
  public val description: String? = null,
  public val endDate: Int? = null,
  public val intervalCount: Int? = null,
  supportedTypes: List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXd995f0ac>? = null,
) {
  public val supportedTypes:
      List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXd995f0ac>? =
      supportedTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var amountTypeValue:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardAmountTypeXb7c8aaff? = null

    public var amountType:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardAmountTypeXb7c8aaff
      get() = requireNotNull(amountTypeValue) { "amountType is required" }
      set(`value`) {
        amountTypeValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var intervalValue:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXb26db952? = null

    public var interval:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXb26db952
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
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXd995f0ac>? = null

    public var supportedTypes:
        List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXd995f0ac>?
      get() = supportedTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        supportedTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c {
      check(amountValue != null) { "amount is required" }
      check(amountTypeValue != null) { "amountType is required" }
      check(currencyValue != null) { "currency is required" }
      check(intervalValue != null) { "interval is required" }
      check(referenceValue != null) { "reference is required" }
      check(startDateValue != null) { "startDate is required" }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c(
        amount = amount,
        amountType = amountType,
        currency = currency,
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
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val amountType = json.decodeRequired<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardAmountTypeXb7c8aaff>(rawObject, "amount_type")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val interval = json.decodeRequired<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardIntervalXb26db952>(rawObject, "interval")
      val reference = json.decodeRequired<String>(rawObject, "reference")
      val startDate = json.decodeRequired<Int>(rawObject, "start_date")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c(
        amount = amount,
        amountType = amountType,
        currency = currency,
        interval = interval,
        reference = reference,
        startDate = startDate,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<Int>(it) },
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
        supportedTypes = rawObject["supported_types"]?.let { json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardItemXd995f0ac>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("amount_type", json.encodeToJsonElement(value.amountType))
        put("currency", value.currency)
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX6034332c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
