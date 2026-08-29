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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Rules that control the lifecycle of this card, such as automatic cancellation. Refer to our
 * [documentation](/issuing/controls/lifecycle-controls) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/lifecycle_controls
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f(
  public val cancelAfter: InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41,
) {
  public class Builder {
    private var cancelAfterValue:
        InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41? = null

    public var cancelAfter: InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41
      get() = requireNotNull(cancelAfterValue) { "cancelAfter is required" }
      set(`value`) {
        cancelAfterValue = value
      }

    public fun build(): InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f {
      check(cancelAfterValue != null) { "cancelAfter is required" }
      return InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f(
        cancelAfter = cancelAfter,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f must be a JSON object")
      val cancelAfter = json.decodeRequired<InlineV1IssuingCardsPostRequestFormLifecycleControlsCancelAfterX06e34d41>(rawObject, "cancel_after")
      return InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f(
        cancelAfter = cancelAfter,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cancel_after", json.encodeToJsonElement(value.cancelAfter))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f(block: InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f.Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f = InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
