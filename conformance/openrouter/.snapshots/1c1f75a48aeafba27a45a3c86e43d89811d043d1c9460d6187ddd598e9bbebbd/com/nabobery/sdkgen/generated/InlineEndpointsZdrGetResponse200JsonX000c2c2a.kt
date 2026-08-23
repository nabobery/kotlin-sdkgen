package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1endpoints~1zdr/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1endpoints~1zdr/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineEndpointsZdrGetResponse200JsonX000c2c2a.Serializer::class)
public class InlineEndpointsZdrGetResponse200JsonX000c2c2a(
  `data`: List<PublicEndpoint>,
) {
  public val `data`: List<PublicEndpoint> = data.toList()

  public class Builder {
    private var dataValue: List<PublicEndpoint>? = null

    public var `data`: List<PublicEndpoint>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    public fun build(): InlineEndpointsZdrGetResponse200JsonX000c2c2a {
      check(dataValue != null) { "data is required" }
      return InlineEndpointsZdrGetResponse200JsonX000c2c2a(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEndpointsZdrGetResponse200JsonX000c2c2a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEndpointsZdrGetResponse200JsonX000c2c2a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEndpointsZdrGetResponse200JsonX000c2c2a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEndpointsZdrGetResponse200JsonX000c2c2a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEndpointsZdrGetResponse200JsonX000c2c2a must be a JSON object")
      val data = json.decodeRequired<List<PublicEndpoint>>(rawObject, "data")
      return InlineEndpointsZdrGetResponse200JsonX000c2c2a(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEndpointsZdrGetResponse200JsonX000c2c2a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEndpointsZdrGetResponse200JsonX000c2c2a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEndpointsZdrGetResponse200JsonX000c2c2a(block: InlineEndpointsZdrGetResponse200JsonX000c2c2a.Builder.() -> Unit): InlineEndpointsZdrGetResponse200JsonX000c2c2a = InlineEndpointsZdrGetResponse200JsonX000c2c2a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEndpointsZdrGetResponse200JsonX000c2c2a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
