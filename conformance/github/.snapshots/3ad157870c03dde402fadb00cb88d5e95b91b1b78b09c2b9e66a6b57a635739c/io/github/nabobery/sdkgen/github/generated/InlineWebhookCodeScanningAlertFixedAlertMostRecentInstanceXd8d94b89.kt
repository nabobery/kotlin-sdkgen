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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/alert/properties/most_r
 * ecent_instance.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed/properties/alert/properties/most_r
 * ecent_instance
 */
@Serializable(with = InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89.Serializer::class)
public class InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89(
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
  public val state: InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08,
  /**
   * Identifies the configuration under which the analysis was executed.
   */
  public val category: String? = null,
  classifications: List<String>? = null,
  public val commitSha: String? = null,
  public val location:
      InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c? = null,
  public val message:
      InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051? = null,
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
        InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08? = null

    public var state: InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08
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

    public var location:
        InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c? = null

    public var message: InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051?
        = null

    public fun build(): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89 {
      check(analysisKeyValue != null) { "analysisKey is required" }
      check(environmentValue != null) { "environment is required" }
      check(refValue != null) { "ref is required" }
      check(stateValue != null) { "state is required" }
      return InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89 must be a JSON object")
      val analysisKey = json.decodeRequired<String>(rawObject, "analysis_key")
      val environment = json.decodeRequired<String>(rawObject, "environment")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val state = json.decodeRequired<InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceStateX60071b08>(rawObject, "state")
      return InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89(
        analysisKey = analysisKey,
        environment = environment,
        ref = ref,
        state = state,
        category = rawObject["category"]?.let { json.decodeFromJsonElement<String>(it) },
        classifications = rawObject["classifications"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        commitSha = rawObject["commit_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        location = rawObject["location"]?.let { json.decodeFromJsonElement<InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceLocationX7e1c372c>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceMessageXbb1ba051>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89")
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

public fun inlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89(block: InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89.Builder.() -> Unit): InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89 = InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCodeScanningAlertFixedAlertMostRecentInstanceXd8d94b89 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
