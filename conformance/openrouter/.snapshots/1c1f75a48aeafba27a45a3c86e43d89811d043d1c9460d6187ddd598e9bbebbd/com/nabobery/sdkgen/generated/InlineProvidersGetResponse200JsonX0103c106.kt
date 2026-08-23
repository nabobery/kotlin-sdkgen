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
 * sdkgen://source/openapi.yaml#/paths/~1providers/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1providers/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineProvidersGetResponse200JsonX0103c106.Serializer::class)
public class InlineProvidersGetResponse200JsonX0103c106(
  `data`: List<InlineProvidersGetResponse200JsonDataItemX79465556>,
) {
  public val `data`: List<InlineProvidersGetResponse200JsonDataItemX79465556> = data.toList()

  public class Builder {
    private var dataValue: List<InlineProvidersGetResponse200JsonDataItemX79465556>? = null

    public var `data`: List<InlineProvidersGetResponse200JsonDataItemX79465556>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    public fun build(): InlineProvidersGetResponse200JsonX0103c106 {
      check(dataValue != null) { "data is required" }
      return InlineProvidersGetResponse200JsonX0103c106(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProvidersGetResponse200JsonX0103c106 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProvidersGetResponse200JsonX0103c106> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProvidersGetResponse200JsonX0103c106 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProvidersGetResponse200JsonX0103c106")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProvidersGetResponse200JsonX0103c106 must be a JSON object")
      val data = json.decodeRequired<List<InlineProvidersGetResponse200JsonDataItemX79465556>>(rawObject, "data")
      return InlineProvidersGetResponse200JsonX0103c106(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProvidersGetResponse200JsonX0103c106) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProvidersGetResponse200JsonX0103c106")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProvidersGetResponse200JsonX0103c106(block: InlineProvidersGetResponse200JsonX0103c106.Builder.() -> Unit): InlineProvidersGetResponse200JsonX0103c106 = InlineProvidersGetResponse200JsonX0103c106.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProvidersGetResponse200JsonX0103c106 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
