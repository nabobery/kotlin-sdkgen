package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items/anyOf/1
 */
@Serializable(with = InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186.Serializer::class)
public class InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186(
  public val id: Int,
  public val nodeId: String,
  public val type: String,
  /**
   * Whether deployments to this environment can be approved by the user who created the deployment.
   */
  public val preventSelfReview: Boolean? = null,
  reviewers: List<InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025>? = null,
) {
  /**
   * The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as
   * reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs
   * to approve the job for it to proceed.
   */
  public val reviewers: List<InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025>? =
      reviewers?.let { collection0 -> collection0.toList() }

  public class Builder {
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

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Whether deployments to this environment can be approved by the user who created the deployment.
     */
    public var preventSelfReview: Boolean? = null

    private var reviewersValue:
        List<InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025>? = null

    /**
     * The people or teams that may approve jobs that reference the environment. You can list up to six users or teams
     * as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers
     * needs to approve the job for it to proceed.
     */
    public var reviewers: List<InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025>?
      get() = reviewersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        reviewersValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186 {
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(typeValue != null) { "type is required" }
      return InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186(
        id = id,
        nodeId = nodeId,
        type = type,
        preventSelfReview = preventSelfReview,
        reviewers = reviewers,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186(
        id = id,
        nodeId = nodeId,
        type = type,
        preventSelfReview = rawObject["prevent_self_review"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        reviewers = rawObject["reviewers"]?.let { json.decodeFromJsonElement<List<InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemX4c3ef025>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("type", value.type)
        value.preventSelfReview?.let { put("prevent_self_review", json.encodeToJsonElement(it)) }
        value.reviewers?.let { put("reviewers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnvironmentProtectionRulesItemAnyOf2X5efe1186(block: InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186.Builder.() -> Unit): InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186 = InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnvironmentProtectionRulesItemAnyOf2X5efe1186 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
