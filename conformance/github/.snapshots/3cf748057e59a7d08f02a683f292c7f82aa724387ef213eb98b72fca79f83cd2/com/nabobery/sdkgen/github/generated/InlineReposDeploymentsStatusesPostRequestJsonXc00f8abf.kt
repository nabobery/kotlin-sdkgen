package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1deployments~1{deployment_id}~1statuses/post/requestBody
 * /content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1deployments~1{deployment_id}~1statuses/post/requestBody
 * /content/application~1json/schema
 */
@Serializable(with = InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf.Serializer::class)
public class InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf(
  /**
   * The state of the status. When you set a transient deployment to `inactive`, the deployment will be shown as
   * `destroyed` in GitHub.
   */
  public val state: InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c,
  /**
   * Adds a new `inactive` status to all prior non-transient, non-production environment deployments with the same
   * repository and `environment` name as the created status's deployment. An `inactive` status is only added to
   * deployments that had a `success` state. Default: `true`
   */
  public val autoInactive: Boolean? = null,
  /**
   * A short description of the status. The maximum description length is 140 characters.
   */
  public val description: String? = null,
  /**
   * Name for the target deployment environment, which can be changed when setting a deploy status. For example,
   * `production`, `staging`, or `qa`. If not defined, the environment of the previous status on the deployment will be
   * used, if it exists. Otherwise, the environment of the deployment will be used.
   */
  public val environment: String? = null,
  /**
   * Sets the URL for accessing your environment. Default: `""`
   */
  public val environmentUrl: String? = null,
  /**
   * The full URL of the deployment's output. This parameter replaces `target_url`. We will continue to accept
   * `target_url` to support legacy uses, but we recommend replacing `target_url` with `log_url`. Setting `log_url` will
   * automatically set `target_url` to the same value. Default: `""`
   */
  public val logUrl: String? = null,
  /**
   * The target URL to associate with this status. This URL should contain output to keep the user updated while the
   * task is running or serve as historical information for what happened in the deployment.
   *
   * > [!NOTE]
   * > It's recommended to use the `log_url` parameter, which replaces `target_url`.
   */
  public val targetUrl: String? = null,
) {
  public class Builder {
    private var stateValue: InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c? = null

    public var state: InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    /**
     * Adds a new `inactive` status to all prior non-transient, non-production environment deployments with the same
     * repository and `environment` name as the created status's deployment. An `inactive` status is only added to
     * deployments that had a `success` state. Default: `true`
     */
    public var autoInactive: Boolean? = null

    /**
     * A short description of the status. The maximum description length is 140 characters.
     */
    public var description: String? = null

    /**
     * Name for the target deployment environment, which can be changed when setting a deploy status. For example,
     * `production`, `staging`, or `qa`. If not defined, the environment of the previous status on the deployment will
     * be used, if it exists. Otherwise, the environment of the deployment will be used.
     */
    public var environment: String? = null

    /**
     * Sets the URL for accessing your environment. Default: `""`
     */
    public var environmentUrl: String? = null

    /**
     * The full URL of the deployment's output. This parameter replaces `target_url`. We will continue to accept
     * `target_url` to support legacy uses, but we recommend replacing `target_url` with `log_url`. Setting `log_url`
     * will automatically set `target_url` to the same value. Default: `""`
     */
    public var logUrl: String? = null

    /**
     * The target URL to associate with this status. This URL should contain output to keep the user updated while the
     * task is running or serve as historical information for what happened in the deployment.
     *
     * > [!NOTE]
     * > It's recommended to use the `log_url` parameter, which replaces `target_url`.
     */
    public var targetUrl: String? = null

    public fun build(): InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf {
      check(stateValue != null) { "state is required" }
      return InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf(
        state = state,
        autoInactive = autoInactive,
        description = description,
        environment = environment,
        environmentUrl = environmentUrl,
        logUrl = logUrl,
        targetUrl = targetUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf must be a JSON object")
      val state = json.decodeRequired<InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c>(rawObject, "state")
      return InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf(
        state = state,
        autoInactive = rawObject["auto_inactive"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        environment = rawObject["environment"]?.let { json.decodeFromJsonElement<String>(it) },
        environmentUrl = rawObject["environment_url"]?.let { json.decodeFromJsonElement<String>(it) },
        logUrl = rawObject["log_url"]?.let { json.decodeFromJsonElement<String>(it) },
        targetUrl = rawObject["target_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("state", json.encodeToJsonElement(value.state))
        value.autoInactive?.let { put("auto_inactive", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.environment?.let { put("environment", it) }
        value.environmentUrl?.let { put("environment_url", it) }
        value.logUrl?.let { put("log_url", it) }
        value.targetUrl?.let { put("target_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposDeploymentsStatusesPostRequestJsonXc00f8abf(block: InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf.Builder.() -> Unit): InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf = InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposDeploymentsStatusesPostRequestJsonXc00f8abf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
