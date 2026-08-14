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
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1analytics~1meta/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineAnalyticsMetaGetResponse200JsonX5f96620f.Serializer::class)
public class InlineAnalyticsMetaGetResponse200JsonX5f96620f(
  public val `data`: InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f,
) {
  public class Builder {
    private var dataValue: InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f? = null

    public var `data`: InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlineAnalyticsMetaGetResponse200JsonX5f96620f {
      check(dataValue != null) { "data is required" }
      return InlineAnalyticsMetaGetResponse200JsonX5f96620f(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonX5f96620f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnalyticsMetaGetResponse200JsonX5f96620f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnalyticsMetaGetResponse200JsonX5f96620f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnalyticsMetaGetResponse200JsonX5f96620f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonX5f96620f must be a JSON object")
      val data = json.decodeRequired<InlineAnalyticsMetaGetResponse200JsonDataXaf9d1e3f>(rawObject, "data")
      return InlineAnalyticsMetaGetResponse200JsonX5f96620f(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnalyticsMetaGetResponse200JsonX5f96620f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnalyticsMetaGetResponse200JsonX5f96620f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnalyticsMetaGetResponse200JsonX5f96620f(block: InlineAnalyticsMetaGetResponse200JsonX5f96620f.Builder.() -> Unit): InlineAnalyticsMetaGetResponse200JsonX5f96620f = InlineAnalyticsMetaGetResponse200JsonX5f96620f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnalyticsMetaGetResponse200JsonX5f96620f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
