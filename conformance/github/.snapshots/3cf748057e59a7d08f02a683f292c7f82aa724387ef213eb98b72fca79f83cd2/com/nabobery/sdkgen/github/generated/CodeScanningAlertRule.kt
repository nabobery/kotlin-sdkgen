package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-rule.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-rule
 */
@Serializable(with = CodeScanningAlertRule.Serializer::class)
public class CodeScanningAlertRule(
  /**
   * A short description of the rule used to detect the alert.
   */
  public val description: String? = null,
  /**
   * A description of the rule used to detect the alert.
   */
  public val fullDescription: String? = null,
  /**
   * Detailed documentation for the rule as GitHub Flavored Markdown.
   */
  public val help: String? = null,
  /**
   * A link to the documentation for the rule used to detect the alert.
   */
  public val helpUri: String? = null,
  /**
   * A unique identifier for the rule used to detect the alert.
   */
  public val id: String? = null,
  /**
   * The name of the rule used to detect the alert.
   */
  public val name: String? = null,
  /**
   * The security severity of the alert.
   */
  public val securitySeverityLevel:
      InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0? = null,
  /**
   * The severity of the alert.
   */
  public val severity: InlineCodeScanningAlertRuleSeverityX076d5005? = null,
  /**
   * A set of tags applicable for the rule.
   */
  public val tags: List<String>? = null,
) {
  public class Builder {
    /**
     * A short description of the rule used to detect the alert.
     */
    public var description: String? = null

    /**
     * A description of the rule used to detect the alert.
     */
    public var fullDescription: String? = null

    /**
     * Detailed documentation for the rule as GitHub Flavored Markdown.
     */
    public var help: String? = null

    /**
     * A link to the documentation for the rule used to detect the alert.
     */
    public var helpUri: String? = null

    /**
     * A unique identifier for the rule used to detect the alert.
     */
    public var id: String? = null

    /**
     * The name of the rule used to detect the alert.
     */
    public var name: String? = null

    /**
     * The security severity of the alert.
     */
    public var securitySeverityLevel: InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0? =
        null

    /**
     * The severity of the alert.
     */
    public var severity: InlineCodeScanningAlertRuleSeverityX076d5005? = null

    /**
     * A set of tags applicable for the rule.
     */
    public var tags: List<String>? = null

    public fun build(): CodeScanningAlertRule = CodeScanningAlertRule(
      description = description,
      fullDescription = fullDescription,
      help = help,
      helpUri = helpUri,
      id = id,
      name = name,
      securitySeverityLevel = securitySeverityLevel,
      severity = severity,
      tags = tags,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningAlertRule = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningAlertRule> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningAlertRule {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningAlertRule")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningAlertRule must be a JSON object")
      return CodeScanningAlertRule(
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        fullDescription = rawObject["full_description"]?.let { json.decodeFromJsonElement<String>(it) },
        help = rawObject["help"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        helpUri = rawObject["help_uri"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        securitySeverityLevel = rawObject["security_severity_level"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0?>(element) },
        severity = rawObject["severity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeScanningAlertRuleSeverityX076d5005?>(element) },
        tags = rawObject["tags"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningAlertRule) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningAlertRule")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", it) }
        value.fullDescription?.let { put("full_description", it) }
        value.help?.let { put("help", it) }
        value.helpUri?.let { put("help_uri", it) }
        value.id?.let { put("id", it) }
        value.name?.let { put("name", it) }
        value.securitySeverityLevel?.let { put("security_severity_level", json.encodeToJsonElement(it)) }
        value.severity?.let { put("severity", json.encodeToJsonElement(it)) }
        value.tags?.let { put("tags", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningAlertRule(block: CodeScanningAlertRule.Builder.() -> Unit): CodeScanningAlertRule = CodeScanningAlertRule.build(block)
