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
 * _rules/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1deployment_protection
 * _rules/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0.Serializer::class)
public class InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0(
  customDeploymentProtectionRules: List<DeploymentProtectionRule>? = null,
  /**
   * The number of enabled custom deployment protection rules for this environment
   */
  public val totalCount: Int? = null,
) {
  public val customDeploymentProtectionRules: List<DeploymentProtectionRule>? =
      customDeploymentProtectionRules?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var customDeploymentProtectionRulesValue: List<DeploymentProtectionRule>? = null

    public var customDeploymentProtectionRules: List<DeploymentProtectionRule>?
      get() = customDeploymentProtectionRulesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        customDeploymentProtectionRulesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The number of enabled custom deployment protection rules for this environment
     */
    public var totalCount: Int? = null

    public fun build(): InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0 = InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0(
      customDeploymentProtectionRules = customDeploymentProtectionRules,
      totalCount = totalCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0 must be a JSON object")
      return InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0(
        customDeploymentProtectionRules = rawObject["custom_deployment_protection_rules"]?.let { json.decodeFromJsonElement<List<DeploymentProtectionRule>>(it) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customDeploymentProtectionRules?.let { put("custom_deployment_protection_rules", json.encodeToJsonElement(it)) }
        value.totalCount?.let { put("total_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0(block: InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0.Builder.() -> Unit): InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0 = InlineReposEnvironmentsDeploymentProtectionRulesGetResponse200JsonX898accd0.build(block)
