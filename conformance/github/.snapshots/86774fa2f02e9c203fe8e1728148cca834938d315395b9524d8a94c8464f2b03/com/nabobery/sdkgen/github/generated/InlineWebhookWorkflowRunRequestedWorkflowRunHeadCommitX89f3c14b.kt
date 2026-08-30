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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/he
 * ad_commit.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/he
 * ad_commit
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b.Serializer::class)
public class InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b(
  /**
   * Metaproperties for Git author/committer information.
   */
  public val author: InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitAuthorX9caeaade,
  /**
   * Metaproperties for Git author/committer information.
   */
  public val committer: InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitCommitterXf2613934,
  public val id: String,
  public val message: String,
  public val timestamp: String,
  public val treeId: String,
) {
  public class Builder {
    private var authorValue: InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitAuthorX9caeaade?
        = null

    public var author: InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitAuthorX9caeaade
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var committerValue:
        InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitCommitterXf2613934? = null

    public var committer: InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitCommitterXf2613934
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

    public fun build(): InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b {
      check(authorValue != null) { "author is required" }
      check(committerValue != null) { "committer is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(treeIdValue != null) { "treeId is required" }
      return InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b must be a JSON object")
      val author = json.decodeRequired<InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitAuthorX9caeaade>(rawObject, "author")
      val committer = json.decodeRequired<InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitCommitterXf2613934>(rawObject, "committer")
      val id = json.decodeRequired<String>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      val treeId = json.decodeRequired<String>(rawObject, "tree_id")
      return InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b(
        author = author,
        committer = committer,
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b")
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

public fun inlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b(block: InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b.Builder.() -> Unit): InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b = InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunRequestedWorkflowRunHeadCommitX89f3c14b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
