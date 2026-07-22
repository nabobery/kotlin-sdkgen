package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The actor who updated the ruleset
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ruleset-version/properties/actor
 */
@Serializable(with = InlineRulesetVersionActorX465fc6ea.Serializer::class)
public class InlineRulesetVersionActorX465fc6ea(
  public val id: Int? = null,
  public val type: String? = null,
) {
  public class Builder {
    public var id: Int? = null

    public var type: String? = null

    public fun build(): InlineRulesetVersionActorX465fc6ea = InlineRulesetVersionActorX465fc6ea(
      id = id,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRulesetVersionActorX465fc6ea = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRulesetVersionActorX465fc6ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRulesetVersionActorX465fc6ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRulesetVersionActorX465fc6ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRulesetVersionActorX465fc6ea must be a JSON object")
      return InlineRulesetVersionActorX465fc6ea(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRulesetVersionActorX465fc6ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRulesetVersionActorX465fc6ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRulesetVersionActorX465fc6ea(block: InlineRulesetVersionActorX465fc6ea.Builder.() -> Unit): InlineRulesetVersionActorX465fc6ea = InlineRulesetVersionActorX465fc6ea.build(block)
