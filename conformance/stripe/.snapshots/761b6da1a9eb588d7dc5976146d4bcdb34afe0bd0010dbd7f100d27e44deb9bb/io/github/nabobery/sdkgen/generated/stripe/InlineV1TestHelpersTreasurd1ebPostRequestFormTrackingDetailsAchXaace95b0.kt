package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/tracking_details/properties/ach.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/tracking_details/properties/ach
 */
@Serializable(with = InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0.Serializer::class)
public class InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0(
  public val traceId: String,
) {
  public class Builder {
    private var traceIdValue: String? = null

    public var traceId: String
      get() = requireNotNull(traceIdValue) { "traceId is required" }
      set(`value`) {
        traceIdValue = value
      }

    public fun build(): InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0 {
      check(traceIdValue != null) { "traceId is required" }
      return InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0(
        traceId = traceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0 must be a JSON object")
      val traceId = json.decodeRequired<String>(rawObject, "trace_id")
      return InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0(
        traceId = traceId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("trace_id", value.traceId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0(block: InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0.Builder.() -> Unit): InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0 = InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersTreasurd1ebPostRequestFormTrackingDetailsAchXaace95b0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
