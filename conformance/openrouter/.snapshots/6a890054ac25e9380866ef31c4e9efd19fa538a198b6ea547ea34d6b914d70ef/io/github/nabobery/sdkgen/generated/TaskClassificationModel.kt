package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/TaskClassificationModel.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TaskClassificationModel
 */
@Serializable(with = TaskClassificationModel.Serializer::class)
public class TaskClassificationModel(
  /**
   * Model identifier (permaslug).
   */
  public val id: String,
  /**
   * Fraction of this classification's sampled token volume attributed to this model (0–1). Sums to ≤1 across the
   * returned models (only top-N are included and unattributed requests are excluded).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val tagTokenShare: Double,
  /**
   * Fraction of this classification's sampled requests attributed to this model (0–1). Sums to ≤1 across the returned
   * models (only top-N are included and unattributed requests are excluded).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val tagUsageShare: Double,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var tagTokenShareValue: Double? = null

    public var tagTokenShare: Double
      get() = requireNotNull(tagTokenShareValue) { "tagTokenShare is required" }
      set(`value`) {
        tagTokenShareValue = value
      }

    private var tagUsageShareValue: Double? = null

    public var tagUsageShare: Double
      get() = requireNotNull(tagUsageShareValue) { "tagUsageShare is required" }
      set(`value`) {
        tagUsageShareValue = value
      }

    public fun build(): TaskClassificationModel {
      check(idValue != null) { "id is required" }
      check(tagTokenShareValue != null) { "tagTokenShare is required" }
      check(tagUsageShareValue != null) { "tagUsageShare is required" }
      return TaskClassificationModel(
        id = id,
        tagTokenShare = tagTokenShare,
        tagUsageShare = tagUsageShare,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaskClassificationModel = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaskClassificationModel> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaskClassificationModel {
      val jsonDecoder = decoder.requireJsonDecoder("TaskClassificationModel")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaskClassificationModel must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val tagTokenShare = json.decodeRequired<Double>(rawObject, "tag_token_share")
      val tagUsageShare = json.decodeRequired<Double>(rawObject, "tag_usage_share")
      return TaskClassificationModel(
        id = id,
        tagTokenShare = tagTokenShare,
        tagUsageShare = tagUsageShare,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaskClassificationModel) {
      val jsonEncoder = encoder.requireJsonEncoder("TaskClassificationModel")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("tag_token_share", json.encodeToJsonElement(value.tagTokenShare))
        put("tag_usage_share", json.encodeToJsonElement(value.tagUsageShare))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taskClassificationModel(block: TaskClassificationModel.Builder.() -> Unit): TaskClassificationModel = TaskClassificationModel.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaskClassificationModel is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
