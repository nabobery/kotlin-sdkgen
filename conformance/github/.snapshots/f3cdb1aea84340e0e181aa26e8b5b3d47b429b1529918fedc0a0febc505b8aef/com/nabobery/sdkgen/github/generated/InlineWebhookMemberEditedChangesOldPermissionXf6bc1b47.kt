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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-member-edited/properties/changes/properties/old_permission.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-member-edited/properties/changes/properties/old_permission
 */
@Serializable(with = InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47.Serializer::class)
public class InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47(
  /**
   * The previous permissions of the collaborator if the action was edited.
   */
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMemberEditedChangesOldPermissionXf6bc1b47(block: InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47.Builder.() -> Unit): InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47 = InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookMemberEditedChangesOldPermissionXf6bc1b47 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
