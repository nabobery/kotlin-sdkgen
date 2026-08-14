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
 * sdkgen://source/openapi.yaml#/paths/~1models~1{author}~1{slug}~1endpoints/get/responses/200/content/application~1json
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1models~1{author}~1{slug}~1endpoints/get/responses/200/content/application~1json
 * /schema
 */
@Serializable(with = InlineModelsEndpointsGetResponse200JsonX9c68b9cb.Serializer::class)
public class InlineModelsEndpointsGetResponse200JsonX9c68b9cb(
  public val `data`: ListEndpointsResponse,
) {
  public class Builder {
    private var dataValue: ListEndpointsResponse? = null

    public var `data`: ListEndpointsResponse
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): InlineModelsEndpointsGetResponse200JsonX9c68b9cb {
      check(dataValue != null) { "data is required" }
      return InlineModelsEndpointsGetResponse200JsonX9c68b9cb(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineModelsEndpointsGetResponse200JsonX9c68b9cb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineModelsEndpointsGetResponse200JsonX9c68b9cb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineModelsEndpointsGetResponse200JsonX9c68b9cb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineModelsEndpointsGetResponse200JsonX9c68b9cb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineModelsEndpointsGetResponse200JsonX9c68b9cb must be a JSON object")
      val data = json.decodeRequired<ListEndpointsResponse>(rawObject, "data")
      return InlineModelsEndpointsGetResponse200JsonX9c68b9cb(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineModelsEndpointsGetResponse200JsonX9c68b9cb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineModelsEndpointsGetResponse200JsonX9c68b9cb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineModelsEndpointsGetResponse200JsonX9c68b9cb(block: InlineModelsEndpointsGetResponse200JsonX9c68b9cb.Builder.() -> Unit): InlineModelsEndpointsGetResponse200JsonX9c68b9cb = InlineModelsEndpointsGetResponse200JsonX9c68b9cb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineModelsEndpointsGetResponse200JsonX9c68b9cb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
