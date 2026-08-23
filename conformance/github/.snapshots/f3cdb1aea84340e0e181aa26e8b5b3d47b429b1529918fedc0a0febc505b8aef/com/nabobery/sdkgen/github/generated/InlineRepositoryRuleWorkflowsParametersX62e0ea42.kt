package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-rule-workflows/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-workflows/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleWorkflowsParametersX62e0ea42.Serializer::class)
public class InlineRepositoryRuleWorkflowsParametersX62e0ea42(
  workflows: List<RepositoryRuleParamsWorkflowFileReference>,
  /**
   * Allow repositories and branches to be created if a check would otherwise prohibit it.
   */
  public val doNotEnforceOnCreate: Boolean? = null,
) {
  /**
   * Workflows that must pass for this rule to pass.
   */
  public val workflows: List<RepositoryRuleParamsWorkflowFileReference> = workflows.toList()

  public class Builder {
    private var workflowsValue: List<RepositoryRuleParamsWorkflowFileReference>? = null

    public var workflows: List<RepositoryRuleParamsWorkflowFileReference>
      get() = requireNotNull(workflowsValue) { "workflows is required" }.toList()
      set(`value`) {
        workflowsValue = value.toList()
      }

    /**
     * Allow repositories and branches to be created if a check would otherwise prohibit it.
     */
    public var doNotEnforceOnCreate: Boolean? = null

    public fun build(): InlineRepositoryRuleWorkflowsParametersX62e0ea42 {
      check(workflowsValue != null) { "workflows is required" }
      return InlineRepositoryRuleWorkflowsParametersX62e0ea42(
        workflows = workflows,
        doNotEnforceOnCreate = doNotEnforceOnCreate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleWorkflowsParametersX62e0ea42 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleWorkflowsParametersX62e0ea42> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleWorkflowsParametersX62e0ea42 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleWorkflowsParametersX62e0ea42")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleWorkflowsParametersX62e0ea42 must be a JSON object")
      val workflows = json.decodeRequired<List<RepositoryRuleParamsWorkflowFileReference>>(rawObject, "workflows")
      return InlineRepositoryRuleWorkflowsParametersX62e0ea42(
        workflows = workflows,
        doNotEnforceOnCreate = rawObject["do_not_enforce_on_create"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleWorkflowsParametersX62e0ea42) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleWorkflowsParametersX62e0ea42")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("workflows", json.encodeToJsonElement(value.workflows))
        value.doNotEnforceOnCreate?.let { put("do_not_enforce_on_create", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleWorkflowsParametersX62e0ea42(block: InlineRepositoryRuleWorkflowsParametersX62e0ea42.Builder.() -> Unit): InlineRepositoryRuleWorkflowsParametersX62e0ea42 = InlineRepositoryRuleWorkflowsParametersX62e0ea42.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleWorkflowsParametersX62e0ea42 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
