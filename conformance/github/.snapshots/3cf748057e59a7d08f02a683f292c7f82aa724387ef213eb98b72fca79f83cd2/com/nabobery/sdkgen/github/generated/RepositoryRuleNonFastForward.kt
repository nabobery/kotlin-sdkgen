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
 * Prevent users with push access from force pushing to refs.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-non-fast-forward
 */
@Serializable(with = RepositoryRuleNonFastForward.Serializer::class)
public class RepositoryRuleNonFastForward(
  public val type: InlineRepositoryRuleNonFastForwardTypeX330f0497,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleNonFastForwardTypeX330f0497? = null

    public var type: InlineRepositoryRuleNonFastForwardTypeX330f0497
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RepositoryRuleNonFastForward {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleNonFastForward(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleNonFastForward = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleNonFastForward> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleNonFastForward {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleNonFastForward")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleNonFastForward must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleNonFastForwardTypeX330f0497>(rawObject, "type")
      return RepositoryRuleNonFastForward(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleNonFastForward) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleNonFastForward")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleNonFastForward(block: RepositoryRuleNonFastForward.Builder.() -> Unit): RepositoryRuleNonFastForward = RepositoryRuleNonFastForward.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleNonFastForward is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
