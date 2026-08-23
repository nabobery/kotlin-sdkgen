package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An iteration setting for an iteration field
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-iteration-setting
 */
@Serializable(with = ProjectsV2IterationSetting.Serializer::class)
public class ProjectsV2IterationSetting(
  /**
   * The unique identifier of the iteration setting.
   */
  public val id: String,
  /**
   * The iteration title.
   */
  public val title: String,
  /**
   * Whether the iteration has been completed.
   */
  public val completed: Boolean? = null,
  /**
   * The duration of the iteration in days.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val duration: Double? = null,
  /**
   * The start date of the iteration.
   */
  public val startDate: String? = null,
  /**
   * The iteration title, rendered as HTML.
   */
  public val titleHtml: String? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    /**
     * Whether the iteration has been completed.
     */
    public var completed: Boolean? = null

    /**
     * The duration of the iteration in days.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var duration: Double? = null

    /**
     * The start date of the iteration.
     */
    public var startDate: String? = null

    /**
     * The iteration title, rendered as HTML.
     */
    public var titleHtml: String? = null

    public fun build(): ProjectsV2IterationSetting {
      check(idValue != null) { "id is required" }
      check(titleValue != null) { "title is required" }
      return ProjectsV2IterationSetting(
        id = id,
        title = title,
        completed = completed,
        duration = duration,
        startDate = startDate,
        titleHtml = titleHtml,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2IterationSetting = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ProjectsV2IterationSetting> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2IterationSetting {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2IterationSetting")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2IterationSetting must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val title = json.decodeRequired<String>(rawObject, "title")
      return ProjectsV2IterationSetting(
        id = id,
        title = title,
        completed = rawObject["completed"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        duration = rawObject["duration"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        startDate = rawObject["start_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        titleHtml = rawObject["title_html"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2IterationSetting) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2IterationSetting")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("title", value.title)
        value.completed?.let { put("completed", json.encodeToJsonElement(it)) }
        value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
        value.startDate?.let { put("start_date", it) }
        value.titleHtml?.let { put("title_html", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2IterationSetting(block: ProjectsV2IterationSetting.Builder.() -> Unit): ProjectsV2IterationSetting = ProjectsV2IterationSetting.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2IterationSetting is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
