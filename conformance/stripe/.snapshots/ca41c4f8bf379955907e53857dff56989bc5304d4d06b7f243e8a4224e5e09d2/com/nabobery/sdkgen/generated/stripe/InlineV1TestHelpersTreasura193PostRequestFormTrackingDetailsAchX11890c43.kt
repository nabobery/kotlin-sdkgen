package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/tracking_details/properties/ach.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/tracking_details/properties/ach
 */
@Serializable(with = InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43.Serializer::class)
public class InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43(
  public val traceId: String,
) {
  public class Builder {
    private var traceIdValue: String? = null

    public var traceId: String
      get() = requireNotNull(traceIdValue) { "traceId is required" }
      set(`value`) {
        traceIdValue = value
      }

    public fun build(): InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43 {
      check(traceIdValue != null) { "traceId is required" }
      return InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43(
        traceId = traceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43 must be a JSON object")
      val traceId = json.decodeRequired<String>(rawObject, "trace_id")
      return InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43(
        traceId = traceId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("trace_id", value.traceId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43(block: InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43.Builder.() -> Unit): InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43 = InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsAchX11890c43 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
