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
import kotlinx.serialization.json.put

/**
 * The role assigned to the collaborator.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-member-added/properties/changes/properties/role_name
 */
@Serializable(with = InlineWebhookMemberAddedChangesRoleNameXaee7a1ee.Serializer::class)
public class InlineWebhookMemberAddedChangesRoleNameXaee7a1ee(
  public val to: String,
) {
  public class Builder {
    private var toValue: String? = null

    public var to: String
      get() = requireNotNull(toValue) { "to is required" }
      set(`value`) {
        toValue = value
      }

    public fun build(): InlineWebhookMemberAddedChangesRoleNameXaee7a1ee {
      check(toValue != null) { "to is required" }
      return InlineWebhookMemberAddedChangesRoleNameXaee7a1ee(
        to = to,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMemberAddedChangesRoleNameXaee7a1ee = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookMemberAddedChangesRoleNameXaee7a1ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMemberAddedChangesRoleNameXaee7a1ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMemberAddedChangesRoleNameXaee7a1ee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMemberAddedChangesRoleNameXaee7a1ee must be a JSON object")
      val to = json.decodeRequired<String>(rawObject, "to")
      return InlineWebhookMemberAddedChangesRoleNameXaee7a1ee(
        to = to,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMemberAddedChangesRoleNameXaee7a1ee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMemberAddedChangesRoleNameXaee7a1ee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("to", value.to)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMemberAddedChangesRoleNameXaee7a1ee(block: InlineWebhookMemberAddedChangesRoleNameXaee7a1ee.Builder.() -> Unit): InlineWebhookMemberAddedChangesRoleNameXaee7a1ee = InlineWebhookMemberAddedChangesRoleNameXaee7a1ee.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookMemberAddedChangesRoleNameXaee7a1ee is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
