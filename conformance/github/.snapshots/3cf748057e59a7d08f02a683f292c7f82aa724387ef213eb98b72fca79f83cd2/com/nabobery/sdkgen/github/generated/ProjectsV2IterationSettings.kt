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
 * An iteration setting for an iteration field
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-iteration-settings
 */
@Serializable(with = ProjectsV2IterationSettings.Serializer::class)
public class ProjectsV2IterationSettings(
  /**
   * Whether the iteration has been completed.
   */
  public val completed: Boolean,
  /**
   * The duration of the iteration in days.
   */
  public val duration: Int,
  /**
   * The unique identifier of the iteration setting.
   */
  public val id: String,
  /**
   * The start date of the iteration.
   */
  public val startDate: String,
  /**
   * The iteration title, in raw text and HTML formats.
   */
  public val title: InlineProjectsV2IterationSettingsTitleX0c435b6f,
) {
  public class Builder {
    private var completedValue: Boolean? = null

    public var completed: Boolean
      get() = requireNotNull(completedValue) { "completed is required" }
      set(`value`) {
        completedValue = value
      }

    private var durationValue: Int? = null

    public var duration: Int
      get() = requireNotNull(durationValue) { "duration is required" }
      set(`value`) {
        durationValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var startDateValue: String? = null

    public var startDate: String
      get() = requireNotNull(startDateValue) { "startDate is required" }
      set(`value`) {
        startDateValue = value
      }

    private var titleValue: InlineProjectsV2IterationSettingsTitleX0c435b6f? = null

    public var title: InlineProjectsV2IterationSettingsTitleX0c435b6f
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    public fun build(): ProjectsV2IterationSettings {
      check(completedValue != null) { "completed is required" }
      check(durationValue != null) { "duration is required" }
      check(idValue != null) { "id is required" }
      check(startDateValue != null) { "startDate is required" }
      check(titleValue != null) { "title is required" }
      return ProjectsV2IterationSettings(
        completed = completed,
        duration = duration,
        id = id,
        startDate = startDate,
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2IterationSettings = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProjectsV2IterationSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2IterationSettings {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2IterationSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2IterationSettings must be a JSON object")
      val completed = json.decodeRequired<Boolean>(rawObject, "completed")
      val duration = json.decodeRequired<Int>(rawObject, "duration")
      val id = json.decodeRequired<String>(rawObject, "id")
      val startDate = json.decodeRequired<String>(rawObject, "start_date")
      val title = json.decodeRequired<InlineProjectsV2IterationSettingsTitleX0c435b6f>(rawObject, "title")
      return ProjectsV2IterationSettings(
        completed = completed,
        duration = duration,
        id = id,
        startDate = startDate,
        title = title,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2IterationSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2IterationSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completed", json.encodeToJsonElement(value.completed))
        put("duration", json.encodeToJsonElement(value.duration))
        put("id", value.id)
        put("start_date", value.startDate)
        put("title", json.encodeToJsonElement(value.title))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2IterationSettings(block: ProjectsV2IterationSettings.Builder.() -> Unit): ProjectsV2IterationSettings = ProjectsV2IterationSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2IterationSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
