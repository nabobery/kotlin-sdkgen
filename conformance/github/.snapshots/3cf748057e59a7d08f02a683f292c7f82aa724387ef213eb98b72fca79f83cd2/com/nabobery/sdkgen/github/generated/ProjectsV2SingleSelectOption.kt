package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * An option for a single select field
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-single-select-option
 */
@Serializable(with = ProjectsV2SingleSelectOption.Serializer::class)
public class ProjectsV2SingleSelectOption(
  /**
   * The unique identifier of the option.
   */
  public val id: String,
  /**
   * The display name of the option.
   */
  public val name: String,
  /**
   * The color associated with the option.
   */
  public val color: String? = null,
  /**
   * A short description of the option.
   */
  public val description: String? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
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

    /**
     * The color associated with the option.
     */
    public var color: String? = null

    /**
     * A short description of the option.
     */
    public var description: String? = null

    public fun build(): ProjectsV2SingleSelectOption {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return ProjectsV2SingleSelectOption(
        id = id,
        name = name,
        color = color,
        description = description,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2SingleSelectOption = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProjectsV2SingleSelectOption> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2SingleSelectOption {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2SingleSelectOption")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2SingleSelectOption must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return ProjectsV2SingleSelectOption(
        id = id,
        name = name,
        color = rawObject["color"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2SingleSelectOption) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2SingleSelectOption")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("name", value.name)
        value.color?.let { put("color", it) }
        value.description?.let { put("description", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2SingleSelectOption(block: ProjectsV2SingleSelectOption.Builder.() -> Unit): ProjectsV2SingleSelectOption = ProjectsV2SingleSelectOption.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2SingleSelectOption is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
