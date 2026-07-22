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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/deployment-branch-policy-name-pattern-with-type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/deployment-branch-policy-name-pattern-with-type
 */
@Serializable(with = DeploymentBranchPolicyNamePatternWithType.Serializer::class)
public class DeploymentBranchPolicyNamePatternWithType(
  /**
   * The name pattern that branches or tags must match in order to deploy to the environment.
   *
   * Wildcard characters will not match `/`. For example, to match branches that begin with `release/` and contain an
   * additional single slash, use `release/&#42;&#47;*`.
   * For more information about pattern matching syntax, see the [Ruby File.fnmatch
   * documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch).
   */
  public val name: String,
  /**
   * Whether this rule targets a branch or tag
   */
  public val type: InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Whether this rule targets a branch or tag
     */
    public var type: InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305? = null

    public fun build(): DeploymentBranchPolicyNamePatternWithType {
      check(nameValue != null) { "name is required" }
      return DeploymentBranchPolicyNamePatternWithType(
        name = name,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeploymentBranchPolicyNamePatternWithType = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DeploymentBranchPolicyNamePatternWithType> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeploymentBranchPolicyNamePatternWithType {
      val jsonDecoder = decoder.requireJsonDecoder("DeploymentBranchPolicyNamePatternWithType")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeploymentBranchPolicyNamePatternWithType must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return DeploymentBranchPolicyNamePatternWithType(
        name = name,
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineDeploymentBranchPolicyNamePatternWithTypeTypeXa2454305>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeploymentBranchPolicyNamePatternWithType) {
      val jsonEncoder = encoder.requireJsonEncoder("DeploymentBranchPolicyNamePatternWithType")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deploymentBranchPolicyNamePatternWithType(block: DeploymentBranchPolicyNamePatternWithType.Builder.() -> Unit): DeploymentBranchPolicyNamePatternWithType = DeploymentBranchPolicyNamePatternWithType.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeploymentBranchPolicyNamePatternWithType is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
