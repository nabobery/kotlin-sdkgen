package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * A GitHub Classroom classroom
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-classroom
 */
@Serializable(with = SimpleClassroom.Serializer::class)
public class SimpleClassroom(
  /**
   * Returns whether classroom is archived or not.
   */
  public val archived: Boolean,
  /**
   * Unique identifier of the classroom.
   */
  public val id: Int,
  /**
   * The name of the classroom.
   */
  public val name: String,
  /**
   * The url of the classroom on GitHub Classroom.
   */
  public val url: String,
) {
  public class Builder {
    private var archivedValue: Boolean? = null

    public var archived: Boolean
      get() = requireNotNull(archivedValue) { "archived is required" }
      set(`value`) {
        archivedValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): SimpleClassroom {
      check(archivedValue != null) { "archived is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      return SimpleClassroom(
        archived = archived,
        id = id,
        name = name,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SimpleClassroom = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SimpleClassroom> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SimpleClassroom {
      val jsonDecoder = decoder.requireJsonDecoder("SimpleClassroom")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SimpleClassroom must be a JSON object")
      val archived = json.decodeRequired<Boolean>(rawObject, "archived")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      return SimpleClassroom(
        archived = archived,
        id = id,
        name = name,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SimpleClassroom) {
      val jsonEncoder = encoder.requireJsonEncoder("SimpleClassroom")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("archived", json.encodeToJsonElement(value.archived))
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun simpleClassroom(block: SimpleClassroom.Builder.() -> Unit): SimpleClassroom = SimpleClassroom.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SimpleClassroom is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
