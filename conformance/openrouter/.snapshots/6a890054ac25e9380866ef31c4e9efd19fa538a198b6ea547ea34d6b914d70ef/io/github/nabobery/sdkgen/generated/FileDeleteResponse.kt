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
 * Confirmation that a file was deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileDeleteResponse
 */
@Serializable(with = FileDeleteResponse.Serializer::class)
public class FileDeleteResponse(
  public val id: String,
  public val type: InlineFileDeleteResponseTypeXe73eefd8,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var typeValue: InlineFileDeleteResponseTypeXe73eefd8? = null

    public var type: InlineFileDeleteResponseTypeXe73eefd8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FileDeleteResponse {
      check(idValue != null) { "id is required" }
      check(typeValue != null) { "type is required" }
      return FileDeleteResponse(
        id = id,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FileDeleteResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FileDeleteResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FileDeleteResponse {
      val jsonDecoder = decoder.requireJsonDecoder("FileDeleteResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FileDeleteResponse must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val type = json.decodeRequired<InlineFileDeleteResponseTypeXe73eefd8>(rawObject, "type")
      return FileDeleteResponse(
        id = id,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FileDeleteResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("FileDeleteResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fileDeleteResponse(block: FileDeleteResponse.Builder.() -> Unit): FileDeleteResponse = FileDeleteResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FileDeleteResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
