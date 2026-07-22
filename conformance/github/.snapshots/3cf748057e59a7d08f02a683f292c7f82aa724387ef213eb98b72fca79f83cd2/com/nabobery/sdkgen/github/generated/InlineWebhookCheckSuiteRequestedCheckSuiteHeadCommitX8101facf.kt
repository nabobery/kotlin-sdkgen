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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/head
 * _commit.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested/properties/check_suite/properties/head
 * _commit
 */
@Serializable(with = InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf.Serializer::class)
public class InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf(
  /**
   * Metaproperties for Git author/committer information.
   */
  public val author: InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitAuthorX6d0abd16,
  /**
   * Metaproperties for Git author/committer information.
   */
  public val committer: InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitCommitterX5feac44c,
  public val id: String,
  public val message: String,
  public val timestamp: String,
  public val treeId: String,
) {
  public class Builder {
    private var authorValue: InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitAuthorX6d0abd16? =
        null

    public var author: InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitAuthorX6d0abd16
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var committerValue:
        InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitCommitterX5feac44c? = null

    public var committer: InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitCommitterX5feac44c
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

    public fun build(): InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf {
      check(authorValue != null) { "author is required" }
      check(committerValue != null) { "committer is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(treeIdValue != null) { "treeId is required" }
      return InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf must be a JSON object")
      val author = json.decodeRequired<InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitAuthorX6d0abd16>(rawObject, "author")
      val committer = json.decodeRequired<InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitCommitterX5feac44c>(rawObject, "committer")
      val id = json.decodeRequired<String>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      val treeId = json.decodeRequired<String>(rawObject, "tree_id")
      return InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf(
        author = author,
        committer = committer,
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf")
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

public fun inlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf(block: InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf.Builder.() -> Unit): InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf = InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteRequestedCheckSuiteHeadCommitX8101facf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
