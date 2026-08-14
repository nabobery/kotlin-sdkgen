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
 * This field is included for legacy purposes; use the `role_name` field instead. The `maintain`
 * role is mapped to `write` and the `triage` role is mapped to `read`. To determine the role
 * assigned to the collaborator, use the `role_name` field instead, which will provide the full
 * role name, including custom roles.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-member-added/properties/changes/properties/permission
 */
@Serializable(with = InlineWebhookMemberAddedChangesPermissionX6e1c26ff.Serializer::class)
public class InlineWebhookMemberAddedChangesPermissionX6e1c26ff(
  public val to: InlineWebhookMemberAddedChangesPermissionToX9ab75103,
) {
  public class Builder {
    private var toValue: InlineWebhookMemberAddedChangesPermissionToX9ab75103? = null

    public var to: InlineWebhookMemberAddedChangesPermissionToX9ab75103
      get() = requireNotNull(toValue) { "to is required" }
      set(`value`) {
        toValue = value
      }

    public fun build(): InlineWebhookMemberAddedChangesPermissionX6e1c26ff {
      check(toValue != null) { "to is required" }
      return InlineWebhookMemberAddedChangesPermissionX6e1c26ff(
        to = to,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMemberAddedChangesPermissionX6e1c26ff = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookMemberAddedChangesPermissionX6e1c26ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMemberAddedChangesPermissionX6e1c26ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMemberAddedChangesPermissionX6e1c26ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMemberAddedChangesPermissionX6e1c26ff must be a JSON object")
      val to = json.decodeRequired<InlineWebhookMemberAddedChangesPermissionToX9ab75103>(rawObject, "to")
      return InlineWebhookMemberAddedChangesPermissionX6e1c26ff(
        to = to,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMemberAddedChangesPermissionX6e1c26ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMemberAddedChangesPermissionX6e1c26ff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("to", json.encodeToJsonElement(value.to))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMemberAddedChangesPermissionX6e1c26ff(block: InlineWebhookMemberAddedChangesPermissionX6e1c26ff.Builder.() -> Unit): InlineWebhookMemberAddedChangesPermissionX6e1c26ff = InlineWebhookMemberAddedChangesPermissionX6e1c26ff.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookMemberAddedChangesPermissionX6e1c26ff is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
