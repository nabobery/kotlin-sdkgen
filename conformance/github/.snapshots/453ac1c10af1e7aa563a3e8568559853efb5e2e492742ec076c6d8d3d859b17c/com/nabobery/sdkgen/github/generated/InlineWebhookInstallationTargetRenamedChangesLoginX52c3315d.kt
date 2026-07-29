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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-target-renamed/properties/changes/properties/lo
 * gin.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-target-renamed/properties/changes/properties/lo
 * gin
 */
@Serializable(with = InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d.Serializer::class)
public class InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d(
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d {
      check(fromValue != null) { "from is required" }
      return InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookInstallationTargetRenamedChangesLoginX52c3315d(block: InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d.Builder.() -> Unit): InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d = InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookInstallationTargetRenamedChangesLoginX52c3315d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
