package io.github.nabobery.sdkgen.github.generated

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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/classroom
 */
@Serializable(with = Classroom.Serializer::class)
public class Classroom(
  /**
   * Whether classroom is archived.
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
  public val organization: SimpleClassroomOrganization,
  /**
   * The URL of the classroom on GitHub Classroom.
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

    private var organizationValue: SimpleClassroomOrganization? = null

    public var organization: SimpleClassroomOrganization
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): Classroom {
      check(archivedValue != null) { "archived is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(organizationValue != null) { "organization is required" }
      check(urlValue != null) { "url is required" }
      return Classroom(
        archived = archived,
        id = id,
        name = name,
        organization = organization,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Classroom = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Classroom> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Classroom {
      val jsonDecoder = decoder.requireJsonDecoder("Classroom")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Classroom must be a JSON object")
      val archived = json.decodeRequired<Boolean>(rawObject, "archived")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val organization = json.decodeRequired<SimpleClassroomOrganization>(rawObject, "organization")
      val url = json.decodeRequired<String>(rawObject, "url")
      return Classroom(
        archived = archived,
        id = id,
        name = name,
        organization = organization,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Classroom) {
      val jsonEncoder = encoder.requireJsonEncoder("Classroom")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("archived", json.encodeToJsonElement(value.archived))
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("organization", json.encodeToJsonElement(value.organization))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun classroom(block: Classroom.Builder.() -> Unit): Classroom = Classroom.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Classroom is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
