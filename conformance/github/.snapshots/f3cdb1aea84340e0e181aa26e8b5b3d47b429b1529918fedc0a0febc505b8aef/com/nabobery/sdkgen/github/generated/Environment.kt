package com.nabobery.sdkgen.github.generated

import kotlin.Long
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
 * Details of a deployment environment
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/environment
 */
@Serializable(with = Environment.Serializer::class)
public class Environment(
  /**
   * The time that the environment was created, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val htmlUrl: String,
  /**
   * The id of the environment.
   */
  public val id: Long,
  /**
   * The name of the environment.
   */
  public val name: String,
  public val nodeId: String,
  /**
   * The time that the environment was last updated, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  public val url: String,
  public val deploymentBranchPolicy: DeploymentBranchPolicySettings? = null,
  protectionRules: List<InlineEnvironmentProtectionRulesItemXa9cb9fa2>? = null,
) {
  /**
   * Built-in deployment protection rules for the environment.
   */
  public val protectionRules: List<InlineEnvironmentProtectionRulesItemXa9cb9fa2>? =
      protectionRules?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var deploymentBranchPolicy: DeploymentBranchPolicySettings? = null

    private var protectionRulesValue: List<InlineEnvironmentProtectionRulesItemXa9cb9fa2>? = null

    /**
     * Built-in deployment protection rules for the environment.
     */
    public var protectionRules: List<InlineEnvironmentProtectionRulesItemXa9cb9fa2>?
      get() = protectionRulesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        protectionRulesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): Environment {
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      return Environment(
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        updatedAt = updatedAt,
        url = url,
        deploymentBranchPolicy = deploymentBranchPolicy,
        protectionRules = protectionRules,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Environment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Environment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Environment {
      val jsonDecoder = decoder.requireJsonDecoder("Environment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Environment must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      return Environment(
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        updatedAt = updatedAt,
        url = url,
        deploymentBranchPolicy = rawObject["deployment_branch_policy"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<DeploymentBranchPolicySettings?>(element) },
        protectionRules = rawObject["protection_rules"]?.let { json.decodeFromJsonElement<List<InlineEnvironmentProtectionRulesItemXa9cb9fa2>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Environment) {
      val jsonEncoder = encoder.requireJsonEncoder("Environment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        value.deploymentBranchPolicy?.let { put("deployment_branch_policy", json.encodeToJsonElement(it)) }
        value.protectionRules?.let { put("protection_rules", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun environment(block: Environment.Builder.() -> Unit): Environment = Environment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Environment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
