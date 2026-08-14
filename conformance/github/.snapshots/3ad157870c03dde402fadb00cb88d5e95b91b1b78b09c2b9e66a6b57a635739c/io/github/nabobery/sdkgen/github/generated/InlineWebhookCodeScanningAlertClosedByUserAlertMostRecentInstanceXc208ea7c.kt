package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/most_recent_instance.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-closed-by-user/properties/alert/properti
 * es/most_recent_instance
 */
@Serializable(with = InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c.Serializer::class)
public class InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c(
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
  public val state: InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d,
  /**
   * Identifies the configuration under which the analysis was executed.
   */
  public val category: String? = null,
  classifications: List<String>? = null,
  public val commitSha: String? = null,
  public val location:
      InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a? = null,
  public val message: InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488? = null,
) {
  public val classifications: List<String>? =
      classifications?.let { collection0 -> collection0.toList() }

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

    private var stateValue:
        InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d? = null

    public var state:
        InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    /**
     * Identifies the configuration under which the analysis was executed.
     */
    public var category: String? = null

    private var classificationsValue: List<String>? = null

    public var classifications: List<String>?
      get() = classificationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        classificationsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var commitSha: String? = null

    public var location: InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a? =
        null

    public var message: InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488? =
        null

    public fun build(): InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c {
      check(analysisKeyValue != null) { "analysisKey is required" }
      check(environmentValue != null) { "environment is required" }
      check(refValue != null) { "ref is required" }
      check(stateValue != null) { "state is required" }
      return InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c must be a JSON object")
      val analysisKey = json.decodeRequired<String>(rawObject, "analysis_key")
      val environment = json.decodeRequired<String>(rawObject, "environment")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val state = json.decodeRequired<InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceStateX506b2d4d>(rawObject, "state")
      return InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c(
        analysisKey = analysisKey,
        environment = environment,
        ref = ref,
        state = state,
        category = rawObject["category"]?.let { json.decodeFromJsonElement<String>(it) },
        classifications = rawObject["classifications"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        commitSha = rawObject["commit_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        location = rawObject["location"]?.let { json.decodeFromJsonElement<InlineWebhookCodeScanningAca41AlertMostRecentInstanceLocationX9ef4ea8a>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<InlineWebhookCodeScanningAca41AlertMostRecentInstanceMessageXb9a40488>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c")
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

public fun inlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c(block: InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c.Builder.() -> Unit): InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c = InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCodeScanningAlertClosedByUserAlertMostRecentInstanceXc208ea7c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
