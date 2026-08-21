package com.nabobery.sdkgen.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/o
 * rder_by.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/o
 * rder_by
 */
@Serializable(with = InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296.Serializer::class)
public class InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296(
  public val direction: InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682,
  /**
   * Field to order by
   */
  public val `field`: String,
) {
  public class Builder {
    private var directionValue: InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682? = null

    public var direction: InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682
      get() = requireNotNull(directionValue) { "direction is required" }
      set(`value`) {
        directionValue = value
      }

    private var fieldValue: String? = null

    public var `field`: String
      get() = requireNotNull(fieldValue) { "field is required" }
      set(`value`) {
        fieldValue = value
      }

    public fun build(): InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296 {
      check(directionValue != null) { "direction is required" }
      check(fieldValue != null) { "field is required" }
      return InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296(
        direction = direction,
        field = field,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296 must be a JSON object")
      val direction = json.decodeRequired<InlineAnalyticsQueryPostRequestJsonOrderByDirectionXb7a79682>(rawObject, "direction")
      val field = json.decodeRequired<String>(rawObject, "field")
      return InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296(
        direction = direction,
        field = field,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("direction", json.encodeToJsonElement(value.direction))
        put("field", value.field)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsQueryPostRequestJsonOrderByXf94cf296(block: InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296.Builder.() -> Unit): InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296 = InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsQueryPostRequestJsonOrderByXf94cf296 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
