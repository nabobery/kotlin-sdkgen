package io.github.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/TaskClassificationItem.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TaskClassificationItem
 */
@Serializable(with = TaskClassificationItem.Serializer::class)
public class TaskClassificationItem(
  /**
   * Fraction of this classification's token volume within its macro-category (0–1). Sums to 1 across all
   * classifications sharing the same `macro_category`.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val categoryTokenShare: Double,
  /**
   * Fraction of this classification's usage within its macro-category (0–1). Sums to 1 across all classifications
   * sharing the same `macro_category`.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val categoryUsageShare: Double,
  /**
   * Human-readable label for the classification.
   */
  public val displayName: String,
  /**
   * Coarse grouping derived from the tag prefix: `code`, `data`, `agent`, or `general`.
   */
  public val macroCategory: String,
  models: List<TaskClassificationModel>,
  /**
   * Classification tag identifier (e.g. `code:general_impl`, `agent:web_search`).
   */
  public val tag: String,
  /**
   * Fraction of classified sampled token volume (prompt + completion) attributed to this classification (0–1). The
   * unclassified `other` bucket is excluded from the denominator.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val tokenShare: Double,
  /**
   * Fraction of classified sampled requests attributed to this classification (0–1). The unclassified `other` bucket is
   * excluded from the denominator.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val usageShare: Double,
) {
  /**
   * Top models for this classification by request volume, sorted descending. Each entry reports the model's share of
   * this classification's requests and tokens.
   */
  public val models: List<TaskClassificationModel> = models.toList()

  public class Builder {
    private var categoryTokenShareValue: Double? = null

    public var categoryTokenShare: Double
      get() = requireNotNull(categoryTokenShareValue) { "categoryTokenShare is required" }
      set(`value`) {
        categoryTokenShareValue = value
      }

    private var categoryUsageShareValue: Double? = null

    public var categoryUsageShare: Double
      get() = requireNotNull(categoryUsageShareValue) { "categoryUsageShare is required" }
      set(`value`) {
        categoryUsageShareValue = value
      }

    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    private var macroCategoryValue: String? = null

    public var macroCategory: String
      get() = requireNotNull(macroCategoryValue) { "macroCategory is required" }
      set(`value`) {
        macroCategoryValue = value
      }

    private var modelsValue: List<TaskClassificationModel>? = null

    public var models: List<TaskClassificationModel>
      get() = requireNotNull(modelsValue) { "models is required" }.toList()
      set(`value`) {
        modelsValue = value.toList()
      }

    private var tagValue: String? = null

    public var tag: String
      get() = requireNotNull(tagValue) { "tag is required" }
      set(`value`) {
        tagValue = value
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

    public fun build(): TaskClassificationItem {
      check(categoryTokenShareValue != null) { "categoryTokenShare is required" }
      check(categoryUsageShareValue != null) { "categoryUsageShare is required" }
      check(displayNameValue != null) { "displayName is required" }
      check(macroCategoryValue != null) { "macroCategory is required" }
      check(modelsValue != null) { "models is required" }
      check(tagValue != null) { "tag is required" }
      check(tokenShareValue != null) { "tokenShare is required" }
      check(usageShareValue != null) { "usageShare is required" }
      return TaskClassificationItem(
        categoryTokenShare = categoryTokenShare,
        categoryUsageShare = categoryUsageShare,
        displayName = displayName,
        macroCategory = macroCategory,
        models = models,
        tag = tag,
        tokenShare = tokenShare,
        usageShare = usageShare,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaskClassificationItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaskClassificationItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaskClassificationItem {
      val jsonDecoder = decoder.requireJsonDecoder("TaskClassificationItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaskClassificationItem must be a JSON object")
      val categoryTokenShare = json.decodeRequired<Double>(rawObject, "category_token_share")
      val categoryUsageShare = json.decodeRequired<Double>(rawObject, "category_usage_share")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val macroCategory = json.decodeRequired<String>(rawObject, "macro_category")
      val models = json.decodeRequired<List<TaskClassificationModel>>(rawObject, "models")
      val tag = json.decodeRequired<String>(rawObject, "tag")
      val tokenShare = json.decodeRequired<Double>(rawObject, "token_share")
      val usageShare = json.decodeRequired<Double>(rawObject, "usage_share")
      return TaskClassificationItem(
        categoryTokenShare = categoryTokenShare,
        categoryUsageShare = categoryUsageShare,
        displayName = displayName,
        macroCategory = macroCategory,
        models = models,
        tag = tag,
        tokenShare = tokenShare,
        usageShare = usageShare,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaskClassificationItem) {
      val jsonEncoder = encoder.requireJsonEncoder("TaskClassificationItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("category_token_share", json.encodeToJsonElement(value.categoryTokenShare))
        put("category_usage_share", json.encodeToJsonElement(value.categoryUsageShare))
        put("display_name", value.displayName)
        put("macro_category", value.macroCategory)
        put("models", json.encodeToJsonElement(value.models))
        put("tag", value.tag)
        put("token_share", json.encodeToJsonElement(value.tokenShare))
        put("usage_share", json.encodeToJsonElement(value.usageShare))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taskClassificationItem(block: TaskClassificationItem.Builder.() -> Unit): TaskClassificationItem = TaskClassificationItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaskClassificationItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
