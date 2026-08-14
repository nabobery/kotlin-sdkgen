package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/check-run/properties/check_suite.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-run/properties/check_suite
 */
@Serializable(with = InlineCheckRunCheckSuiteX22423232.Serializer::class)
public class InlineCheckRunCheckSuiteX22423232(
  public val id: Int,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public fun build(): InlineCheckRunCheckSuiteX22423232 {
      check(idValue != null) { "id is required" }
      return InlineCheckRunCheckSuiteX22423232(
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCheckRunCheckSuiteX22423232 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCheckRunCheckSuiteX22423232> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckRunCheckSuiteX22423232 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckRunCheckSuiteX22423232")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCheckRunCheckSuiteX22423232 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      return InlineCheckRunCheckSuiteX22423232(
        id = id,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckRunCheckSuiteX22423232) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCheckRunCheckSuiteX22423232")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCheckRunCheckSuiteX22423232(block: InlineCheckRunCheckSuiteX22423232.Builder.() -> Unit): InlineCheckRunCheckSuiteX22423232 = InlineCheckRunCheckSuiteX22423232.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCheckRunCheckSuiteX22423232 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
