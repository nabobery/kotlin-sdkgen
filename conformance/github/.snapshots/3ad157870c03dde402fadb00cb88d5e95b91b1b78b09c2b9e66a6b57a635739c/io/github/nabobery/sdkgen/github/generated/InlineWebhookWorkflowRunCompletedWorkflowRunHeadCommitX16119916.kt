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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/he
 * ad_commit.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/he
 * ad_commit
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916.Serializer::class)
public class InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916(
  /**
   * Metaproperties for Git author/committer information.
   */
  public val author: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitAuthorXaf2aa43b,
  /**
   * Metaproperties for Git author/committer information.
   */
  public val committer: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitCommitterX0d84281a,
  public val id: String,
  public val message: String,
  public val timestamp: String,
  public val treeId: String,
) {
  public class Builder {
    private var authorValue: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitAuthorXaf2aa43b?
        = null

    public var author: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitAuthorXaf2aa43b
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var committerValue:
        InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitCommitterX0d84281a? = null

    public var committer: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitCommitterX0d84281a
      get() = requireNotNull(committerValue) { "committer is required" }
      set(`value`) {
        committerValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var timestampValue: String? = null

    public var timestamp: String
      get() = requireNotNull(timestampValue) { "timestamp is required" }
      set(`value`) {
        timestampValue = value
      }

    private var treeIdValue: String? = null

    public var treeId: String
      get() = requireNotNull(treeIdValue) { "treeId is required" }
      set(`value`) {
        treeIdValue = value
      }

    public fun build(): InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916 {
      check(authorValue != null) { "author is required" }
      check(committerValue != null) { "committer is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(treeIdValue != null) { "treeId is required" }
      return InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916(
        author = author,
        committer = committer,
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916 must be a JSON object")
      val author = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitAuthorXaf2aa43b>(rawObject, "author")
      val committer = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitCommitterX0d84281a>(rawObject, "committer")
      val id = json.decodeRequired<String>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      val treeId = json.decodeRequired<String>(rawObject, "tree_id")
      return InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916(
        author = author,
        committer = committer,
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", json.encodeToJsonElement(value.author))
        put("committer", json.encodeToJsonElement(value.committer))
        put("id", value.id)
        put("message", value.message)
        put("timestamp", value.timestamp)
        put("tree_id", value.treeId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916(block: InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916.Builder.() -> Unit): InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916 = InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunCompletedWorkflowRunHeadCommitX16119916 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
