package io.github.nabobery.sdkgen.github.generated

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
 * Choose which environments must be successfully deployed to before refs can be pushed into a ref that matches this
 * rule.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-deployments
 */
@Serializable(with = RepositoryRuleRequiredDeployments.Serializer::class)
public class RepositoryRuleRequiredDeployments(
  public val type: InlineRepositoryRuleRequiredDeploymentsTypeXd224c837,
  public val parameters: InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleRequiredDeploymentsTypeXd224c837? = null

    public var type: InlineRepositoryRuleRequiredDeploymentsTypeXd224c837
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115? = null

    public fun build(): RepositoryRuleRequiredDeployments {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleRequiredDeployments(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleRequiredDeployments = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleRequiredDeployments> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleRequiredDeployments {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleRequiredDeployments")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleRequiredDeployments must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleRequiredDeploymentsTypeXd224c837>(rawObject, "type")
      return RepositoryRuleRequiredDeployments(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleRequiredDeploymentsParametersX54eb8115>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleRequiredDeployments) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleRequiredDeployments")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleRequiredDeployments(block: RepositoryRuleRequiredDeployments.Builder.() -> Unit): RepositoryRuleRequiredDeployments = RepositoryRuleRequiredDeployments.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleRequiredDeployments is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
