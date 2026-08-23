package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Details of a deployment branch or tag policy.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/deployment-branch-policy
 */
@Serializable(with = DeploymentBranchPolicy.Serializer::class)
public class DeploymentBranchPolicy(
  /**
   * The unique identifier of the branch or tag policy.
   */
  public val id: Int? = null,
  /**
   * The name pattern that branches or tags must match in order to deploy to the environment.
   */
  public val name: String? = null,
  public val nodeId: String? = null,
  /**
   * Whether this rule targets a branch or tag.
   */
  public val type: InlineDeploymentBranchPolicyTypeX41073575? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the branch or tag policy.
     */
    public var id: Int? = null

    /**
     * The name pattern that branches or tags must match in order to deploy to the environment.
     */
    public var name: String? = null

    public var nodeId: String? = null

    /**
     * Whether this rule targets a branch or tag.
     */
    public var type: InlineDeploymentBranchPolicyTypeX41073575? = null

    public fun build(): DeploymentBranchPolicy = DeploymentBranchPolicy(
      id = id,
      name = name,
      nodeId = nodeId,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeploymentBranchPolicy = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DeploymentBranchPolicy> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeploymentBranchPolicy {
      val jsonDecoder = decoder.requireJsonDecoder("DeploymentBranchPolicy")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeploymentBranchPolicy must be a JSON object")
      return DeploymentBranchPolicy(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineDeploymentBranchPolicyTypeX41073575>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeploymentBranchPolicy) {
      val jsonEncoder = encoder.requireJsonEncoder("DeploymentBranchPolicy")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deploymentBranchPolicy(block: DeploymentBranchPolicy.Builder.() -> Unit): DeploymentBranchPolicy = DeploymentBranchPolicy.build(block)
