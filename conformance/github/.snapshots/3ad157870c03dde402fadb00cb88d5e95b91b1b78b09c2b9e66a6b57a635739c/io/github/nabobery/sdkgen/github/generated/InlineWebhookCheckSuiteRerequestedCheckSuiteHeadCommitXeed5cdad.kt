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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/he
 * ad_commit.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite/properties/he
 * ad_commit
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad.Serializer::class)
public class InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad(
  /**
   * Metaproperties for Git author/committer information.
   */
  public val author: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitAuthorX0db0ef23,
  /**
   * Metaproperties for Git author/committer information.
   */
  public val committer: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitCommitterXb831c03c,
  public val id: String,
  public val message: String,
  public val timestamp: String,
  public val treeId: String,
) {
  public class Builder {
    private var authorValue: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitAuthorX0db0ef23?
        = null

    public var author: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitAuthorX0db0ef23
      get() = requireNotNull(authorValue) { "author is required" }
      set(`value`) {
        authorValue = value
      }

    private var committerValue:
        InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitCommitterXb831c03c? = null

    public var committer: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitCommitterXb831c03c
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

    public fun build(): InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad {
      check(authorValue != null) { "author is required" }
      check(committerValue != null) { "committer is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      check(timestampValue != null) { "timestamp is required" }
      check(treeIdValue != null) { "treeId is required" }
      return InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad must be a JSON object")
      val author = json.decodeRequired<InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitAuthorX0db0ef23>(rawObject, "author")
      val committer = json.decodeRequired<InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitCommitterXb831c03c>(rawObject, "committer")
      val id = json.decodeRequired<String>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      val timestamp = json.decodeRequired<String>(rawObject, "timestamp")
      val treeId = json.decodeRequired<String>(rawObject, "tree_id")
      return InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad(
        author = author,
        committer = committer,
        id = id,
        message = message,
        timestamp = timestamp,
        treeId = treeId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad")
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

public fun inlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad(block: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad.Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad = InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
