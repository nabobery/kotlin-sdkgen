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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/TaskClassificationMacroCategory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TaskClassificationMacroCategory
 */
@Serializable(with = TaskClassificationMacroCategory.Serializer::class)
public class TaskClassificationMacroCategory(
  /**
   * Macro-category identifier.
   */
  public val key: String,
  /**
   * Human-readable label for the macro-category.
   */
  public val label: String,
  /**
   * Combined token share of all classifications in this macro-category (0–1).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val tokenShare: Double,
  /**
   * Combined usage share of all classifications in this macro-category (0–1).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val usageShare: Double,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var labelValue: String? = null

    public var label: String
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var tokenShareValue: Double? = null

    public var tokenShare: Double
      get() = requireNotNull(tokenShareValue) { "tokenShare is required" }
      set(`value`) {
        tokenShareValue = value
      }

    private var usageShareValue: Double? = null

    public var usageShare: Double
      get() = requireNotNull(usageShareValue) { "usageShare is required" }
      set(`value`) {
        usageShareValue = value
      }

    public fun build(): TaskClassificationMacroCategory {
      check(keyValue != null) { "key is required" }
      check(labelValue != null) { "label is required" }
      check(tokenShareValue != null) { "tokenShare is required" }
      check(usageShareValue != null) { "usageShare is required" }
      return TaskClassificationMacroCategory(
        key = key,
        label = label,
        tokenShare = tokenShare,
        usageShare = usageShare,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaskClassificationMacroCategory = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaskClassificationMacroCategory> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaskClassificationMacroCategory {
      val jsonDecoder = decoder.requireJsonDecoder("TaskClassificationMacroCategory")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaskClassificationMacroCategory must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val label = json.decodeRequired<String>(rawObject, "label")
      val tokenShare = json.decodeRequired<Double>(rawObject, "token_share")
      val usageShare = json.decodeRequired<Double>(rawObject, "usage_share")
      return TaskClassificationMacroCategory(
        key = key,
        label = label,
        tokenShare = tokenShare,
        usageShare = usageShare,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaskClassificationMacroCategory) {
      val jsonEncoder = encoder.requireJsonEncoder("TaskClassificationMacroCategory")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("label", value.label)
        put("token_share", json.encodeToJsonElement(value.tokenShare))
        put("usage_share", json.encodeToJsonElement(value.usageShare))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taskClassificationMacroCategory(block: TaskClassificationMacroCategory.Builder.() -> Unit): TaskClassificationMacroCategory = TaskClassificationMacroCategory.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaskClassificationMacroCategory is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
