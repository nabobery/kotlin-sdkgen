package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1deployments/post/requestBody/content/application~1json/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1deployments/post/requestBody/content/application~1json/
 * schema
 */
@Serializable(with = InlineReposDeploymentsPostRequestJsonXbc4f81c1.Serializer::class)
public class InlineReposDeploymentsPostRequestJsonXbc4f81c1(
  /**
   * The ref to deploy. This can be a branch, tag, or SHA.
   */
  public val ref: String,
  /**
   * Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.
   */
  public val autoMerge: Boolean? = null,
  /**
   * Short description of the deployment.
   */
  public val description: String? = null,
  /**
   * Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
   */
  public val environment: String? = null,
  public val payload: InlineReposDeploymentsPostRequestJsonPayloadX75e436ee? = null,
  /**
   * Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment`
   * is `production` and `false` otherwise.
   */
  public val productionEnvironment: Boolean? = null,
  requiredContexts: List<String>? = null,
  /**
   * Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
   */
  public val task: String? = null,
  /**
   * Specifies if the given environment is specific to the deployment and will no longer exist at some point in the
   * future. Default: `false`
   */
  public val transientEnvironment: Boolean? = null,
) {
  /**
   * The [status](https://docs.github.com/rest/commits/statuses) contexts to verify against commit status checks. If you
   * omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely,
   * pass an empty array. Defaults to all unique contexts.
   */
  public val requiredContexts: List<String>? =
      requiredContexts?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    /**
     * Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.
     */
    public var autoMerge: Boolean? = null

    /**
     * Short description of the deployment.
     */
    public var description: String? = null

    /**
     * Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
     */
    public var environment: String? = null

    public var payload: InlineReposDeploymentsPostRequestJsonPayloadX75e436ee? = null

    /**
     * Specifies if the given environment is one that end-users directly interact with. Default: `true` when
     * `environment` is `production` and `false` otherwise.
     */
    public var productionEnvironment: Boolean? = null

    private var requiredContextsValue: List<String>? = null

    /**
     * The [status](https://docs.github.com/rest/commits/statuses) contexts to verify against commit status checks. If
     * you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking
     * entirely, pass an empty array. Defaults to all unique contexts.
     */
    public var requiredContexts: List<String>?
      get() = requiredContextsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        requiredContextsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
     */
    public var task: String? = null

    /**
     * Specifies if the given environment is specific to the deployment and will no longer exist at some point in the
     * future. Default: `false`
     */
    public var transientEnvironment: Boolean? = null

    public fun build(): InlineReposDeploymentsPostRequestJsonXbc4f81c1 {
      check(refValue != null) { "ref is required" }
      return InlineReposDeploymentsPostRequestJsonXbc4f81c1(
        ref = ref,
        autoMerge = autoMerge,
        description = description,
        environment = environment,
        payload = payload,
        productionEnvironment = productionEnvironment,
        requiredContexts = requiredContexts,
        task = task,
        transientEnvironment = transientEnvironment,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposDeploymentsPostRequestJsonXbc4f81c1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposDeploymentsPostRequestJsonXbc4f81c1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDeploymentsPostRequestJsonXbc4f81c1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDeploymentsPostRequestJsonXbc4f81c1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposDeploymentsPostRequestJsonXbc4f81c1 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      return InlineReposDeploymentsPostRequestJsonXbc4f81c1(
        ref = ref,
        autoMerge = rawObject["auto_merge"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        environment = rawObject["environment"]?.let { json.decodeFromJsonElement<String>(it) },
        payload = rawObject["payload"]?.let { json.decodeFromJsonElement<InlineReposDeploymentsPostRequestJsonPayloadX75e436ee>(it) },
        productionEnvironment = rawObject["production_environment"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requiredContexts = rawObject["required_contexts"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        task = rawObject["task"]?.let { json.decodeFromJsonElement<String>(it) },
        transientEnvironment = rawObject["transient_environment"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDeploymentsPostRequestJsonXbc4f81c1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposDeploymentsPostRequestJsonXbc4f81c1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ref", value.ref)
        value.autoMerge?.let { put("auto_merge", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.environment?.let { put("environment", it) }
        value.payload?.let { put("payload", json.encodeToJsonElement(it)) }
        value.productionEnvironment?.let { put("production_environment", json.encodeToJsonElement(it)) }
        value.requiredContexts?.let { put("required_contexts", json.encodeToJsonElement(it)) }
        value.task?.let { put("task", it) }
        value.transientEnvironment?.let { put("transient_environment", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposDeploymentsPostRequestJsonXbc4f81c1(block: InlineReposDeploymentsPostRequestJsonXbc4f81c1.Builder.() -> Unit): InlineReposDeploymentsPostRequestJsonXbc4f81c1 = InlineReposDeploymentsPostRequestJsonXbc4f81c1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposDeploymentsPostRequestJsonXbc4f81c1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
