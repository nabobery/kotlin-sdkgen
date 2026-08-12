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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-scan-completed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-scan-completed
 */
@Serializable(with = WebhookSecretScanningScanCompleted.Serializer::class)
public class WebhookSecretScanningScanCompleted(
  public val action: InlineWebhookSecretScanningScanCompletedActionXf29944f3,
  /**
   * The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val completedAt: String,
  /**
   * What type of content was scanned
   */
  public val source: InlineWebhookSecretScanningScanCompletedSourceXa3384f41,
  /**
   * The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val startedAt: String,
  /**
   * What type of scan was completed
   */
  public val type: InlineWebhookSecretScanningScanCompletedTypeXaa8102f3,
  /**
   * If the scan was triggered by a custom pattern update, this will be the name of the pattern that was updated
   */
  public val customPatternName: String? = null,
  /**
   * If the scan was triggered by a custom pattern update, this will be the scope of the pattern that was updated
   */
  public val customPatternScope:
      InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
  secretTypes: List<String>? = null,
  public val sender: SimpleUser? = null,
) {
  /**
   * List of patterns that were updated. This will be empty for normal backfill scans or custom pattern updates
   */
  public val secretTypes: List<String>? = secretTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var actionValue: InlineWebhookSecretScanningScanCompletedActionXf29944f3? = null

    public var action: InlineWebhookSecretScanningScanCompletedActionXf29944f3
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var completedAtValue: String? = null

    public var completedAt: String
      get() = requireNotNull(completedAtValue) { "completedAt is required" }
      set(`value`) {
        completedAtValue = value
      }

    private var sourceValue: InlineWebhookSecretScanningScanCompletedSourceXa3384f41? = null

    public var source: InlineWebhookSecretScanningScanCompletedSourceXa3384f41
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var startedAtValue: String? = null

    public var startedAt: String
      get() = requireNotNull(startedAtValue) { "startedAt is required" }
      set(`value`) {
        startedAtValue = value
      }

    private var typeValue: InlineWebhookSecretScanningScanCompletedTypeXaa8102f3? = null

    public var type: InlineWebhookSecretScanningScanCompletedTypeXaa8102f3
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * If the scan was triggered by a custom pattern update, this will be the name of the pattern that was updated
     */
    public var customPatternName: String? = null

    /**
     * If the scan was triggered by a custom pattern update, this will be the scope of the pattern that was updated
     */
    public var customPatternScope:
        InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    private var secretTypesValue: List<String>? = null

    /**
     * List of patterns that were updated. This will be empty for normal backfill scans or custom pattern updates
     */
    public var secretTypes: List<String>?
      get() = secretTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        secretTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var sender: SimpleUser? = null

    public fun build(): WebhookSecretScanningScanCompleted {
      check(actionValue != null) { "action is required" }
      check(completedAtValue != null) { "completedAt is required" }
      check(sourceValue != null) { "source is required" }
      check(startedAtValue != null) { "startedAt is required" }
      check(typeValue != null) { "type is required" }
      return WebhookSecretScanningScanCompleted(
        action = action,
        completedAt = completedAt,
        source = source,
        startedAt = startedAt,
        type = type,
        customPatternName = customPatternName,
        customPatternScope = customPatternScope,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
        secretTypes = secretTypes,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookSecretScanningScanCompleted = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookSecretScanningScanCompleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSecretScanningScanCompleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSecretScanningScanCompleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSecretScanningScanCompleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookSecretScanningScanCompletedActionXf29944f3>(rawObject, "action")
      val completedAt = json.decodeRequired<String>(rawObject, "completed_at")
      val source = json.decodeRequired<InlineWebhookSecretScanningScanCompletedSourceXa3384f41>(rawObject, "source")
      val startedAt = json.decodeRequired<String>(rawObject, "started_at")
      val type = json.decodeRequired<InlineWebhookSecretScanningScanCompletedTypeXaa8102f3>(rawObject, "type")
      return WebhookSecretScanningScanCompleted(
        action = action,
        completedAt = completedAt,
        source = source,
        startedAt = startedAt,
        type = type,
        customPatternName = rawObject["custom_pattern_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customPatternScope = rawObject["custom_pattern_scope"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookSecretScanningScanCompletedCustomPatternScopeX862c7c95?>(element) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        secretTypes = rawObject["secret_types"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSecretScanningScanCompleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSecretScanningScanCompleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("completed_at", value.completedAt)
        put("source", json.encodeToJsonElement(value.source))
        put("started_at", value.startedAt)
        put("type", json.encodeToJsonElement(value.type))
        value.customPatternName?.let { put("custom_pattern_name", it) }
        value.customPatternScope?.let { put("custom_pattern_scope", json.encodeToJsonElement(it)) }
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.secretTypes?.let { put("secret_types", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookSecretScanningScanCompleted(block: WebhookSecretScanningScanCompleted.Builder.() -> Unit): WebhookSecretScanningScanCompleted = WebhookSecretScanningScanCompleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSecretScanningScanCompleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
