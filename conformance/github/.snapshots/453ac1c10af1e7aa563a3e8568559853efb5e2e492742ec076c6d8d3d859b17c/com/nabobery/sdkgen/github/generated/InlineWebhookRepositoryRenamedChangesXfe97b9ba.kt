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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-renamed/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-renamed/properties/changes
 */
@Serializable(with = InlineWebhookRepositoryRenamedChangesXfe97b9ba.Serializer::class)
public class InlineWebhookRepositoryRenamedChangesXfe97b9ba(
  public val repository: InlineWebhookRepositoryRenamedChangesRepositoryX035e4534,
) {
  public class Builder {
    private var repositoryValue: InlineWebhookRepositoryRenamedChangesRepositoryX035e4534? = null

    public var repository: InlineWebhookRepositoryRenamedChangesRepositoryX035e4534
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    public fun build(): InlineWebhookRepositoryRenamedChangesXfe97b9ba {
      check(repositoryValue != null) { "repository is required" }
      return InlineWebhookRepositoryRenamedChangesXfe97b9ba(
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryRenamedChangesXfe97b9ba = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryRenamedChangesXfe97b9ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRenamedChangesXfe97b9ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryRenamedChangesXfe97b9ba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryRenamedChangesXfe97b9ba must be a JSON object")
      val repository = json.decodeRequired<InlineWebhookRepositoryRenamedChangesRepositoryX035e4534>(rawObject, "repository")
      return InlineWebhookRepositoryRenamedChangesXfe97b9ba(
        repository = repository,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRenamedChangesXfe97b9ba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryRenamedChangesXfe97b9ba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository", json.encodeToJsonElement(value.repository))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryRenamedChangesXfe97b9ba(block: InlineWebhookRepositoryRenamedChangesXfe97b9ba.Builder.() -> Unit): InlineWebhookRepositoryRenamedChangesXfe97b9ba = InlineWebhookRepositoryRenamedChangesXfe97b9ba.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRepositoryRenamedChangesXfe97b9ba is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
