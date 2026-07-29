package com.nabobery.sdkgen.generated.stripe

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
 * Details about a returned OutboundTransfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}~1return/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/returned_details
 */
@Serializable(with = InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918.Serializer::class)
public class InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918(
  public val code:
      InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237? = null,
) {
  public class Builder {
    public var code: InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237? =
        null

    public fun build(): InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918 = InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918(
      code = code,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918 must be a JSON object")
      return InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918(
        code = rawObject["code"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsCodeX94e03237>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.code?.let { put("code", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918(block: InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918.Builder.() -> Unit): InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918 = InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918.build(block)
