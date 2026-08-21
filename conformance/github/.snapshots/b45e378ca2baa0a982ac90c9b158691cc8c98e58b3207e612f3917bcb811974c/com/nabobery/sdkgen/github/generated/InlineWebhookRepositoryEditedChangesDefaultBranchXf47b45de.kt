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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-edited/properties/changes/properties/default_bran
 * ch.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-edited/properties/changes/properties/default_bran
 * ch
 */
@Serializable(with = InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de.Serializer::class)
public class InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de(
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de {
      check(fromValue != null) { "from is required" }
      return InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de(block: InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de.Builder.() -> Unit): InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de = InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
