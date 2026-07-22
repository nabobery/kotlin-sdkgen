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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/head
 * _commit.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/head
 * _commit
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52.Serializer::class)
public class InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52(
  /**
   * Metaproperties for Git author/committer information.
   */
  public val author: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitAuthorX22af5886,
  /**
   * Metaproperties for Git author/committer information.
   */
  public val committer: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitCommitterXc8b0f15c,
  public val id: String,
  public val message: String,
  public val timestamp: String,
  public val treeId: String,
) {
  public class Builder {
    private var authorValue: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitAuthorX22af5886? =
        null

    public var author: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitAuthorX22af5886
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var committerValue:
        InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitCommitterXc8b0f15c? = null

    public var committer: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitCommitterXc8b0f15c
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

    public fun build(): InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52 {
      check(authorValue != null) { "author is required" }
      check(committerValue != null) { "committer is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(treeIdValue != null) { "treeId is required" }
      return InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52 must be a JSON object")
      val author = json.decodeRequired<InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitAuthorX22af5886>(rawObject, "author")
      val committer = json.decodeRequired<InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitCommitterXc8b0f15c>(rawObject, "committer")
      val id = json.decodeRequired<String>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      val treeId = json.decodeRequired<String>(rawObject, "tree_id")
      return InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52(
        author = author,
        committer = committer,
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52")
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

public fun inlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52(block: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52.Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52 = InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
