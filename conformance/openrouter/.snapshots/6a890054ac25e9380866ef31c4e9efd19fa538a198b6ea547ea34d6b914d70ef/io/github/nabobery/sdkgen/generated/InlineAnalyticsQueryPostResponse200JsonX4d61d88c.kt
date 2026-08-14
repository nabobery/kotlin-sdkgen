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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineAnalyticsQueryPostResponse200JsonX4d61d88c.Serializer::class)
public class InlineAnalyticsQueryPostResponse200JsonX4d61d88c(
  public val `data`: InlineAnalyticsQueryPostResponse200JsonDataX314b77b8,
) {
  public class Builder {
    private var dataValue: InlineAnalyticsQueryPostResponse200JsonDataX314b77b8? = null

    public var `data`: InlineAnalyticsQueryPostResponse200JsonDataX314b77b8
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlineAnalyticsQueryPostResponse200JsonX4d61d88c {
      check(dataValue != null) { "data is required" }
      return InlineAnalyticsQueryPostResponse200JsonX4d61d88c(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsQueryPostResponse200JsonX4d61d88c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsQueryPostResponse200JsonX4d61d88c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsQueryPostResponse200JsonX4d61d88c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsQueryPostResponse200JsonX4d61d88c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsQueryPostResponse200JsonX4d61d88c must be a JSON object")
      val data = json.decodeRequired<InlineAnalyticsQueryPostResponse200JsonDataX314b77b8>(rawObject, "data")
      return InlineAnalyticsQueryPostResponse200JsonX4d61d88c(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsQueryPostResponse200JsonX4d61d88c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsQueryPostResponse200JsonX4d61d88c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsQueryPostResponse200JsonX4d61d88c(block: InlineAnalyticsQueryPostResponse200JsonX4d61d88c.Builder.() -> Unit): InlineAnalyticsQueryPostResponse200JsonX4d61d88c = InlineAnalyticsQueryPostResponse200JsonX4d61d88c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsQueryPostResponse200JsonX4d61d88c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
