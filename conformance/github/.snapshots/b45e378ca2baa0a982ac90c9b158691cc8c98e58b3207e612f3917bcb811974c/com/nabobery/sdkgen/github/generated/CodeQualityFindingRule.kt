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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Code quality rule
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-finding-rule
 */
@Serializable(with = CodeQualityFindingRule.Serializer::class)
public class CodeQualityFindingRule(
  /**
   * The category of the rule used to detect the finding.
   */
  public val category: InlineCodeQualityFindingRuleCategoryXc5efce73,
  /**
   * A short description of the rule used to detect the finding.
   */
  public val description: String,
  /**
   * A unique identifier for the rule used to detect the finding.
   */
  public val id: String,
  /**
   * The severity of the rule used to detect the finding.
   */
  public val severity: InlineCodeQualityFindingRuleSeverityX28296544,
  /**
   * The name of the rule used to detect the finding.
   */
  public val title: String,
  /**
   * A detailed description of the rule used to detect the finding.
   */
  public val help: String? = null,
) {
  public class Builder {
    private var categoryValue: InlineCodeQualityFindingRuleCategoryXc5efce73? = null

    public var category: InlineCodeQualityFindingRuleCategoryXc5efce73
      get() = requireNotNull(categoryValue) { "category is required" }
      set(`value`) {
        categoryValue = value
      }

    private var descriptionValue: String? = null

    public var description: String
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

    private var severityValue: InlineCodeQualityFindingRuleSeverityX28296544? = null

    public var severity: InlineCodeQualityFindingRuleSeverityX28296544
      get() = requireNotNull(severityValue) { "severity is required" }
      set(`value`) {
        severityValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    /**
     * A detailed description of the rule used to detect the finding.
     */
    public var help: String? = null

    public fun build(): CodeQualityFindingRule {
      check(categoryValue != null) { "category is required" }
      check(descriptionValue != null) { "description is required" }
      check(idValue != null) { "id is required" }
      check(severityValue != null) { "severity is required" }
      check(titleValue != null) { "title is required" }
      return CodeQualityFindingRule(
        category = category,
        description = description,
        id = id,
        severity = severity,
        title = title,
        help = help,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeQualityFindingRule = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeQualityFindingRule> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeQualityFindingRule {
      val jsonDecoder = decoder.requireJsonDecoder("CodeQualityFindingRule")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeQualityFindingRule must be a JSON object")
      val category = json.decodeRequired<InlineCodeQualityFindingRuleCategoryXc5efce73>(rawObject, "category")
      val description = json.decodeRequired<String>(rawObject, "description")
      val id = json.decodeRequired<String>(rawObject, "id")
      val severity = json.decodeRequired<InlineCodeQualityFindingRuleSeverityX28296544>(rawObject, "severity")
      val title = json.decodeRequired<String>(rawObject, "title")
      return CodeQualityFindingRule(
        category = category,
        description = description,
        id = id,
        severity = severity,
        title = title,
        help = rawObject["help"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeQualityFindingRule) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeQualityFindingRule")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("category", json.encodeToJsonElement(value.category))
        put("description", value.description)
        put("id", value.id)
        put("severity", json.encodeToJsonElement(value.severity))
        put("title", value.title)
        value.help?.let { put("help", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeQualityFindingRule(block: CodeQualityFindingRule.Builder.() -> Unit): CodeQualityFindingRule = CodeQualityFindingRule.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeQualityFindingRule is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
