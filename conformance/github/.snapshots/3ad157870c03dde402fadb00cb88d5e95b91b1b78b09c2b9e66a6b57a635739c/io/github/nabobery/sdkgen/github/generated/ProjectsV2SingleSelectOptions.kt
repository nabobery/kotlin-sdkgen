package io.github.nabobery.sdkgen.github.generated

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
 * An option for a single select field
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-single-select-options
 */
@Serializable(with = ProjectsV2SingleSelectOptions.Serializer::class)
public class ProjectsV2SingleSelectOptions(
  /**
   * The color associated with the option.
   */
  public val color: String,
  /**
   * The description of the option, in raw text and HTML formats.
   */
  public val description: InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c,
  /**
   * The unique identifier of the option.
   */
  public val id: String,
  /**
   * The display name of the option, in raw text and HTML formats.
   */
  public val name: InlineProjectsV2SingleSelectOptionsNameX047fb272,
) {
  public class Builder {
    private var colorValue: String? = null

    public var color: String
      get() = requireNotNull(colorValue) { "color is required" }
      set(`value`) {
        colorValue = value
      }

    private var descriptionValue: InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c? = null

    public var description: InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: InlineProjectsV2SingleSelectOptionsNameX047fb272? = null

    public var name: InlineProjectsV2SingleSelectOptionsNameX047fb272
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): ProjectsV2SingleSelectOptions {
      check(colorValue != null) { "color is required" }
      check(descriptionValue != null) { "description is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return ProjectsV2SingleSelectOptions(
        color = color,
        description = description,
        id = id,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2SingleSelectOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ProjectsV2SingleSelectOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2SingleSelectOptions {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2SingleSelectOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2SingleSelectOptions must be a JSON object")
      val color = json.decodeRequired<String>(rawObject, "color")
      val description = json.decodeRequired<InlineProjectsV2SingleSelectOptionsDescriptionX7d64281c>(rawObject, "description")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<InlineProjectsV2SingleSelectOptionsNameX047fb272>(rawObject, "name")
      return ProjectsV2SingleSelectOptions(
        color = color,
        description = description,
        id = id,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2SingleSelectOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2SingleSelectOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("color", value.color)
        put("description", json.encodeToJsonElement(value.description))
        put("id", value.id)
        put("name", json.encodeToJsonElement(value.name))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2SingleSelectOptions(block: ProjectsV2SingleSelectOptions.Builder.() -> Unit): ProjectsV2SingleSelectOptions = ProjectsV2SingleSelectOptions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2SingleSelectOptions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
