package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 * Specifies which event to cancel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meter_event_adjustments/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/cancel
 */
@Serializable(with = InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417.Serializer::class)
public class InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417(
  public val identifier: String? = null,
) {
  public class Builder {
    public var identifier: String? = null

    public fun build(): InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417 = InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417(
      identifier = identifier,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417 must be a JSON object")
      return InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417(
        identifier = rawObject["identifier"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.identifier?.let { put("identifier", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417(block: InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417.Builder.() -> Unit): InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417 = InlineV1BillingMeterEventAdjustmentsPostRequestFormCancelX5b9a3417.build(block)
