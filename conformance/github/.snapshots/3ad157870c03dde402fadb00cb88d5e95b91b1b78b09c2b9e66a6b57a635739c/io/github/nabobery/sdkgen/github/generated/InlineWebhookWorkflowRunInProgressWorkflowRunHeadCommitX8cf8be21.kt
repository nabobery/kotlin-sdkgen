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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * head_commit.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * head_commit
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21.Serializer::class)
public class InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21(
  /**
   * Metaproperties for Git author/committer information.
   */
  public val author: InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitAuthorX8493f031,
  /**
   * Metaproperties for Git author/committer information.
   */
  public val committer: InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitCommitterXa3181336,
  public val id: String,
  public val message: String,
  public val timestamp: String,
  public val treeId: String,
) {
  public class Builder {
    private var authorValue: InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitAuthorX8493f031?
        = null

    public var author: InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitAuthorX8493f031
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var committerValue:
        InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitCommitterXa3181336? = null

    public var committer: InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitCommitterXa3181336
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

    public fun build(): InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21 {
      check(authorValue != null) { "author is required" }
      check(committerValue != null) { "committer is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(treeIdValue != null) { "treeId is required" }
      return InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21 must be a JSON object")
      val author = json.decodeRequired<InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitAuthorX8493f031>(rawObject, "author")
      val committer = json.decodeRequired<InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitCommitterXa3181336>(rawObject, "committer")
      val id = json.decodeRequired<String>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      val treeId = json.decodeRequired<String>(rawObject, "tree_id")
      return InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21(
        author = author,
        committer = committer,
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21")
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

public fun inlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21(block: InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21.Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21 = InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunHeadCommitX8cf8be21 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
