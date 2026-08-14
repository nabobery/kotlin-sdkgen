package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/output/items/properties/outcome
 * /oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/output/items/properties/outcome
 * /oneOf/1
 */
@Serializable(with = InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db.Serializer::class)
public class InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db(
  public val type: InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234,
) {
  public class Builder {
    private var typeValue: InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234? =
        null

    public var type: InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db {
      check(typeValue != null) { "type is required" }
      return InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db must be a JSON object")
      val type = json.decodeRequired<InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2TypeXf7d57234>(rawObject, "type")
      return InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db(block: InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db.Builder.() -> Unit): InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db = InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputShellCallOutputItemOutputItemOutcomeOneOf2X435324db is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
