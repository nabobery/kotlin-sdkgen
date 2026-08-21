package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Deployment protection rule
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/deployment-protection-rule
 */
@Serializable(with = DeploymentProtectionRule.Serializer::class)
public class DeploymentProtectionRule(
  public val app: CustomDeploymentRuleApp,
  /**
   * Whether the deployment protection rule is enabled for the environment.
   */
  public val enabled: Boolean,
  /**
   * The unique identifier for the deployment protection rule.
   */
  public val id: Int,
  /**
   * The node ID for the deployment protection rule.
   */
  public val nodeId: String,
) {
  public class Builder {
    private var appValue: CustomDeploymentRuleApp? = null

    public var app: CustomDeploymentRuleApp
      get() = requireNotNull(appValue) { "app is required" }
      set(`value`) {
        appValue = value
      }

    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    public fun build(): DeploymentProtectionRule {
      check(appValue != null) { "app is required" }
      check(enabledValue != null) { "enabled is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      return DeploymentProtectionRule(
        app = app,
        enabled = enabled,
        id = id,
        nodeId = nodeId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeploymentProtectionRule = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DeploymentProtectionRule> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeploymentProtectionRule {
      val jsonDecoder = decoder.requireJsonDecoder("DeploymentProtectionRule")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeploymentProtectionRule must be a JSON object")
      val app = json.decodeRequired<CustomDeploymentRuleApp>(rawObject, "app")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      return DeploymentProtectionRule(
        app = app,
        enabled = enabled,
        id = id,
        nodeId = nodeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeploymentProtectionRule) {
      val jsonEncoder = encoder.requireJsonEncoder("DeploymentProtectionRule")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app", json.encodeToJsonElement(value.app))
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deploymentProtectionRule(block: DeploymentProtectionRule.Builder.() -> Unit): DeploymentProtectionRule = DeploymentProtectionRule.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeploymentProtectionRule is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
