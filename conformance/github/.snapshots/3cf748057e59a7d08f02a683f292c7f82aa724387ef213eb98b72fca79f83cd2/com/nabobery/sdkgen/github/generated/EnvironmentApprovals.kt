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
 * An entry in the reviews log for environment deployments
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/environment-approvals
 */
@Serializable(with = EnvironmentApprovals.Serializer::class)
public class EnvironmentApprovals(
  /**
   * The comment submitted with the deployment review
   */
  public val comment: String,
  environments: List<InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a>,
  /**
   * Whether deployment to the environment(s) was approved or rejected or pending (with comments)
   */
  public val state: InlineEnvironmentApprovalsStateX16894d01,
  public val user: SimpleUser,
) {
  /**
   * The list of environments that were approved or rejected
   */
  public val environments: List<InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a> =
      environments.toList()

  public class Builder {
    private var commentValue: String? = null

    public var comment: String
      get() = requireNotNull(commentValue) { "comment is required" }
      set(`value`) {
        commentValue = value
      }

    private var environmentsValue: List<InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a>? = null

    public var environments: List<InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a>
      get() = requireNotNull(environmentsValue) { "environments is required" }
      set(`value`) {
        environmentsValue = value
      }

    private var stateValue: InlineEnvironmentApprovalsStateX16894d01? = null

    public var state: InlineEnvironmentApprovalsStateX16894d01
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var userValue: SimpleUser? = null

    public var user: SimpleUser
      get() = requireNotNull(userValue) { "user is required" }
      set(`value`) {
        userValue = value
      }

    public fun build(): EnvironmentApprovals {
      check(commentValue != null) { "comment is required" }
      check(environmentsValue != null) { "environments is required" }
      check(stateValue != null) { "state is required" }
      check(userValue != null) { "user is required" }
      return EnvironmentApprovals(
        comment = comment,
        environments = environments,
        state = state,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EnvironmentApprovals = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<EnvironmentApprovals> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EnvironmentApprovals {
      val jsonDecoder = decoder.requireJsonDecoder("EnvironmentApprovals")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EnvironmentApprovals must be a JSON object")
      val comment = json.decodeRequired<String>(rawObject, "comment")
      val environments = json.decodeRequired<List<InlineEnvironmentApprovalsEnvironmentsItemXd4c2c31a>>(rawObject, "environments")
      val state = json.decodeRequired<InlineEnvironmentApprovalsStateX16894d01>(rawObject, "state")
      val user = json.decodeRequired<SimpleUser>(rawObject, "user")
      return EnvironmentApprovals(
        comment = comment,
        environments = environments,
        state = state,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: EnvironmentApprovals) {
      val jsonEncoder = encoder.requireJsonEncoder("EnvironmentApprovals")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("comment", value.comment)
        put("environments", json.encodeToJsonElement(value.environments))
        put("state", json.encodeToJsonElement(value.state))
        put("user", json.encodeToJsonElement(value.user))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun environmentApprovals(block: EnvironmentApprovals.Builder.() -> Unit): EnvironmentApprovals = EnvironmentApprovals.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EnvironmentApprovals is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
