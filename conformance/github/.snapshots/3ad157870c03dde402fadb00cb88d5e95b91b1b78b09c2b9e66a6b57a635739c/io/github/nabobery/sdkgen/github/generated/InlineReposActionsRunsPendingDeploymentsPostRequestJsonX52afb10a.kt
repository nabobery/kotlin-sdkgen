package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1pending_deployments/post/reque
 * stBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1pending_deployments/post/reque
 * stBody/content/application~1json/schema
 */
@Serializable(with = InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a.Serializer::class)
public class InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a(
  /**
   * A comment to accompany the deployment review
   */
  public val comment: String,
  environmentIds: List<Int>,
  /**
   * Whether to approve or reject deployment to the specified environments.
   */
  public val state: InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384,
) {
  /**
   * The list of environment ids to approve or reject
   */
  public val environmentIds: List<Int> = environmentIds.toList()

  public class Builder {
    private var commentValue: String? = null

    public var comment: String
      get() = requireNotNull(commentValue) { "comment is required" }
      set(`value`) {
        commentValue = value
      }

    private var environmentIdsValue: List<Int>? = null

    public var environmentIds: List<Int>
      get() = requireNotNull(environmentIdsValue) { "environmentIds is required" }.toList()
      set(`value`) {
        environmentIdsValue = value.toList()
      }

    private var stateValue: InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384? =
        null

    public var state: InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    public fun build(): InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a {
      check(commentValue != null) { "comment is required" }
      check(environmentIdsValue != null) { "environmentIds is required" }
      check(stateValue != null) { "state is required" }
      return InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a(
        comment = comment,
        environmentIds = environmentIds,
        state = state,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a must be a JSON object")
      val comment = json.decodeRequired<String>(rawObject, "comment")
      val environmentIds = json.decodeRequired<List<Int>>(rawObject, "environment_ids")
      val state = json.decodeRequired<InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384>(rawObject, "state")
      return InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a(
        comment = comment,
        environmentIds = environmentIds,
        state = state,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("comment", value.comment)
        put("environment_ids", json.encodeToJsonElement(value.environmentIds))
        put("state", json.encodeToJsonElement(value.state))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a(block: InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a.Builder.() -> Unit): InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a = InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposActionsRunsPendingDeploymentsPostRequestJsonX52afb10a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
