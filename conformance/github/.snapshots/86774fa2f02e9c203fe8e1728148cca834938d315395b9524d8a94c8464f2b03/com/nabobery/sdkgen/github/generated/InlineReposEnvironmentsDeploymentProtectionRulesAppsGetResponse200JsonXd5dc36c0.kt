package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1deployment_protection
 * _rules~1apps/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1deployment_protection
 * _rules~1apps/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0.Serializer::class)
public class InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0(
  availableCustomDeploymentProtectionRuleIntegrations: List<CustomDeploymentRuleApp>? = null,
  /**
   * The total number of custom deployment protection rule integrations available for this environment.
   */
  public val totalCount: Int? = null,
) {
  public val availableCustomDeploymentProtectionRuleIntegrations: List<CustomDeploymentRuleApp>? =
      availableCustomDeploymentProtectionRuleIntegrations?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var availableCustomDeploymentProtectionRuleIntegrationsValue:
        List<CustomDeploymentRuleApp>? = null

    public var availableCustomDeploymentProtectionRuleIntegrations: List<CustomDeploymentRuleApp>?
      get() = availableCustomDeploymentProtectionRuleIntegrationsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        availableCustomDeploymentProtectionRuleIntegrationsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The total number of custom deployment protection rule integrations available for this environment.
     */
    public var totalCount: Int? = null

    public fun build(): InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0 = InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0(
      availableCustomDeploymentProtectionRuleIntegrations = availableCustomDeploymentProtectionRuleIntegrations,
      totalCount = totalCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0 must be a JSON object")
      return InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0(
        availableCustomDeploymentProtectionRuleIntegrations = rawObject["available_custom_deployment_protection_rule_integrations"]?.let { json.decodeFromJsonElement<List<CustomDeploymentRuleApp>>(it) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.availableCustomDeploymentProtectionRuleIntegrations?.let { put("available_custom_deployment_protection_rule_integrations", json.encodeToJsonElement(it)) }
        value.totalCount?.let { put("total_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0(block: InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0.Builder.() -> Unit): InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0 = InlineReposEnvironmentsDeploymentProtectionRulesAppsGetResponse200JsonXd5dc36c0.build(block)
