package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/klarna/properties/on_demand.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/klarna/properties/on_demand
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b(
  public val averageAmount: Int? = null,
  public val maximumAmount: Int? = null,
  public val minimumAmount: Int? = null,
  public val purchaseInterval:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalX7a52d2d4? = null,
  public val purchaseIntervalCount: Int? = null,
) {
  public class Builder {
    public var averageAmount: Int? = null

    public var maximumAmount: Int? = null

    public var minimumAmount: Int? = null

    public var purchaseInterval:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalX7a52d2d4? = null

    public var purchaseIntervalCount: Int? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b(
      averageAmount = averageAmount,
      maximumAmount = maximumAmount,
      minimumAmount = minimumAmount,
      purchaseInterval = purchaseInterval,
      purchaseIntervalCount = purchaseIntervalCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b(
        averageAmount = rawObject["average_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        maximumAmount = rawObject["maximum_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        minimumAmount = rawObject["minimum_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        purchaseInterval = rawObject["purchase_interval"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPurchaseIntervalX7a52d2d4>(it) },
        purchaseIntervalCount = rawObject["purchase_interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.averageAmount?.let { put("average_amount", json.encodeToJsonElement(it)) }
        value.maximumAmount?.let { put("maximum_amount", json.encodeToJsonElement(it)) }
        value.minimumAmount?.let { put("minimum_amount", json.encodeToJsonElement(it)) }
        value.purchaseInterval?.let { put("purchase_interval", json.encodeToJsonElement(it)) }
        value.purchaseIntervalCount?.let { put("purchase_interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b.build(block)
