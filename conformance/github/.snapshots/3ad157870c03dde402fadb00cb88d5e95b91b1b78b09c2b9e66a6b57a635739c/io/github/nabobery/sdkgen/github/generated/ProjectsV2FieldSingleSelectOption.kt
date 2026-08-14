package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/projects-v2-field-single-select-option.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-field-single-select-option
 */
@Serializable(with = ProjectsV2FieldSingleSelectOption.Serializer::class)
public class ProjectsV2FieldSingleSelectOption(
  /**
   * The color associated with the option.
   */
  public val color: InlineProjectsV2FieldSingleSelectOptionColorX29c48dff? = null,
  /**
   * The description of the option.
   */
  public val description: String? = null,
  /**
   * The display name of the option.
   */
  public val name: String? = null,
) {
  public class Builder {
    /**
     * The color associated with the option.
     */
    public var color: InlineProjectsV2FieldSingleSelectOptionColorX29c48dff? = null

    /**
     * The description of the option.
     */
    public var description: String? = null

    /**
     * The display name of the option.
     */
    public var name: String? = null

    public fun build(): ProjectsV2FieldSingleSelectOption = ProjectsV2FieldSingleSelectOption(
      color = color,
      description = description,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2FieldSingleSelectOption = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ProjectsV2FieldSingleSelectOption> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2FieldSingleSelectOption {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2FieldSingleSelectOption")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2FieldSingleSelectOption must be a JSON object")
      return ProjectsV2FieldSingleSelectOption(
        color = rawObject["color"]?.let { json.decodeFromJsonElement<InlineProjectsV2FieldSingleSelectOptionColorX29c48dff>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2FieldSingleSelectOption) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2FieldSingleSelectOption")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.color?.let { put("color", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2FieldSingleSelectOption(block: ProjectsV2FieldSingleSelectOption.Builder.() -> Unit): ProjectsV2FieldSingleSelectOption = ProjectsV2FieldSingleSelectOption.build(block)
