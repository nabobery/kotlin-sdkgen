package com.nabobery.sdkgen.github.generated

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
 * Require all changes made to a targeted branch to pass the specified workflows before they can be merged.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-workflows
 */
@Serializable(with = RepositoryRuleWorkflows.Serializer::class)
public class RepositoryRuleWorkflows(
  public val type: InlineRepositoryRuleWorkflowsTypeXb0c9a6d8,
  public val parameters: InlineRepositoryRuleWorkflowsParametersX62e0ea42? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleWorkflowsTypeXb0c9a6d8? = null

    public var type: InlineRepositoryRuleWorkflowsTypeXb0c9a6d8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleWorkflowsParametersX62e0ea42? = null

    public fun build(): RepositoryRuleWorkflows {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleWorkflows(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleWorkflows = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleWorkflows> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleWorkflows {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleWorkflows")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleWorkflows must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleWorkflowsTypeXb0c9a6d8>(rawObject, "type")
      return RepositoryRuleWorkflows(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleWorkflowsParametersX62e0ea42>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleWorkflows) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleWorkflows")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleWorkflows(block: RepositoryRuleWorkflows.Builder.() -> Unit): RepositoryRuleWorkflows = RepositoryRuleWorkflows.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleWorkflows is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
