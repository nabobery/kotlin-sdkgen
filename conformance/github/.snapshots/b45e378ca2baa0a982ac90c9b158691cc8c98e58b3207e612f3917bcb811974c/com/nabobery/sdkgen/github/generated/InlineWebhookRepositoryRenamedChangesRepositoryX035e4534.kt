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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-renamed/properties/changes/properties/repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-renamed/properties/changes/properties/repository
 */
@Serializable(with = InlineWebhookRepositoryRenamedChangesRepositoryX035e4534.Serializer::class)
public class InlineWebhookRepositoryRenamedChangesRepositoryX035e4534(
  public val name: InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646,
) {
  public class Builder {
    private var nameValue: InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646? = null

    public var name: InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineWebhookRepositoryRenamedChangesRepositoryX035e4534 {
      check(nameValue != null) { "name is required" }
      return InlineWebhookRepositoryRenamedChangesRepositoryX035e4534(
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRenamedChangesRepositoryX035e4534 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryRenamedChangesRepositoryX035e4534> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRenamedChangesRepositoryX035e4534 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRenamedChangesRepositoryX035e4534")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRenamedChangesRepositoryX035e4534 must be a JSON object")
      val name = json.decodeRequired<InlineWebhookRepositoryRenamedChangesRepositoryNameX6d44e646>(rawObject, "name")
      return InlineWebhookRepositoryRenamedChangesRepositoryX035e4534(
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRenamedChangesRepositoryX035e4534) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRenamedChangesRepositoryX035e4534")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", json.encodeToJsonElement(value.name))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRenamedChangesRepositoryX035e4534(block: InlineWebhookRepositoryRenamedChangesRepositoryX035e4534.Builder.() -> Unit): InlineWebhookRepositoryRenamedChangesRepositoryX035e4534 = InlineWebhookRepositoryRenamedChangesRepositoryX035e4534.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRepositoryRenamedChangesRepositoryX035e4534 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
