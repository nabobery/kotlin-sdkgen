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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/deployment-branch-policy-name-pattern.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/deployment-branch-policy-name-pattern
 */
@Serializable(with = DeploymentBranchPolicyNamePattern.Serializer::class)
public class DeploymentBranchPolicyNamePattern(
  /**
   * The name pattern that branches must match in order to deploy to the environment.
   *
   * Wildcard characters will not match `/`. For example, to match branches that begin with `release/` and contain an
   * additional single slash, use `release/&#42;&#47;*`.
   * For more information about pattern matching syntax, see the [Ruby File.fnmatch
   * documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch).
   */
  public val name: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): DeploymentBranchPolicyNamePattern {
      check(nameValue != null) { "name is required" }
      return DeploymentBranchPolicyNamePattern(
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeploymentBranchPolicyNamePattern = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DeploymentBranchPolicyNamePattern> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeploymentBranchPolicyNamePattern {
      val jsonDecoder = decoder.requireJsonDecoder("DeploymentBranchPolicyNamePattern")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeploymentBranchPolicyNamePattern must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return DeploymentBranchPolicyNamePattern(
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeploymentBranchPolicyNamePattern) {
      val jsonEncoder = encoder.requireJsonEncoder("DeploymentBranchPolicyNamePattern")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deploymentBranchPolicyNamePattern(block: DeploymentBranchPolicyNamePattern.Builder.() -> Unit): DeploymentBranchPolicyNamePattern = DeploymentBranchPolicyNamePattern.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeploymentBranchPolicyNamePattern is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
