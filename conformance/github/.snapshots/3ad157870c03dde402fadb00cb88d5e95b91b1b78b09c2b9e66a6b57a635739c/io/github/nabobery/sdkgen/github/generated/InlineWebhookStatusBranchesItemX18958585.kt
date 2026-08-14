package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/branches/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/branches/items
 */
@Serializable(with = InlineWebhookStatusBranchesItemX18958585.Serializer::class)
public class InlineWebhookStatusBranchesItemX18958585(
  public val commit: InlineWebhookStatusBranchesItemCommitX255ec330,
  public val name: String,
  public val `protected`: Boolean,
) {
  public class Builder {
    private var commitValue: InlineWebhookStatusBranchesItemCommitX255ec330? = null

    public var commit: InlineWebhookStatusBranchesItemCommitX255ec330
      get() = requireNotNull(commitValue) { "commit is required" }
      set(`value`) {
        commitValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var protectedValue: Boolean? = null

    public var `protected`: Boolean
      get() = requireNotNull(protectedValue) { "protected is required" }
      set(`value`) {
        protectedValue = value
      }

    public fun build(): InlineWebhookStatusBranchesItemX18958585 {
      check(commitValue != null) { "commit is required" }
      check(nameValue != null) { "name is required" }
      check(protectedValue != null) { "protected is required" }
      return InlineWebhookStatusBranchesItemX18958585(
        commit = commit,
        name = name,
        protected = protected,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookStatusBranchesItemX18958585 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookStatusBranchesItemX18958585> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookStatusBranchesItemX18958585 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookStatusBranchesItemX18958585")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookStatusBranchesItemX18958585 must be a JSON object")
      val commit = json.decodeRequired<InlineWebhookStatusBranchesItemCommitX255ec330>(rawObject, "commit")
      val name = json.decodeRequired<String>(rawObject, "name")
      val protected = json.decodeRequired<Boolean>(rawObject, "protected")
      return InlineWebhookStatusBranchesItemX18958585(
        commit = commit,
        name = name,
        protected = protected,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStatusBranchesItemX18958585) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookStatusBranchesItemX18958585")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit", json.encodeToJsonElement(value.commit))
        put("name", value.name)
        put("protected", json.encodeToJsonElement(value.protected))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookStatusBranchesItemX18958585(block: InlineWebhookStatusBranchesItemX18958585.Builder.() -> Unit): InlineWebhookStatusBranchesItemX18958585 = InlineWebhookStatusBranchesItemX18958585.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookStatusBranchesItemX18958585 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
