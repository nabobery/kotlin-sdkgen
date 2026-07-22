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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/alert/prop
 * erties/most_recent_instance.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment/properties/alert/prop
 * erties/most_recent_instance
 */
@Serializable(with = InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d.Serializer::class)
public class InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d(
  /**
   * Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes
   * the workflow filename and job name.
   */
  public val analysisKey: String,
  /**
   * Identifies the variable values associated with the environment in which the analysis that generated this alert
   * instance was performed, such as the language that was analyzed.
   */
  public val environment: String,
  /**
   * The full Git reference, formatted as `refs/heads/<branch name>`.
   */
  public val ref: String,
  /**
   * State of a code scanning alert.
   */
  public val state: InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60,
  /**
   * Identifies the configuration under which the analysis was executed.
   */
  public val category: String? = null,
  public val classifications: List<String>? = null,
  public val commitSha: String? = null,
  public val location:
      InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceLocationXbaf8a825? = null,
  public val message: InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9? = null,
) {
  public class Builder {
    private var analysisKeyValue: String? = null

    public var analysisKey: String
      get() = requireNotNull(analysisKeyValue) { "analysisKey is required" }
      set(`value`) {
        analysisKeyValue = value
      }

    private var environmentValue: String? = null

    public var environment: String
      get() = requireNotNull(environmentValue) { "environment is required" }
      set(`value`) {
        environmentValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var stateValue: InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60? =
        null

    public var state: InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    /**
     * Identifies the configuration under which the analysis was executed.
     */
    public var category: String? = null

    public var classifications: List<String>? = null

    public var commitSha: String? = null

    public var location: InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceLocationXbaf8a825? =
        null

    public var message: InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9? =
        null

    public fun build(): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d {
      check(analysisKeyValue != null) { "analysisKey is required" }
      check(environmentValue != null) { "environment is required" }
      check(refValue != null) { "ref is required" }
      check(stateValue != null) { "state is required" }
      return InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d(
        analysisKey = analysisKey,
        environment = environment,
        ref = ref,
        state = state,
        category = category,
        classifications = classifications,
        commitSha = commitSha,
        location = location,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d must be a JSON object")
      val analysisKey = json.decodeRequired<String>(rawObject, "analysis_key")
      val environment = json.decodeRequired<String>(rawObject, "environment")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val state = json.decodeRequired<InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceStateX0dafad60>(rawObject, "state")
      return InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d(
        analysisKey = analysisKey,
        environment = environment,
        ref = ref,
        state = state,
        category = rawObject["category"]?.let { json.decodeFromJsonElement<String>(it) },
        classifications = rawObject["classifications"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        commitSha = rawObject["commit_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        location = rawObject["location"]?.let { json.decodeFromJsonElement<InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceLocationXbaf8a825>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<InlineWebhookCodeScanningAb4c5AlertMostRecentInstanceMessageX79b8fad9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("analysis_key", value.analysisKey)
        put("environment", value.environment)
        put("ref", value.ref)
        put("state", json.encodeToJsonElement(value.state))
        value.category?.let { put("category", it) }
        value.classifications?.let { put("classifications", json.encodeToJsonElement(it)) }
        value.commitSha?.let { put("commit_sha", it) }
        value.location?.let { put("location", json.encodeToJsonElement(it)) }
        value.message?.let { put("message", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d(block: InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d.Builder.() -> Unit): InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d = InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCodeScanningAlertUpdatedAssignmentAlertMostRecentInstanceXd7fa8f7d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
