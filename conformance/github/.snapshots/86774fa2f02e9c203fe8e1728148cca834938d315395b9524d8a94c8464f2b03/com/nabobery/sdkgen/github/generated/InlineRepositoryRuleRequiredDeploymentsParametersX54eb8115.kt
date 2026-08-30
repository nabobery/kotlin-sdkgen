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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-deployments/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-deployments/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115.Serializer::class)
public class InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115(
  requiredDeploymentEnvironments: List<String>,
) {
  /**
   * The environments that must be successfully deployed to before branches can be merged.
   */
  public val requiredDeploymentEnvironments: List<String> = requiredDeploymentEnvironments.toList()

  public class Builder {
    private var requiredDeploymentEnvironmentsValue: List<String>? = null

    public var requiredDeploymentEnvironments: List<String>
      get() = requireNotNull(requiredDeploymentEnvironmentsValue) { "requiredDeploymentEnvironments is required" }.toList()
      set(`value`) {
        requiredDeploymentEnvironmentsValue = value.toList()
      }

    public fun build(): InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115 {
      check(requiredDeploymentEnvironmentsValue != null) { "requiredDeploymentEnvironments is required" }
      return InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115(
        requiredDeploymentEnvironments = requiredDeploymentEnvironments,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115 must be a JSON object")
      val requiredDeploymentEnvironments = json.decodeRequired<List<String>>(rawObject, "required_deployment_environments")
      return InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115(
        requiredDeploymentEnvironments = requiredDeploymentEnvironments,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("required_deployment_environments", json.encodeToJsonElement(value.requiredDeploymentEnvironments))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleRequiredDeploymentsParametersX54eb8115(block: InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115.Builder.() -> Unit): InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115 = InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
