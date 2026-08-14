package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/paths/~1keys/get/responses/200/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1keys/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineKeysGetResponse200JsonX70b5db68.Serializer::class)
public class InlineKeysGetResponse200JsonX70b5db68(
  `data`: List<InlineKeysGetResponse200JsonDataItemX600a6c0b>,
) {
  /**
   * List of API keys
   */
  public val `data`: List<InlineKeysGetResponse200JsonDataItemX600a6c0b> = data.toList()

  public class Builder {
    private var dataValue: List<InlineKeysGetResponse200JsonDataItemX600a6c0b>? = null

    public var `data`: List<InlineKeysGetResponse200JsonDataItemX600a6c0b>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    public fun build(): InlineKeysGetResponse200JsonX70b5db68 {
      check(dataValue != null) { "data is required" }
      return InlineKeysGetResponse200JsonX70b5db68(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineKeysGetResponse200JsonX70b5db68 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineKeysGetResponse200JsonX70b5db68> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineKeysGetResponse200JsonX70b5db68 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineKeysGetResponse200JsonX70b5db68")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineKeysGetResponse200JsonX70b5db68 must be a JSON object")
      val data = json.decodeRequired<List<InlineKeysGetResponse200JsonDataItemX600a6c0b>>(rawObject, "data")
      return InlineKeysGetResponse200JsonX70b5db68(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineKeysGetResponse200JsonX70b5db68) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineKeysGetResponse200JsonX70b5db68")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineKeysGetResponse200JsonX70b5db68(block: InlineKeysGetResponse200JsonX70b5db68.Builder.() -> Unit): InlineKeysGetResponse200JsonX70b5db68 = InlineKeysGetResponse200JsonX70b5db68.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineKeysGetResponse200JsonX70b5db68 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
