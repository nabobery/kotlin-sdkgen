package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/t
 * ime_range.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/t
 * ime_range
 */
@Serializable(with = InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf.Serializer::class)
public class InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val end: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val start: String,
) {
  public class Builder {
    private var endValue: String? = null

    public var end: String
      get() = requireNotNull(endValue) { "end is required" }
      set(`value`) {
        endValue = value
      }

    private var startValue: String? = null

    public var start: String
      get() = requireNotNull(startValue) { "start is required" }
      set(`value`) {
        startValue = value
      }

    public fun build(): InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      return InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf(
        end = end,
        start = start,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf must be a JSON object")
      val end = json.decodeRequired<String>(rawObject, "end")
      val start = json.decodeRequired<String>(rawObject, "start")
      return InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf(
        end = end,
        start = start,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", value.end)
        put("start", value.start)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf(block: InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf.Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf = InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonTimeRangeX83acfeaf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
