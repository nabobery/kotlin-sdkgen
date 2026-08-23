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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-renamed/properties/changes/properties/repository/
 * properties/name.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-renamed/properties/changes/properties/repository/
 * properties/name
 */
@Serializable(with = InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646.Serializer::class)
public class InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646(
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646(block: InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646.Builder.() -> Unit): InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646 = InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
